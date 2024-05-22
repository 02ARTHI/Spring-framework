package com.telusko.springDataJPACourseFinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springDataJPACourseFinder.dao.Course;
import com.telusko.springDataJPACourseFinder.dao.ICourseRepo;

@Service
public class CourseServiceIMpl implements ICourseService {

	@Autowired
	public ICourseRepo repo;
	
	@Override
	public List<Course> fetchByCost(int cost) {
		List<Course> courses = repo.findByCost(cost);
		System.out.println(courses);
		return courses;
	}

}
