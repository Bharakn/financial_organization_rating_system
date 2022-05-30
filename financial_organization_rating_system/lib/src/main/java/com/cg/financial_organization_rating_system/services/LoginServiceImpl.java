package com.cg.financial_organization_rating_system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.entities.LoginDetails;
import com.cg.financial_organization_rating_system.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository loginrepo;
	@Override
	public List<LoginDetails> getAllDetails() {
		List<LoginDetails> list=loginrepo.findAll();
		return list;
	}


	
}
