package com.cg.financial_organization_rating_system.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.dto.UpdateRatingDto;
import com.cg.financial_organization_rating_system.entities.FinanceTeam;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.exceptions.FinanceTeamNotFoundException;
import com.cg.financial_organization_rating_system.exceptions.InvalidPasswordException;
import com.cg.financial_organization_rating_system.exceptions.OrganizationRepNotFoundException;
import com.cg.financial_organization_rating_system.repository.FinanceTeamRepository;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;

@Service
public class FinanceTeamServiceImpl implements FinanceTeamService {

	@Autowired
	FinanceTeamRepository financerepo;
	@Autowired
	OrganizationRepRepository orgrepo;

	@Override
	public void addMem(FinanceTeam finance) {
		FinanceTeam financet = new FinanceTeam();
		financet.setAdminId(finance.getAdminId());
		if (finance.getPassword() == null || finance.getPassword() == "") {
			throw new InvalidPasswordException("password should not be null, try again");
		}
		financet.setPassword(finance.getPassword());
		financerepo.save(financet);
	}

	@Override
	public List<FinanceTeam> getAllDetails() {
		List<FinanceTeam> list = financerepo.findAll();
		if (list.isEmpty() == true) {
			throw new FinanceTeamNotFoundException("financeteamlist is empty");
		}
		return list;
	}


	@Override
	public List<OrganizationRep> validation() {
		return orgrepo.findAll();
	}

	@Override
	public void updateStatus(UpdateRatingDto updateratingdto) {
		List<OrganizationRep> list3 = orgrepo.findAll();
		for (OrganizationRep org : list3) {
			if (org.getOrgId() != updateratingdto.getOrgId()) {
				throw new OrganizationRepNotFoundException("organization id is invalid");
			}
		}
		OrganizationRep orgrep = orgrepo.getOrgRepById(updateratingdto.getOrgId());
		orgrep.setApprovalStatus(updateratingdto.getApprovalStaus());
		orgrep.setOrgRating(updateratingdto.getRating());
		orgrepo.save(orgrep);
		
	}
}
