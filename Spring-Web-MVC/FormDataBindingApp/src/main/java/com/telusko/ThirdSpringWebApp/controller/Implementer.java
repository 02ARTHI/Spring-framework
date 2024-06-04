package com.telusko.ThirdSpringWebApp.controller;

public class Implementer {
  
	private int id;
	private String iname;
	private String icity;
	private String isalary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getIcity() {
		return icity;
	}
	public void setIcity(String icity) {
		this.icity = icity;
	}
	public String getIsalary() {
		return isalary;
	}
	public void setIsalary(String isalary) {
		this.isalary = isalary;
	}
	public Implementer(int id, String iname, String icity, String isalary) {
		super();
		this.id = id;
		this.iname = iname;
		this.icity = icity;
		this.isalary = isalary;
	}
	public Implementer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Implementer [id=" + id + ", iname=" + iname + ", icity=" + icity + ", isalary=" + isalary + "]";
	}
	
	
}
