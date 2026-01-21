package com.publicis.movie_booking.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "bookings")
public class Booking {

    @id
    private String id;
    private String showId;
    private int bookedSeat;
    private double totalAmount;
    private double discount;
    private String status;


}
