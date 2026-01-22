package com.publicis.movie_booking.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "bookings")
public class Booking {

    @Id
    private String id;
    private String showId;
    private int bookedSeat;
    private double totalAmount;
    private double discount;
    private String status;


    public String getId() {
        return id;
    }

    public String getShowId() {
        return showId;
    }

    public int getBookedSeat() {
        return bookedSeat;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public void setBookedSeat(int bookedSeat) {
        this.bookedSeat = bookedSeat;
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
}
