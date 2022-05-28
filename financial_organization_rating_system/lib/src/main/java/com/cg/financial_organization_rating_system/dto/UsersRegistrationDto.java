package com.cg.financial_organization_rating_system.dto;

public class UsersRegistrationDto {
private int userId;
private String userName;
private long userContactDetails;
private String password;
private int adrId;


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


@Override
public String toString() {
	return "UsersRegistrationDto [userName=" + userName + ", userContactDetails=" + userContactDetails + ", password="
			+ password + ", adrId=" + adrId + "]";
}


}
