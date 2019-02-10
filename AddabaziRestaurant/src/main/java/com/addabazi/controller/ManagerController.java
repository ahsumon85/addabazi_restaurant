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

import com.addabazi.dto.ManagerDTO;
import com.addabazi.entity.ManagerEntity;
import com.addabazi.service.ManagerService;
import com.addabazi.upload.Upload;
import com.addabazi.upload.UploadImpl;

@Controller
@ManagedBean
@Scope("session")
public class ManagerController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ManagerService service;
	private ManagerDTO managerdto;

	private UploadedFile uploadFile;
	private List<ManagerDTO> managerDTOs;
	
	

	public String savaManager(){
		FacesContext mass=FacesContext.getCurrentInstance();
		try{
			String fileName=uploadFile.getFileName();
			Upload upload=new UploadImpl();
			upload.upload("managerPic", fileName, uploadFile);
			managerdto.setPhotoPath(fileName);
			service.saveManager(managerdto);
			managerdto=null;
			mass.addMessage(null, new FacesMessage("Data Delete Successfully!"));
		}catch (Exception e) {
			mass.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Data Could not Inserted Successfully!",""));
 			
		}
		return null;
		
	}
	
	public void findAllManagers(){
		try{
			managerDTOs =new ArrayList<ManagerDTO>();
			List<ManagerEntity> list=new ArrayList<ManagerEntity>();
			list=service.findAllManager();
			for(ManagerEntity a:list){
				ManagerDTO dto=new ManagerDTO();
				BeanUtils.copyProperties(a, dto);
				managerDTOs.add(dto);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	  public void deleteManager(){
		  FacesContext mass=FacesContext.getCurrentInstance();
	         try{
	            service.deleteManager(managerdto.getManagerID());
	            mass.addMessage(null, new FacesMessage("Data Delete Successfully!"));   
	 		} catch (Exception e) {
	 			mass.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Data Could not Inserted Successfully!",""));
	 		}
	       
	        
	     }
	  
	  
	  
	public ManagerDTO getManagerdto() {
		if(managerdto==null) managerdto=new ManagerDTO();
		return managerdto;
	}

	public void setManagerdto(ManagerDTO managerdto) {
		this.managerdto = managerdto;
	}

	

	public List<ManagerDTO> getManagerDTOs() {
		findAllManagers();
		return managerDTOs;
	}

	public void setManagerDTOs(List<ManagerDTO> managerDTOs) {
		this.managerDTOs = managerDTOs;
	}

	public UploadedFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(UploadedFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	
	

}
