package com.cg.financial_organization_rating_system.dto;

public class UsersRegistrationDto {

private String userName;
private long userContactDetails;
private String password;
private int pincode;

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


public int getPincode() {
	return pincode;
}


public void setPincode(int pincode) {
	this.pincode = pincode;
}

}
