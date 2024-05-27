package com.telusko.springDataJPA1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springDataJPA1.dao.IJobRepo;
import com.telusko.springDataJPA1.dao.JobSeeker;

@Service
public class JobServiceImpl implements IJobService {
	
	@Autowired
	private IJobRepo repo;

	@Override
	public String registerJobSeeker(JobSeeker job) {
		
		int id=repo.save(job).getId();
		return "job seeker registered with id " + id;
	}

	@Override
	public Optional<JobSeeker> searchJobseekarInfoBy(int id) {
		
		return repo.findById(id);
	}

}
