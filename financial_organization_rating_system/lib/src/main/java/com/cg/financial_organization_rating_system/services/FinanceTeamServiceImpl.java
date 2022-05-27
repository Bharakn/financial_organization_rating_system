package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.repository.FinanceTeamRepository;

@Service
public class FinanceTeamServiceImpl implements FinanceTeamService {
	
	@Autowired
	FinanceTeamRepository financerepo;

}
