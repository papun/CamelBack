package com.dgf.demo_dgf.dto;

import com.dgf.demo_dgf.document.model.DgfConnectionDocumentModel;
import com.dgf.demo_dgf.model.Connection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DgfConnectionInput {
	private Long connecitonId;
	
	private String isp;

	private String contractId;

	private String customerName;

	private String customerLastname;

	private String customerStreet;

	private String connectedPOPId;

	private String connectedDeviceName;

	private String connectedPort;
	
	public static ConnectionDto getDgfDto(Connection dgfModel) {
		return ConnectionDto.builder().isp(dgfModel.getIsp()).contractId(dgfModel.getContractId())
			.customerName(dgfModel.getCustomerName()).customerLastname(dgfModel.getCustomerLastname())
			.customerStreet(dgfModel.getCustomerStreet()).connectedPOPId(dgfModel.getConnectedPOPId())
			.connectedDeviceName(dgfModel.getConnectedDeviceName()).connectedPort(dgfModel.getConnectedPort()).build();
		
	}

	public static ConnectionDto getDgfDto(DgfConnectionDocumentModel dgfModel) {
	
		return	ConnectionDto.builder().isp(dgfModel.getIsp()).contractId(dgfModel.getContractId())
		.customerName(dgfModel.getCustomerName()).customerLastname(dgfModel.getCustomerLastname())
		.customerStreet(dgfModel.getCustomerStreet()).connectedPOPId(dgfModel.getConnectedPOPId())
		.connectedDeviceName(dgfModel.getConnectedDeviceName()).connectedPort(dgfModel.getConnectedPort()).build();
	}
}
