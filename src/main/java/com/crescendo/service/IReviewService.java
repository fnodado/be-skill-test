package com.crescendo.service;

import java.util.List;

import com.crescendo.model.Review;

public interface IReviewService {

	List<Review> findByBusiness(Integer id);

	void insert(Integer id, Review review);

}
