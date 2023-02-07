package com.simplilearn.demo.loginpage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplilearn.demo.loginpage.entity.User;
import com.simplilearn.demo.loginpage.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	//add user method
	public User addUser(User u) {
		return repo.save(u);
	}
		
	// List user method
	public List<User> getAllUser(){
		return repo.findAll();
	}

}

