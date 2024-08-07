package com.example.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Entity.Subject;
import com.example.test.Service.subjectService;

@RequestMapping("/subject")
@RestController
public class subjectController 
{
	
	@Autowired
	private subjectService subService;
	
	@GetMapping
	public List<Subject> getAllSubjects()
	{
		return subService.getAllSubjects();
	}
}
