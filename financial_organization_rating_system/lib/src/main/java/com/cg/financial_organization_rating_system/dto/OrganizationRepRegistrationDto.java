package com.cg.financial_organization_rating_system.dto;

public class OrganizationRepRegistrationDto {
	private String orgname;
	private long orgContactDetails;
	private String orgLocation;
	private String password;
	private double orgNetCapital;
	private int orgEconomicRiskScore;
	private int orgIndustryRiskScore;
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public long getOrgContactDetails() {
		return orgContactDetails;
	}
	public void setOrgContactDetails(long orgContactDetails) {
		this.orgContactDetails = orgContactDetails;
	}
	public String getOrgLocation() {
		return orgLocation;
	}
	public void setOrgLocation(String orgLocation) {
		this.orgLocation = orgLocation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getOrgNetCapital() {
		return orgNetCapital;
	}
	public void setOrgNetCapital(double orgNetCapital) {
		this.orgNetCapital = orgNetCapital;
	}
	public int getOrgEconomicRiskScore() {
		return orgEconomicRiskScore;
	}
	public void setOrgEconomicRiskScore(int orgEconomicRiskScore) {
		this.orgEconomicRiskScore = orgEconomicRiskScore;
	}
	public int getOrgIndustryRiskScore() {
		return orgIndustryRiskScore;
	}
	public void setOrgIndustryRiskScore(int orgIndustryRiskScore) {
		this.orgIndustryRiskScore = orgIndustryRiskScore;
	}
	

}
