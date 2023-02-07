package com.simplilearn.demo.loginpage;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.loginpage.entity.Admin;
import com.simplilearn.demo.loginpage.service.AdminService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/adminlogin")
public class AdminController {

	@Autowired
	private AdminService service2;
	
	///create new record
	@PostMapping("/")
	public Admin addAdmin(@RequestBody Admin admin){
		return service2.addAdmin(admin);	
	}
	
	//get list of all admin
	@GetMapping("/")
	public List<Admin> getAllAdminDetails(){
		return service2.getAllAdmin();
	}

}

