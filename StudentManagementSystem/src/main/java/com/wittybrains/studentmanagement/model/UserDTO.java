package com.wittybrains.studentmanagement.model;

import java.util.Date;

import javax.management.relation.Role;



public class UserDTO {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String fatherName;
    private String motherName;
    private String className;
    private String rollNo;
    private String mobileNo;
    private Date admissionDate;
    private Gender gender;
    private String name;
    private String password;
    private String  userType;
    private String Designation;
    private String role;
    
    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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
 
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
 
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
 
    public String getFatherName() {
        return fatherName;
    }
 
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
 
    public String getMotherName() {
        return motherName;
    }
 
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
 
    public String getClassName() {
        return className;
    }
 
    public void setClassName(String className) {
        this.className = className;
    }
 
    public String getRollNo() {
        return rollNo;
    }
 
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
 
    public String getMobileNo() {
        return mobileNo;
    }
 
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
 
    public Date getAdmissionDate() {
        return admissionDate;
    }
 
    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }

public String getUserType() {
    return userType;
}

public void setUserType(String userType) {
    this.userType = userType;
}
public String getDesignation() {
	return Designation;
}

public void setDesignation(String designation) {
	Designation = designation;
}









}


