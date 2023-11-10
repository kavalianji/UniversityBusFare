package com.bus.fare.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResourceNotFoundExceptionTest {
	ResourceNotFoundException resourcenotfoundexception;
	String err_msg;
	@BeforeEach
	public void setup() {
		err_msg = "jjjjj";
		resourcenotfoundexception = new ResourceNotFoundException(err_msg);
	}
	@Test
	void ResourceNotFoundExceptiontest() {
		new ResourceNotFoundException(err_msg);
		assertEquals(resourcenotfoundexception, resourcenotfoundexception);
	}

}
