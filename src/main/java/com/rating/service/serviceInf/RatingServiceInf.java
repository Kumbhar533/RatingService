package com.rating.service.serviceInf;

import java.util.List;

import com.rating.service.entities.RatingEntity;

public interface RatingServiceInf {

	RatingEntity createRating(RatingEntity entity);

	List<RatingEntity> getAll();

	List<RatingEntity> getRatingByUserId(String userId);

	List<RatingEntity> getRatingByHotelId(String hotelId);

}
