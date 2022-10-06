package com.crescendo.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crescendo.model.Business;
import com.crescendo.service.BusinessServiceImpl;

@RestController
public class BusinessController {

	@Autowired
	private BusinessServiceImpl bsi;

	@GetMapping("/api/businesses")
	public List<Business> findAll() {
		
		return bsi.findAll();
	}

	@PostMapping("/api/businesses/")
	public void insert(@RequestBody Business business) {
		bsi.insert(business);
	}
	
	@PutMapping("/api/businesses/{id}")
	public void update(@PathVariable("id") Integer id, @RequestBody Business business) {
		bsi.update(id, business);
	}
	
	@DeleteMapping("/api/businesses/{id}")
	public void delete(@PathVariable("id")Integer id) {
		bsi.delete(id);
	}
}
