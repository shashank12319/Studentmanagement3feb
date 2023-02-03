package com.wittybrains.studentmanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wittybrains.studentmanagement.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
	//@SuppressWarnings("unchecked")
	Teacher save(Teacher teacher);
	
}