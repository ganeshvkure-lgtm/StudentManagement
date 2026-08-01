package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;

	@PostMapping("adds")
	String addStudent(@RequestBody Student s) {

		return ss.saveStudent(s);
	}

	@DeleteMapping("deleteStudent/{rollNo}")

	String deleteStudent(@PathVariable int rollNo) {

		return ss.deleteStudent(rollNo);
	}

}
