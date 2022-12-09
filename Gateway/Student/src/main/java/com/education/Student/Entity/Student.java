package com.education.Student.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
    @Id
	private int studentId;
	private String studentName;
	private String courseName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Student(int studentId, String studentName, String courseName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseName = courseName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
