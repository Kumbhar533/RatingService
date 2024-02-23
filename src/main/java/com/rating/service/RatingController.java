package com.rating.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.service.entities.RatingEntity;
import com.rating.service.serviceInf.RatingServiceInf;

@RestController
@RequestMapping("/api/rating")
public class RatingController {

	@Autowired
	private RatingServiceInf ratingServiceInf;

	@PostMapping
	public ResponseEntity<?> addRating(@RequestBody RatingEntity ratingEntity) {

		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceInf.createRating(ratingEntity));
	}

	@GetMapping
	public ResponseEntity<?> getAll() {

		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceInf.getAll());
	}

	@GetMapping("/user/{userid}")
	public ResponseEntity<?> getRatingByUserId(@PathVariable String userid) {

		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceInf.getRatingByUserId(userid));
	}

	@GetMapping("/{hotelid}")
	public ResponseEntity<?> getRatingByHotelId(@PathVariable String hotelid) {

		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceInf.getRatingByUserId(hotelid));
	}
}
