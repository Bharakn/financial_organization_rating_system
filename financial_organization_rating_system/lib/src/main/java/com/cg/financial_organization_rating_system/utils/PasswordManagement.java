package com.cg.financial_organization_rating_system.utils;

public class PasswordManagement {
public static String encryptedPassword(String password)
{
	StringBuilder encryptedPassword = new StringBuilder("");
	for(int i=0;i<password.length();i++)
	{
		if(i<=password.length()/2) {
	encryptedPassword.append(password.charAt(i)-13);}
		else
			encryptedPassword.append(password.charAt(i)-5);		
	}
	return encryptedPassword.toString();
}
private PasswordManagement()
{
	
}
}
