package com.telusko.springDataJPA1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springDataJPA1.dao.IVaccineRepo;
import com.telusko.springDataJPA1.dao.Vaccine;

@Service
public class VaccineServiceImpl implements IVaccineService {
	
	@Autowired
	private IVaccineRepo repo;

	@Override
	public String registerVaccineInfo(Vaccine vaccineInfo) {
		// TODO Auto-generated method stub
		Vaccine vaccine = repo.save(vaccineInfo);
		return "vaccine with id" + vaccine.getId()+ "successfully";
	}

	@Override
	public Iterable registerMultipleVaccines(Iterable<Vaccine> vaccines) {
		// TODO Auto-generated method stub
		return repo.saveAll(vaccines);
		 
	}

	@Override
	public long getVaccinesCount() {
		// TODO Auto-generated method stub
		return repo.count();
	}

	@Override
	public Boolean IdExists(int id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

}
