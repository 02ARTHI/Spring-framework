package com.telusko.SpringBoot01.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SpringBoot implements Courses {
	
	
	public SpringBoot()
	{
		System.out.println("springboot bean is created");
	}
	

	@Override
	public Boolean gettheCourse(Double amount) {
		// TODO Auto-generated method stub
		System.out.println("springboot course is purchased");
		return true;
	}

}
