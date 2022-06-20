package com.cg.financial_organization_rating_system.services;

import java.util.List;
import com.cg.financial_organization_rating_system.dto.UpdateRatingDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;

public interface FinanceTeamService {

	public List<OrganizationRep> validation();

	void updateStatus(UpdateRatingDto updateratingdto);

}
