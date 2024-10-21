package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.questions;

@Repository
public interface questiondao extends JpaRepository<questions, Integer> {
  List<questions> findByCategory(String category);
}
