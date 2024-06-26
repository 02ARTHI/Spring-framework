package com.telusko.springJDBCAPI.dao;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String city;
	private String name;
	private Double salary;
	
	public Employee()
	{
		System.out.println("employee bean is created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", city=" + city + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
	

}
