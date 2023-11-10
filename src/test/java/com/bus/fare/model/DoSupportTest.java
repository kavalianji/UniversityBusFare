package com.bus.fare.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

class DoSupportTest {
	DoSupport dosupport;
	Response response;
	BindingResult result;
	Properties prop;
	@BeforeEach
	public void setup() {
		dosupport = new DoSupport();
		response = mock(Response.class);
		result = mock(BindingResult.class);
		prop = mock(Properties.class);
	}

	@Test
	void constructErrorMessagetest() {
		List<ObjectError> errors = new ArrayList();
		ObjectError error = new ObjectError("a", "b");
		errors.add(error);
		Mockito.when(result.getAllErrors()).thenReturn(errors);
		prop.setProperty("b", "error");
		//String errorcode = "abcd";
		//Mockito.when(response.getErrorCode()).thenReturn(Mockito.anyString());
		
		
		dosupport.constructErrorMessage(result);
	
	}

}
