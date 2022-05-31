package com.cg.financial_organization_rating_system.services;

import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepUpdateDetailsDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;

public interface OrganizationRepService {
    int addOrganizationRep(OrganizationRepRegistrationDto orgrepdto);
    void updateOrgDetails(OrganizationRepUpdateDetailsDto orgrepudto);
    void deleteOrgDetails(int orgId);
    
}
