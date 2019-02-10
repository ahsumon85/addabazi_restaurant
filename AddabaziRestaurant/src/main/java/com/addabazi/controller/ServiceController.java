package com.addabazi.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.addabazi.dto.CategoryDTO;
import com.addabazi.dto.ServiceDTO;
import com.addabazi.entity.CategoryEntity;
import com.addabazi.entity.ServiceEntity;
import com.addabazi.service.ServicesService;
import com.addabazi.upload.UploadService;
import com.addabazi.upload.UploadServiceImpl;


@Controller
@ManagedBean
@Scope("session")
public class ServiceController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ServicesService service;
	
	
	private ServiceDTO servicedto;
	private CategoryDTO categoryDTO;
	
	
	private List<CategoryDTO> categoryDTOs;
	private List<ServiceDTO> serviceList;
	
	
	private UploadedFile uploadFile;
	private List<ServiceDTO> categoryWiseList;
	private String seviceCategory;
	
	
	
	public void categorySave(){
		
		FacesContext mass=FacesContext.getCurrentInstance();
		try{
			boolean b=service.categorySave(categoryDTO);
			categoryDTO=null;
			if(b){
				mass.addMessage(null, new FacesMessage("Category Inserted Successfully!"));   
			}else {
				mass.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Category Could not Inserted Successfully!",""));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void findAllCategory(){
		try{
			categoryDTOs=new ArrayList<>();
			List<CategoryEntity> list=new ArrayList<>();
			list=service.findAllCategory();
			for(CategoryEntity a:list){
				CategoryDTO categoryDTO=new CategoryDTO();
				BeanUtils.copyProperties(a, categoryDTO);
				categoryDTOs.add(categoryDTO);
			}
		}catch (Exception e) {
			
		}
		
	}
	
	public void saveService(){
		FacesContext mass=FacesContext.getCurrentInstance();
		
		try{	
		String fileName=uploadFile.getFileName();
		UploadService upload=new UploadServiceImpl();
		upload.uploadService("servicePic", fileName, uploadFile);	
		servicedto.setPhotoPath(fileName); 
		service.saveService(servicedto);
		servicedto=null; 
		mass.addMessage(null, new FacesMessage("Data Inserted Successfully!"));   
		}
		catch (Exception e) {
			mass.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Data Could not Inserted Successfully!",""));
			e.printStackTrace();
		}

	}
	
	public void findAllServices(){
		try{
			serviceList =new ArrayList<ServiceDTO>();
			List<ServiceEntity> list=new ArrayList<ServiceEntity>();
			list=service.findAllServices();
			for(ServiceEntity a:list){
				ServiceDTO dto=new ServiceDTO();
				BeanUtils.copyProperties(a, dto);
				serviceList.add(dto);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void findCategoryService(){
		try{
		Long categoryId=categoryDTO.getCategoryID();
		System.out.println("category is working.."+categoryId);
		categoryWiseList=new ArrayList<>();
		categoryWiseList=service.findCategoryService(categoryId);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	public List<ServiceDTO> getCategoryWiseList() {
		findCategoryService();
		return categoryWiseList;
	}

	public void setCategoryWiseList(List<ServiceDTO> categoryWiseList) {
		this.categoryWiseList = categoryWiseList;
	}

	public String getSeviceCategory() {
		return seviceCategory;
	}

	public void setSeviceCategory(String seviceCategory) {
		this.seviceCategory = seviceCategory;
	}




	
		/*new edition*/
	
	public CategoryDTO getCategoryDTO() {
		if(categoryDTO==null){
			categoryDTO=new CategoryDTO();
		}
		return categoryDTO;
	}


	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}

	public List<CategoryDTO> getCategoryDTOs() {
		findAllCategory();
		return categoryDTOs;
	}

	public void setCategoryDTOs(List<CategoryDTO> categoryDTOs) {
		this.categoryDTOs = categoryDTOs;
	}

	public ServiceDTO getServicedto() {
		if(servicedto==null){
			servicedto =new ServiceDTO();
		}
		return servicedto;
	}

	public void setServicedto(ServiceDTO servicedto) {
		this.servicedto = servicedto;
	}
	
	public List<ServiceDTO> getServiceList() {
		 findAllServices();
		return serviceList;
	}

	public void setServiceList(List<ServiceDTO> serviceList) {
		this.serviceList = serviceList;
	}

	public UploadedFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(UploadedFile uploadFile) {
		this.uploadFile = uploadFile;
	}

}

	