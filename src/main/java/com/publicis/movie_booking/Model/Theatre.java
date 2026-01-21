package com.publicis.movie_booking.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "theatres")
public class Theatre {

    @Id
    private String id;
    private String name;
    private String city;
}
