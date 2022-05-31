package com.cg.financial_organization_rating_system.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.Users;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;
import com.cg.financial_organization_rating_system.repository.UsersRepository;
import com.cg.financial_organization_rating_system.services.OrganizationRepServiceImpl;
import com.cg.financial_organization_rating_system.services.UsersServiceImpl;

public class FinancialOrganizationRatingSystemTests {
@Autowired
UsersRepository userrepo;

@Autowired
OrganizationRepRepository orgreprepo;

@Autowired
OrganizationRepServiceImpl orgservice;

@Autowired
UsersServiceImpl userservice;

@Test
void testOrganizationRepRegistration()
{
	OrganizationRepRegistrationDto orgRepRegDto = new OrganizationRepRegistrationDto();
	orgRepRegDto.setOrgname("uheifjoe");
	orgRepRegDto.setOrgContactDetails( 175687);
	orgRepRegDto.setOrgLocation("jfjhnuehn");
	orgRepRegDto.setPassword("64ydh");
	int orgId= orgservice.addOrganizationRep(orgRepRegDto);
	assertEquals("uheifjoe",orgreprepo.getOrgRepById(orgId).getOrgName());
}

//@Test
void testUserDetail()
{
	UsersRegistrationDto userdto = new UsersRegistrationDto();
	userdto.setUserName("Pavan");
	userdto.setUserContactDetails(9989876560l);
	userdto.setPassword("pav123");
	userdto.setPincode(560001);
	int userId = userservice.userRegistration(userdto);
	
	//assertEquals("Pavan",userd)
}
}
