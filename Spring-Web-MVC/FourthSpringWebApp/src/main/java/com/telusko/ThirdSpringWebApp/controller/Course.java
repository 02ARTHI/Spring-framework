package com.telusko.ThirdSpringWebApp.controller;

public class Course {
   
	private int cid;
	private String courseName;
	private int price;
	public Course(int cid, String courseName, int price) {
		super();
		this.cid = cid;
		this.courseName = courseName;
		this.price = price;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", courseName=" + courseName + ", price=" + price + "]";
	}
	
	
}
