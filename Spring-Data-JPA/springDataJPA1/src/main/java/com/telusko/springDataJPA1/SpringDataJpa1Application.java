package com.telusko.springDataJPA1;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springDataJPA1.dao.IStudentRepo;
import com.telusko.springDataJPA1.dao.Student;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
	    IStudentRepo repo = container.getBean(IStudentRepo.class);
	    System.out.println("implementation class"+ repo.getClass().getName());
//	    
//	    Student st = new Student(2,23,"charlie");
//	    Student st2 = (Student) repo.save(st);
//	    System.out.println(st2);
	    
	   // System.out.println(repo.count()); --> number of records in the table
	    
//	    repo.deleteById(1);
//	    System.out.println("deleted record with id 1");
	    
	    Iterable<Student> records = repo.findAll();
 	    Iterator<Student> iterator = records.iterator();
 	    while(iterator.hasNext())
 	    {
 	    	Student s = iterator.next();
 	    	System.out.println(s);
 	    }
 	    
 	    repo.findAll().forEach(s->System.out.println(s));
 	    
	    
	    Boolean status = repo.existsById(2);
	    System.out.println("id exists "+status);
	    
	                       
	}

}
