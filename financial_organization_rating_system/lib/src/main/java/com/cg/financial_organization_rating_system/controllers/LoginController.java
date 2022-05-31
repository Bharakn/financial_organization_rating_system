package com.cg.financial_organization_rating_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.financial_organization_rating_system.entities.LoginDetails;
import com.cg.financial_organization_rating_system.services.LoginServiceImpl;

@RestController
@RequestMapping("/login")
public class LoginController 
{
	
	@Autowired
	LoginServiceImpl loginimpl;
	@GetMapping("/logindetails")
	public List<LoginDetails> getalldetails() {
		return loginimpl.getAllDetails();
	}

}
