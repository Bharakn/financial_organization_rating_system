package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.entities.Address;
import com.cg.financial_organization_rating_system.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addrepo;

	@Override
	public void addUserAddress(Address address) {
		addrepo.save(address);
		
	}
}
