package com.publicis.movie_booking.repository;

import com.publicis.movie_booking.model.Show;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ShowRepository extends MongoRepository<Show,String> {


    // READ
    List<Show> findByMovieIdAndShowDate(String movieId, LocalDate showDate);

    List<Show> findByTheatreIdAndShowDate(String theatreId, LocalDate showDate);

    // WRITE
    Optional<Show> findByIdAndTheatreId(String id, String theatreId);
}
