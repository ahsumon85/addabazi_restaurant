package com.addabazi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.addabazi.entity.SignUpAttempt;

public interface SignUpAttemptRepo extends JpaRepository<SignUpAttempt, Long>{

	@Modifying
	@Query(value="delete from SignUpAttempt t where t.email=?1")
	public void deleteByEmail(String name);
}
