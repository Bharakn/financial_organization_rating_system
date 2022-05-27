package com.cg.financial_organization_rating_system.dto;

public class OrganizationRepUpdateDetailsDto {
	private double orgNetCapital;
	private int orgEconomicRiskScore;
	private int orgIndustryRiskScore;
	private int orgId;
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
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
