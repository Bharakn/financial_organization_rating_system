package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepUpdateDetailsDto;
import com.cg.financial_organization_rating_system.entities.LoginDetails;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.exceptions.InvalidIndustryRiskScoreException;
import com.cg.financial_organization_rating_system.exceptions.InvalidNetCapitalException;
import com.cg.financial_organization_rating_system.exceptions.InvalidOrgEconomicRiskScore;
import com.cg.financial_organization_rating_system.exceptions.InvalidPasswordException;
import com.cg.financial_organization_rating_system.exceptions.InvalidUserNameException;
import com.cg.financial_organization_rating_system.exceptions.OrganizationIdNotFound;
import com.cg.financial_organization_rating_system.repository.LoginRepository;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;
import com.cg.financial_organization_rating_system.utils.PasswordManagement;

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
		if(orgrepdto.getOrgname()==null||orgrepdto.getOrgname()==" ")
			throw new InvalidUserNameException("Invalid user name");
		orgrep.setOrgName(orgrepdto.getOrgname());
		
		orgrep.setOrgContactDetails(orgrepdto.getOrgContactDetails());
		
		if(orgrepdto.getOrgLocation()==null||orgrepdto.getOrgLocation()==" ")
			throw new InvalidUserNameException("Invalid user name");
		orgrep.setOrgLocation(orgrepdto.getOrgLocation());
		
		if(orgrepdto.getPassword()==null||orgrepdto.getPassword()==" ")
			throw new InvalidPasswordException("Invalid password");
		orgrep.setPassword(PasswordManagement.encryptedPassword(orgrepdto.getPassword()));
		
		orgrepo.save(orgrep);
		
		LoginDetails login=new LoginDetails();
		login.setPassword(PasswordManagement.encryptedPassword(orgrepdto.getPassword()));
		login.setLoginId(orgrep.getOrgId());
		login.setRole("OrganizationRep");
		loginrepo.save(login);
		return orgrep.getOrgId();
		
		
	}


	@Override
	public void updateOrgDetails(OrganizationRepUpdateDetailsDto orgrepudto) {
		OrganizationRep orgrep=orgrepo.updateDetails(orgrepudto.getOrgId());
		if(orgrepudto.getOrgEconomicRiskScore()>10||orgrepudto.getOrgEconomicRiskScore()==0)
			throw new InvalidOrgEconomicRiskScore("Enter valid Organization Economic Risk Score");
		orgrep.setOrgEconomicRiskScore(orgrepudto.getOrgEconomicRiskScore());
		if(orgrepudto.getOrgIndustryRiskScore()>10||orgrepudto.getOrgIndustryRiskScore()==0)
			throw new InvalidIndustryRiskScoreException("Enter valid Organization Industry Risk Score");
		orgrep.setOrgIndustryRiskScore(orgrepudto.getOrgIndustryRiskScore());
		if(orgrepudto.getOrgNetCapital()<20)
			throw new InvalidNetCapitalException("Sorry..Your ourganization netcapital doesnt match the rating criteria");
		orgrep.setOrgNetCapital(orgrepudto.getOrgNetCapital());
		orgrepo.save(orgrep);
	
		
		
	}


	@Override
	public void deleteOrgDetails(int orgId) {
		OrganizationRep orgrep=orgrepo.getOrgRepById(orgId);
		if(orgrep==null)
			throw new OrganizationIdNotFound("Please enter valid Organization Id");
		orgrepo.deleteById(orgId);
		
	}

}
