package com.publicis.movie_booking.Repository;

import com.publicis.movie_booking.Model.Theatre;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TheatreRepository extends MongoRepository<Theatre,String> {

    List<Theatre> findbyCity(String city);
}
