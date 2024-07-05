package com.telusko.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{

}
