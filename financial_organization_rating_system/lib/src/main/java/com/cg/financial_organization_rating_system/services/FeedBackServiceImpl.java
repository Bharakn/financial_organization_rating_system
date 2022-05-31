package com.cg.financial_organization_rating_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.financial_organization_rating_system.dto.UserFeedBackDto;
import com.cg.financial_organization_rating_system.entities.FeedBack;
import com.cg.financial_organization_rating_system.entities.Users;
import com.cg.financial_organization_rating_system.exceptions.UserNotFoundException;
import com.cg.financial_organization_rating_system.repository.FeedBackRepository;
import com.cg.financial_organization_rating_system.repository.UsersRepository;

@Service
public class FeedBackServiceImpl implements FeedBackService{

	@Autowired
	FeedBackRepository feedrepo;
	
	@Autowired
	UsersRepository userrepo;

	

	@Override
	public int feedBackDetails(UserFeedBackDto userfeedDto) {
		FeedBack fb = new FeedBack();
		Users user = userrepo.getUserById(userfeedDto.getUserId());
		fb.setComment(userfeedDto.getComments());
		fb.setOrgName(userfeedDto.getOrganizationName());
		fb.setUserName(userfeedDto.getUserName());
		if(user==null)
		{
			throw new UserNotFoundException("Invalid UserId...");
		}
		fb.setUser(user);
		feedrepo.save(fb);
		return fb.getSlNo();
	}

}
