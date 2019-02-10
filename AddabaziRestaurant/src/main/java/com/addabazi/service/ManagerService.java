package com.addabazi.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.addabazi.dto.ManagerDTO;
import com.addabazi.entity.ManagerEntity;
import com.addabazi.repo.ManagerRepo;

@Service
@Transactional
public class ManagerService {
	@Autowired
	private ManagerRepo addabaziRepo;
	
	
	public String saveManager(ManagerDTO dto){
		ManagerEntity entity=new ManagerEntity();
		BeanUtils.copyProperties(dto, entity);
		addabaziRepo.save(entity);
		return null;
		
	}
	public List<ManagerEntity> findAllManager(){
		return addabaziRepo.findAll();
	}
	
	public void deleteManager(Long managerID)throws Exception{
		addabaziRepo.delete(managerID);
	}

}
