package com.hexaware.codingchallenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PlayerNotFoundException extends ResponseStatusException{
	public PlayerNotFoundException(HttpStatus status, String msg) {
		super(status,msg);
	}

}
