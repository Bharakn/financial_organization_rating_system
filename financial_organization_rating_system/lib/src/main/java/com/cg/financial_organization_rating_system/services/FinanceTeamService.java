package com.cg.financial_organization_rating_system.services;



import java.util.List;

import com.cg.financial_organization_rating_system.entities.FinanceTeam;

public interface FinanceTeamService {
	public int addMem(FinanceTeam finance);
public List<FinanceTeam> getDetailsById();
public List<FinanceTeam> getAllDetails(String id);
}
