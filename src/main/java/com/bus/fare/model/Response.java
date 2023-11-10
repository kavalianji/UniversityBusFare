package com.bus.fare.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true )
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response implements Serializable {
	private String errorCode;
	private String errorMessage;
	private List<Object> errorParams;
	private String responseCode;
	private String responseMessage;

	public Response() {}
	public Response(String statusCode, String statusMessage){
		this.errorCode = statusCode;
		this.errorMessage = statusMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<Object> getErrorParams() {
		return errorParams;
	}
	public void setErrorParams(List<Object> errorParams) {
		this.errorParams = errorParams;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
}
