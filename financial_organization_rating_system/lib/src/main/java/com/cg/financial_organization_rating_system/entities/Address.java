package com.cg.financial_organization_rating_system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address 
{
	@Id
	@Column(name="pincode",length=6)
	private int pincode;
	@Column(name="city",length=20)
	private String city;
	@Column(name="state")
	private String state;
	public Address(int pincode) {
		this.pincode=pincode;
	}
	public Address(int pincode, String city, String state) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	public Address() {
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
