package com.telusko.springDataJPA1.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //adding this annotation is optional 
public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {

}
