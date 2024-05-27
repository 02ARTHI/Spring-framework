package com.telusko.springDataJPA1.service;

import java.util.Optional;

import com.telusko.springDataJPA1.dao.JobSeeker;

public interface IJobService
{
   public String registerJobSeeker(JobSeeker job);
   public Optional<JobSeeker> searchJobseekarInfoBy(int id);
}
