package com.cg.financial_organization_rating_system.services;

import java.util.Optional;

import com.cg.financial_organization_rating_system.dto.OrgRepLoginDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepUpdateDetailsDto;
import com.cg.financial_organization_rating_system.entities.LoginDetails;

public interface OrganizationRepService {
    int addOrganizationRep(OrganizationRepRegistrationDto orgrepdto);
    void updateOrgDetails(OrganizationRepUpdateDetailsDto orgrepudto);
    
}
