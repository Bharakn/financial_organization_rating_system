package com.cg.financial_organization_rating_system.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.financial_organization_rating_system.dto.OrgRepLoginDto;
import com.cg.financial_organization_rating_system.dto.UserLoginDto;
import com.cg.financial_organization_rating_system.entities.LoginDetails;
import com.cg.financial_organization_rating_system.repository.FinanceTeamRepository;
import com.cg.financial_organization_rating_system.services.FinanceTeamServiceImpl;
import com.cg.financial_organization_rating_system.services.LoginServiceImpl;

@RestController
@RequestMapping("/login")
public class LoginController 
{
	
}
