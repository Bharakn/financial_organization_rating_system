package com.cg.financial_organization_rating_system.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FeedBackExceptionHandler {
	@ExceptionHandler(value = InvalidFeedBackChoiceException.class)
	public ResponseEntity<String> exception(InvalidFeedBackChoiceException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
}
