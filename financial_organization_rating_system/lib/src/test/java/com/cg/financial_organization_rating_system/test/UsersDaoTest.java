package com.cg.financial_organization_rating_system.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.financial_organization_rating_system.dto.UsersRegistrationDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.entities.Users;
import com.cg.financial_organization_rating_system.repository.AddressRepository;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;
import com.cg.financial_organization_rating_system.repository.UsersRepository;
import com.cg.financial_organization_rating_system.services.UsersService;
import com.cg.financial_organization_rating_system.services.UsersServiceImpl;

@SpringBootTest
class UsersDaoTest {

	@Autowired
	UsersRepository userRepo;

	@Autowired
	OrganizationRepRepository orgRepo;

	@Autowired
	AddressRepository addressRepo;

	@Autowired

	UsersService userservice = new UsersServiceImpl();

	@Test
	void tesUserRegistration() {
		UsersRegistrationDto userdto = new UsersRegistrationDto();
		userdto.setUserName("Mahesh");
		userdto.setPassword("p1a2s3");
		userdto.setUserContactDetails(9889876756l);
		userdto.setAddress("560001");
		int userId = userservice.userRegistration(userdto);
		assertEquals("Mahesh", userRepo.getUserById(userId).getUserName());
		assertEquals("p1a2s3", userRepo.getUserById(userId).getPassword());
		assertEquals(9889876756l, userRepo.getUserById(userId).getUserContactDetails());
		assertEquals(560001, addressRepo.getAdrsById(560001).getPincode());
	}

	@Test
	void testBrowseByEntity() {
		List<OrganizationRep> orgrepList = orgRepo.findAll();
		assertNotNull(orgrepList);
	}

	@Test
	void testGetUserDetail() {
		List<Users> userList = userRepo.findAll();
		assertNotNull(userList);

	}

	@Test
	void testGetUserDetails() {
		List<Users> userList = userRepo.findAll();
		assertNull(userList);
	}

	@Test
	void testBrowseByEntityId() {
		OrganizationRep orgrep = orgRepo.getOrgRepById(1005);
		assertEquals(1005, orgrep.getOrgId());
	}

	@Test
	void testDeleteUser() {
		userRepo.deleteById(108);
		Users user = userRepo.getUserById(108);
		assertNull(user);
	}

}
