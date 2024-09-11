package com.dgf.demo_dgf.dto;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeviceDto {
	private Long deviceId;
	private String name;
	private String hostName;
	private String deviceType;
	private String vendor;
	private String popId;
	private String city;
	private String popLocation;
	private String migrated;
}
