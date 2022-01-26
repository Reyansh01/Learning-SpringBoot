package com.SpringBoot.UsingMySql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.UsingMySql.Entity.Subject;
import com.SpringBoot.UsingMySql.Entity.User;
import com.SpringBoot.UsingMySql.Repository.SubjectRepository;
import com.SpringBoot.UsingMySql.Repository.UserRepository;

@RestController
public class MyController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	
	@PostMapping("/addSubject")
	public Subject addSubject(@RequestBody Subject subject) {
		Subject sub = subjectRepository.save(subject);
		return sub;
	}
	
	@GetMapping("/getSubject")
	public ResponseEntity<?> getSubject() {
		return ResponseEntity.ok(subjectRepository.findAll());
	}
	
	@GetMapping("/getSubjects")
	public ResponseEntity<List<Subject>> getSubjects() {
		return ResponseEntity.ok(subjectRepository.findAll());
	}
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.ok(userRepository.findAll());
	}
	
	@GetMapping("/getSubject/{id}")
	public ResponseEntity<?> getSubject(@PathVariable int id) {
		return ResponseEntity.ok(subjectRepository.findById(id));
	}
	
//	@GetMapping("/getUser")
//	public ResponseEntity<?> getUser() {
//		return ResponseEntity.ok(subjectRepository.findAll());
//	}
//	
//	@GetMapping("/getUser/{id}")
//	public ResponseEntity<?> getUserById(@PathVariable int id) {
//		return ResponseEntity.ok(subjectRepository.findById(id));
//	}
	

}
