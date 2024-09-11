package com.dgf.demo_dgf.dao;

import com.dgf.demo_dgf.dto.DeviceDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dgf.demo_dgf.model.Connection;
import com.dgf.demo_dgf.model.ConnectionModel;

import java.util.List;

@Repository
public interface DgfRepository extends JpaRepository<ConnectionModel, Long> {


}
