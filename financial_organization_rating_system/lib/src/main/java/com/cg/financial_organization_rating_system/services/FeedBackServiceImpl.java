package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.entities.FeedBack;
import com.cg.financial_organization_rating_system.repository.FeedBackRepository;

@Service
public class FeedBackServiceImpl implements FeedBackService{

	@Autowired
	FeedBackRepository feedrepo;

	@Override
	public int feedBackDetails(FeedBack feedback) {
		feedrepo.save(feedback);
		return feedback.getSlNo();
	}

	



	



}
