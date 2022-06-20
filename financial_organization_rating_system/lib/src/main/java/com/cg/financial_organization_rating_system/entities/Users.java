package com.cg.financial_organization_rating_system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Users {
	  @Id
	  @SequenceGenerator(name="uid_seq",initialValue = 100,sequenceName = "uid_seq_gen",allocationSize = 1)
	  @GeneratedValue(generator = "uid_seq",strategy = GenerationType.SEQUENCE)
	  @Column(name="user_ID")
	  private int userId;
	  @Column(name="user_Name",length=20,nullable=false)
	  private String userName;
	  @Column(name="role")
	  private String role;
	  @Column(name="contact_details",nullable = false,length=10)
	  private long userContactDetails;
	  @Column(name="password",nullable = false,length=300)
	  private String password;
	  
	  public Users() {
			
	  }

	  	  public Users(String userName, String role, String password) {
	  	super();
	  	this.userName = userName;
	  	this.role = role;
	  	this.password = password;
	  }

	  	public Users(String userName, String role, long userContactDetails, String password, String address) {
	  	super();
	  	this.userName = userName;
	  	this.role = role;
	  	this.userContactDetails = userContactDetails;
	  	this.password = password;
	  	this.address = address;
	  }

	  	public Users(int userId, String userName, String role, long userContactDetails, String password, String address) {
	  		super();
	  		this.userId = userId;
	  		this.userName = userName;
	  		this.role = role;
	  		this.userContactDetails = userContactDetails;
	  		this.password = password;
	  		this.address = address;
	  	}

	  public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	 @Column(name="Address")
	  private String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	


}
