package com.cg.financial_organization_rating_system.services;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.entities.FinanceTeam;
import com.cg.financial_organization_rating_system.repository.FinanceTeamRepository;

@Service
public class FinanceTeamServiceImpl implements FinanceTeamService {
	
	@Autowired
	FinanceTeamRepository financerepo;
	//@Autowired

	@Override
	public void addMem(FinanceTeam finance) {
		FinanceTeam financet=new FinanceTeam();
		financet.setAdminId(finance.getAdminId());
		financet.setPassword(finance.getPassword());
		financerepo.save(financet);
	}

	@Override
	public List<FinanceTeam> getAllDetails() {
		List<FinanceTeam> list=financerepo.findAll();
		return list;
	}

	

}
	

