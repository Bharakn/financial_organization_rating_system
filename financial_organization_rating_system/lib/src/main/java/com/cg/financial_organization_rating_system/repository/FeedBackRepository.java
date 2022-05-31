package com.cg.financial_organization_rating_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.financial_organization_rating_system.entities.FeedBack;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack,Integer>{
@Query(value="select fd from FeedBack fd where fd.slNo=?1")
FeedBack getFeedbackbyId(int slNo);
}
