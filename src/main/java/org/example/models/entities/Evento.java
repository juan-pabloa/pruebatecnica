package org.example.models.entities;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Evento {

    private String id;
    private String location;
    private String name;
    private String date;

}
