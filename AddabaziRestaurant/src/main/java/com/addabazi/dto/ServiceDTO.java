package com.addabazi.dto;

import java.io.Serializable;

import com.addabazi.entity.CategoryEntity;
import com.addabazi.entity.ManagerEntity;

public class ServiceDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long serviceID;	
	private String serviceName;
	private int price;
	private String photoPath;
	private double amount;
	private CategoryEntity categoryEntity;
	private ManagerEntity managerEntity;
	
	
	public Long getServiceID() {
		return serviceID;
	}
	public void setServiceID(Long serviceID) {
		this.serviceID = serviceID;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public CategoryEntity getCategoryEntity() {
		if(categoryEntity==null)categoryEntity=new CategoryEntity();
		return categoryEntity;
	}
	public void setCategoryEntity(CategoryEntity categoryEntity) {
		this.categoryEntity = categoryEntity;
	}
	public ManagerEntity getManagerEntity() {
		if(managerEntity==null) managerEntity=new ManagerEntity();
		return managerEntity;
	}
	public void setManagerEntity(ManagerEntity managerEntity) {
		this.managerEntity = managerEntity;
	}
	
}
