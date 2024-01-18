/**
 * The package declaration for the StudentRepository interface.
 * 
 * This declares that the StudentRepository interface is in the 
 * com.studentsystem.repository package.
*/
package com.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
