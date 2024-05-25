package com.telusko.springDataJPA1.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.telusko.springDataJPA1.dao.Vaccine;
import com.telusko.springDataJPA1.view.ResultView;

public interface IVaccineService 
{ 
	

	public List<Vaccine> fetchByVaccineCompany( String v);
	
	
	public List<Vaccine> fetchByVaccineCompany(String comp1, String comp2);
	
	public List<String> fetchByVaccinePriceRange(int min, int max);
	
	public List<Object[]> fetchVaccineInfoByVaccineName(String vac1, String vac2);
	
	public int changeVaccinePriceByVaccineName(int newCost, String vac);
	
	public int deleteByVaccinePriceRange(int min, int max);
	
	public int insertVaccineDetails(int id,String vaccineName, String VaccineCompany, int cost);
}
