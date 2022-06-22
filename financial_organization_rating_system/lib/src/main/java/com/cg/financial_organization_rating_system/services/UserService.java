package com.cg.financial_organization_rating_system.services;

import java.util.List;

import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.entities.Users;
import com.cg.financial_organization_rating_system.model.UserDto;

public interface UserService {
	Users save(UsersRegistrationDto user);
    List<Users> findAll();
    void delete(int id);
    List<OrganizationRep> browseByEntity();

    Users findOne(String username);

    Users findById(int id);

    UserDto update(UserDto userDto);
}
