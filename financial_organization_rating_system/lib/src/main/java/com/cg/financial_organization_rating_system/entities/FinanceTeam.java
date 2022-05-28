package com.cg.financial_organization_rating_system.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="finance_team")
public class FinanceTeam {

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name="slno")
	   private int slno;
	   @Column(name="AdminID",nullable=false,length=20)
	   private String adminId;
	   @Column(name="Password",nullable = false,length=20)
	   private String password;
	  /* @OneToOne
	   @JoinColumn(name="orgId")
	   private OrganizationRep organizationrep;
	   public OrganizationRep getOrganizationrep() {
		return organizationrep;
	}
	public void setOrganizationrep(OrganizationRep organizationrep) {
		this.organizationrep = organizationrep;
	}*/
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
