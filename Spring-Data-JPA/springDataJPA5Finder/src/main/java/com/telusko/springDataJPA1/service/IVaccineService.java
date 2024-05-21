package com.telusko.springDataJPA1.service;

import java.util.List;
import java.util.Optional;

import com.telusko.springDataJPA1.dao.Vaccine;

public interface IVaccineService 
{ 
	
	public List<Vaccine> searchByVaccineInfo(Vaccine vaccine, boolean status, String... properties);
	public Vaccine searchVaccineById(int id);
	public List<Vaccine> searchVaccineByObject(Vaccine vaccine);
	public String removeVaccaineInfoByIds(Iterable<Integer> ids);
	
	
}	