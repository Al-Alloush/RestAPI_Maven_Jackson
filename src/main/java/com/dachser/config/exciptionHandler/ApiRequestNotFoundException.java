package com.dachser.config.exciptionHandler;

public class ApiRequestNotFoundException extends RuntimeException {
	
	

	private static final long serialVersionUID = 1L;
	
	

	public ApiRequestNotFoundException() {
		super();
	}

	public ApiRequestNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ApiRequestNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public ApiRequestNotFoundException(String message) {
		super(message);
	}

	public ApiRequestNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
	

}
