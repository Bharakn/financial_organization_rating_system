package com.cg.financial_organization_rating_system.services;

import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.Users;

public interface UsersService {
void userRegistration(Users user);

int userRegistration(UsersRegistrationDto userdto);

}
