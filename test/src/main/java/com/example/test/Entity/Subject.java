package com.example.test.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Table(name = "Subject")
@Entity
public class Subject 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long subjectId;
	
	private String subjectName;
	
	@ManyToMany(mappedBy = "subjects")
	private Set<Student> students = new HashSet<>();
	
	
	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
