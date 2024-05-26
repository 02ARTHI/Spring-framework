package com.telusko.springDataJPA1.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerInfo {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String cname;
	private String ccity;
	private LocalDateTime dob;
	private LocalTime regTime;
	private LocalDate regDate;
	public CustomerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerInfo( String cname, String ccity, LocalDateTime dob, LocalTime regTime, LocalDate regDate) {
		super();
		
		this.cname = cname;
		this.ccity = ccity;
		this.dob = dob;
		this.regTime = regTime;
		this.regDate = regDate;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public LocalTime getRegTime() {
		return regTime;
	}
	public void setRegTime(LocalTime regTime) {
		this.regTime = regTime;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "CustomerInfo [cid=" + cid + ", cname=" + cname + ", ccity=" + ccity + ", dob=" + dob + ", regTime="
				+ regTime + ", regDate=" + regDate + "]";
	}
	
	
	
}
