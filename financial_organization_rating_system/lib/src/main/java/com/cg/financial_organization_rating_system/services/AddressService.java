package com.cg.financial_organization_rating_system.services;

import com.cg.financial_organization_rating_system.entities.Address;

public interface AddressService {
int addUserAddress(Address address);
Address getAddressById(int pincode);
void deleteAddress(int pincode);
}
