package com.cg.financial_organization_rating_system.dto;

public class UpdateRatingDto {
	private int orgId;
	private int rating;
	private String approvalStaus;
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public String getApprovalStaus() {
		return approvalStaus;
	}
	public void setApprovalStaus(String approvalStaus) {
		this.approvalStaus = approvalStaus;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	

}
