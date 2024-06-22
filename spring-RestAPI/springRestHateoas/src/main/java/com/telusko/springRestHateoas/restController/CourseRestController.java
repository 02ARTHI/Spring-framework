package com.telusko.springRestHateoas.restController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CourseRestController {
    
	@GetMapping("/getCourses/{id}")
	public ResponseEntity<Course> getCourseDetails(@PathVariable("id") int id)
	{
		Course obj = new Course(02,"aws",9000.0);
		return new ResponseEntity<Course>(obj,HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public List<Course> allcourse()
	{
		List<Course> course = new ArrayList<>();
		course.add(new Course(101,"azure",98754.3));
		course.add(new Course(102,"back end",98754.3));
		course.add(new Course(103,"front end",98754.3));
		return course;
	}
	
	@GetMapping("/getthread/{id}")
	public ResponseEntity<Course> getJavaCourseDetails(@PathVariable("id") int id)
	{
		Course obj = new Course(22,"devOps",9000.0);
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseRestController.class).allcourse()).withRel("/getall");
		obj.add(link);
		return new ResponseEntity<Course>(obj,HttpStatus.OK);
	}
	
}
