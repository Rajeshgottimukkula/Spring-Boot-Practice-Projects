package com.education.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.education.Student.Entity.Student;
import com.education.Student.ResponseTemplateVO.Course;
import com.education.Student.ResponseTemplateVO.ResponseTemplateVO;
import com.education.Student.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    // An object for the Class StudentService is created with name studentService
	@Autowired
	StudentService studentService;
	
	@Autowired
	RestTemplate restTemplate;
	
	// Student registration
	@PostMapping("/")
	public Student registerStudent(@RequestBody Student st) {
		return studentService.registerStudent(st);
	}
	
    // Returns all the Students along with signedup course
	@GetMapping("/")
	public List<Student> getAllSignedupCourseDetails(){
		return studentService.getStudents();
	}
	
	
	// Student along with the course details
	@GetMapping("/{studentName}")
	public ResponseTemplateVO getCourseDetails(@PathVariable("studentName") String studentName) {
		ResponseTemplateVO vo=new ResponseTemplateVO();
		Student student=studentService.getStudent(studentName);
		Course course=restTemplate.getForObject("http://localhost:8051/course/"+student.getCourseName(), Course.class);
		vo.setStudent(student);
		vo.setCourse(course);
		return vo;
		
	}
	
	// To delete a particular student using Student name
	@DeleteMapping("/{name}")
	public String removeStudent(@PathVariable("name") String name) {
		studentService.removeStudent(name);
		return name+" has been deleted";
	}
	
}
