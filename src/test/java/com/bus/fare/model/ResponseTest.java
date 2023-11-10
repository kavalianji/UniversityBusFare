package com.bus.fare.model;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResponseTest {
	public static Response response ;
	public static String responseCode;
	public static String responseMessage;
	public static List<Object> errorparams;
	
	@BeforeAll
	public static void before() { 
		responseCode="abcd"; 
		responseMessage="xyz"; 
		errorparams = new ArrayList<>();
		errorparams.add("34");
		errorparams.add("4");
		errorparams.add("3");
	}
	 
	@BeforeEach
	public void setup() {
		response = new Response("hi", "helo");
		
	}

	@Test
	void Responsetest() {
		new Response("hi","helo");
	}
	
	@Test
	void getErrorCodetest() {
		response.getErrorCode();
		String errorcode = response.getErrorCode();
		assertEquals(errorcode, "hi");
	}
	
	@Test
	void setErrorCodetest() {
		String errorcode = response.getErrorCode();
		response.setErrorCode(errorcode);
		assertEquals(errorcode, "hi");
	}
	
	@Test
	void getErrorMessagetest() {
		response.getErrorMessage();
		String errormessage = response.getErrorMessage();
		assertEquals(errormessage, "helo");
	}
	
	@Test
	void setErrorMessagetest() {
		String errormessage = response.getErrorMessage();
		response.setErrorMessage(errormessage);
		assertEquals(errormessage, "helo");
	}
	
	@Test
	void getErrorParamstest() {
		List<Object> temp_errorparams = new ArrayList<>();
		temp_errorparams.add("34");
		temp_errorparams.add("4");
		temp_errorparams.add("3");
		response.setErrorParams(errorparams);
		errorparams = response.getErrorParams();
		assertEquals(errorparams, temp_errorparams);
	}
	
	@Test
	void setErrorParamstest() {
		List<Object> temp_errorparams = new ArrayList<>();
		temp_errorparams.add("34");
		temp_errorparams.add("4");
		temp_errorparams.add("3");
		response.setErrorParams(errorparams);
		errorparams = response.getErrorParams();
		assertEquals(errorparams, temp_errorparams);
	}
	
	@Test
	void getResponseCodetest() {
		response.setResponseCode(responseCode);
		response.getResponseCode();
		String responsecode = response.getResponseCode();
		assertEquals(responsecode, "abcd");
	}
	
	@Test
	void setResponseCodetest() {
		response.setResponseCode(responseCode);
		String responsecode = response.getResponseCode();
		assertEquals(responsecode, "abcd");
	}
	
	@Test
	void getResponseMessagetest() {
		response.setResponseMessage(responseMessage);
		response.getResponseMessage();
		String responsemessage = response.getResponseMessage();
		assertEquals(responsemessage, "xyz");
	}
	
	@Test
	void setResponseMessagetest() {
		response.setResponseMessage(responseMessage);
		String responsemessage = response.getResponseMessage();
		assertEquals(responsemessage, "xyz");
	}
	
	@AfterAll
	public static void end() {
		response =null;
	}

}
