package com.bus.fare.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;

import com.bus.fare.model.ErrorHandler;

class UniversityBusExceptionTest {
	UniversityBusException universitybusexception;
	InvalidDataAccessApiUsageException idaaux;
	ResourceNotFoundException resourcenotfound;
	ErrorHandler errorhandler;
	@BeforeEach
	public void setup() {
		universitybusexception = new UniversityBusException();
		idaaux =new InvalidDataAccessApiUsageException("abcd");
		resourcenotfound = new ResourceNotFoundException("xyz");
		errorhandler = new ErrorHandler();
	}
	@Test
	void resourceNotFoundExceptiontest() {
		ErrorHandler errorHandler =	universitybusexception.resourceNotFoundException(idaaux);
		assertEquals(HttpStatus.NOT_FOUND, errorHandler.getHttpStatus());
		assertNotNull( errorHandler.getError_description());
	}
	
	@Test
	void resourceNotFoundExceptiontest1() {
		ErrorHandler errorHandler =	universitybusexception.resourceNotFoundException(resourcenotfound);
		assertEquals(HttpStatus.METHOD_NOT_ALLOWED, errorHandler.getHttpStatus());
		assertNotNull( errorHandler.getError_description());
	}

}
