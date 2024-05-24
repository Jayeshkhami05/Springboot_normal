package com.Jayesh.SpringbootNormal.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Jayesh.SpringbootNormal.entity.Student;

@Repository
public interface Repo extends JpaRepository<Student, Integer>{

}
