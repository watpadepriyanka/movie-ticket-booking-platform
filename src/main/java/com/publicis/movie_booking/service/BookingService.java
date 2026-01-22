package com.publicis.movie_booking.service;

import com.publicis.movie_booking.dto.BookingRequest;
import com.publicis.movie_booking.dto.BookingResponse;

public interface BookingService {


    BookingResponse createBooking(BookingRequest request);

}
