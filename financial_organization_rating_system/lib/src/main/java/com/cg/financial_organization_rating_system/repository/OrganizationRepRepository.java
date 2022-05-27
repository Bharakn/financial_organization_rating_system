package com.cg.financial_organization_rating_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.financial_organization_rating_system.entities.OrganizationRep;

@Repository
public interface OrganizationRepRepository extends JpaRepository<OrganizationRep, Integer>{
  
}