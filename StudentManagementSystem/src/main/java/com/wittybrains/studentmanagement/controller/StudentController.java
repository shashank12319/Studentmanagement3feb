package com.wittybrains.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wittybrains.studentmanagement.model.Student;
import com.wittybrains.studentmanagement.repository.StudentRepository;

@RestController
	@RequestMapping("/students")
	public class StudentController {
   
	

	    @Autowired
	    private StudentRepository studentRepository;
	    @GetMapping("/")
	    public String demo() {
			return "shashank";
	    	
	    }
	    @PostMapping
	    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	        Student savedStudent = studentRepository.save(student);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
	    }
}



