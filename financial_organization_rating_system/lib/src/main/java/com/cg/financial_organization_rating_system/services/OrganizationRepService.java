package com.cg.financial_organization_rating_system.services;

import com.cg.financial_organization_rating_system.entities.OrganizationRep;

public interface OrganizationRepService {
    int addOrganizationRep(OrganizationRep orgrepdto);
    void updateOrgDetails(OrganizationRep orgrepudto);
    void deleteOrgDetails(int orgId);
    
}
