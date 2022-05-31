package com.cg.financial_organization_rating_system.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.financial_organization_rating_system.dto.UpdateRatingDto;
import com.cg.financial_organization_rating_system.entities.FinanceTeam;
import com.cg.financial_organization_rating_system.entities.OrganizationRep;
import com.cg.financial_organization_rating_system.repository.FinanceTeamRepository;
import com.cg.financial_organization_rating_system.repository.OrganizationRepRepository;
import com.cg.financial_organization_rating_system.services.FinanceTeamService;
import com.cg.financial_organization_rating_system.services.FinanceTeamServiceImpl;

@SpringBootTest
 class FinanceTeamDaoTest {
	@Autowired
	FinanceTeamRepository financerepo;
	@Autowired
	OrganizationRepRepository orgrepo;
	@Autowired
	FinanceTeamService service=new FinanceTeamServiceImpl();
	
	@Test
	void testAddMem() {
		FinanceTeam finance=new FinanceTeam();
		finance.setAdminId("venkatesh");
		finance.setPassword("ven154");
		service.addMem(finance);
		finance= financerepo.getFinanceTeamById("venkatesh");
		assertEquals("venkatesh", finance.getAdminId());
		assertEquals("ven154", finance.getPassword());
	}
	@Test
	void testGetAllDetails() {
		List<FinanceTeam> list = financerepo.findAll();
		assertNotNull(list);
	}
	@Test
	void testUpdateRating() {
		UpdateRatingDto updateratingdto=new UpdateRatingDto();
		updateratingdto.setOrgId(1004);
		updateratingdto.setRating(5);
		service.updateRating(updateratingdto);
		OrganizationRep orgrep =orgrepo.getOrgRepById(1004);
		
		assertEquals(5, orgrep.getOrgRating());
		
		
	}
	@Test
	void testValidation() {
		List<OrganizationRep> list = orgrepo.findAll();
		assertNotNull(list);
	}

}
