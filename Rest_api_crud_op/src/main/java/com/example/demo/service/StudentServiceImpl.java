package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.StudentVO;
import com.example.demo.repo.StudentRepo;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo; 
	
	@Override
	public StudentVO saveStudent(StudentVO studentVO) {
		// TODO Auto-generated method sub
		return studentRepo.save(studentVO);
	}

	@Override
	public List<StudentVO> findAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}

	@Override
	public StudentVO findById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).orElse(null);
	}

	
}
