package com.telusko.springRest1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springRest1.model.Course;

@RestController
public class CourseRestController {
   
	@PostMapping(value="/addcourses", consumes={"application/xml","application/json"})
	public ResponseEntity<String> adddetails(@RequestBody Course course)
	{
		System.out.println(course);
		String msg="course details added into db";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/getcourses", produces= {"application/xml","application/json"})
	public Course getdetails()
	{
		Course obj = new Course(01,"dsa",987.6);
		return obj;
	}
}
