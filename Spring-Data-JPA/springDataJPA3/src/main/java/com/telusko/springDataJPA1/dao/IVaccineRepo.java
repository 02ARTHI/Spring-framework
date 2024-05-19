package com.telusko.springDataJPA1.dao;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository //adding this annotation is optional 
public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {

}
