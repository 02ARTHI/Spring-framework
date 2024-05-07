package com.telusko.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.telusko.bean.Employee;

public class LaunchLazy {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("applicationconfig.xml");
		BeanFactory container = new XmlBeanFactory(res);
//        Employee bean1 = container.getBean("emp1",Employee.class);
//        System.out.println(bean1.employeeTask());
//        System.out.println(bean1);
//        
//        Employee bean2 = container.getBean("emp2",Employee.class);
//        System.out.println(bean2.employeeTask());
//        System.out.println(bean2);
//        
	}
	
	
}
