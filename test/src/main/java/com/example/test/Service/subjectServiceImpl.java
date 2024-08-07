package com.example.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.Entity.Subject;
import com.example.test.Repository.subjectRepository;


@Service
public class subjectServiceImpl implements subjectService
{
	@Autowired
	private subjectRepository subjectRepo;
	
	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return subjectRepo.findAll();
	}

}
