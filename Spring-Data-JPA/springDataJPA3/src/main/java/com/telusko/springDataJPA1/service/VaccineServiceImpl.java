package com.telusko.springDataJPA1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Iterable<Vaccine> fetchDetails(boolean status, String... properties) {
		Sort sort = Sort.by(status? Direction.ASC: Direction.DESC, properties);
		return repo.findAll(sort);
		
	}



	@Override
	public List<Vaccine> fetchDetails(int pgNO, int pgSize, boolean status, String... properties) {
		Sort sort = Sort.by(status? Direction.ASC: Direction.DESC, properties);
		PageRequest pageable = PageRequest.of(pgNO, pgSize, sort);
		 Page<Vaccine> page = repo.findAll(pageable);
		 return page.getContent();
	}



	@Override
	public void fecthDetailsPagenation(int pageSize) {
		long count=4l;
		long pagesCount = count/pageSize;
		for(int i=0;i<pagesCount;i++)
		{
			PageRequest pageable = PageRequest.of(i, pageSize);
			Page<Vaccine> page = repo.findAll(pageable);
			page.getContent().forEach(c-> System.out.println(c.getVaccineCompany()+" : "+ c.getVaccineName()));
			System.out.println("-------------");
		}
		
	}

	

}
