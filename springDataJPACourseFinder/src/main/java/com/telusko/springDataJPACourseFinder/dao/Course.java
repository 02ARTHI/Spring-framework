package com.telusko.springDataJPACourseFinder.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	private int id;
	private String courseName;
	private String courseOwner;
	private int cost;
			
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(int id, String courseName, String courseOwner, int cost) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseOwner = courseOwner;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseOwner() {
		return courseOwner;
	}
	
	public void setCourseOwner(String courseOwner) {
		this.courseOwner = courseOwner;
	}
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseOwner=" + courseOwner + ", cost=" + cost
				+ "]";
	}

	
	
}
