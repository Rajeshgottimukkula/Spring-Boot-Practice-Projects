package com.rajesh.SpringRestPractice.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rajesh.SpringRestPractice.Entity.EmployeeInfo;
import com.rajesh.SpringRestPractice.repo.Repo;
import com.rajesh.SpringRestPractice.service.RestService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	RestService rs;
	
	@PostMapping("/Employees")
	public EmployeeInfo saveToDb(@RequestBody EmployeeInfo ed) {
		return rs.saveToDb(ed);
	}
	
	@GetMapping("/Employees")
	public List<EmployeeInfo> getEmployeeDetails(){
		return rs.getEmployeeDetails();
		
	}
	@GetMapping("/Employees/{id}")
	public Optional<EmployeeInfo> getEmployeeDetailsById(@PathVariable long id){
		return rs.getEmployeeDetailsById(id);
		
	}
	
	
	
	@DeleteMapping("/Employees/{id}")
	public String deleteEmployeeById(@PathVariable("id") long id) {
		return rs.deleteEmployeeById(id);
	}
	
	@PutMapping("/Employees/{id}")
	public EmployeeInfo updateById(@PathVariable("id") long id,
			@RequestBody EmployeeInfo newData) {
		return rs.updateEmployeeById(id,newData);
	}
	
	@GetMapping("/Employees/name/{name}")
	public EmployeeInfo fetchByName(@PathVariable("name") String name) {
		return rs.fetchByName(name);
	}
	

}
