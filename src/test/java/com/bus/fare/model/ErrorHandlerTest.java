package com.bus.fare.model;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class ErrorHandlerTest {
	static ErrorHandler errorhandler;
	static String error_description;
	static HttpStatus httpstatus;
	@BeforeAll
	public static void before() {
		error_description="hi";
		httpstatus=HttpStatus.ACCEPTED;
	}
	@BeforeEach
	public void setUp() {
		errorhandler = new ErrorHandler(httpstatus,error_description);
	}
	
	@Test
	void ErrorHandlerTest() {
		new ErrorHandler(httpstatus,error_description);
	}
	
	@Test
	void ErrorHandlerTest1() {
		new ErrorHandler(error_description);
	}
	
	@Test
	void getError_descriptionTest() {
		errorhandler.setError_description(error_description);
		String a = errorhandler.getError_description();
		assertEquals(a,error_description);
	}
	
	@Test
	void setError_descriptionTest() {
		errorhandler.setError_description(error_description);
	}
	
	@Test
	void getHttpStatusTest() {
		errorhandler.setHttpStatus(HttpStatus.ACCEPTED);
		HttpStatus status = errorhandler.getHttpStatus();
		assertEquals(status, HttpStatus.ACCEPTED);
	}
	
	@Test 
	void setHttpStatusTest(){
		errorhandler.setHttpStatus(HttpStatus.ACCEPTED);
	}
	
	@Test
	void toStringTest() {
		/*
		 * errorhandler.setHttpStatus(HttpStatus.ACCEPTED);
		 * errorhandler.setError_description(error_description);
		 */
		String s = errorhandler.toString();
		assertNotEquals(s,httpstatus);
	}
	@AfterAll
	public static void end() {
		errorhandler = null;
	}

}
