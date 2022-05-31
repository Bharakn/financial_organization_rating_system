package com.cg.financial_organization_rating_system.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {
@ExceptionHandler(value = UserNotFoundException.class)
public ResponseEntity<String> exception(UserNotFoundException exception)
{
	return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
}

@ExceptionHandler(value = InvalidUserNameException.class)
public ResponseEntity<String> exception(InvalidUserNameException exception)
{
	return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
}

@ExceptionHandler(value = InvalidContactDetailsException.class)
public ResponseEntity<String> exception(InvalidContactDetailsException exception)
{
	return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
}

@ExceptionHandler(value = InvalidPasswordException.class)
public ResponseEntity<String> exception(InvalidPasswordException exception)
{
	return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
}

@ExceptionHandler(value = UserAddressNotFoundException.class)
public ResponseEntity<String> exception(UserAddressNotFoundException exception)
{
	return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
}

@ExceptionHandler(value = UserAddressAllReadyFoundException.class)
public ResponseEntity<String> exception(UserAddressAllReadyFoundException exception)
{
	return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
}

@ExceptionHandler(value = UserAllReadyExistsException.class)
public ResponseEntity<String> exception(UserAllReadyExistsException exception)
{
	return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
}

@ExceptionHandler(value = OrganizationRepEntityNotFoundException.class)
public ResponseEntity<String> exception(OrganizationRepEntityNotFoundException exception)
{
	return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
}
}
