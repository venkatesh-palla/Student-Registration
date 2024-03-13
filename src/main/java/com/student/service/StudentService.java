package com.student.service;

import java.util.List;

import com.student.model.Student;


public interface StudentService {
	
	    
	  public  Student createStudent(Student student);
	    
	  public  Student updateStudent(Student student);
	    
	  public void deleteStudent(long studentId);
	    
	  public  Student getStudentData(long student);
	    
	  public  List<Student> getAllStudents();
	  
	  public Student getDataByname(String name);

		
	}



