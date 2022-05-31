package com.cg.financial_organization_rating_system.services;

import java.util.List;
import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.entities.Users;

public interface UsersService {
	int userRegistration(UsersRegistrationDto userdto);
	List<OrganizationRep> browseByEntity();
	List<Users> getUserDetails();
	OrganizationRep browseByEntityId(int orgId);
	void deleteUser(int userId);
	
}
