package com.simplilearn.demo.loginpage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.loginpage.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

}

