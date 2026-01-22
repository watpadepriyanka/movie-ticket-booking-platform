package com.publicis.movie_booking.repository;

import com.publicis.movie_booking.model.Show;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface ShowRepository extends MongoRepository<Show,String> {


    List<Show> findByMovieIdAndShowDate(String movieId, LocalDate showDate);

    List<Show> findByTheatreIdAndShowDate(String theatreId, LocalDate showDate);
}
