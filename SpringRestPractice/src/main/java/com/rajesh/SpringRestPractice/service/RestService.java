package com.rajesh.SpringRestPractice.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajesh.SpringRestPractice.Entity.EmployeeInfo;
import com.rajesh.SpringRestPractice.repo.Repo;

@Service
public class RestService {

	@Autowired
	private Repo reposit;
	
	public EmployeeInfo saveToDb(EmployeeInfo ed) {
		// TODO Auto-generated method stub
		return reposit.save(ed);
	}

	public String deleteEmployeeById(long deleteID) {
		// TODO Auto-generated method stub
		reposit.deleteById(deleteID);
		return "Employee with ID "+deleteID+"deleted";
	}

	public List<EmployeeInfo> getEmployeeDetails() {
		// TODO Auto-generated method stub
		return reposit.findAll();
	}

	public Optional<EmployeeInfo> getEmployeeDetailsById(long id) {
		// TODO Auto-generated method stub
		return reposit.findById(id);
	}

	public EmployeeInfo updateEmployeeById(long id, EmployeeInfo newData) {
		// TODO Auto-generated method stub
		EmployeeInfo extData=reposit.findById(id).get();
		if(Objects.nonNull(newData.getDepartment())&&!"".equalsIgnoreCase(newData.getDepartment())) {
			extData.setDepartment(newData.getDepartment());
		}
		return reposit.save(extData);
	}

	public EmployeeInfo fetchByName(String name) {
		// TODO Auto-generated method stub
		return reposit.findByName(name);
	}

}
