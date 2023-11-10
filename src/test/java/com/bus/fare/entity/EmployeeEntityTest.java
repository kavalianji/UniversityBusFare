package com.bus.fare.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeEntityTest {
	public static EmployeeEntity employeeentity;
	public static Integer empId;
	public static String empName;
	public static Integer empContacNo;
	public static String empLocation;
	@BeforeEach
	public void setup() {
		employeeentity = new EmployeeEntity();
		empId = 101;
		empName ="ashok";
		empContacNo =1234543;
		empLocation = "hyd";
	}
	@Test
	void EmployeeEntitytest() {
	new EmployeeEntity();
	}
	
	@Test
	void getEmpIdtest() {
		employeeentity.setEmpId(empId);
		Integer empid = employeeentity.getEmpId();
		assertEquals(empid, empId);
	}
	
	@Test
	void setEmpIdtest() {
		employeeentity.setEmpId(empId);
		Integer empid = employeeentity.getEmpId();
		assertEquals(empid, empId);
	}
	
	@Test
	void getEmpNametest() {
		employeeentity.setEmpName(empName);
		String empname = employeeentity.getEmpName();
		assertEquals(empname, empName);
	}
	
	@Test
	void setEmpNametest() {
		employeeentity.setEmpName(empName);
		String empname = employeeentity.getEmpName();
		assertEquals(empname, empName);
	}
	
	@Test
	void getEmpContacNotest() {
		employeeentity.setEmpContacNo(empContacNo);
		Integer empcontact = employeeentity.getEmpContacNo();
		assertEquals(empcontact, empContacNo);
	}
	
	@Test
	void setEmpContacNotest() {
		employeeentity.setEmpContacNo(empContacNo);
		Integer empcontact = employeeentity.getEmpContacNo();
		assertEquals(empcontact, empContacNo);
	}
	
	@Test
	void setEmpLocationtest() {
		employeeentity.setEmpLocation(empLocation);
		String emplocation = employeeentity.getEmpLocation();
		assertEquals(emplocation, empLocation);
	}
	
	@Test
	void getEmpLocationtest() {
		employeeentity.setEmpLocation(empLocation);
		String emplocation = employeeentity.getEmpLocation();
		assertEquals(emplocation, empLocation);
	}
	
	@Test
	void toStringtest() {
		String string = employeeentity.toString();
		assertNotEquals(string, employeeentity);
	}
	
	@AfterAll
	public static void end() {
		employeeentity =null;
	}
}
