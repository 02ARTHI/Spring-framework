package com.telusko.FirstWebApp.services;


public class Mockito implements Courses {

	@Override
	public Boolean getTheCourse() {
		System.out.println("Mockito cours is purchased");
		return true;
	}

}
