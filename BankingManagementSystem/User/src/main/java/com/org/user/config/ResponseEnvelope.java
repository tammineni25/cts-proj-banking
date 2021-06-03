package com.org.user.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseEnvelope<T> {
	private int errorCode;
	private String errorDescription;
	private String errorMessage;
	private T response;
	
	public ResponseEnvelope (
			@JsonProperty("errorCode") int  errorCode,
			@JsonProperty("errorDescription") String errorDescription,
			@JsonProperty("errorMessage") String errorMessage,
			@JsonProperty("response") T response) {
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
		this.errorMessage = errorMessage;
		this.response = response;
	}

	public ResponseEnvelope( CoreError error, String errorMessage, T t) {
		this.errorCode = error.getCode();
		this.errorDescription = error.name();
		this.errorMessage = errorMessage;
		this.response = t;
	}
	public ResponseEnvelope(T t) {
		this(CoreError.SUCCESS, null, t);
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

	public static <T> ResponseEnvelope<T> of(T t) {
		return new ResponseEnvelope<T>(t);
	}

}
