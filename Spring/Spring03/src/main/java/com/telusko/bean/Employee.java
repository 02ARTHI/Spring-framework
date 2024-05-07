package com.telusko.bean;

public class Employee {
	
	private int id;
	private String name;
	private Double salary;
	private String addr;
	
	static
	{
	  System.out.println("class is loaded");	
	}
//	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("employee bean is created with single constructor..");
	}
	public Employee(int id, String name, Double salary, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addr = addr;
		System.out.println("employee object is created");
	}
	
	public String employeeTask()
	{
		return "employeee productivity";
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addr=" + addr + "]";
	}
	
	

}
