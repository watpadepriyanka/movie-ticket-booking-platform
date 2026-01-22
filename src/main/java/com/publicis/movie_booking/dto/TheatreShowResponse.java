package com.publicis.movie_booking.dto;

import java.time.LocalTime;


public class TheatreShowResponse {

    private String theatreName;
    private LocalTime showTime;
    private int availableSeats;


    public TheatreShowResponse(String theatreName, LocalTime showTime, int availableSeats) {
        this.theatreName = theatreName;
        this.showTime = showTime;
        this.availableSeats = availableSeats;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public void setShowTime(LocalTime showTime) {
        this.showTime = showTime;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public LocalTime getShowTime() {
        return showTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
