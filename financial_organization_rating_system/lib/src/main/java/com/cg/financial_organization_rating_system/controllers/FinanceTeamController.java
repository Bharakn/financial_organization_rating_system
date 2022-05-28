package com.cg.financial_organization_rating_system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.financial_organization_rating_system.services.FinanceTeamService;

@RestController
@RequestMapping("/financeteam")
public class FinanceTeamController {

	@Autowired
	FinanceTeamService financeservice;
	
	
	
}
