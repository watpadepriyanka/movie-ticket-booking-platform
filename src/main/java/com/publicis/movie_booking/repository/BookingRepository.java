package com.publicis.movie_booking.repository;

import com.publicis.movie_booking.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookingRepository extends MongoRepository<Booking,String> {
}
