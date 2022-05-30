package com.cg.financial_organization_rating_system.services;
import java.sql.PreparedStatement;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.dto.UpdateRatingDto;
import com.cg.financial_organization_rating_system.entities.FinanceTeam;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
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

	@Override
	public Optional<OrganizationRep> viewOrganizationRepById(int orgId) {
		return orgrepo.findById(orgId);
		
	}

	@Override
	public Optional<FinanceTeam> getFinanceDetailsById(int id) {
		return financerepo.findById(id);
	}

	@Override
	public void updateRating(UpdateRatingDto updateratingdto) {
	OrganizationRep orgrep=orgrepo.getOrgRepById(updateratingdto.getOrgId());
orgrep.setOrgRating(updateratingdto.getRating());
orgrepo.save(orgrep);
		
	}

	@Override
	public List<OrganizationRep> validation() {
		
		return  orgrepo.findAll() ;
	}

	

}
	

