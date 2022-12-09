package com.course.course.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	//Id will gets Generated Automatically
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private String courseDuration;
	private String courseMentor;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
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
	public Course(int courseId, String courseName, String courseDuration, String courseMentor) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseMentor = courseMentor;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
