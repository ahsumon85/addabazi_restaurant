package com.addabazi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="service")
public class ServiceEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long serviceID;	
	
	@Column(name="serviceName")
	private String serviceName;
	
	@Column(name="price")
	private int price;
	
	@Column(name="photoPath")
	private String photoPath;

	@Column(name="amount")
	private double amount;
	
	@ManyToOne
	@JoinColumn(name="categoryID")
	private CategoryEntity categoryEntity;
	
	@ManyToOne
	@JoinColumn(name="managerID")
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
		return categoryEntity;
	}
	public void setCategoryEntity(CategoryEntity categoryEntity) {
		this.categoryEntity = categoryEntity;
	}
	public ManagerEntity getManagerEntity() {
		return managerEntity;
	}
	public void setManagerEntity(ManagerEntity managerEntity) {
		this.managerEntity = managerEntity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
