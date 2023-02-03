package com.wittybrains.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wittybrains.studentmanagement.model.Student;




public interface StudentRepository extends JpaRepository<Student, Long> {
	
	

}
