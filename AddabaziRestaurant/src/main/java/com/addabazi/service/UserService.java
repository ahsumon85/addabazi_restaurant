package com.addabazi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.addabazi.dto.UsersDTO;
import com.addabazi.entity.Users;
import com.addabazi.repo.UserRepo;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public void saveUser(UsersDTO usersDTO){
		
		Users users=new Users();
		BeanUtils.copyProperties(usersDTO, users);
		userRepo.save(users);
		
	}
	
	public boolean isUserExist(String userName){
		
		boolean userExistence=false;
		Users users=new Users();
		users=userRepo.findByUserName(userName);
		if(users!=null){
			userExistence=true;
		}
		return userExistence;
		
	} 
	
	public Users findByUserName(String userName){
		
		return(Users)userRepo.findByUserName(userName);
		
	}

}
