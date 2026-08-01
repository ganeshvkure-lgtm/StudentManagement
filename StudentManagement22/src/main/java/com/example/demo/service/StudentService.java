package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {

	String saveStudent(Student s);

	String deleteStudent(int rollNo);

}
