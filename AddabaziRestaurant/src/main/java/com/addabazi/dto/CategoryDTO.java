package com.addabazi.dto;

import java.io.Serializable;

public class CategoryDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Long categoryID;
	private String categoryName;
	private String categoryDetails;
	
	
	public Long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Long categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDetails() {
		return categoryDetails;
	}
	public void setCategoryDetails(String categoryDetails) {
		this.categoryDetails = categoryDetails;
	}

	
	
}
