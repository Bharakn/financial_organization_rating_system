package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.dto.OrgRepLoginDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepUpdateDetailsDto;
import com.cg.financial_organization_rating_system.entities.LoginDetails;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.repository.LoginRepository;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;

@Service
public class OrganizationRepServiceImpl implements OrganizationRepService
{
	@Autowired
  OrganizationRepRepository orgrepo;
	@Autowired
	LoginRepository loginrepo;

	
	@Override
	public int addOrganizationRep(OrganizationRepRegistrationDto orgrepdto) {
		OrganizationRep orgrep=new OrganizationRep();
		orgrep.setOrgName(orgrepdto.getOrgname());
		orgrep.setOrgContactDetails(orgrepdto.getOrgContactDetails());
		orgrep.setOrgLocation(orgrepdto.getOrgLocation());
		orgrep.setPassword(orgrepdto.getPassword());
		orgrepo.save(orgrep);
		
		LoginDetails login=new LoginDetails();
		login.setPassword(orgrepdto.getPassword());
		login.setLoginId(orgrep.getOrgId());
		login.setRole("OrganizationRep");
		loginrepo.save(login);
		return orgrep.getOrgId();
		
		
	}


	@Override
	public void updateOrgDetails(OrganizationRepUpdateDetailsDto orgrepudto) {
		OrganizationRep orgrep=orgrepo.updateDetails(orgrepudto.getOrgId());
		orgrep.setOrgEconomicRiskScore(orgrepudto.getOrgEconomicRiskScore());
		orgrep.setOrgIndustryRiskScore(orgrepudto.getOrgIndustryRiskScore());
		orgrep.setOrgNetCapital(orgrepudto.getOrgNetCapital());
		orgrepo.save(orgrep);
		
		
	}

}
