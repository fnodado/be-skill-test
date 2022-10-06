package com.crescendo.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crescendo.model.Review;
import com.crescendo.service.ReviewServiceImpl;

@RestController
public class ReviewController {

	@Autowired
	private ReviewServiceImpl irs;
	
	@GetMapping("/api/businesses/{id}/reviews")
	public List<Review> getAll(@PathVariable("id")Integer id) {
		return irs.findByBusiness(id);
	}
	
	@PostMapping("/api/businesses/{id}/reviews")
	public void insertReview(@PathVariable("id")Integer id, @RequestBody Review review) {
		irs.insert(id, review);
	}

}
