package com.telusko.springDataJPA1.dao;

import org.springframework.data.repository.CrudRepository;

public interface IJobRepo extends CrudRepository<JobSeeker, Integer> {

}
