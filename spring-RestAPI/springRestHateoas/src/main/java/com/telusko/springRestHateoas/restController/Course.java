package com.telusko.springRestHateoas.restController;

import org.springframework.hateoas.RepresentationModel;

public class Course extends RepresentationModel{

	private int cid;
	private String cname;
	private Double price;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Course(int cid, String cname, Double price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.price = price;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", price=" + price + "]";
	}
	
	
}
