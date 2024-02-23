package com.rating.service.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document("rating_entity")
public class RatingEntity {

	@Id
	private String ratingId;

	private String userId;

	private String hotelId;

	private int rating;

	private String feedback;

	private Hotel hotel;

}
