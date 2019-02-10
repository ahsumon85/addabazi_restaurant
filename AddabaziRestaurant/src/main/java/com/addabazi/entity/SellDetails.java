package com.addabazi.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sell_details")
public class SellDetails implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sellID")
	private Long sellID;
	
	@ManyToOne
	@JoinColumn(name="serviceID")
	private ServiceEntity serviceEntity;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="totalPrice")
	private double totalPrice;
	
	@Column(name="sellDate")
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
