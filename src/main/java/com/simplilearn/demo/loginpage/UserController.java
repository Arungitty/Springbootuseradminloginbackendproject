package com.simplilearn.demo.loginpage;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.loginpage.entity.User;
import com.simplilearn.demo.loginpage.service.UserService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	///create new record
	@PostMapping("/")
	public User addUser(@RequestBody User u){
		return service.addUser(u);	
	}
	
	//get all users
	@GetMapping("/")
	public List<User> getAllUser(){
		return service.getAllUser();
	}

}

