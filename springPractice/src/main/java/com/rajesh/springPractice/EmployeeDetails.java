package com.rajesh.springPractice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {
  private String employeeName;
  @Id
  private Long employeeID;
  private String mobile;
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public Long getEmployeeID() {
	return employeeID;
}
public void setEmployeeID(Long employeeID) {
	this.employeeID = employeeID;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public EmployeeDetails(String employeeName, Long employeeID, String mobile) {
	super();
	this.employeeName = employeeName;
	this.employeeID = employeeID;
	this.mobile = mobile;
}
  
}
