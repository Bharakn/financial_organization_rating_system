package com.cg.financial_organization_rating_system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepUpdateDetailsDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.services.OrganizationRepService;

@RestController
@RequestMapping("/orgrep")
public class OrganizationRepController {

	@Autowired
	OrganizationRepService orgrepservice;
	
	@PostMapping("/Registration")
	public ResponseEntity<String> addOrganizationRep(@RequestBody OrganizationRepRegistrationDto orgrepdto)
	{
	 int orgId=	orgrepservice.addOrganizationRep(orgrepdto);
		return new ResponseEntity<String>("inserted orgId = "+orgId,HttpStatus.OK);
	}
}


