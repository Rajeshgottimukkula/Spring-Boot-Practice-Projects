package com.rajesh.SpringRestPractice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajesh.SpringRestPractice.Entity.EmployeeInfo;
@Repository
public interface Repo extends JpaRepository<EmployeeInfo,Long>{

	 public EmployeeInfo findByName(String name);
	 
	 public EmployeeInfo findByDepartment(String name);

	

}
