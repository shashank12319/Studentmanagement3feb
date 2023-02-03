package com.wittybrains.studentmanagement.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="teacher_id")
  private int id;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="designation")
  private String designation;

  @Column(name="dob")
  private Date dob;

  @Enumerated(EnumType.STRING)
  @Column(name="gender")
  private Gender gender;
  @Enumerated(EnumType.STRING)
  @Column(name="department")
  private Department department;
  
  public enum Gender {
    MALE,
    FEMALE,
    OTHER
  }
 
  public enum Department {
	    IT,
	    SCIENCE,
	    ARTS,
	    COMMERCE
	  }
  
  public Teacher() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date date) {
    this.dob = date;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }
  public Department getDepartment() {
	    return department;
	  }

	  public void setDepartment(Department department) {
	    this.department = department;
	  }


}

