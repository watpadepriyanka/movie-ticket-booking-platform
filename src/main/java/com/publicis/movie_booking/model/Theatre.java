package com.publicis.movie_booking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "theatres")
public class Theatre {

    @Id
    private String id;
    private String name;
    private String city;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }


}
