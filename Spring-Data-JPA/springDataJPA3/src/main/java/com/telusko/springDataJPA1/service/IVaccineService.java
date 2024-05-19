package com.telusko.springDataJPA1.service;

import java.util.List;
import java.util.Optional;

import com.telusko.springDataJPA1.dao.Vaccine;

public interface IVaccineService 
{ 
	
	public Iterable<Vaccine> fetchDetails(boolean status, String... properties);
	public List<Vaccine> fetchDetails(int pgNO, int pgSize,boolean status, String... properties);
	public void fecthDetailsPagenation(int pageSize);
	
	
}	