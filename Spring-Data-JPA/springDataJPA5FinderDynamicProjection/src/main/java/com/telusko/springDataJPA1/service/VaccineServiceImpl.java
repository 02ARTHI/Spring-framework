package com.telusko.springDataJPA1.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springDataJPA1.dao.IVaccineRepo;
import com.telusko.springDataJPA1.dao.Vaccine;
import com.telusko.springDataJPA1.view.ResultView1;
import com.telusko.springDataJPA1.view.View;

@Service
public class VaccineServiceImpl implements IVaccineService {
	
	@Autowired
	private IVaccineRepo repo;

	public <T extends View> List<T> fetchByCostLessThan(int cost, Class<T> cls) {
		
		return repo.findByCostLessThan(cost,cls);
	}

	
}
