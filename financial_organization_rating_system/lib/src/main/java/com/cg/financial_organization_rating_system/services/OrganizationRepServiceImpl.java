package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;

@Service
public class OrganizationRepServiceImpl implements OrganizationRepService
{
	@Autowired
  OrganizationRepRepository orgrepo;
}
