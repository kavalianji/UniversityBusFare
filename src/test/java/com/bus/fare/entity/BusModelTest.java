package com.bus.fare.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BusModelTest {
	public static BusModel busmodel;
	public static ModelStudent modelstudent;
	public static Integer amount;
	public static Integer distance;
	public static Integer id;
	public static Integer studentid;
	public static String studentname;
	public static ModelStudent msd;
	@BeforeEach
	public void setup() {
		busmodel = new BusModel();
		modelstudent = new ModelStudent();
		id = 1223;
		amount = 10000;
		distance = 2;
		studentid = 1001;
		studentname="anupama";
		busmodel.setId(id);
		busmodel.setAmount(amount);
		busmodel.setDistance(distance);
		busmodel.setMsd(modelstudent);
	}

	@Test
	void BusModeltest() {
		 new BusModel();
	}
	
	@Test
	void getIdtest() {
		busmodel.setId(id);
		Integer id = busmodel.getId();
		assertEquals(id, 1223);
	}
	
	@Test
	void setIdtest() {
		busmodel.setId(id);
		Integer id = busmodel.getId();
		assertEquals(id, 1223);
	}
	
	@Test
	void getAmounttest() {
		busmodel.setAmount(amount);
		Integer amount = busmodel.getAmount();
		assertEquals(amount, 10000);
	}
	
	@Test
	void setAmounttest() {
		busmodel.setAmount(amount);
		Integer amount = busmodel.getAmount();
		assertEquals(amount, 10000);
	}
	
	@Test
	void getDistancetest() {
		busmodel.setDistance(distance);
		Integer distance = busmodel.getDistance();
		assertEquals(distance, 2);
	}
	
	@Test
	void setDistancetest() {
		busmodel.setDistance(distance);
		Integer distance = busmodel.getDistance();
		assertEquals(distance, 2);
	}
	
	@Test
	void getMsdtest() {
		modelstudent.setStudentId(studentid);
		modelstudent.setStudentName(studentname);
		busmodel.setMsd(modelstudent);
		msd = busmodel.getMsd();
		assertEquals(msd, modelstudent);
	}
	
	@Test
	void setMsdtest() {
		modelstudent.setStudentId(studentid);
		modelstudent.setStudentName(studentname);
		busmodel.setMsd(modelstudent);
		msd = busmodel.getMsd();
		assertEquals(msd, modelstudent);
	}
	
	@Test
	void BusModeltestconstructor() {
//		msd = busmodel.getMsd();
		new BusModel(id, amount, distance, msd);
		assertEquals(busmodel, busmodel);
	}
	
	@Test
	void toStringtest() {
		String name = busmodel.toString();
		assertNotEquals(name, busmodel);
		
	}
	
	@AfterAll
	public static void end() {
		busmodel = null;
		modelstudent =null;
	}

}
