package com.telusko.SpringJDBCExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.SpringJDBCExample.model.Student;
import com.telusko.SpringJDBCExample.service.StudentService;

@SpringBootApplication
public class SpringJdbcExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcExampleApplication.class, args);
		
		Student obj = context.getBean(Student.class );
		obj.setRollNo(190);
		obj.setMarks(200);
		obj.setName("arthi");
		
		StudentService service = context.getBean(StudentService.class);
		service.addStudents(obj);
	}

	
}
