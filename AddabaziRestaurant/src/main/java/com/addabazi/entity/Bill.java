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
@Table(name="bill")
public class Bill implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="billID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long billID;
	
	@Column(name="billCustomID")	
	private String billCustomID;
	
	@ManyToOne
	@JoinColumn(name="managerID")
	private ManagerEntity managerEntity;
	
	@ManyToOne
	@JoinColumn(name="custID")
	private CustomerBasicInfo customerBasicInfo;
	
	@ManyToOne
	@JoinColumn(name="sellID")
	private SellDetails sellDetails;	
	
	@Column(name="billDate")
	private Date billDate;
	
	@Column(name="payableAmount")
	private double payableAmount;
	
	@Column(name="discountAmont")
	private double discountAmont;
	
	@Column(name="netPayment")
	private double netPayment;
	

	public Long getBillID() {
		return billID;
	}

	public void setBillID(Long billID) {
		this.billID = billID;
	}

	public String getBillCustomID() {
		return billCustomID;
	}

	public void setBillCustomID(String billCustomID) {
		this.billCustomID = billCustomID;
	}

	public ManagerEntity getManagerEntity() {
		return managerEntity;
	}

	public void setManagerEntity(ManagerEntity managerEntity) {
		this.managerEntity = managerEntity;
	}

	public CustomerBasicInfo getCustomerBasicInfo() {
		return customerBasicInfo;
	}

	public void setCustomerBasicInfo(CustomerBasicInfo customerBasicInfo) {
		this.customerBasicInfo = customerBasicInfo;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public SellDetails getSellDetails() {
		return sellDetails;
	}

	public void setSellDetails(SellDetails sellDetails) {
		this.sellDetails = sellDetails;
	}

	public double getPayableAmount() {
		return payableAmount;
	}

	public void setPayableAmount(double payableAmount) {
		this.payableAmount = payableAmount;
	}

	public double getDiscountAmont() {
		return discountAmont;
	}

	public void setDiscountAmont(double discountAmont) {
		this.discountAmont = discountAmont;
	}

	public double getNetPayment() {
		return netPayment;
	}

	public void setNetPayment(double netPayment) {
		this.netPayment = netPayment;
	}
	
	
}
