package com.cg.financial_organization_rating_system.dto;

public class GetUserDetailsDto {
	private int userId;
	private String userName;
	private long userContactDetails;
	private String password;
	private int adrId;
	private int pincode;
	private String city;
	private String state;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserContactDetails() {
		return userContactDetails;
	}
	public void setUserContactDetails(long userContactDetails) {
		this.userContactDetails = userContactDetails;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAdrId() {
		return adrId;
	}
	public void setAdrId(int adrId) {
		this.adrId = adrId;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "GetUserDetails [userId=" + userId + ", userName=" + userName + ", userContactDetails="
				+ userContactDetails + ", password=" + password + ", adrId=" + adrId + ", pincode=" + pincode
				+ ", city=" + city + ", state=" + state + "]";
	}

}
