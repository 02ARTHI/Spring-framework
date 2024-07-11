package com.telusko.springSecurity01.rest;

public class Student {
 
	
	private int id;
	private String name;
	private String courseName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Student(int id, String name, String courseName) {
		super();
		this.id = id;
		this.name = name;
		this.courseName = courseName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + "]";
	}
	
	
}
