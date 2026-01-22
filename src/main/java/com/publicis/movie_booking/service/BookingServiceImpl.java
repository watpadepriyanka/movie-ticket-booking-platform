package com.publicis.movie_booking.service;

import com.publicis.movie_booking.dto.BookingRequest;
import com.publicis.movie_booking.dto.BookingResponse;
import com.publicis.movie_booking.model.Booking;
import com.publicis.movie_booking.model.Show;
import com.publicis.movie_booking.repository.BookingRepository;
import com.publicis.movie_booking.repository.ShowRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BookingServiceImpl implements BookingService {

    private final ShowRepository showRepository;
    private final BookingRepository bookingRepository;


    public BookingServiceImpl(ShowRepository showRepository,
                              BookingRepository bookingRepository) {
        this.showRepository = showRepository;
        this.bookingRepository = bookingRepository;


    }

    @Override
    public BookingResponse createBooking(BookingRequest request) {


        Show show = showRepository.findById(request.getShowId())
                .orElseThrow(() -> new RuntimeException("Show not found"));

        // 1. Validate seat availability
        if (show.getAvailableSeats() < request.getNumberOfSeats()) {
            throw new RuntimeException("Not enough seats available");
        }

        // 2. Reduce available seats
        show.setAvailableSeats(
                show.getAvailableSeats() - request.getNumberOfSeats()
        );

        // 3. Save show (optimistic locking handled by Mongo @Version)
        showRepository.save(show);

        // 4. Create booking
        Booking booking = new Booking();
        booking.setShowId(show.getId());
        booking.setUserId(request.getUserId());
        booking.setBookedSeats(request.getNumberOfSeats());
        booking.setStatus("CONFIRMED");
        booking.setBookedAt(LocalDateTime.now());

        bookingRepository.save(booking);


        return new BookingResponse(
                booking.getId(),
                booking.getStatus(),
                booking.getBookedSeats(),
                booking.getTotalAmount(),
                booking.getDiscount());


    }
}
