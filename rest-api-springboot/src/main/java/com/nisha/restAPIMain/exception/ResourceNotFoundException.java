package com.nisha.restAPIMain.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.*;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends Exception{

	public ResourceNotFoundException(String message) {
		super(message);
	}
	
}
