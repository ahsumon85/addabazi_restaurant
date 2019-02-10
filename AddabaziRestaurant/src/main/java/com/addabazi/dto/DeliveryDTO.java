package com.addabazi.dto;

import java.io.Serializable;
import java.util.Date;

import com.addabazi.entity.Bill;
import com.addabazi.entity.CustomerBasicInfo;

public class DeliveryDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	

	private Long deliveryId;
	private Bill bill;	
	private Date deliveryTime;
	
	
	public Long getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public Date getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	
	
}
