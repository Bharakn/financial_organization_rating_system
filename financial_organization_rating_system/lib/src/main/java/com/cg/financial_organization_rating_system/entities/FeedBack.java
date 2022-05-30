package com.cg.financial_organization_rating_system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FeedBack")
public class FeedBack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int slNo;
	@Column(name="userId",nullable = false)
	private int userId;
	@Column(name="OrganizationName",nullable=false,length=30)
	private String orgName;
	@Column(name="userName",nullable=false,length = 20)
	private String userName;
	@Column(name="feedback_orgDescription",nullable=false,length = 10)
	private String feedbackByOrgDescription;
	@Column(name="feedback_orgRating",nullable=false,length = 10)
	private String feedbackByOrgRating;
	@Column(name="comments",length=40)
	private String comment;
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFeedbackByOrgDescription() {
		return feedbackByOrgDescription;
	}
	public void setFeedbackByOrgDescription(String feedbackByOrgDescription) {
		this.feedbackByOrgDescription = feedbackByOrgDescription;
	}
	public String getFeedbackByOrgRating() {
		return feedbackByOrgRating;
	}
	public void setFeedbackByOrgRating(String feedbackByOrgRating) {
		this.feedbackByOrgRating = feedbackByOrgRating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
