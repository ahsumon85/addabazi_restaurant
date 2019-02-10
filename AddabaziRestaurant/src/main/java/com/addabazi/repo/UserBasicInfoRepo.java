package com.addabazi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addabazi.entity.UserBasicInfo;

public interface UserBasicInfoRepo extends JpaRepository<UserBasicInfo, Long>{
	UserBasicInfo findByEmail(String email);

}
