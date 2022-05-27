package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.entities.Users;
import com.cg.financial_organization_rating_system.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersRepository userrepo;

	@Override
	public void userRegistration(Users user) {
	
		
	}

	

}
