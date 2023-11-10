package com.bus.fare.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayerTest {
	public static Payer payer;
	public static Integer student_Id;
	public static Integer student_Amout;
	public static String student_Name; 
	@BeforeEach
	public void setup() {
		payer = new Payer();
		student_Id = 1001;
		student_Amout = 343;
		student_Name = "ashok";
	}
	@Test
	void Payertest() {
		payer = new Payer(student_Id, student_Amout, student_Name);
		assertEquals(student_Id, payer.getStudent_Id());
		assertEquals(student_Amout, payer.getStudent_Amout());
		assertEquals(student_Name, payer.getStudent_Name());
	}
	
	@Test
	void getStudent_Idtest() {
		payer.setStudent_Id(student_Id);
		Integer studentid = payer.getStudent_Id();
		assertEquals(studentid, student_Id);
	}
	
	@Test
	void setStudent_Idtest() {
		payer.setStudent_Id(student_Id);
		Integer studentid = payer.getStudent_Id();
		assertEquals(studentid, student_Id);
	}
	
	@Test
	void getStudent_Amouttest() {
		payer.setStudent_Amout(student_Amout);
		Integer studentamount = payer.getStudent_Amout();
		assertEquals(studentamount, student_Amout);
	}
	
	@Test
	void setStudent_Amouttest() {
		payer.setStudent_Amout(student_Amout);
		Integer studentamount = payer.getStudent_Amout();
		assertEquals(studentamount, student_Amout);
	}

	@Test
	void getStudent_Nametest() {
		payer.setStudent_Name(student_Name);
		String studentname = payer.getStudent_Name();
		assertEquals(studentname, student_Name);
	}
	
	@Test
	void setStudent_Nametest() {
		payer.setStudent_Name(student_Name);
		String studentname = payer.getStudent_Name();
		assertEquals(studentname, student_Name);
	}
	
	@Test
	void toStringtest() {
		String string = payer.toString();
		assertNotEquals(string, payer);
	}
	
	@AfterAll
	public static void end() {
		payer = null;
	}
}
