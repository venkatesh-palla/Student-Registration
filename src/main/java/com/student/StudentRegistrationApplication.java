package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@EntityScan(basePackages = {"com.student"})
@ComponentScan(basePackages = {"com.student"})
public class StudentRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationApplication.class, args);
	}

}
