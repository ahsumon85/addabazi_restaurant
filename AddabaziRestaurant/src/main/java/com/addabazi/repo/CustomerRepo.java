package com.addabazi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addabazi.entity.CustomerBasicInfo;

public interface CustomerRepo extends JpaRepository<CustomerBasicInfo, Long>{
	

}
