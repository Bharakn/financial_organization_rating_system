package com.cg.financial_organization_rating_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.financial_organization_rating_system.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

}
