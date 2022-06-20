package com.cg.financial_organization_rating_system.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.financial_organization_rating_system.dto.OrganizationRepRegistrationDto;
import com.cg.financial_organization_rating_system.dto.OrganizationRepUpdateDetailsDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;
import com.cg.financial_organization_rating_system.repository.UsersRepository;
import com.cg.financial_organization_rating_system.services.OrganizationRepService;
import com.cg.financial_organization_rating_system.services.OrganizationRepServiceImpl;

@SpringBootTest
public class OrganizationRepDaoTest {

	@Autowired
	OrganizationRepRepository orgrepo;
	@Autowired
	UsersRepository usrerepo;
	
	@Autowired
	OrganizationRepService orgservice=new OrganizationRepServiceImpl();
	
	@Test
	void testAddOrganizationRep() {
		OrganizationRepRegistrationDto orgrepdtoAdd=new OrganizationRepRegistrationDto();
		orgrepdtoAdd.setOrgname("Finance1");
		orgrepdtoAdd.setOrgContactDetails(8787675654l);
		orgrepdtoAdd.setOrgLocation("Banglore");
		orgrepdtoAdd.setPassword("A12345");
		int orgId=orgservice.addOrganizationRep(orgrepdtoAdd);
		assertEquals("Finance1",orgrepo.getOrgRepById(orgId).getOrgName());
		assertEquals("Banglore",orgrepo.getOrgRepById(orgId).getOrgLocation());
		assertEquals("A12345",orgrepo.getOrgRepById(orgId).getPassword());
	}
     @Test
	void testUpdateOrgDetails() {
		OrganizationRepUpdateDetailsDto orgrepudtoUpdate=new OrganizationRepUpdateDetailsDto();
		orgrepudtoUpdate.setOrgId(1032);
		orgrepudtoUpdate.setOrgEconomicRiskScore(8);
		orgrepudtoUpdate.setOrgIndustryRiskScore(9);
		orgrepudtoUpdate.setOrgNetCapital(80);
		orgservice.updateOrgDetails(orgrepudtoUpdate);
		assertEquals(1032,orgrepo.updateDetails(1032).getOrgId());
		assertEquals(8,orgrepo.updateDetails(1032).getOrgEconomicRiskScore());
		assertEquals(9,orgrepo.updateDetails(1032).getOrgIndustryRiskScore());
		assertEquals(80,orgrepo.updateDetails(1032).getOrgNetCapital());	
		
	}
	@Test
	void testDeleteOrgDetails() {
		orgrepo.deleteById(1004);
		OrganizationRep orgrep=orgrepo.getOrgRepById(1004);
		assertNull(orgrep);
		
	}
}
