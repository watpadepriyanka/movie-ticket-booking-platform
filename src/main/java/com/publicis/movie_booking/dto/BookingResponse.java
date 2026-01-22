package com.publicis.movie_booking.dto;

public class BookingResponse {

    private String bookingId;
    private String status;
    private int bookedSeats;
    private double totalAmount;
    private double discount;

    public BookingResponse(String bookingId, String status, int bookedSeats, double totalAmount, double discount) {
        this.bookingId = bookingId;
        this.status = status;
        this.bookedSeats = bookedSeats;
        this.totalAmount = totalAmount;
        this.discount = discount;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getStatus() {
        return status;
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
}
