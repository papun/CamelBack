package com.dgf.demo_dgf.document.model;


import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.dgf.demo_dgf.dto.ConnectionDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Document(collection = "dgf_connection")
public class DgfConnectionDocumentModel {
	@Id
	private Long connecitonId;

	private String isp;

	private String contractId;

	private String customerName;

	private String customerLastname;

	private String customerStreet;

	private String connectedPOPId;

	private String connectedDeviceName;

	private String connectedPort;
	
	public static DgfConnectionDocumentModel getDgfServiceDocumentModel(ConnectionDto dto) {
		
		return	DgfConnectionDocumentModel.builder().connecitonId(dto.getConnecitonId()).isp(dto.getIsp()).contractId(dto.getContractId())
				.customerName(dto.getCustomerName()).customerLastname(dto.getCustomerLastname())
				.customerStreet(dto.getCustomerStreet()).connectedPOPId(dto.getConnectedPOPId())
				.connectedDeviceName(dto.getConnectedDeviceName()).connectedPort(dto.getConnectedPort()).build();
    }
	
}
