package com.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.User;

@Repository
public interface UserDAO extends JpaRepository<User,Long> {
	
	public User findByEmailAndPassword(String email,String password);
	public User findByEmail(String email);

}
