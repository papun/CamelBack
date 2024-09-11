package com.dgf.demo_dgf.document.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Table(name = "device")
public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "device_id")
	private Long deviceId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "host_name")
	private String hostName;
	
	@Column(name = "device_type")
	private String deviceType;
	
	@Column(name = "vendor")
	private String vendor;
	
	@Column(name = "pop_id")
	private String popId;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "pop_location")
	private String popLocation;
	
	@Column(name = "migrated")
	private String migrated;
	
	@OneToOne(mappedBy = "device", cascade = CascadeType.ALL)
	private Connection connection;
}
