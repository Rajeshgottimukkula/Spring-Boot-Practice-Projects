package com.springMicroServices.microservices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springMicroServices.microservices.Entity.DeptEntity;
import com.springMicroServices.microservices.Service.DeptService;

import lombok.extern.slf4j.Slf4j;
@Slf4j

@RestController
public class DeptController {

	
	@Autowired
	private DeptService ds;
	
	@PostMapping("/department")
	public DeptEntity saveDept(@RequestBody DeptEntity dept) {
//		log.info("Inside deptController of dept Service");
		return ds.saveDept(dept);
	}
	@GetMapping("/department/{id}")
	public DeptEntity findDeptById(@PathVariable("id") Long id) {
		return ds.findDeptById(id);
	}
	@GetMapping("/department")
	public List<DeptEntity> getDepartments(){
		return ds.getDepartments();
	}
	
	@DeleteMapping("/Department/{id}")
	public String deleteById(@PathVariable Long id) {
		ds.deleteById(id);
		return "Deleted succesfully";
	}
}
