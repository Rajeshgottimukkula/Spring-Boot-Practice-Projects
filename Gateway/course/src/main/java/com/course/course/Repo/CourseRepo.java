package com.course.course.Repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.course.Entity.Course;
@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{
    @Transactional
	Course findByCourseName(String courseName);

}
