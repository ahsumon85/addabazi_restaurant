package com.addabazi.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.addabazi.dto.BillDTO;
import com.addabazi.dto.ManagerDTO;
import com.addabazi.dto.ServiceDTO;
import com.addabazi.entity.ServiceEntity;
import com.addabazi.service.BillService;
import com.addabazi.service.ServicesService;

@Controller
@ManagedBean
@Scope("session")
public class BillController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private BillService BillService;
	
	@Autowired
	private ServicesService ServicesService;
			
	private BillDTO BillDTO;
	
	
	private ManagerDTO ManagerDTO;
	private ServiceDTO ServiceDTO;
	
	private List<ManagerDTO> managerDTOList;
	private List<ServiceDTO> categoryWiseList;
	private String seviceCategory;
	private String cutomerName;
	private String manager;
	private int number;
	private String customeID;
	private Date dateTime;

	
	/*
	public void findAllAdds(){
		try{
			addDtoList =new ArrayList<>();
			addDtoList=BillService.findAllAdds();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void findCategoryService(){
		try{
		categoryWiseList=new ArrayList<>();
		categoryWiseList=BillService.findAllSevice(seviceCategory);
		}catch (Exception e) {
		System.out.println("controller w.as not working.."+e);
		}
		
	}
	
	private String makeCustomID(){
		long currentId=9+new Date().getTime();
		String customId="AB01"+currentId;
		return customId;
		
	}
	

	public ManagerDTO getManagerDTO() {
		if(ManagerDTO==null){
			ManagerDTO=new ManagerDTO();
		}
		return ManagerDTO;
	}

	public void setManagerDTO(ManagerDTO ManagerDTO) {
		this.ManagerDTO = ManagerDTO;
	}

	public ServiceDTO getServiceDTO() {
		if(ServiceDTO==null){
			ServiceDTO=new ServiceDTO();
		}
		return ServiceDTO;
	}

	public void setServiceDTO(ServiceDTO ServiceDTO) {
		this.ServiceDTO = ServiceDTO;
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

	public addDTO getDto() {
		if(dto==null){
			dto=new addDTO();
		}
		return dto;
	}

	public void setDto(addDTO dto) {
		this.dto = dto;
	}

	public List<addDTO> getAddDtoList() {
		findAllAdds();
		return addDtoList;
	}

	public void setAddDtoList(List<addDTO> addDtoList) {
		this.addDtoList = addDtoList;
	}
	
	
	

	public String getCutomerName() {
		return cutomerName;
	}

	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	

	public String getCustomeID() {
		return customeID;
	}

	public void setCustomeID(String customeID) {
		this.customeID = customeID;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	*/
	
	
	public BillDTO getBillDTO() {
		if(BillDTO==null){
			BillDTO=new BillDTO();
		}
		return BillDTO;
	}

	public void setBillDTO(BillDTO BillDTO) {
		this.BillDTO = BillDTO;
	}


}
