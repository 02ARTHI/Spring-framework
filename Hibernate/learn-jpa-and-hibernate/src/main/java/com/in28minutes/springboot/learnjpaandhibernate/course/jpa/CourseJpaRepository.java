package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	 @PersistenceContext
	 private EntityManager entitymanager;
	 
	 public void insert(Course course)
	 {
		 entitymanager.merge(course);
	 }
	 
	 public Course findById(long id)
	 {
		 return entitymanager.find(Course.class,id);
	 }
	 
	 public void deleteById(long id)
	 {
		  Course course = entitymanager.find(Course.class,id);
		   entitymanager.remove(course);
	 }
	 

}
