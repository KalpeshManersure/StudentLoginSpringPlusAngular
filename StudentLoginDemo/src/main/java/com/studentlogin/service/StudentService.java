package com.studentlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentlogin.DAO.StudentDao;
import com.studentlogin.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;

	public String saveNewUserToDB(Student student) {
		// TODO Auto-generated method stub
		return studentDao.saveNewUserToDB(student);
	}
	
	

}
