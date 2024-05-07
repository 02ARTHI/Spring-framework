package com.telusko.SpringDataJDBC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Springjdbc 
{
	private static final String SQL_QUERY = "INSERT INTO STUDENT(id,name,city) values(1,'arthi','klr')";
	private static final String SQL_QUERY_DELETE = "DELETE FROM STUDENT WHERE ID=1";
	private static final String SQL_QUERY_COURSE = "INSERT INTO course (cid,cname) VALUES(?,?)";
	@Autowired
    private JdbcTemplate jdbc;
	
	
//	public void insert()
//	{
//		System.out.println("jdbctemplate:" + jdbc.getClass().getName());
//		jdbc.update(SQL_QUERY);
//	}
	
	public void insert(CourseDetails course)
	{
		System.out.println("course insertion");
		jdbc.update(SQL_QUERY_COURSE, course.getCid(), course.getCname());
	}
	
	public void delete(int id)
	{
		System.out.println("jdbctemplate:" + jdbc.getClass().getName());
		//jdbc.update(SQL_QUERY_DELETE, id);
	}
	
}
