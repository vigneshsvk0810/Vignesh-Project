package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,String>{
 

	public User findByName(String name);
	public User findByEmailAndPassword(String email,String password);
}
