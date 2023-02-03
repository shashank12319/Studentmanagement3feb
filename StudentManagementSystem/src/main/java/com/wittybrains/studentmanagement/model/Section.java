package com.wittybrains.studentmanagement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "section")
public class Section {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="section_tname")
	private String name;
	 @Column(name="section_id")
	private int id;
//	@OneToMany(mappedBy = "section", cascade = CascadeType.ALL,targetEntity=Student.class, fetch = FetchType.LAZY)
//
//	  private List<Student> students = new ArrayList<>();

	 
	@Column(name = "section_name", unique = true)
	private String sectionName;
	
	@Column(name = "description")
	private String description;
	
	
	
	public Section(int id, String name, String sectionName) {
	    this.id = id;
	    this.sectionName = sectionName;
	    //this.students = new ArrayList<>();
	  }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
