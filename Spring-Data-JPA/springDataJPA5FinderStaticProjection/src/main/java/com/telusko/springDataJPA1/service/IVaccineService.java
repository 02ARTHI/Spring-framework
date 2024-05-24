package com.telusko.springDataJPA1.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.telusko.springDataJPA1.dao.Vaccine;
import com.telusko.springDataJPA1.view.ResultView;

public interface IVaccineService 
{ 
	
	public List<ResultView> fetchByCostLessThan(int cost);
}
