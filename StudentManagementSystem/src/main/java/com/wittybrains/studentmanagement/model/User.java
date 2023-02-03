

package com.wittybrains.studentmanagement.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, targetEntity = Student.class)
    
    private Student student;
    @OneToOne(cascade = CascadeType.ALL, targetEntity = Teacher.class)
    private Teacher teacher;
    @Column(name="password")
    private String password;
    @Column(name="name")
    private String name;
    //other fields and methods
    @Column(name="email")
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(name="role")
    private Role role;
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

public Teacher getTeacher() {
	return teacher;
}

public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
}

enum Role {
STUDENT, TEACHER
}

