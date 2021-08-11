package com.login.demo.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;
import org.springframework.stereotype.Repository;
import com.login.demo.bean.Student;
@Transactional
@Repository
public class StudentRepository {
	@PersistenceContext
	EntityManager em;

	public void save(Student newStudent) {
		System.out.println("Repository check"+newStudent.toString());
		em.persist(newStudent);	
		System.out.println("After Repository check"+newStudent.toString());
	}
}
