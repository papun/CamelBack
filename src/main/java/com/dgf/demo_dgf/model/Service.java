package com.dgf.demo_dgf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "service")
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_id")
	private Long service;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "creation_time")
	private String creationTime;
	
	@Column(name = "port")
	private String port;
	
	 @ManyToOne
	 @JoinColumn(name = "connection_fk")
	 private Connection connection;
	
}
