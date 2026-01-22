package com.publicis.movie_booking.controller;

import com.publicis.movie_booking.dto.TheatreShowResponse;
import com.publicis.movie_booking.service.TheatreService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/browse")
public class BrowseController {

    private final TheatreService theatreService;

    public BrowseController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    //browser theatre

    @GetMapping("/movies/{movieId}/theatres")
    public List<TheatreShowResponse> browseTheatres(
            @PathVariable String movieId,
            @RequestParam String city,
            @RequestParam String date) {



        return theatreService.browseTheatres(
                movieId,
                city,
                LocalDate.parse(date)
        );
    }



    //browser movie



}
