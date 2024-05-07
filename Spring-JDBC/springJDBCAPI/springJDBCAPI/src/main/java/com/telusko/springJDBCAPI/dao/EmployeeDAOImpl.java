package com.telusko.springJDBCAPI.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements Employeepersistency {

	private static final String SQL_QUERY = "SELECT * FROM employee";

	List<Employee> employes;
	
	@Autowired
	private DataSource datasource;
	
	
	
	public EmployeeDAOImpl() {
		super();
		System.out.println("employee dao bean is created");
	}



	@Override
	public List<Employee> getEmployeesData() {
		try {
			Connection connection = datasource.getConnection();
			
			PreparedStatement pstmt = connection.prepareStatement(SQL_QUERY);
			ResultSet rs=  pstmt.executeQuery();
			employes = new ArrayList();
			
			while(rs.next())
			{
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setCity(rs.getString(2));
				emp.setName(rs.getString(3));
				emp.setSalary(rs.getDouble(4));
				
				employes.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employes;
	}

}
