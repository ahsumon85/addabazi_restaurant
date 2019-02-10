package com.addabazi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addabazi.entity.SellDetails;

public interface SellRepo extends JpaRepository<SellDetails, Long>{ 

}
