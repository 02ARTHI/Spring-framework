package com.telusko.SpringJDBCExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringJDBCExample.model.Student;
import com.telusko.SpringJDBCExample.repo.StudentRepo;

@Service
public class StudentService {
	
	private StudentRepo repo;

	public StudentRepo getRepo() {
		return repo;
	}
    
	@Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}

	public void addStudents(Student obj) {
		repo.save();
		// TODO Auto-generated method stub
		
	}

}
