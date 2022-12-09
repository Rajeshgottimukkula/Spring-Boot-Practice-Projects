package com.course.course.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.course.Entity.Course;
import com.course.course.Repo.CourseRepo;

@Service
public class CourseService {
    //Object for Class CourseRepo has been created with the name courseRepository
	@Autowired
	CourseRepo courseRepository;
	
	//course object is saved into the repository/Database
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}
    // course is fetched from the Repository using courseName
	public Course getCourse(String courseName) {
		return courseRepository.findByCourseName(courseName);
	}
    // All the courses present in the repository are returned as a List
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

}
