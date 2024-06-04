package com.telusko.springDataJPAMongoDB.dto;

public class CustomerDto {
 
	private int cxNo;
	private String name;
	private String city;
	public int getCxNo() {
		return cxNo;
	}
	public void setCxNo(int cxNo) {
		this.cxNo = cxNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public CustomerDto(int cxNo, String name, String city) {
		super();
		this.cxNo = cxNo;
		this.name = name;
		this.city = city;
	}
	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerDto [cxNo=" + cxNo + ", name=" + name + ", city=" + city + "]";
	}

	
}
