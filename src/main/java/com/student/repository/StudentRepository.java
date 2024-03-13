package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.model.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{


    @Query("SELECT s FROM Student s WHERE s.name = :name")
    Student findByName(@Param("name") String name);

}
