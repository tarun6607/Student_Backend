/**
 * StudentController handles REST API endpoints for CRUD operations on Student model.
 * 
 * This is a Spring REST controller with request mappings for adding a new student, 
 * getting all students, etc. It depends on an autowired StudentService to implement
 * the actual CRUD logic.
 *
 * The add() method takes a Student object in the request body and saves it via the 
 * StudentService. The getAllStudents() method returns a list of all Student objects
 * by calling the getAllStudents() method on the StudentService.
 */
package com.studentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studentsystem.model.Student;
import com.studentsystem.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "New Student is added";
	}

	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
}
