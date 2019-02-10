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
@Table(name="delivery")
public class DeliveryEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="delivery_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long deliveryId;
	
	@ManyToOne
	@JoinColumn(name="billId")
	private Bill bill;	
	
	@Column(name="deliveryTime")
	private Date deliveryTime;
	
	
	public Long getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}

}
