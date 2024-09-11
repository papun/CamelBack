package com.dgf.demo_dgf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dgf.demo_dgf.dto.DgfConnectionInput;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "connection")
public class ConnectionModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "conneciton_id")
	private Long connecitonId;
	@Column(name = "isp")
	private String isp;
	@Column(name = "contract_id")
	private String contractId;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "customer_last_tname")
	private String customerLastname;
	@Column(name = "customer_street")
	private String customerStreet;
	@Column(name = "connected_pop_id")
	private String connectedPOPId;
	@Column(name = "connected_device_name")
	private String connectedDeviceName;
	@Column(name = "connected_port")
	private String connectedPort;
	
	public static ConnectionModel getDgfModel(DgfConnectionInput dgfDto) {
		return ConnectionModel.builder().connecitonId(dgfDto.getConnecitonId()).isp(dgfDto.getIsp()).contractId(dgfDto.getContractId())
				.customerName(dgfDto.getCustomerName()).customerLastname(dgfDto.getCustomerLastname())
				.customerStreet(dgfDto.getCustomerStreet()).connectedPOPId(dgfDto.getConnectedPOPId())
				.connectedDeviceName(dgfDto.getConnectedDeviceName()).connectedPort(dgfDto.getConnectedPort()).build();
	}
}
