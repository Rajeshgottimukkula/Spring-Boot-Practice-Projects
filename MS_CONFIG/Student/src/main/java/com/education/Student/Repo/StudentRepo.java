package com.education.Student.Repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.Student.Entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
    @Transactional
	void deleteByStudentName(String name);

	Student findByStudentName(String studentName);

}
