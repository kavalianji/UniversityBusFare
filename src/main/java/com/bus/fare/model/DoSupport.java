package com.bus.fare.model;

import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

public class DoSupport {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	protected Response constructErrorMessage(BindingResult result) {
		Response response = new Response();
		List<ObjectError> objError = result.getAllErrors();
		ObjectError obj = objError != null ? objError.get(0):null;
		String defaultMessage = obj.getDefaultMessage();
		response.setErrorCode(new Properties().getProperty(defaultMessage));
		response.setErrorMessage(new Properties().getProperty(response.getErrorCode()));
		return response;
	}
}
