package com.publicis.movie_booking.repository;

import com.publicis.movie_booking.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {
}
