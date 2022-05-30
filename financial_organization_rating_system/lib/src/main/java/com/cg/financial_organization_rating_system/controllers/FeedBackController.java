package com.cg.financial_organization_rating_system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.financial_organization_rating_system.entities.FeedBack;
import com.cg.financial_organization_rating_system.services.FeedBackServiceImpl;

@RestController
@RequestMapping("/Feedback")
public class FeedBackController {

	@Autowired
	FeedBackServiceImpl feedservice;
	
	@PostMapping
	public ResponseEntity<String> addFeedBack(@RequestBody FeedBack feedback)
	{
		int slNo = feedservice.feedBackDetails(feedback);
		return new ResponseEntity<String>("Feedback added successfully and feedback serial number is ="+slNo,HttpStatus.OK);
	}
}
