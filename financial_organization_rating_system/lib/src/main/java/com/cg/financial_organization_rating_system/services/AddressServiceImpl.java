package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.entities.Address;
import com.cg.financial_organization_rating_system.exceptions.UserAddressNotFoundException;
import com.cg.financial_organization_rating_system.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addrepo;

	@Override
	public int addUserAddress(Address address) {
		addrepo.save(address);
		return address.getPincode();
		
	}

	@Override
	public Address getAddressById(int pincode) {
		Address adres = addrepo.getAdrsById(pincode);
		if(adres.getPincode()==0&&adres.getPincode()!=6)
		{throw new UserAddressNotFoundException("please enter valid pincode...");}
		return adres;
	}

	@Override
	public void deleteAddress(int pincode) {
	addrepo.deleteById(pincode);
		
	}
}
