package com.crescendo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.exception.ResourceNotFound;
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
	public void insert(Integer id, Review review) {
		Business business = br.findById(id).orElse(null);
		if (business == null)
			throw new ResourceNotFound("Business not found");
		review.setBusiness(business);

		rr.save(review);
	}

	@Override
	public List<Review> findByBusiness(Integer id) {
		Business business = br.findById(id).orElse(null);
		List<Review> listOfReviews;
		if (business == null)
			throw new ResourceNotFound("Business not found");
		else {
			listOfReviews = rr.findByBusiness(business);
		}
		return listOfReviews;
	}

}
