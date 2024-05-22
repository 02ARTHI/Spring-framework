package com.telusko.springDataJPACourseFinder.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICourseRepo extends JpaRepository<Course, Integer> {
	public List<Course> findByCost(int cost);
}
