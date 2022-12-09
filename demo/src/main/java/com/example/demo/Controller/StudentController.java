package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StudentDetails;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
   @GetMapping("/")
   public String meth() {
	   return "Hello World";
   }
   
   
   @Autowired
   public StudentService ss;
   
   @PostMapping("/Students")
   public StudentDetails saveToDb(@RequestBody StudentDetails sd) {
	   return ss.saveToDb(sd);
   }
}
