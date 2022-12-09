package com.education.Student.ResponseTemplateVO;
// Dummy class for another Micro service Course
public class Course {
	private String courseName;
	private String courseDuration;
	private String courseMentor;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getCourseMentor() {
		return courseMentor;
	}
	public void setCourseMentor(String courseMentor) {
		this.courseMentor = courseMentor;
	}
	public Course(String courseName, String courseDuration, String courseMentor) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseMentor = courseMentor;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
