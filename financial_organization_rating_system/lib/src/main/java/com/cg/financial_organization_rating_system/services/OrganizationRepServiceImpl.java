package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepUpdateDetailsDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;

@Service
public class OrganizationRepServiceImpl implements OrganizationRepService
{
	@Autowired
  OrganizationRepRepository orgrepo;

	
	@Override
	public int addOrganizationRep(OrganizationRepRegistrationDto orgrepdto) {
		OrganizationRep orgrep=new OrganizationRep();
		orgrep.setOrgName(orgrepdto.getOrgname());
		orgrep.setOrgContactDetails(orgrepdto.getOrgContactDetails());
		orgrep.setOrgLocation(orgrepdto.getOrgLocation());
		orgrep.setPassword(orgrepdto.getPassword());
		orgrepo.save(orgrep);
		return orgrep.getOrgId();
	}

}
