package com.dgf.demo_dgf;

import com.dgf.demo_dgf.dto.ConnectionDto;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestCSV {
	/*
	 * private static final String CSV_FILE_PATH = "D:/dgf.csv"; // Path to D drive
	 * 
	 * // Ensure directory exists (optional if using specific file path) static {
	 * File directory = new File("D:/"); if (!directory.exists()) {
	 * directory.mkdirs(); } }
	 * 
	 * // Write a list of DgfDto objects to a CSV file (append mode) public static
	 * void writeToCsv(List<DgfServiceDto> dtos) { try (CSVWriter writer = new
	 * CSVWriter(new FileWriter(CSV_FILE_PATH, true))) { for (DgfServiceDto dto :
	 * dtos) { writer.writeNext(new String[] { dto.getName(), dto.getEmail(),
	 * dto.getAddress() }); } } catch (IOException e) { e.printStackTrace(); } }
	 * 
	 * // Read all DgfDto objects from the CSV file public static
	 * List<DgfServiceDto> readFromCsv() throws CsvValidationException {
	 * List<DgfServiceDto> dtos = new ArrayList<>(); try (CSVReader reader = new
	 * CSVReader(new FileReader(CSV_FILE_PATH))) { String[] line; while ((line =
	 * reader.readNext()) != null) { DgfServiceDto dto =
	 * DgfServiceDto.builder().name(line[0]).email(line[1]).address(line[2]).build()
	 * ; dtos.add(dto); } } catch (FileNotFoundException e) { // File does not exist
	 * yet, return empty list return dtos; } catch (IOException e) {
	 * e.printStackTrace(); } return dtos; }
	 * 
	 * public static void main(String[] args) throws CsvValidationException { //
	 * Example usage List<DgfServiceDto> initialDtos = new ArrayList<>();
	 * initialDtos.add(DgfServiceDto.builder().name("John Doe").email(
	 * "john.doe@example.com").address("123 Main St").build()); initialDtos
	 * .add(DgfServiceDto.builder().name("Jane Smith").email(
	 * "jane.smith@example.com").address("456 Oak St").build());
	 * 
	 * // Write initial data to CSV (will append) writeToCsv(initialDtos);
	 * 
	 * // Append new data to CSV List<DgfServiceDto> additionalDtos = new
	 * ArrayList<>();
	 * additionalDtos.add(DgfServiceDto.builder().name("Michael Brown").email(
	 * "michael.brown@example.com") .address("789 Elm St").build());
	 * additionalDtos.add(
	 * DgfServiceDto.builder().name("Emily White").email("emily.white@example.com").
	 * address("101 Pine St").build()); writeToCsv(additionalDtos);
	 * 
	 * // Read all data from CSV List<DgfServiceDto> allDtos = readFromCsv();
	 * allDtos.forEach(dto -> System.out.println(dto.getName() + ", " +
	 * dto.getEmail() + ", " + dto.getAddress())); }
	 */
}
