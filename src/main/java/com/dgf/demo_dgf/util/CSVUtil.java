package com.dgf.demo_dgf.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dgf.demo_dgf.dto.ConnectionDto;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class CSVUtil {

	private static final String CSV_FILE_PATH = "D:/dgf1.csv";

	public static void writeToCsv(List<ConnectionDto> dtos) {
		createDirectoryIfNotExist();
		try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE_PATH))) {
			for (ConnectionDto dto : dtos) {
				writer.writeNext(new String[] { String.valueOf(dto.getConnecitonId()), 
						dto.getIsp(), dto.getContractId(), dto.getCustomerName(), dto.getCustomerLastname(),
						dto.getCustomerStreet(), dto.getConnectedPOPId(), dto.getConnectedDeviceName(),
						dto.getConnectedPort() });
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<ConnectionDto> readFromCsv() {
		List<ConnectionDto> dtos = new ArrayList<>();
		try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH))) {
			String[] line;
			while ((line = reader.readNext()) != null) {
				ConnectionDto dto = ConnectionDto.builder().connecitonId(Long.parseLong(line[0])).isp(line[1])
						.contractId(line[2]).customerName(line[3]).customerLastname(line[4]).customerStreet(line[5])
						.connectedPOPId(line[6]).connectedDeviceName(line[7]).connectedPort(line[8]).build();
				dtos.add(dto);
			}
		} catch (FileNotFoundException e) {
			// File does not exist yet, return empty list
			return dtos;
		} catch (IOException | CsvValidationException e) {
			e.printStackTrace();
		}
		return dtos;
	}

	public static void createDirectoryIfNotExist() {
		File directory = new File("D:/");
		if (!directory.exists()) {
			directory.mkdirs();
		}
	}
}
