package com.rajesh.SpringRestPractice.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long employeeID;

private String name;
private String department;
private String contact;

public EmployeeInfo(long iD, String name, String department, String contact) {
	super();
	this.employeeID = iD;
	this.name = name;
	this.department = department;
	this.contact = contact;
}


public EmployeeInfo() {
	
	// TODO Auto-generated constructor stub
}


public long getEmployeeID() {
	return employeeID;
}
public void setEmployeeID(long iD) {
	employeeID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}

}
