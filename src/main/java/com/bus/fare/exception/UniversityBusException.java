package com.bus.fare.exception;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bus.fare.model.ErrorHandler;

@RestControllerAdvice
public class UniversityBusException extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value = InvalidDataAccessApiUsageException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorHandler resourceNotFoundException(InvalidDataAccessApiUsageException ex) {
		return new ErrorHandler(HttpStatus.NOT_FOUND,ex.getMessage());
	}
	
	@ExceptionHandler(value = ResourceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED)
	public ErrorHandler resourceNotFoundException(ResourceNotFoundException ex) {
		return new ErrorHandler(HttpStatus.METHOD_NOT_ALLOWED,ex.getMessage());
	}
}