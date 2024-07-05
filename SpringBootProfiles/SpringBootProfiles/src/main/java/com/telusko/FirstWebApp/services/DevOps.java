package com.telusko.FirstWebApp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"devops","jen", "doc"})
public class DevOps implements Courses
{

	@Override
	public Boolean getTheCourse() {
		System.out.println("DevOps course is purchased.....");
		return true;
	}

}
