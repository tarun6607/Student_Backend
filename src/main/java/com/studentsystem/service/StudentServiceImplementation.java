/**
 * This package contains the service classes for the student system application. 
 * The service layer contains business logic and handles communication between the controller and data access layers.
*/
package com.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentsystem.model.Student;
import com.studentsystem.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {

	@Autowired
	private StudentRepository studentRespository;

	@Override
	public Student saveStudent(Student student) {
		return studentRespository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRespository.findAll();
	}

}
