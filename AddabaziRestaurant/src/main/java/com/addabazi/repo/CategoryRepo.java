package com.addabazi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addabazi.entity.CategoryEntity;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Long>{

}
