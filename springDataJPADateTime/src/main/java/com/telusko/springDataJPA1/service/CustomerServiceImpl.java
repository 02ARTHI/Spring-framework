package com.telusko.springDataJPA1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springDataJPA1.dao.CustomerInfo;
import com.telusko.springDataJPA1.dao.ICustomerRepo;

@Service
public class CustomerServiceImpl implements ICustomerService 
{
	@Autowired
	private ICustomerRepo repo;

	@Override
	public String registerCustomer(CustomerInfo cx) {
		int id=repo.save(cx).getCid();
		return "table got created with id : " + id;
	}
   
}
