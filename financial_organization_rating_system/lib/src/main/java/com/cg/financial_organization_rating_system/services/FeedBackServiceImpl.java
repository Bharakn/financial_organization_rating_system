package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.entities.FeedBack;
import com.cg.financial_organization_rating_system.exceptions.InvalidFeedBackChoiceException;
import com.cg.financial_organization_rating_system.repository.FeedBackRepository;

@Service
public class FeedBackServiceImpl implements FeedBackService{

	@Autowired
	FeedBackRepository feedrepo;

	@Override
	public int feedBackDetails(FeedBack feedback) {
	FeedBack fb= feedrepo.getById(feedback.getSlNo());
	if(feedback.getFeedbackByOrgDescription()!="Excellent"&&feedback.getFeedbackByOrgDescription()!="Good"&&feedback.getFeedbackByOrgDescription()!="Average"&&feedback.getFeedbackByOrgDescription()!="Bad")
	{	throw new InvalidFeedBackChoiceException("Invalid Feedback choice Please enter valid Choice 1.Excellent 2.Good 3.Average 4.Bad");
	}	
	if(feedback.getFeedbackByOrgRating()!="Excellent"&&feedback.getFeedbackByOrgRating()!="Good"&&feedback.getFeedbackByOrgRating()!="Average"&&feedback.getFeedbackByOrgRating()!="Bad")
	{	throw new InvalidFeedBackChoiceException("Invalid Feedback choice Please enter valid Choice 1.Excellent 2.Good 3.Average 4.Bad");
	}
		feedrepo.save(feedback);
		return feedback.getSlNo();
	}

	



	



}
