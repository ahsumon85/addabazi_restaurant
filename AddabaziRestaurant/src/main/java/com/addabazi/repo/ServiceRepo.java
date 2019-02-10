package com.addabazi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.addabazi.entity.ServiceEntity;

public interface ServiceRepo extends JpaRepository<ServiceEntity, Long>{
	
	//serviceEntity findByserviceID(Long serviceID);
	
	@Query(value="select t from ServiceEntity t where t.categoryEntity.categoryID=?1")
	List<ServiceEntity> findExistingCategory(Long categoryId);

	public ServiceEntity findByServiceName(String serviceName);
}
