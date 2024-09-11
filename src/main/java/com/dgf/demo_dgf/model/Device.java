package com.dgf.demo_dgf.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
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
	
	 @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, orphanRemoval = true)
	 private List<Connection> connections;
	 
	 @OneToOne(mappedBy = "device", cascade = CascadeType.ALL, orphanRemoval = true)
	 private MigrationJob migrationJob;
}
