package com.test.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MyEmployeeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1406566034805293159L;

	public MyEmployeeException(String msg) {
 		super(msg);
	}

}
