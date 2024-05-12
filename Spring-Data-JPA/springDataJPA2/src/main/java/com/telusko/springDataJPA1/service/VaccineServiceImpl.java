package com.telusko.springDataJPA1.service;

import java.util.List;
import java.util.Optional;

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
		
		Vaccine vaccine = repo.save(vaccineInfo);
		return "vaccine with id" + vaccine.getId()+ "successfully";
	}

	@Override
	public Iterable registerMultipleVaccines(Iterable<Vaccine> vaccines) {
		
		return repo.saveAll(vaccines);
		 
	}

	@Override
	public long getVaccinesCount() {
		
		return repo.count();
	}

	@Override
	public Boolean IdExists(int id) {
		
		return repo.existsById(id);
	}

	@Override
	public Optional<Vaccine> getVaccineById(int id) {
		
		return repo.findById(id);
		
	}

	@Override
	public String removeVaccineById(int id) {
		
		Optional<Vaccine> optional = repo.findById(id);
		if(optional.isPresent())
		{
			repo.deleteById(id);
			return "vaccines details deleted for id "+id;
		}
		 
		 return "vaccine details for given id not found";
	}

	@Override
	public String removeVaccinesByIDs(List<Integer> ids) {
		List<Vaccine> vaccines = (List<Vaccine>) repo.findAllById(ids);
		int count1=ids.size();
		int count2=vaccines.size();
		if(count1==count2)
		{
			repo.deleteAllById(ids);
			return"records of given id got deleted";
		}
		return "records of given id not found";
	}

	@Override
	public String removeVaccineByObject(Vaccine vaccine) {
		Optional<Vaccine> vac = repo.findById(vaccine.getId());
		if(vac.isPresent())
		{
			repo.delete(vaccine);
			return "Vaccine details deleted by id" + vac;
		}
		
		return "record of given id not found";
	}

}
