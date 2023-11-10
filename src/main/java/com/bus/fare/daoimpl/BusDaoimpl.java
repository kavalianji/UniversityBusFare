package com.bus.fare.daoimpl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bus.fare.dao.Busdao;
import com.bus.fare.entity.BusModel;
import com.bus.fare.exception.ResourceNotFoundException;
import com.bus.fare.repo.BusFairRepo;


@Service
public class BusDaoimpl  implements Busdao{
	Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	BusFairRepo busrep;
	
	public String SavebusData(BusModel e) {
		return String.valueOf(busrep.save(e));
	}
	public String SaveBusData(BusModel p) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<BusModel> findAll() {
		// TODO Auto-generated method stub
		return busrep.findAll();
	}
	@Override
	public ResponseEntity<BusModel> getByName(String name) {
		//JDK 8 feature handled for except
		 BusModel orElseThrow = busrep.getByName(name).orElseThrow(()->new ResourceNotFoundException("Method Not Found Ashok"));
		return ResponseEntity.ok().body(orElseThrow);
	}
	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return "Raju";
	}
}
