package com.cg.financial_organization_rating_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.financial_organization_rating_system.entities.FinanceTeam;

@Repository
public interface FinanceTeamRepository extends JpaRepository<FinanceTeam, Integer> {
	@Query(value = "select finance from FinanceTeam finance where finance.adminId=?1")
	FinanceTeam getFinanceTeamById(String adminId);

}
