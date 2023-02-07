package com.simplilearn.demo.loginpage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_login_details")     // table name

public class UserLogin {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int userId;                                         // object property
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_password")
	private String userPassword;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
