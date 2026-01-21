package com.publicis.movie_booking.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Document(collation = "shows")
public class Show {

    @Id
    private String id;
    private String movieId;
    private String theatreId;
    private LocalDate showDate;
    private LocalTime showTime;
    private int totalSeats;
    private int availableSeats;


}
