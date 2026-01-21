package com.publicis.movie_booking.Repository;

import com.publicis.movie_booking.Model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking,String> {
}
