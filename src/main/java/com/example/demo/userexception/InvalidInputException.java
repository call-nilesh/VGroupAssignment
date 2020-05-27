package com.example.demo.userexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidInputException extends RuntimeException {



	public InvalidInputException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	

	
}
