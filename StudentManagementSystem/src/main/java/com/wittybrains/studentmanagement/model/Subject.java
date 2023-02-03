package com.wittybrains.studentmanagement.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "subject_code")
    private String subjectCode;
    
    @ManyToMany(mappedBy = "subjects")
    private List<Class> classes = new ArrayList<>();
    
    public Subject() {}
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSubjectCode() {
        return subjectCode;
    }
    
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }
    
    public List<Class> getClasses() {
        return classes;
    }
    
    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }
}

