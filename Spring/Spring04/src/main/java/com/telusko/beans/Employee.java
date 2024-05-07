package com.telusko.beans;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private Department depart;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department getDepart() {
		return depart;
	}

	public void setDepart(Department depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", depart=" + depart + "]";
	}
	
	
	

}
