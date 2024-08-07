package com.example.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Entity.Student;
import com.example.test.Service.studentService;


@RequestMapping("/student")
@RestController
public class studentController 
{
	
	@Autowired
	private studentService studentSer;
	
	
	@PostMapping
	public Student addStudent(@RequestBody Student student)
	{
		return studentSer.createStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudents()
	{
		return studentSer.getAllStudents();
	}
	
	
	
}
