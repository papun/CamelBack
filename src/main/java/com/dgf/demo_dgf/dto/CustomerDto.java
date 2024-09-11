package com.dgf.demo_dgf.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
	private String firstName="John";
	private String lastName="John";
	private String gender="male";
	private String mobile="+91-8453322222";
	private String oNTSerialNumber="ONT101";
	private String street="New Mumbai";
	private String city="Mumbai";
	private String houseNumber="H101";
	private String tzipcode="440034";
	private List<ConnectionDto> connection;
}
