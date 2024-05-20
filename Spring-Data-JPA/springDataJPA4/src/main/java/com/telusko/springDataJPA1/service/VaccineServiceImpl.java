package com.telusko.springDataJPA1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.springDataJPA1.dao.IVaccineRepo;
import com.telusko.springDataJPA1.dao.Vaccine;

@Service
public class VaccineServiceImpl implements IVaccineService {
	
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<Vaccine> searchByVaccineInfo(Vaccine vaccine, boolean status, String... properties) {
		Example<Vaccine> example = Example.of(vaccine);
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(example, sort);
		 
	}

	@Override
	public Vaccine searchVaccineById(int id) {
		//return repo.getById(id);
		return repo.getReferenceById(id);
		 
	}

	@Override
	public List<Vaccine> searchVaccineByObject(Vaccine vaccine) {
		Example<Vaccine> example = Example.of(vaccine);
		
		return repo.findAll(example);
		
	}

	@Override
	public String removeVaccaineInfoByIds(Iterable<Integer> ids) {
		 repo.deleteAllByIdInBatch(ids);
		 return "deleted records for given id";
		 
	}

    

}
