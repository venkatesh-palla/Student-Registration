package com.student.model;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private Long studentId;
	private String name;
	private String gender;
	private String city;
	private Long phoneNumber;
	private String standard;
	private int age;
	
	
	

}