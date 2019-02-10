package com.addabazi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="categoryID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long categoryID;
	
	
	@Column(name="categoryName")
	private String categoryName;
	
	@Column(name="categoryDetails")
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
