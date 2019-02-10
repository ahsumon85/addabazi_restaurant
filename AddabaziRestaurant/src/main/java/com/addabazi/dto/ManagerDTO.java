package com.addabazi.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class ManagerDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long managerID;	
	private String managerName;
	private String email;
	private BigInteger natinoalID;
	private String number;
	private String fatherName;
	private String fatherNumber;
	private String photoPath;
	private String birthDate;
	private String education;
	private String address;
	
	
	public Long getManagerID() {
		return managerID;
	}
	public void setManagerID(Long managerID) {
		this.managerID = managerID;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigInteger getNatinoalID() {
		return natinoalID;
	}
	public void setNatinoalID(BigInteger natinoalID) {
		this.natinoalID = natinoalID;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFatherNumber() {
		return fatherNumber;
	}
	public void setFatherNumber(String fatherNumber) {
		this.fatherNumber = fatherNumber;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
	

}
