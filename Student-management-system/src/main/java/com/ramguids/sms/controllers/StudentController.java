package com.ramguids.sms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ramguids.sms.models.Student;
import com.ramguids.sms.services.StudentService;

@Controller
public class StudentController {
	
	//Dependency injection
	private StudentService studentservice;

	// Constructor method of dependency injection
	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	//Handler method to handle student list and return model and view
	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("students",studentservice.getAllStudent());
		return "students"; //return "students" this is view page name
		
	}
	
	@GetMapping("/students/new")
	public  String createStudentForm(Model model) {
		//creating student object to hold student from data
		Student student =new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentservice.saveStudent(student);
		return "redirect:/students";
	}
	
	
	//	@PathVariable is used to bind data from html page to java variable
	//	Model model is used so that we can return data to view
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable long id, Model model) {
		model.addAttribute("student",studentservice.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student, Model model){
		
		//get student from database by id
		Student existingStudent = studentservice.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		// save update student object
		studentservice.updateStudent(existingStudent);
		return "redirect:/students";
		
	}
	
	
	// handler method to delete student request
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		
		studentservice.deletStudentById(id);
		return "redirect:/students";
	}
	

}
