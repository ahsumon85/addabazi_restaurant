package com.addabazi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.addabazi.dto.SignUpAttemptDTO;
import com.addabazi.entity.SignUpAttempt;
import com.addabazi.repo.SignUpAttemptRepo;

@Service
@Transactional
public class SignUpAttemptService {
	
	
	@Autowired
	private SignUpAttemptRepo signUpAttemptRepo;
	
	public void deleteExtraObject(String userName){
		signUpAttemptRepo.deleteByEmail(userName);
	}
	
	public void createSignUpAttempt(SignUpAttemptDTO signUpAttemptDTO){
		
		SignUpAttempt signUpAttempt=new SignUpAttempt();
		BeanUtils.copyProperties(signUpAttemptDTO, signUpAttempt);
		signUpAttemptRepo.save(signUpAttempt);
	} 

}
