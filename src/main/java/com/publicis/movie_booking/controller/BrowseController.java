package com.publicis.movie_booking.controller;

import com.publicis.movie_booking.dto.TheatreShowResponse;
import com.publicis.movie_booking.model.Theatre;
import com.publicis.movie_booking.service.BrowseServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/browse")
public class BrowseController {

    private  final BrowseServiceImpl browseservice ;

    public BrowseController(BrowseServiceImpl browseservice) {
        this.browseservice = browseservice;
    }

    //browser theatre

    @GetMapping("/movies/{movieId}/theatres")
    public List<TheatreShowResponse> browseTheatres(
            @PathVariable String movieId,
            @RequestParam String city,
            @RequestParam String date) {

        Theatre t = new Theatre();
        t.getId();

        return browseservice.browseTheatres(
                movieId,
                city,
                LocalDate.parse(date)
        );
    }



    //browser movie



}
