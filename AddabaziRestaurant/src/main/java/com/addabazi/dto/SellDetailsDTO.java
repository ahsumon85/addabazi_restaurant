package com.addabazi.dto;

import java.io.Serializable;
import java.util.Date;

import com.addabazi.entity.ServiceEntity;

public class SellDetailsDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;

	
	private Long sellID;
	private ServiceEntity serviceEntity;
	private int quantity;
	private double totalPrice;
	private Date sellDate;
	
	public Long getSellID() {
		return sellID;
	}
	public void setSellID(Long sellID) {
		this.sellID = sellID;
	}
	public ServiceEntity getServiceEntity() {
		return serviceEntity;
	}
	public void setServiceEntity(ServiceEntity serviceEntity) {
		this.serviceEntity = serviceEntity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getSellDate() {
		return sellDate;
	}
	public void setSellDate(Date sellDate) {
		this.sellDate = sellDate;
	}
	
	
	
}
