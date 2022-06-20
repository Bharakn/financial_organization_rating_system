package com.cg.financial_organization_rating_system.dto;

public class UsersRegistrationDto {

private String userName;
private long userContactDetails;
private String password;
private String address;
private String role;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}


}
