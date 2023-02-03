package com.wittybrains.studentmanagement.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wittybrains.studentmanagement.model.Teacher;
import com.wittybrains.studentmanagement.repository.TeacherRepository;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;
    @GetMapping("/")
    public String demo() {
        return "Teacher Controller";
    }

    
    @PostMapping
    public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher) {
      try {
        Teacher savedTeacher = teacherRepository.save(teacher);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTeacher);
      } catch (Exception e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
      }
    }
}
