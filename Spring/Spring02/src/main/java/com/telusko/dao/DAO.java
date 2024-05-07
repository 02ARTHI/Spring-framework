package com.telusko.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DAO {
  
	public DAO()
	{
		System.out.println("DAO bean is created");
	}
	
	public void disp()
	{
		System.out.println("inside dao");
	}
	
}
