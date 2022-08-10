package com.ramguids.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ramguids.sms.models.Student;
import com.ramguids.sms.repositories.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1= new Student("Ram","Chhetri","ramchhetri@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2= new Student("sam","kunwar","samkunwar@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3= new Student("hari","bahadur","hariBahadur@gmail.com");
//		studentRepository.save(student3);
		
	}

}
