package com.telusko.springDataJPA1.dao;

import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepo extends CrudRepository<CustomerInfo, Integer> {

}
