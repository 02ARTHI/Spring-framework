package com.telusko.SpringScProj1.rest;

public class Student {

	
	private Integer id;
	
	private String name;
	
	private String courseName;

	public Student(Integer id, String name, String courseName) {
		super();
		this.id = id;
		this.name = name;
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
