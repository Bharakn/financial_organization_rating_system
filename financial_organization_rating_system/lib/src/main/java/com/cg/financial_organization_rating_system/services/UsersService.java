package com.cg.financial_organization_rating_system.services;

import java.util.List;

import com.cg.financial_organization_rating_system.dto.GetUserDetailsDto;
import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;


public interface UsersService{
int userRegistration(UsersRegistrationDto userdto);
List<OrganizationRep> browseByEntity();

}
