package com.publicis.movie_booking.repository;

import com.publicis.movie_booking.model.Theatre;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TheatreRepository extends MongoRepository<Theatre,String> {

    List<Theatre> findByCity(String city);
}
