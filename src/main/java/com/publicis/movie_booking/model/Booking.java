package com.publicis.movie_booking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "bookings")
public class Booking {

    @Id
    private String id;

    private String showId;
    private String userId;

    private int bookedSeats;
    private double totalAmount;
    private double discount;
    private String status;

    private LocalDateTime bookedAt;

    public String getId() {
        return id;
    }

    public String getShowId() {
        return showId;
    }

    public String getUserId() {
        return userId;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getBookedAt() {
        return bookedAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBookedAt(LocalDateTime bookedAt) {
        this.bookedAt = bookedAt;
    }
}
