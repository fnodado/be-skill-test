package com.crescendo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crescendo.model.Business;

@Repository
public interface BusinessRepository extends CrudRepository<Business, Integer>{

	List<Business> findAll();

}
