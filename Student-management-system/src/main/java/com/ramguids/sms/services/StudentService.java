package com.ramguids.sms.services;

import java.util.List;

import com.ramguids.sms.models.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deletStudentById(Long id);

}
