package com.dgf.demo_dgf.service;

import java.util.List;

import com.dgf.demo_dgf.dto.ConnectionDto;
import com.dgf.demo_dgf.dto.DeviceDto;
import com.dgf.demo_dgf.dto.DgfConnectionInput;
import com.dgf.demo_dgf.dto.DgfMigrationData;

public interface DgfService {
	ConnectionDto AddDgfConfigInfo(DgfConnectionInput dgf);
	List<ConnectionDto> getDgfConfigInfo();
	DgfMigrationData getMigratedConfigInfo(String connectionID);

	List<DeviceDto> getAllDeviceInfo();
}

