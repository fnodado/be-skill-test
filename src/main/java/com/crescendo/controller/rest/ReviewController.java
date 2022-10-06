package com.crescendo.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crescendo.model.Review;
import com.crescendo.service.ReviewServiceImpl;

@RestController
public class ReviewController {

	@Autowired
	private ReviewServiceImpl irs;
	
	@GetMapping("/api/business/{id}/reviews")
	public List<Review> getAll(@PathVariable("id")Integer businessId) {
		return irs.findByBusiness(businessId);
	}
	
	@PostMapping("/api/businesses/{id}/review")
	public void insertReview( Review review) {
		irs.insert(review);
	}

}
