package com.trainapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.trainapp.dto.ReservationRequest;
import com.trainapp.model.Reservation;
import com.trainapp.service.ReservationService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
@Autowired
private ReservationService rService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String reserveTrain(@RequestBody ReservationRequest reservationRequest){
        rService.createReservation(reservationRequest);
        return "Created Train";
    }
    
}
