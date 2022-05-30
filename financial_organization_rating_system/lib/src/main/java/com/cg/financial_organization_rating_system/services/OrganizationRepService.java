package com.cg.financial_organization_rating_system.services;

import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.entities.RatingCriteria;

public interface OrganizationRepService {
    int addOrganizationRep(OrganizationRepRegistrationDto orgrepdto);
    void displayCriteria(RatingCriteria rc);
    
}
