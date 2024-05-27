package com.telusko.springDataJPA1.service;

import com.telusko.springDataJPA1.dao.CustomerInfo;

public interface ICustomerService {
	public String registerCustomer(CustomerInfo cx);
	public Iterable<CustomerInfo> fetchAllCxInfo();
}
