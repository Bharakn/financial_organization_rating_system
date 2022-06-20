package com.cg.financial_organization_rating_system.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.financial_organization_rating_system.dto.UpdateRatingDto;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;
import com.cg.financial_organization_rating_system.services.FinanceTeamService;
import com.cg.financial_organization_rating_system.services.FinanceTeamServiceImpl;

@SpringBootTest
 class FinanceTeamDaoTest {
	
	@Autowired
	OrganizationRepRepository orgrepo;
	@Autowired
	FinanceTeamService service=new FinanceTeamServiceImpl();
	
	
	@Test
	void testUpdateRating() {
		UpdateRatingDto updateratingdto=new UpdateRatingDto();
		updateratingdto.setOrgId(1004);
		updateratingdto.setRating(5);
		service.updateStatus(updateratingdto);
		OrganizationRep orgrep =orgrepo.getOrgRepById(1004);
		
		assertEquals(5, orgrep.getOrgRating());
		
		
	}
	@Test
	void testValidation() {
		List<OrganizationRep> list = orgrepo.findAll();
		assertNotNull(list);
	}

}
