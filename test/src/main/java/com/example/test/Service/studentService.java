package com.example.test.Service;

import java.util.List;

import com.example.test.Entity.Student;

public interface studentService 
{
	Student createStudent(Student student);
	
	List<Student> getAllStudents();
}
