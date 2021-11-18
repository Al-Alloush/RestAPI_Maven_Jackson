package com.dachser.config.exciptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// the purpose of this class is to handle custom exception or existing exception, 
// and customize the way to throw the error to client
@ControllerAdvice
public class ApiExcepionHandler {
	// tell spring that this messge is will be responsible of handling Exceptions, by use this annotation,
	// pass this class {value = {ApiRequestNotFoundException.class}} as value 
	@ExceptionHandler() 
	public ResponseEntity<Object> HandlerNotFoundException(ApiRequestNotFoundException e){
		
		ApiExcepion apiExcepion = new ApiExcepion();
		apiExcepion.setStatus(HttpStatus.NOT_FOUND.value());
		apiExcepion.setMessage(e.getMessage());
		apiExcepion.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<Object>(apiExcepion, HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler() 
	public ResponseEntity<Object> HandlerException(Exception e){
		
		ApiExcepion apiExcepion = new ApiExcepion();
		apiExcepion.setStatus(HttpStatus.BAD_REQUEST.value());
		apiExcepion.setMessage(e.getMessage());
		apiExcepion.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<Object>(apiExcepion, HttpStatus.BAD_REQUEST);
		
	}

}
