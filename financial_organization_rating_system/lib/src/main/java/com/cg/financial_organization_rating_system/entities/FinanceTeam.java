package com.cg.financial_organization_rating_system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="finace_team")
public class FinanceTeam {

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name="slno")
	   private int slno;
	   @Column(name="AdminID",nullable=false,length=7)
	   private String adminId;
	   @Column(name="Password",nullable = false,length=6)
	   private String password;
	   
	   
	   public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}  
}
