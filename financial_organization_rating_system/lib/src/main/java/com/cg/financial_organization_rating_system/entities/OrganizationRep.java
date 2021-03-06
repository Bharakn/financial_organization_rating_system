package com.cg.financial_organization_rating_system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="OrganizationRep")
public class OrganizationRep extends Users
{
public OrganizationRep() {
	
}
  public OrganizationRep(String userName, String role, String password) {
	super(userName, role, password);
	
}
public OrganizationRep(int orgId, String orgName, long orgContactDetails, String orgLocation, String approvalStatus,
			double orgNetCapital, int orgEconomicRiskScore, int orgIndustryRiskScore, int orgRating) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		
		this.orgLocation = orgLocation;
		this.approvalStatus = approvalStatus;
		this.orgNetCapital = orgNetCapital;
		this.orgEconomicRiskScore = orgEconomicRiskScore;
		this.orgIndustryRiskScore = orgIndustryRiskScore;
		this.orgRating = orgRating;
	}
@Column(name="Organization_ID")
  private int orgId;
  @Column(name="Organization",nullable = false,length=30)
  private String orgName;

  @Column(name="Location",nullable = false,length=10)
  private String orgLocation;
  @Column(name="approvalStatus",length=10)
  private String approvalStatus;
  @Column(name="Netcapital_in_crore",nullable = false,columnDefinition ="numeric(5,2)")
  private double orgNetCapital;
  @Column(name="Economic_Risk_Score")
  private int orgEconomicRiskScore;
  @Column(name="Industry_Risk_Score")
  private int orgIndustryRiskScore;
  @Column(name="Rating")
  private int orgRating;
  
 
  
public int getOrgRating() {
	return orgRating;
}
public void setOrgRating(int orgRating) {
	this.orgRating = orgRating;
}
public int getOrgId() {
	return orgId;
}
public void setOrgId(int orgId) {
	this.orgId = orgId;
}
public String getOrgName() {
	return orgName;
}
public void setOrgName(String orgName) {
	this.orgName = orgName;
}



public String getApprovalStatus() {
	return approvalStatus;
}
public void setApprovalStatus(String approvalStatus) {
	this.approvalStatus = approvalStatus;
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
public String getOrgLocation() {
	return orgLocation;
}
public void setOrgLocation(String orgLocation) {
	this.orgLocation = orgLocation;
}
}
