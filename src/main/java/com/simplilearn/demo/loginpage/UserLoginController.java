package com.simplilearn.demo.loginpage;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.simplilearn.demo.loginpage.entity.UserLogin;
import com.simplilearn.demo.loginpage.service.UserLoginService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/userlogin")
public class UserLoginController {
	
	@Autowired
	private UserLoginService service1;
	
	///create new record
	@PostMapping("/")
	public UserLogin addUserLoginDetails(@RequestBody UserLogin userLogin){
		return service1.addUserLogin(userLogin);	
	}
	
	//get all users login details
	@GetMapping("/")
	public List<UserLogin> getAllUserDetails(){
		return service1.getAllUserLogin();
	}

}
