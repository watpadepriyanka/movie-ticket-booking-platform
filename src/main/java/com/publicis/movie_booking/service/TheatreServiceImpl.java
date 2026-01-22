package com.publicis.movie_booking.service;

import com.publicis.movie_booking.dto.TheatreShowResponse;
import com.publicis.movie_booking.model.Show;
import com.publicis.movie_booking.model.Theatre;
import com.publicis.movie_booking.repository.ShowRepository;
import com.publicis.movie_booking.repository.TheatreRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService {

    private final TheatreRepository theatreRepository;
    private final ShowRepository showRepository;

    public TheatreServiceImpl(TheatreRepository theatreRepository, ShowRepository showRepository) {
        this.theatreRepository = theatreRepository;
        this.showRepository = showRepository;
    }



    @Override
    public List<TheatreShowResponse> browseTheatres(String movieId, String city, LocalDate date) {

        List<Theatre> theatres = theatreRepository.findByCity(city);
        List<TheatreShowResponse> response = new ArrayList<>();

        for (Theatre theatre : theatres) {
            List<Show> shows =
                    showRepository.findByTheatreIdAndShowDate(theatre.getId(), date);

            for (Show show : shows) {
                if (show.getMovieId().equals(movieId)) {
                    response.add(new TheatreShowResponse(
                            theatre.getName(),
                            show.getShowTime(),
                            show.getAvailableSeats()
                    ));
                }
            }
        }
        return response;
    }

}
