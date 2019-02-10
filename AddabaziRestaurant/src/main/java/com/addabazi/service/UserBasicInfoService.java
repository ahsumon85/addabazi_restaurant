package com.addabazi.service;

import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.addabazi.dto.UserBasicInfoDTO;
import com.addabazi.entity.UserBasicInfo;
import com.addabazi.repo.UserBasicInfoRepo;

@Service
@Transactional
public class UserBasicInfoService {
	
	@Autowired
	private UserBasicInfoRepo userBasicInfoRepo;
	
	public void saveUserBasicInfo(UserBasicInfoDTO userBasicInfoDTO){
		UserBasicInfo userBasicInfo=new UserBasicInfo();
		BeanUtils.copyProperties(userBasicInfoDTO, userBasicInfo);
		userBasicInfoRepo.save(userBasicInfo);
		
	}
	
	public UserBasicInfo findByEmail(String email){
		
		UserBasicInfo userBasicInfo=new UserBasicInfo();
		userBasicInfo=userBasicInfoRepo.findByEmail(email);
		return userBasicInfo;
	}

}
