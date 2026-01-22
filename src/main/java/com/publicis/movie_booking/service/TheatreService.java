package com.publicis.movie_booking.service;

import com.publicis.movie_booking.dto.TheatreShowResponse;

import java.time.LocalDate;
import java.util.List;

public interface TheatreService {




    public List<TheatreShowResponse> browseTheatres(String movieId, String city, LocalDate date);
}
