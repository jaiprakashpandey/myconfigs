package com.example.modal;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Jai on 3/9/2017.
 */
@Data
@Entity
public class Reservation {
   @Id
   @GeneratedValue
    private Long id;

    public Reservation(String name) {
        this.name = name;
    }

    public Reservation() {
    }

    private String name;
    private String adr;
    private String age;

}
