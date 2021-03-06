package com.cg.financial_organization_rating_system.controllers;

import java.util.List;
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

import com.cg.financial_organization_rating_system.dto.UserFeedBackDto;
import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.entities.Users;
import com.cg.financial_organization_rating_system.repository.LoginRepository;
import com.cg.financial_organization_rating_system.services.FeedBackServiceImpl;
import com.cg.financial_organization_rating_system.services.UsersServiceImpl;



@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UsersServiceImpl userservice;
	
	@Autowired
	LoginRepository loginservice;
	
	@PostMapping
	public ResponseEntity<String> userRegistration(@RequestBody UsersRegistrationDto userDto)
	{
		
		int userId=userservice.userRegistration(userDto);
		
		return new ResponseEntity<String>("User Registered Successfully and your userId is = "+userId,HttpStatus.OK);
	}
	@GetMapping("/RegisteredUsers")
	public ResponseEntity<List<Users>> getUsersDetails()

	{
	List<Users>	userlist = userservice.getUserDetails();
		return new ResponseEntity<List<Users>>(userlist,HttpStatus.OK);
	}
	
	
     
	@GetMapping("/browsebyentity")
	public ResponseEntity<List<OrganizationRep>> getDetailsByEntity()
	{
		List<OrganizationRep> orgrep =userservice.browseByEntity();
		return new ResponseEntity<List<OrganizationRep>>(orgrep,HttpStatus.OK);
		
	}
	@GetMapping("/browsebyOrgId/Id{orgId}")
	public ResponseEntity <OrganizationRep> getDetailsByEntityId(@PathVariable int orgId)
	{
		OrganizationRep orgrep =userservice.browseByEntityId(orgId);
		return new ResponseEntity<OrganizationRep>(orgrep,HttpStatus.OK);
	}
	
	@DeleteMapping("/id/{userId}")
	public ResponseEntity<String> deleteDepartment(@PathVariable int userId){
		userservice.deleteUser(userId);
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}

	
	@Autowired
	FeedBackServiceImpl feedservice;
	
	@PostMapping("/FeedBack")
	public ResponseEntity<String> addFeedBack(@RequestBody UserFeedBackDto userfeedbackdto)
	{
		int slNo = feedservice.feedBackDetails(userfeedbackdto);
		return new ResponseEntity<String>("Feedback added successfully and feedback serial number is ="+slNo,HttpStatus.OK);
	}

	
	
	
	
	

	
	
	



}
