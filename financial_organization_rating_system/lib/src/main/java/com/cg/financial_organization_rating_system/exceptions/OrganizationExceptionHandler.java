package com.cg.financial_organization_rating_system.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OrganizationExceptionHandler 
{
	@ExceptionHandler(value=InvalidContactDetailsException.class)
   public ResponseEntity<String> exception(InvalidContactDetailsException exception)
   {
	   return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
   }
	
	@ExceptionHandler(value=InvalidUserNameException.class)
	public ResponseEntity<String> exception(InvalidUserNameException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=InvalidLocationException.class)
    public ResponseEntity<String> exception(InvalidLocationException exception)
    {
		return new ResponseEntity<String> (exception.getMessage(),HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(value=InvalidPasswordException.class)
	public ResponseEntity<String> exception(InvalidPasswordException exception)
	{
	   return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND); 	
	}
	@ExceptionHandler(value=InvalidOrgEconomicRiskScore.class)
	public ResponseEntity<String> exception(InvalidOrgEconomicRiskScore exception)
	{
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=InvalidIndustryRiskScoreException.class)
	public ResponseEntity<String> exception(InvalidIndustryRiskScoreException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=InvalidNetCapitalException.class)
	public ResponseEntity<String> exception(InvalidNetCapitalException exception)
	{
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=OrganizationIdNotFound.class)
	public ResponseEntity<String> exception(OrganizationIdNotFound exception)
	{
		return new ResponseEntity<String> (exception.getMessage(),HttpStatus.NOT_FOUND);
	}
}
