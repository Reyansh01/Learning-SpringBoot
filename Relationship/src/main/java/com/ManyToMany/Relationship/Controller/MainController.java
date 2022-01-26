package com.ManyToMany.Relationship.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ManyToMany.Relationship.Entity.Subject;
import com.ManyToMany.Relationship.Entity.User;
import com.ManyToMany.Relationship.Repository.SubjectRepository;
import com.ManyToMany.Relationship.Repository.UserRepository;

@RestController
public class MainController {
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/addSubject")
	public Subject addSubject(@RequestBody Subject subject) {
		Subject sub = subjectRepository.save(subject);
		return sub;
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		User us = userRepository.save(user);
		return us;
	}
	
	@GetMapping("/getUser")
	public List<User> getUser() {
		return userRepository.findAll();
	}
	
	@GetMapping("/getSubject")
	public List<Subject> getSubject() {
		return subjectRepository.findAll();
	}

}
