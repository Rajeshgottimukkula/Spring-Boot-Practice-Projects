package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudentDetails;
import com.example.demo.Repo.Repo;

@Service
public class StudentService {

	
	@Autowired
	public Repo reposit;
	
	public StudentDetails saveToDb(StudentDetails sd) {
		// TODO Auto-generated method stub
		
		return reposit.save(sd);
	}

}
