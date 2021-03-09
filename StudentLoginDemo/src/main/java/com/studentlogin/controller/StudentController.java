package com.studentlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentlogin.model.Student;
import com.studentlogin.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	StudentService studentService;
	

	@RequestMapping(value = "Kalpesh/{data}",method=RequestMethod.GET)
	public String index(@PathVariable("data") String input) {
		return "Greetings from Spring Boot! "+input;
	} 
	
	@RequestMapping(value="/newuser",method=RequestMethod.POST)
	public String validateLoginForUser(@RequestBody Student student){
		System.out.println("In validateLoginForUser Method");
		return studentService.saveNewUserToDB(student);
		
	}

	
	
	//login   should show a form with email & pass for student to login
	//student + create to show a from to create a student with necessary details
	// Students returns list of the student
	
}
