package com.ramguids.sms.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ramguids.sms.models.Student;
import com.ramguids.sms.repositories.StudentRepository;
import com.ramguids.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
		public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deletStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
