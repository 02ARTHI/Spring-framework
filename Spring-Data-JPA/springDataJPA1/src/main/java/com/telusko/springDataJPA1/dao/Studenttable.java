package com.telusko.springDataJPA1.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable")
public class Studenttable {
   private int id;
   private int age;
   private String name;
}
