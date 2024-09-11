package com.dgf.demo_dgf.service;

import com.dgf.demo_dgf.dao.DeviceRepo;
import com.dgf.demo_dgf.dao.DgfRepository;
import com.dgf.demo_dgf.document.dao.DgfMongoRepository;
import com.dgf.demo_dgf.document.model.DgfConnectionDocumentModel;
import com.dgf.demo_dgf.dto.*;
import com.dgf.demo_dgf.model.ConnectionModel;
import com.dgf.demo_dgf.model.Device;
import com.dgf.demo_dgf.util.CSVUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DgfServiceImpl implements DgfService {

    @Autowired
    private DgfRepository dgfRepository;
    @Autowired
    private DgfMongoRepository dgfMongoRepository;

    @Autowired
    private DeviceRepo deviceRepo;


    @Override
    public ConnectionDto AddDgfConfigInfo(DgfConnectionInput dgf) {
        ConnectionModel dgfModel = dgfRepository.save(ConnectionModel.getDgfModel(dgf));
        return ConnectionDto.getDgfDto(dgfModel);
    }

    @Override
    public List<ConnectionDto> getDgfConfigInfo() {
        List<ConnectionModel> dgfModelList = dgfRepository.findAll();
        List<ConnectionDto> dtoList = dgfModelList.stream().map(dgfModel -> ConnectionDto.builder().connecitonId(dgfModel.getConnecitonId()).isp(dgfModel.getIsp()).contractId(dgfModel.getContractId()).customerName(dgfModel.getCustomerName()).customerLastname(dgfModel.getCustomerLastname()).customerStreet(dgfModel.getCustomerStreet()).connectedPOPId(dgfModel.getConnectedPOPId()).connectedDeviceName(dgfModel.getConnectedDeviceName()).connectedPort(dgfModel.getConnectedPort()).build()).collect(Collectors.toList());

        CSVUtil.writeToCsv(dtoList);
        List<DgfConnectionDocumentModel> documentList = null;
        documentList = CSVUtil.readFromCsv().stream().map(DgfConnectionDocumentModel::getDgfServiceDocumentModel).collect(Collectors.toList());
        dgfMongoRepository.saveAll(documentList);
        return documentList.stream().map(ConnectionDto::getDgfDto).collect(Collectors.toList());
    }

    @Override
    public DgfMigrationData getMigratedConfigInfo(String connectionID) {
        // get the connection info
        List<ConnectionModel> dgfModelList = dgfRepository.findAll();
        List<ConnectionDto> dtoList = dgfModelList.stream().map(dgfModel -> ConnectionDto.builder().
                                        isp(dgfModel.getIsp()).
                                        contractId(dgfModel.getContractId()).
                                        customerName(dgfModel.getCustomerName()).
                                        customerLastname(dgfModel.getCustomerLastname()).
                                        customerStreet(dgfModel.getCustomerStreet()).
                                        connectedPOPId(dgfModel.getConnectedPOPId()).
                                        connectedDeviceName(dgfModel.getConnectedDeviceName()).
                                        connectedPort(dgfModel.getConnectedPort()).
                                        migrationStatus(MigrationStatus.builder().ceaseRequestStatus("Completed").
                                                ceaseCompletionTime(LocalDateTime.now()).ceaseRequestTime(LocalDateTime.now())
                                                .build()).build()).collect(Collectors.toList());

        for (ConnectionDto dto : dtoList) {
            if (dto.getIsp().equalsIgnoreCase("string")) {
                dto.getMigrationStatus().setCeaseRequestStatus("InProgress");
            }

        }

        CustomerDto customerDto = new CustomerDto();
        customerDto.setConnection(dtoList);


        DeviceDto deviceDto = new DeviceDto();

        DgfMigrationData data = new DgfMigrationData();
        data.setCustomerDto(customerDto);
        data.setDeviceDto(deviceDto);
        return data;
    }

    @Override
    public List<DeviceDto> getAllDeviceInfo() {
        List<Device> all = deviceRepo.findAll();
        List<DeviceDto> data = new ArrayList<>();
        for (Object source: all ) {
            DeviceDto target= new DeviceDto();
            BeanUtils.copyProperties(source , target);
            data.add(target);
        }
        return data;
    }
}
