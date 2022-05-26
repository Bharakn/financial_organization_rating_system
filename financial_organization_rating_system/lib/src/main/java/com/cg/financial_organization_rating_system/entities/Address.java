package com.cg.financial_organization_rating_system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address_Details")
public class Address 
{
	@Id
	@Column(name="Pincode",length=6)
	private int pincode;
	@Column(name="City",length=20)
	private String city;
	@Column(name="State")
	private String state;
	
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

}
