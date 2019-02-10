package com.addabazi.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "manager")
public class ManagerEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="managerID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long managerID;	
	
	@Column(name="managerName")
	private String managerName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="natinoalID")
	private BigInteger natinoalID;
	
	@Column(name="number")
	private String number;
	
	@Column(name="fatherName")
	private String fatherName;
	
	@Column(name="fatherNumber")
	private String fatherNumber;
	
	@Column(name="photoPath")
	private String photoPath;
	
	@Column(name="birthDate")
	private String birthDate;
	
	@Column(name="education")
	private String education;
	
	@Column(name="address")
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
