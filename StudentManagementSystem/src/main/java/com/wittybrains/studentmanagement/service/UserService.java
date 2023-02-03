package com.wittybrains.studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wittybrains.studentmanagement.model.User;
import com.wittybrains.studentmanagement.repository.StudentRepository;
import com.wittybrains.studentmanagement.repository.UserRepository;



@Service
public class UserService {
@Autowired
    private  UserRepository userRepository;
    @Autowired
    private StudentRepository studentRepository;
   
    public void create(User user) {
        user = userRepository.save(user);
    }
}
