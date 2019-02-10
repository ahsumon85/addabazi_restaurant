package com.addabazi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addabazi.entity.Users;

public interface UserRepo extends JpaRepository<Users, Long>{
	
	public Users findByUserName(String userName);

}
