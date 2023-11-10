package com.bus.fare.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.bus.fare.entity.BusModel;

public interface Busdao {
	public List<BusModel> findAll();
	public ResponseEntity<BusModel> getByName(String name);
	public String getName(String name);
}
