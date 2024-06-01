package com.telusko.ThirdSpringWebApp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

	@GetMapping("/getCourse")
	public String getCourse(Map<String, Object> map)
	{
		Course course = new Course(1,"DevOps",980);
		map.put("course",course );
		return "course";
	}
	
	@GetMapping("/courseinfo")
	public String getCourseinfo(Map<String, Object> map)
	{
		
		map.put("cid",2 );
		map.put("cname","AWS" );
		map.put("cprice",2800 );
		return "courseInfo";
	}
}
