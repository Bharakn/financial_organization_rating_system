package com.cg.financial_organization_rating_system.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.dto.UpdateRatingDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;

@Service
public class FinanceTeamServiceImpl implements FinanceTeamService {

	
	@Autowired
	OrganizationRepRepository orgrepo;

	


	@Override
	public List<OrganizationRep> validation() {
		return orgrepo.findAll();
	}

	@Override
	public void updateStatus(UpdateRatingDto updateratingdto) {
		
		
		OrganizationRep orgrep = orgrepo.getOrgRepById(updateratingdto.getOrgId());
		orgrep.setApprovalStatus(updateratingdto.getApprovalStaus());
		orgrep.setOrgRating(updateratingdto.getRating());
		orgrepo.save(orgrep);
		
	}
}
