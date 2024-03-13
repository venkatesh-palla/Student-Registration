package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	StudentRepository studentRepository;
	
	
	@Autowired
	StudentService studentService;
	

	@PostMapping("/Creating")
	public Student createStudent(@RequestBody Student student)
	{
		studentService.createStudent(student);
		return student;
		
	}
	
	@PutMapping("/Update")
	public Student updateStudent(@RequestBody Student student) {
		
		studentService.updateStudent(student);
		
		return student;
	}
	
	
	@DeleteMapping("/Deleting")
	public Long deleteStudent(@RequestParam Long id)
	{
		studentService.deleteStudent(id);
		return null;
		
		
	}
	
	@GetMapping("/Retrive")
	public List<Student> getStudentData()
	{
		
		return studentService.getAllStudents();
		
	}
	
	
	@GetMapping("/RetriveByName")
	public Student getDataByname(@RequestParam String name)
	{
		return studentService.getDataByname(name);

	}
	
	
	
	

}
