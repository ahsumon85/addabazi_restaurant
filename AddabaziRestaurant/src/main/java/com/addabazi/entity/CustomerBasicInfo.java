package com.addabazi.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerBasicInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="custID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long custID;
	
	@Column(name="customerID")
	private String customerID;
	
	@Column(name="customerName")
	private String customerName;

	@Column(name="customerNumber")
	private int customerNumber;	
		
	@Column(name="dateTime")
	private Date dateTime;
	

	public Long getCustID() {
		return custID;
	}

	public void setCustID(Long custID) {
		this.custID = custID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}


	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
}
