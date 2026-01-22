package com.publicis.movie_booking.dto;

public class BookingRequest {

    private String showId;
    private String userId;
    private int numberOfSeats;

    public String getShowId() {
        return showId;
    }

    public String getUserId() {
        return userId;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
