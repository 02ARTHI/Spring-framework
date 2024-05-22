package com.telusko.springDataJPACourseFinder.service;

import java.util.List;


import com.telusko.springDataJPACourseFinder.dao.Course;

public interface ICourseService {
	public List<Course> fetchByCost(int cost);
}
