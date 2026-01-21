package com.publicis.movie_booking.Repository;

import com.publicis.movie_booking.Model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {
}
