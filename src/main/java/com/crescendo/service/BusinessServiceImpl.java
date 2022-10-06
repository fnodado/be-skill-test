package com.crescendo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.exception.ResourceNotFound;
import com.crescendo.model.Business;
import com.crescendo.repository.BusinessRepository;

@Service
public class BusinessServiceImpl implements IBusinessService{

	@Autowired
	private BusinessRepository br;
	
	@Override
	public List<Business> findAll() {
		return br.findAll();
	}

	@Override
	public Business findById(Integer id) {
		Business business = br.findById(id).orElse(null);
		if (business == null)
			throw new ResourceNotFound("Business not found");
		return business;
	}

	@Override
	public Business insert(Business business) {
		return br.save(business);
	}

	@Override
	public Business update(Integer id, Business updated) {
		Business orig = br.findById(id).orElse(null);
		if (orig == null)
			throw new ResourceNotFound("Business not found");
		
		Business toSave = updateBusiness(orig, updated);
		
		return br.save(toSave);
	}

	private Business updateBusiness(Business orig, Business updated) {
		Business toSave = new Business();
		toSave.setId(orig.getId());
		toSave.setAddress(updated.getAddress());
		toSave.setBusinessName(updated.getBusinessName());
		toSave.setPhone(updated.getPhone());
		
		return toSave;
	}

	@Override
	public void delete(Integer id) {
		 br.deleteById(id);
	}

}
