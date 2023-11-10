package com.bus.fare.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModelStudentTest {
	public static ModelStudent modelstudent;
	public static Integer studentId;
	public static String  studentName;
	@BeforeEach
	public void setup() {
		modelstudent = new ModelStudent();
		studentId = 1992;
		studentName = "rahim";
	}
	@Test
	void ModelStudenttest() {
		new ModelStudent();
	}
	
	@Test
	void getStudentIdtest() {
		modelstudent.setStudentId(studentId);
		Integer studentid = modelstudent.getStudentId();
		assertEquals(studentid, studentId);
	}
	
	@Test
	void setStudentIdtest() {
		modelstudent.setStudentId(studentId);
		Integer studentid = modelstudent.getStudentId();
		assertEquals(studentid, studentId);
	}
	
	@Test
	void getStudentNametest() {
		modelstudent.setStudentName(studentName);
		String studentname = modelstudent.getStudentName();
		assertEquals(studentname, studentName);
	}
	
	@Test
	void setStudentNametest() {
		modelstudent.setStudentName(studentName);
		String studentname = modelstudent.getStudentName();
		assertEquals(studentname, studentName);
	}
	
	@Test
	void ModelStudenttest1() {
		modelstudent =new ModelStudent(studentId, studentName);
		assertEquals(studentId, modelstudent.getStudentId());
		assertEquals(studentName, modelstudent.getStudentName());
	}
	
	@Test
	void toStringtest() {
		String string = modelstudent.toString();
		assertNotEquals(string, modelstudent);
	}
	
	@AfterAll
	public static void end() {
		modelstudent = null;
	}
}
