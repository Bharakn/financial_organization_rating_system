package com.cg.financial_organization_rating_system.services;

import java.util.List;
import com.cg.financial_organization_rating_system.dto.UpdateRatingDto;
import com.cg.financial_organization_rating_system.entities.FinanceTeam;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;

public interface FinanceTeamService {
	public void addMem(FinanceTeam finance);

	public List<FinanceTeam> getAllDetails();

	public List<OrganizationRep> validation();
	
	void updateStatus(UpdateRatingDto updateratingdto);

}
