package com.bus.fare.model;

import org.springframework.http.HttpStatus;

public class ErrorHandler {
private String error_description;
private HttpStatus httpStatus;

public ErrorHandler() {
	super();
	// TODO Auto-generated constructor stub
}

public ErrorHandler(HttpStatus httpStatus,String error_description) {
	super();
	this.httpStatus = httpStatus;
	this.error_description = error_description;
}

public ErrorHandler(String error_description) {
	super();
	this.error_description = error_description;
}

public String getError_description() {
	return error_description;
}
public void setError_description(String error_description) {
	this.error_description = error_description;
}
public HttpStatus getHttpStatus() {
	return httpStatus;
}
public void setHttpStatus(HttpStatus httpStatus) {
	this.httpStatus = httpStatus;
}
@Override
public String toString() {
	return "ErrorHandler [error_description=" + error_description + ", httpStatus=" + httpStatus + "]";
}

}
