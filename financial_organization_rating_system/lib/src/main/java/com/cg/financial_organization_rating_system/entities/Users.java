package com.cg.financial_organization_rating_system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class Users {

	  @Id
	  @SequenceGenerator(name="uid_seq",initialValue = 100,sequenceName = "uid_seq_gen",allocationSize = 1)
	  @GeneratedValue(generator = "uid_seq",strategy = GenerationType.SEQUENCE)
	  @Column(name="user_ID")
	  private int userId;
	  @Column(name="user_Name",length=20,nullable=false)
	  private String userName;
	  @Column(name="contact_details",nullable = false,length=10)
	  private long userContactDetails;
	  @Column(name="password",nullable = false,length=6)
	  private String password;

	  @OneToOne
	  @JoinColumn(name="pincode")
	  private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



}
