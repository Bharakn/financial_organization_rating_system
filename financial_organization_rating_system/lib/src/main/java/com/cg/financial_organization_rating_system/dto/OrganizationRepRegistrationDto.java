package com.cg.financial_organization_rating_system.dto;

public class OrganizationRepRegistrationDto {
	private String orgname;
	private long orgContactDetails;
	private String orgLocation;
	private String password;
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

}
