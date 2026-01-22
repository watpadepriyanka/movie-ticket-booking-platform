package com.publicis.movie_booking.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "movies")
public class Movie {

    @Id
    private String id;
    private String name;
    private String language;
    private String genre;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getGenre() {
        return genre;
    }
}
