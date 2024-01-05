package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello world");
	}
	private  final StudentRepository studentRepository;
	@Autowired
	public DemoApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@GetMapping("/api/students")
	public List<Student>getAllStudents(){
		return 	studentRepository.findAll();
	}
}
