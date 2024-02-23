package com.rating.service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rating.service.entities.RatingEntity;

public interface RatingRepository extends MongoRepository<RatingEntity, String> {

	// custom finder method

	List<RatingEntity> findByUserId(String userId);

	List<RatingEntity> findByHotelId(String hotelId);

}
