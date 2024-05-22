package com.telusko.springDataJPACourseFinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.telusko.springDataJPACourseFinder.service.CourseServiceIMpl;

@SpringBootApplication
public class SpringDataJpaCourseFinderApplication {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringDataJpaCourseFinderApplication.class, args);
	     CourseServiceIMpl service = container.getBean(CourseServiceIMpl.class);
	    
	    service.fetchByCost(2).forEach(c->System.out.println(c));
	}

}
