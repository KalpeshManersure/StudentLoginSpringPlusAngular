package com.studentlogin.DAO;


//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Query;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentlogin.utils.*;
import com.studentlogin.model.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

@Repository
public class StudentDao {



	Transaction transaction = null;

	public String saveNewUserToDB(Student student) {
		System.out.println("Validating User");
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			session.save(student);
			// commit transaction
			transaction.commit();
			return "Success";
		} catch (Exception e) {
			transaction.rollback();
			return "Failure";
		}
	} 
	
	
	public String checkLogin(Student student) {
		
		
		
		
		    return null;
	}
	
	
	public List<Student> getAllStudents(){
		return null;
		
	}
	
	



}
