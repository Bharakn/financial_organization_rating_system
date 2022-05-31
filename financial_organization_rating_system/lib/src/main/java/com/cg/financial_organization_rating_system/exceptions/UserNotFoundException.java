package com.cg.financial_organization_rating_system.exceptions;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(String message) {
		super(message);
		
	}

}
