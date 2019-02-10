package com.addabazi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.addabazi.dto.CategoryDTO;
import com.addabazi.dto.ServiceDTO;
import com.addabazi.entity.CategoryEntity;
import com.addabazi.entity.ServiceEntity;
import com.addabazi.repo.CategoryRepo;
import com.addabazi.repo.ServiceRepo;

@Service
@Transactional
public class ServicesService {
	
	@Autowired
	private ServiceRepo serviceRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	public boolean categorySave(CategoryDTO categoryDTO){
		CategoryEntity categoryEntity =new CategoryEntity();
		BeanUtils.copyProperties(categoryDTO, categoryEntity);
		categoryRepo.save(categoryEntity);
		return true;
		
	}
	
	public List<CategoryEntity> findAllCategory(){
		return categoryRepo.findAll();
		
	}
	
	public void saveService(ServiceDTO dto){
		ServiceEntity entity=new ServiceEntity();
		CategoryEntity categoryEntity=new CategoryEntity();
		categoryEntity.setCategoryID(dto.getCategoryEntity().getCategoryID());		
		entity.setServiceName(dto.getServiceName());
		entity.setPrice(dto.getPrice());
		entity.setPhotoPath(dto.getPhotoPath());
		entity.setCategoryEntity(categoryEntity);
		serviceRepo.save(entity);
	}
	
	public List<ServiceEntity> findAllServices(){
		return serviceRepo.findAll();
	}
	
	/*
	public ServiceEntity findByServiceName(String serviceName){
		return (ServiceEntity)ServiceRepo.findByServiceName(serviceName);
		
	}*/
	
	public List<ServiceDTO> findCategoryService(Long categoryId)throws Exception{
		List<ServiceDTO> dtoList=new ArrayList<>();
		List<ServiceEntity> list=new ArrayList<>();
		list=serviceRepo.findExistingCategory(categoryId);
		for(ServiceEntity a:list){
			ServiceDTO dto=new ServiceDTO();
			BeanUtils.copyProperties(a, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}
	


}
