package com.telusko.springDataJPAMongoDB.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICustomerRepo extends MongoRepository<Customer, String> {

}
