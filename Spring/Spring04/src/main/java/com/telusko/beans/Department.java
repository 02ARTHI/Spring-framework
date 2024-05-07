package com.telusko.beans;

public class Department {
     private int dpNo;
     private String dpName;
	public Department(int dpNo, String dpName) {
		super();
		this.dpNo = dpNo;
		this.dpName = dpName;
		System.out.println("department bean is created");
	}
	@Override
	public String toString() {
		return "Department [dpNo=" + dpNo + ", dpName=" + dpName + "]";
	}
     
     
}
