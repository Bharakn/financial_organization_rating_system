package com.cg.financial_organization_rating_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.financial_organization_rating_system.entities.OrganizationRep;

@Repository
public interface OrganizationRepRepository extends JpaRepository<OrganizationRep, Integer>{
@Query(value="select org from OrganizationRep org where org.orgId=?1")
OrganizationRep getOrgRepById(int orgId); 
	
}

