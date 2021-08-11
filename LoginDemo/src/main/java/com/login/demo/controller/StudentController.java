package com.login.demo.controller;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.Valid;

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.demo.Status;
import com.login.demo.bean.Student;
import com.login.demo.service.StudentService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService studentService;
	@PersistenceContext
	EntityManager em;
	@PostMapping("/student/register")
	public Status registerStudent(@RequestBody Student newStudent) {
		System.out.println("checking print"+newStudent.toString());
		return studentService.registerStu(newStudent);
	}
	
	@GetMapping("/all")
	public List getData() {
		System.out.println("hiting get");
		Query q=em.createQuery("from Student s");
		System.out.println(q.getResultList());
		return q.getResultList();
	}
}
