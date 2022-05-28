package com.cg.financial_organization_rating_system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.financial_organization_rating_system.entities.Address;
import com.cg.financial_organization_rating_system.services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService addservice;
	
	@PostMapping
	public ResponseEntity<String> addUserAddress(@RequestBody Address adres)
	{
		addservice.addUserAddress(adres);
		return new ResponseEntity<String>("User address added",HttpStatus.OK);
	}

}
