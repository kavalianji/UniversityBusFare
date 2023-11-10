package com.bus.fare.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String error_msg) {
		super(error_msg);
	}
}
