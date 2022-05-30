package com.cg.financial_organization_rating_system.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.dto.GetUserDetailsDto;
import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.Address;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.entities.Users;
import com.cg.financial_organization_rating_system.repository.AddressRepository;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;
import com.cg.financial_organization_rating_system.repository.UsersRepository;


@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersRepository userrepo;
	
	@Autowired
	AddressRepository adrsrepo;
	
	@Autowired
	OrganizationRepRepository orgreprepo;

	@Override
	public int userRegistration(UsersRegistrationDto userdto) {
	Address address = adrsrepo.getAdrsById(userdto.getPincode());
	Users usr = new Users();
	usr.setUserName(userdto.getUserName());
	usr.setUserContactDetails(userdto.getUserContactDetails());
	usr.setPassword(userdto.getPassword());
	usr.setAddress(address);
	userrepo.save(usr);
	
	return usr.getUserId();
		
	}

	@Override
	public List<OrganizationRep> browseByEntity() {
		
		return orgreprepo.findAll();
	}

	

	@Override
	public List<Users> getUserDetails() {

		return userrepo.findAll();
	}

	@Override
	public Optional<OrganizationRep> browseByEntityId(int orgId) {
		
		return orgreprepo.findById(orgId);
	}

	

}
