package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;

	@Override
	public String saveStudent(Student s) {
		sr.save(s);
		return "Student Saved";
	}

	@Override
	public String deleteStudent(int rollNo) {

		sr.deleteById(rollNo);
		return "Deleted";
	}

}
