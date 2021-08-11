package com.login.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.login.demo.bean.Student;
import com.login.demo.dao.StudentRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class LoginDemoApplication implements CommandLineRunner{
	@Autowired
	StudentRepository stuData;
	
	
	public static void main(String[] args) {
		SpringApplication.run(LoginDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("working main check");
		//Student stu=new Student("jatt","pass");
		//stuData.save(stu);
		
	}

}
