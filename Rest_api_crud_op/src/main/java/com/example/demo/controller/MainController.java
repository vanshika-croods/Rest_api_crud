package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.StudentVO;
import com.example.demo.service.StudentService;

@Controller
public class MainController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public ModelAndView register() {
		return new ModelAndView("Register");
	}
	
	//insert into the database
	@ResponseBody
	@PostMapping("/saveStudent")
	public StudentVO saveStudent(@RequestBody StudentVO studentVO) {
		studentService.saveStudent(studentVO);
		System.out.println("data saved into the database");
		return studentVO;
	}
	
	//find all the students
	@ResponseBody
	@GetMapping("/student/findall")
	public List<StudentVO> findAllStudent(){
		List<StudentVO> findStudent = studentService.findAllStudent();
		return findStudent;
	}
	
	//delete the student
	@ResponseBody
	@DeleteMapping("/student/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
		System.out.println("data has been deleted");
	}

	//update the student
	
	@ResponseBody
	@PutMapping("/edit/{id}")
	public StudentVO editStudent(@PathVariable int id,@RequestBody StudentVO studentVO){
		studentService.findById(id);
		studentVO.setFirstName(studentVO.getFirstName());
		studentVO.setLastName(studentVO.getLastName());
		studentVO.setUserName(studentVO.getUserName());
		studentVO.setPassword(studentVO.getPassword());
		return studentVO;
	}
	
}
