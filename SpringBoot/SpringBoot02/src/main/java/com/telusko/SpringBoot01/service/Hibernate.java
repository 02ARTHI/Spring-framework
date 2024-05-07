package com.telusko.SpringBoot01.service;

import org.springframework.stereotype.Service;

@Service
public class Hibernate implements Courses {
	
	public Hibernate()
	{
		System.out.println("Hibernate bean is created");
	}
	

	@Override
	public Boolean gettheCourse(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate course is purchased");
		return true;
	}

}
