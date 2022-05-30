package com.cg.financial_organization_rating_system.services;

import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepUpdateDetailsDto;

public interface OrganizationRepService {
    int addOrganizationRep(OrganizationRepRegistrationDto orgrepdto);
    void updateOrgDetails(OrganizationRepUpdateDetailsDto orgrepudto);
    
}
