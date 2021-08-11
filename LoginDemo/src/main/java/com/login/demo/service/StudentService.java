package com.login.demo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.demo.Status;
import com.login.demo.dao.StudentRepository;
import com.login.demo.bean.Student;
@Service
public class StudentService {
	
	
	//@PersistenceContext
	//EntityManager em;
	
	@Autowired
	StudentRepository studentDao;
	public Status registerStu(Student newStudent) {
		//List<Student> students=studentDao.findAll();
		
		
		//for(Student stu:students) {
			
			
			//if(stu.equals(newStudent)) {
				//Already Exist
				//return Status.USER_ALREADY_EXISTS;
			//}
		//} 
		System.out.println("Service Before adding"+newStudent.toString());
		studentDao.save(newStudent);
		System.out.println("Service Safter adding"+newStudent.toString());
		return Status.SUCCESS;
	}

}
