package com.telusko.springDataJPAMongoDB.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springDataJPAMongoDB.dao.Customer;
import com.telusko.springDataJPAMongoDB.dao.ICustomerRepo;
import com.telusko.springDataJPAMongoDB.dto.CustomerDto;

@Service
public class CustomerserviceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public String registerCustomerInfo(CustomerDto dto) {
		Customer cx = new Customer();
		BeanUtils.copyProperties(dto, cx);
		System.out.println(repo.save(cx).getId());
		return "record created";
	}

}
