package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.questions;

@Repository
public interface questiondao extends JpaRepository<questions, Integer> {
  List<questions> findByCategory(String category);
 @Query(value="SELECT * from questions q WHERE q.category=:category ORDER BY RANDOM() LIMIT :num", nativeQuery=true)
 List<questions> createAQuizWithNumOfQues(String category, int num);
}
