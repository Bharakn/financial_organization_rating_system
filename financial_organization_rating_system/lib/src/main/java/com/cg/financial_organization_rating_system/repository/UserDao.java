package com.cg.financial_organization_rating_system.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.financial_organization_rating_system.entities.Users;

@Repository
public interface UserDao extends CrudRepository<Users, Integer> {

   Users findByUserName(String username);
}
