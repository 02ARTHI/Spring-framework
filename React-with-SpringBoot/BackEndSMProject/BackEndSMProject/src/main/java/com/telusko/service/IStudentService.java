package com.telusko.service;

import java.util.List;

import com.telusko.model.Student;

public interface IStudentService 
{
	
	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student getStudentById(Long id);
	public Student updateStudent(Student student);
	public void deleteStudentById(Long id);

}
