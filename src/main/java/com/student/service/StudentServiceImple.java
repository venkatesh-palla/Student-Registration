package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StudentRepository;


@Service
public class StudentServiceImple implements StudentService {

	@Autowired
	StudentRepository studentRepository;


	@Override
	public void deleteStudent(long studentId) {
		// TODO Auto-generated method stub
		
		studentRepository.deleteById(studentId);
		
	}



	@Override
	public Student getStudentData(long student) {
		// TODO Auto-generated method stub
		studentRepository.findById(student);
		return null;
	}
	
	

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		
		return studentRepository.findAll();
	}







	@Override
	public Student getDataByname(String name) {
		// TODO Auto-generated method stub
		
		return studentRepository.findByName(name);
	}



	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return student;
	}



	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return student;
	}


	
	


}
