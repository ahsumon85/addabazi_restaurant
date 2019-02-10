package com.addabazi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.addabazi.dto.BillDTO;
import com.addabazi.dto.ManagerDTO;
import com.addabazi.dto.ServiceDTO;
import com.addabazi.entity.Bill;
import com.addabazi.entity.CustomerBasicInfo;
import com.addabazi.entity.ManagerEntity;
import com.addabazi.entity.ServiceEntity;
import com.addabazi.repo.BillRepo;
import com.addabazi.repo.CustomerRepo;
import com.addabazi.repo.ManagerRepo;
import com.addabazi.repo.ServiceRepo;

@Service
@Transactional
public class BillService {
	
	@Autowired
	private CustomerRepo CustomerRepo;
	
	@Autowired
	private ManagerRepo ManagerRepo;
	
	@Autowired
	private ServiceRepo ServiceRepo;
	
	@Autowired
	private BillRepo BillRepo;
	

	
	
	
	public String billBasicInfo(BillDTO dto){
		CustomerBasicInfo bill=new CustomerBasicInfo();
		BeanUtils.copyProperties(dto, bill);
		CustomerRepo.save(bill);
		
		return null;
		
	}
	  
	/*public void addItem(addDTO dto){
		Bill entity=new Bill();
		//FinalAddItem finalAddItem=new FinalAddItem();
		BeanUtils.copyProperties(dto, entity);
		//BeanUtils.copyProperties(dto, finalAddItem);
		BillRepo.save(entity);
	//	finalAdd.save(finalAddItem);
		
	}
	*/
		
/*	public List<addDTO> findAllAdds(){
		List<addDTO> dtoList=new ArrayList<addDTO>();
		List<Bill> list=new ArrayList<Bill>();
		list=BillRepo.findAll();
		for(Bill a:list){
			addDTO dto=new addDTO();
			BeanUtils.copyProperties(a, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}
	*/
	public List<ManagerDTO> findAllManager(){
		List<ManagerDTO> dtoList=new ArrayList<>();
		List<ManagerEntity> list=new ArrayList<ManagerEntity>();
		list=ManagerRepo.findAll();
		for(ManagerEntity a:list){
			ManagerDTO dto=new ManagerDTO();
			BeanUtils.copyProperties(a, dto);
			dtoList.add(dto);
		}
		return dtoList;
		
	}
	
	public List<ServiceDTO> findAllSevice(String seviceCategory)throws Exception{
		List<ServiceDTO> dtoList=new ArrayList<>();
		List<ServiceEntity> list=new ArrayList<>();
	//	list=ServiceRepo.findExistingCategory(seviceCategory);
		for(ServiceEntity a:list){
			ServiceDTO dto=new ServiceDTO();
			BeanUtils.copyProperties(a, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}
	

}
