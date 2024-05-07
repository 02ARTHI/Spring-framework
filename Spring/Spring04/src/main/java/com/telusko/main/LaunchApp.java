package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.beans.Department;
import com.telusko.beans.Employee;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		Employee e = container.getBean(Employee.class);
		System.out.println(e);
		
		Department d = container.getBean(Department.class);
		System.out.println(d);
		
	}
}
