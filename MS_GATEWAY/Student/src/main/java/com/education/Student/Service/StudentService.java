package com.education.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.Student.Entity.Student;
import com.education.Student.Repo.StudentRepo;

@Service
public class StudentService {
	//An object an class StudentRepo is created with name studentRepository
	@Autowired
	StudentRepo studentRepository;
	
    // Student Registration
	public Student registerStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
		
		
	}
    //Returns All the students present in the repository along with their course 
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
    // Removes a particular student using student name
	public void removeStudent(String name) {
		// TODO Auto-generated method stub
		studentRepository.deleteByStudentName(name);
		
	}
    // Returns a particular student using student name
	public Student getStudent(String studentName) {
		// TODO Auto-generated method stub
		return studentRepository.findByStudentName(studentName);
	}

}
