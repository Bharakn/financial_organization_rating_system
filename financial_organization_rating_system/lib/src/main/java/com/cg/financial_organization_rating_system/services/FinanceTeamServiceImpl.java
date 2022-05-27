package com.cg.financial_organization_rating_system.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.entities.FinanceTeam;
import com.cg.financial_organization_rating_system.repository.FinanceTeamRepository;

@Service
public class FinanceTeamServiceImpl implements FinanceTeamService {
	
	@Autowired
	FinanceTeamRepository financerepo;

	

	@Override
	public int addMem(FinanceTeam finance) {
		FinanceTeam financef=new FinanceTeam();
		financef.setAdminId(finance.getAdminId());
		financef.setPassword(finance.getPassword());
		financerepo.save(financef);
		return finance.getSlno();
	}

}
