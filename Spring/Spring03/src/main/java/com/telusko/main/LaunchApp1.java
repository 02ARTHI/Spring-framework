package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.bean.Employee;

public class LaunchApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
        Employee bean1 = container.getBean("emp1",Employee.class);
        System.out.println(bean1.employeeTask());
        System.out.println(bean1);
        
        Employee bean2 = container.getBean("emp2",Employee.class);
        System.out.println(bean2.employeeTask());
        System.out.println(bean2);
        
	}

}
