package com.addabazi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addabazi.entity.Bill;

public interface BillRepo extends JpaRepository<Bill, Long>{

}
