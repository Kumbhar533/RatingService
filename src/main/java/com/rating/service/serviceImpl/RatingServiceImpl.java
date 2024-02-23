package com.rating.service.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.service.entities.RatingEntity;
import com.rating.service.repository.RatingRepository;
import com.rating.service.serviceInf.RatingServiceInf;

@Service
public class RatingServiceImpl implements RatingServiceInf {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public RatingEntity createRating(RatingEntity entity) {

		String randomuuid = UUID.randomUUID().toString();

		entity.setRatingId(randomuuid);

		return this.ratingRepository.save(entity);
	}

	@Override
	public List<RatingEntity> getAll() {

		return this.ratingRepository.findAll();
	}

	@Override
	public List<RatingEntity> getRatingByUserId(String userId) {

		return this.ratingRepository.findByUserId(userId);
	}

	@Override
	public List<RatingEntity> getRatingByHotelId(String hotelId) {

		return this.ratingRepository.findByHotelId(hotelId);
	}

}
