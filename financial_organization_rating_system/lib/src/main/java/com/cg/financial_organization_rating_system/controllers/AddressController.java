package com.cg.financial_organization_rating_system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		int pincode = addservice.addUserAddress(adres);
		return new ResponseEntity<String>("User address added and pincode "+pincode ,HttpStatus.OK);
	}
	
	@GetMapping("/id/{pincode}")
	public ResponseEntity<Address> getAddresById(@PathVariable int pincode){
	Address adrs= addservice.getAddressById(pincode);
		return new ResponseEntity<Address>(adrs,HttpStatus.OK);
	}
	
	@DeleteMapping("/id/{pincode}")
	public ResponseEntity<String> deleteAddressById(@PathVariable int pincode){
		addservice.deleteAddress(pincode);
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}


}
