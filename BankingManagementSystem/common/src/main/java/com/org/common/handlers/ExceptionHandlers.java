package com.org.common.handlers;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import com.org.common.exception.BankManagementSystemException;

@ControllerAdvice
public class ExceptionHandlers   {
	
	@ExceptionHandler(value = BankManagementSystemException.class)
	public ResponseEntity<Object> exception(BankManagementSystemException exception) {
		return new ResponseHandlers().handleExceptions(exception);
	}

	@ExceptionHandler(value = {
			HttpRequestMethodNotSupportedException.class,
			HttpMediaTypeNotSupportedException.class,
			HttpMediaTypeNotAcceptableException.class,
			MissingPathVariableException.class,
			MissingServletRequestParameterException.class,
			ServletRequestBindingException.class,
			ConversionNotSupportedException.class,
			TypeMismatchException.class,
			HttpMessageNotReadableException.class,
			HttpMessageNotWritableException.class,
			MethodArgumentNotValidException.class,
			MissingServletRequestPartException.class,
			BindException.class,
			NoHandlerFoundException.class,
			AsyncRequestTimeoutException.class,
			IllegalArgumentException.class,
			InvocationTargetException.class,
			RestClientException.class,
			RuntimeException.class
		})
	public ResponseEntity<Object> exception(Exception ex) {
		BankManagementSystemException exception = BankManagementSystemException.builder()
													.errorCode(HttpStatus.BAD_REQUEST)
													.errorMessage(ex.getMessage())
													.build();
		return new ResponseHandlers().handleExceptions(exception);
	}

}
