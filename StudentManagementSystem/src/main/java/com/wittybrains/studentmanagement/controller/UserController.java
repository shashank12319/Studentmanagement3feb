package com.wittybrains.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wittybrains.studentmanagement.model.Student;
import com.wittybrains.studentmanagement.model.Teacher;
import com.wittybrains.studentmanagement.model.User;
import com.wittybrains.studentmanagement.model.UserDTO;
import com.wittybrains.studentmanagement.repository.StudentRepository;
import com.wittybrains.studentmanagement.repository.UserRepository;
import com.wittybrains.studentmanagement.repository.TeacherRepository;


@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TeacherRepository teacherRepository;

	@GetMapping("/")
	public String demo() {
		return "shashank";

	}

	@SuppressWarnings({ "rawtypes", "unlikely-arg-type" })
	@PostMapping("/create")
	public ResponseEntity createUserAndStudent(@RequestBody UserDTO userDTO) throws UserAlreadyExistException {
		
		User user = new User();
		user.setName(userDTO.getName());
		user.setPassword(userDTO.getPassword());
		if (userRepository.existsByName(userDTO.getName())) {
			throw new UserAlreadyExistException("User with this name already exist");
		}
		if (userDTO.getRole().equals("student")) {
			Student student = new Student();
			student.setFirstName(userDTO.getFirstName());
			student.setLastName(userDTO.getLastName());
			student.setDateOfBirth(userDTO.getDateOfBirth());
			student.setFatherName(userDTO.getFatherName());
			student.setMotherName(userDTO.getMotherName());
			student.setClassName(userDTO.getClassName());
			student.setRollNo(userDTO.getRollNo());
			student.setMobileNo(userDTO.getMobileNo());
			student.setAdmissionDate(userDTO.getAdmissionDate());

			student = studentRepository.save(student);
			if (student.getId() != null) {
				user.setStudent(student);
				user = userRepository.save(user);
				return new ResponseEntity<>("student created", HttpStatus.OK);
			} 
				else {
				return new ResponseEntity<>("student created", HttpStatus.BAD_REQUEST);

			}

		}
		if (userDTO.getRole().equals("teacher")) {
			Teacher teacher = new Teacher();
			teacher.setFirstName(userDTO.getFirstName());
			teacher.setLastName(userDTO.getLastName());
			teacher.setDesignation(userDTO.getDesignation());
			teacher.setDob(userDTO.getDateOfBirth());
			
			teacher=  teacherRepository.save(teacher);
			
			user.setTeacher(teacher);
			user = userRepository.save(user);
			return new ResponseEntity<>("teacher created", HttpStatus.OK);
		} 
			else {
			return new ResponseEntity<>("teacher created", HttpStatus.BAD_REQUEST);

	}
	}
}

