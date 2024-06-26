package com.telusko.springDataJPA1.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springDataJPA1.dao.IVaccineRepo;
import com.telusko.springDataJPA1.dao.Vaccine;
import com.telusko.springDataJPA1.view.ResultView;

@Service
public class VaccineServiceImpl implements IVaccineService {
	
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<Vaccine> fetchByVaccineCompany(String v) {
		
		return repo.searchByVaccineCompany(v);
	}

	@Override
	public List<Vaccine> fetchByVaccineCompany(String comp1, String comp2) {
		
		return repo.searchByVaccineCompany(comp1, comp2);
	}

	@Override
	public List<String> fetchByVaccinePriceRange(int min, int max) {
		
		return repo.searchByVaccinePriceRange(min, max);
		 
	}

	@Override
	public List<Object[]> fetchVaccineInfoByVaccineName(String vac1, String vac2) {
		
		return repo.searchVaccineInfoByVaccineName(vac1, vac2);
	}

	@Override
	public int changeVaccinePriceByVaccineName(int newCost, String vac) {
		
		return repo.updateVaccinePriceByVaccineName(newCost, vac);
	}

	@Override
	public int deleteByVaccinePriceRange(int min, int max) {
		
		return repo.deleteByVaccinePriceRange(min, max);
	}

	@Override
	public int insertVaccineDetails(int id, String vaccineName, String VaccineCompany, int cost) {
		
		return repo.insertVaccineDetails(id,vaccineName, VaccineCompany, cost);
	}

	
	

	
}
