package com.addabazi.dto;

import java.io.Serializable;
import java.util.Date;

import com.addabazi.entity.CustomerBasicInfo;
import com.addabazi.entity.ManagerEntity;
import com.addabazi.entity.SellDetails;


public class BillDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long billID;
	
	private String billCustomID;
	
	private ManagerEntity managerEntity;
	
	private CustomerBasicInfo customerBasicInfo;
	
	private SellDetails sellDetails;
	
	private Date billDate;
	
	private double payableAmount;
	
	private double discountAmont;
	
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

	public SellDetails getSellDetails() {
		return sellDetails;
	}

	public void setSellDetails(SellDetails sellDetails) {
		this.sellDetails = sellDetails;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
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
