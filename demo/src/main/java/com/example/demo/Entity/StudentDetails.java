package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDetails {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  
  private String studentName;
  private String branch;
   public StudentDetails(Long id, String studentName, String branch) {
	super();
	this.id = id;
	this.studentName = studentName;
	this.branch = branch;
}
public StudentDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String name) {
	this.studentName = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
}
