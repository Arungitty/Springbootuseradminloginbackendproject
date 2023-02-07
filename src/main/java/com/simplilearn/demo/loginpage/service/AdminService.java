package com.simplilearn.demo.loginpage.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplilearn.demo.loginpage.entity.Admin;
import com.simplilearn.demo.loginpage.repo.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepo repo2;
	
	//add admin object in database
	public Admin addAdmin(Admin admin) {
		return repo2.save(admin);
	}
		
	// List of all admin 
	public List<Admin> getAllAdmin(){
		return repo2.findAll();
	}
	
}

