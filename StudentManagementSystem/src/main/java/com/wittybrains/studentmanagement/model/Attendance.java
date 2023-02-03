

package com.wittybrains.studentmanagement.model;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "present")
    private Boolean present;

    @OneToOne(targetEntity=Student.class)
    @JoinColumn(name = "student_id")
    private Student student;
    @OneToOne(targetEntity=Teacher.class)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @Column(name = "status")
    private AttendanceStatus status;
  



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate localDate) {
        this.date = localDate;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    
    
    public void setStatus(Boolean status) {
        this.present = status;
    }
    public enum AttendanceStatus {
        LEAVE,
        PRESENT,
        ABSENT
    }
	

    public AttendanceStatus getStatus() {
        return status;
    }
    
    public void setStatus(AttendanceStatus status) {
        this.status = status;
    }

}
