package com.springMicroServices.microservices.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMicroServices.microservices.Entity.DeptEntity;
import com.springMicroServices.microservices.Repo.DeptRepo;

@Service
public class DeptService {

	
	@Autowired
	private DeptRepo dr;

	public DeptEntity saveDept(DeptEntity dept) {
		// TODO Auto-generated method stub
		return dr.save(dept);
	}

	public DeptEntity findDeptById(Long id) {
		// TODO Auto-generated method stub
		return dr.findByDeptId(id);
	}

	public List<DeptEntity> getDepartments() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dr.deleteById(id);
		
	}

}
