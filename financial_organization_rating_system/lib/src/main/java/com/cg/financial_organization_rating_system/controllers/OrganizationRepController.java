package com.cg.financial_organization_rating_system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepUpdateDetailsDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.model.ApiResponse;
import com.cg.financial_organization_rating_system.repository.LoginRepository;
import com.cg.financial_organization_rating_system.services.OrganizationRepService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/orgrep")
public class OrganizationRepController {

	@Autowired
	OrganizationRepService orgrepservice;
	@Autowired
	LoginRepository loginservice;
	
	@PostMapping
	public ApiResponse<String> addOrganizationRep(@RequestBody OrganizationRep orgrepdto)
	{
	// int orgId=	orgrepservice.addOrganizationRep(orgrepdto);
		return new ApiResponse<String>(HttpStatus.OK.value(), "Organization Rep  Register successfully.",orgrepservice.addOrganizationRep(orgrepdto));
	}
	
	
	@PutMapping("/UpdateDetails")
	public ResponseEntity<String> updateDetails(@RequestBody OrganizationRep orgrepudto)
	{
		orgrepservice.updateOrgDetails(orgrepudto);
		return new ResponseEntity<String>("Thank you for updating organization details ",HttpStatus.OK);
	}
 
	@DeleteMapping("/DeleteById/Id/{orgId}")
	public ResponseEntity<String> deleteOrganizationDetails(@PathVariable int orgId)
	{
		orgrepservice.deleteOrgDetails(orgId);
		return new ResponseEntity<String>("Organization Details deleted",HttpStatus.OK);
	}
	
	
}


