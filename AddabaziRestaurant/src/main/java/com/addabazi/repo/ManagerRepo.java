package com.addabazi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addabazi.entity.ManagerEntity;

public interface ManagerRepo extends JpaRepository<ManagerEntity, Long>{

}
