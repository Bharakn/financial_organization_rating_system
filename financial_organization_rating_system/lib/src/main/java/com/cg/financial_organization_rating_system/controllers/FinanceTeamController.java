package com.cg.financial_organization_rating_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.financial_organization_rating_system.entities.FinanceTeam;
import com.cg.financial_organization_rating_system.services.FinanceTeamService;

@RestController
@RequestMapping("/financeteam")
public class FinanceTeamController {

	@Autowired
	FinanceTeamService financeservice;
	@PostMapping
	public ResponseEntity<String> addDetails(@RequestBody FinanceTeam finance){
		financeservice.addMem(finance);
		return new ResponseEntity<String>("inserted",HttpStatus.OK);
	}
	@GetMapping("/get")
	public List<FinanceTeam> getalldetails() {
		return financeservice.getAllDetails();
	}
	
}
