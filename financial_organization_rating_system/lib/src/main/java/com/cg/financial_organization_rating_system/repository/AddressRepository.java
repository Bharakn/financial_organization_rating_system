package com.cg.financial_organization_rating_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.financial_organization_rating_system.entities.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
	@Query(value = "select adrs from Address adrs where adrs.adrId=?1")
	Address getAdrsById(int adrId);
}
