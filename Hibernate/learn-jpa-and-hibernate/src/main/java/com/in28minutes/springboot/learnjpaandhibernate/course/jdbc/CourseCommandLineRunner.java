package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
   
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1,"learn aws","boo"));
		repository.save(new Course(2,"java","arthi"));
		repository.save(new Course(3,"data science","vichu"));
		repository.save(new Course(4,"learn devops","arthi"));
		repository.deleteById(1l);
		System.out.println(repository.findById(3l));
		System.out.println(repository.findById(4l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("boo"));
		System.out.println(repository.findByAuthor("arthi"));
		System.out.println(repository.findByAuthor("vichu"));
		System.out.println(repository.findByAuthor(""));
		System.out.println(repository.findByName("java"));
		
	}

}
