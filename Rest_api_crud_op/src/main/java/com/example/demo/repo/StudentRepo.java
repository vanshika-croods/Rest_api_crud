package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.StudentVO;

public interface StudentRepo extends JpaRepository<StudentVO, Integer> {

}
