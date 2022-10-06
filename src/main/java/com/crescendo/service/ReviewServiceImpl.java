package com.crescendo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.model.Business;
import com.crescendo.model.Review;
import com.crescendo.repository.BusinessRepository;
import com.crescendo.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements IReviewService {

	@Autowired
	private ReviewRepository rr;
	
	@Autowired
	private BusinessRepository br;

	@Override
	public void insert(Review review) {
		rr.save(review);
	}

	@Override
	public List<Review> findByBusiness(Integer id) {
		Business business = br.findByBusinessId(id);
		
		return rr.findByBusiness(business);
	}

}
