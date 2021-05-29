package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.StudentVO;

public interface StudentService {

	StudentVO saveStudent(StudentVO studentVO);
	
	List<StudentVO> findAllStudent();
	
	void deleteStudent(int id);
	
	StudentVO findById(int id);
}
