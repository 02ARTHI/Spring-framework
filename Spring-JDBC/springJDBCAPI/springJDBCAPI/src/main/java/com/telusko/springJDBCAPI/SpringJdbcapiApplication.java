package com.telusko.springJDBCAPI;

import java.util.Iterator;
import java.util.List;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springJDBCAPI.dao.Employee;
import com.telusko.springJDBCAPI.dao.EmployeeDAOImpl;

@SpringBootApplication
public class SpringJdbcapiApplication {

	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(SpringJdbcapiApplication.class, args);
		EmployeeDAOImpl dao = container.getBean(EmployeeDAOImpl.class);
		
		//collection api
//		List<Employee> employees = dao.getEmployeesData();
//		Iterator<Employee> itr = employees.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		//stream api
		dao.getEmployeesData().forEach(e->System.out.println(e));
	}

}
