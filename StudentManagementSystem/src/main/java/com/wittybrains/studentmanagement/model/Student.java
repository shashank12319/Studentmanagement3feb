package com.wittybrains.studentmanagement.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name")
	private String firstName;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "section_id")
	
    private Section section;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
	
    private Class classes;
	@Column(name = "roll_no", unique = true, updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String rollNo;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "dob")
	private Date dateOfBirth;
	@Column(name = "father_Name")
	private String fatherName;
	@Column(name = "mother_name")
	private String motherName;
	@Column(name = "class_name")
	private String className;

	@Column(name = "mobile_no")
	private String mobileNo;
	@Column(name = "admission_date")
	private Date admissionDate;
	@Column(name = "gender")
	private Gender gender;
	 @Column(name = "address_id")
	    private String address;

@Column(name = "attendance_date")
private Date attendanceDate;
private boolean attendance;
	public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
	public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public Section getSection() {
	return section;
}
public void setSection(Section section) {
	this.section = section;
}
public String getRollNo() {
	return rollNo;
}
public void setRollNo(String string) {
	this.rollNo = string;
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
public Date getAttendanceDate() {
	return attendanceDate;
}
public void setAttendanceDate(Date attendanceDate) {
	this.attendanceDate = attendanceDate;
}
public boolean isAttendance() {
	return attendance;
}
public void setAttendance(boolean attendance) {
	this.attendance = attendance;
}



}

	