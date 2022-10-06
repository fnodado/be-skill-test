package com.crescendo.service;

import java.util.List;

import com.crescendo.model.Business;

public interface IBusinessService {
	
	List<Business> findAll();
	
	Business findById(Integer id);
	
	Business insert(Business business);
	
	Business update(Integer id, Business business);
	
	void delete(Integer id);
	
}
