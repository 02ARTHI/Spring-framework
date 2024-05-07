package com.telusko.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Configuration config = new Configuration();
        
        //step 2 configure hibernate.cfg.xml file to configuration object
        config.configure("hibernate.cfg.xml");
        
        //step 3 create session factory object
        SessionFactory sessionFactory = config.buildSessionFactory();
        
        //step 4get the session object from session factory
        Session session = sessionFactory.openSession();
        
        //step 5 begin the transcation within session
        Transaction transaction = session.beginTransaction();
        
        Student student = new Student();
        student.setSid(2);
        student.setScity("cbe");
        student.setSname("charlie");
        
        //step 6 perform operation
         session.persist(student);
         
         //step 7 performing transaction operation
         transaction.commit();
         
         //step 8 close the session
          session.close(); 
        
        
    
        
	}

}
