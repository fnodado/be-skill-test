package com.crescendo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crescendo.model.Business;
import com.crescendo.model.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer>{

	List<Review> findByBusiness(Business b);
	
}
