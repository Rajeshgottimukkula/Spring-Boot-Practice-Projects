package com.course.course.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.course.Entity.Course;
import com.course.course.Service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	// Object for the Class CourseService has been created with name courseService
	@Autowired
	CourseService courseService;
	
	// Adds a course to the Database
	@PostMapping("/")
	public Course saveCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	// Returns a particular course
	@GetMapping("/{courseName}")
	public Course getCourse(@PathVariable String courseName) {
		return courseService.getCourse(courseName);
	}
	// Returns all the course details
	@GetMapping("/")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}
	
	
	
}
