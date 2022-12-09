package com.springMicroServices.microservices.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class DeptEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long deptId;
    private String deptName;
    private String deptAddress;
    private String deptCode;
	public DeptEntity(Long deptId, String deptName, String deptAddress, String deptCode) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
		this.deptCode = deptCode;
	}
	
	
	public DeptEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
    
    
    
    
    
}
