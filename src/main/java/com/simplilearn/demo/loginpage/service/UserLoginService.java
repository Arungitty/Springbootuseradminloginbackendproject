package com.simplilearn.demo.loginpage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplilearn.demo.loginpage.entity.UserLogin;
import com.simplilearn.demo.loginpage.repo.UserLoginRepository;

@Service
public class UserLoginService {
	
	@Autowired
	private UserLoginRepository repo1;
	
	//add user login details 
	public UserLogin addUserLogin(UserLogin userLogin) {
		return repo1.save(userLogin);
	}
		
	// get list of user login details 
	public List<UserLogin> getAllUserLogin(){
		return repo1.findAll();
	}	

}

