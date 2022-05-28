package com.cg.financial_organization_rating_system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.services.UsersService;
import com.cg.financial_organization_rating_system.services.UsersServiceImpl;

import antlr.collections.List;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UsersServiceImpl userservice;
	
	
	
	
	
	
	@PostMapping
	public ResponseEntity<String> userRegistration(@RequestBody UsersRegistrationDto userDto)
	{
		userservice.userRegistration(userDto);
		return new ResponseEntity<String>("User Registered Successfully",HttpStatus.OK);
	}
	
	
	



}
