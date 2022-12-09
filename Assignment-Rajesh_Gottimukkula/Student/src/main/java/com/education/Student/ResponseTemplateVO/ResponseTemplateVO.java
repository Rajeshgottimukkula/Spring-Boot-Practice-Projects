package com.education.Student.ResponseTemplateVO;

import com.education.Student.Entity.Student;

public class ResponseTemplateVO {

	
	private Student student;
	private Course course;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public ResponseTemplateVO(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}
	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
