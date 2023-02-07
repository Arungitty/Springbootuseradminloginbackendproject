package com.simplilearn.demo.loginpage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.loginpage.entity.UserLogin;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, Integer> {

}
