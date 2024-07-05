package com.telusko.FirstWebApp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("sb")
public class SpringBoot implements Courses {

	@Override
	public Boolean getTheCourse() {
		System.out.println("Spring course is purchased.....");
		return true;
	}

}
