package com.telusko.SpringBoot01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Telusko {
    
	@Autowired
	@Qualifier("hibernate")
	private Courses course;
	
	public Boolean buyTheCourse()
	{
		return course.gettheCourse(454.8);
	}
	
}
