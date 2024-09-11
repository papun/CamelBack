package com.dgf.demo_dgf.dto;

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
public class DgfMigrationData {

	private CustomerDto customerDto;
	private DeviceDto deviceDto;
	
}
