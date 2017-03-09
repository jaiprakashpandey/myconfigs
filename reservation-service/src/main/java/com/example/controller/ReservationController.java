package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jai on 3/9/2017.
 */
@RestController
public class ReservationController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getName(){
        return "test";
    }
}
