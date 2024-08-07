package com.example.test.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Table(name = "Student")
@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	
	private String studendName;
	
	private String studentAddress;
	
	
	@ManyToMany
	@JoinTable(
			name = "Student_Subject",
			joinColumns = @JoinColumn(name = "studentId"),
			 inverseJoinColumns = @JoinColumn(name = "subjectId")
			)
	
	private Set<Subject> subjects = new HashSet<>();
	
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudendName() {
		return studendName;
	}

	public void setStudendName(String studendName) {
		this.studendName = studendName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
