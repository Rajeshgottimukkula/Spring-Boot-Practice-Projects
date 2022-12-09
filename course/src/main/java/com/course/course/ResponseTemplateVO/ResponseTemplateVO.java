package com.course.course.ResponseTemplateVO;

import com.course.course.Entity.Course;

public class ResponseTemplateVO {

	private Student student;
	private Course course;
	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTemplateVO(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}
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
	
}
