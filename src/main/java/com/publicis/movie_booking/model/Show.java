package com.publicis.movie_booking.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "shows")
public class Show {

    @Id
    private String id;
    private String movieId;
    private String theatreId;
    private LocalDate showDate;
    private LocalTime showTime;
    private int totalSeats;
    private int availableSeats;

    @Version
    private Long version;

    public String getId() {
        return id;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getTheatreId() {
        return theatreId;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public LocalTime getShowTime() {
        return showTime;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setTheatreId(String theatreId) {
        this.theatreId = theatreId;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public void setShowTime(LocalTime showTime) {
        this.showTime = showTime;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
