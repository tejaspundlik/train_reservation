package com.trainapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.trainapp.dto.ReservationRequest;
import com.trainapp.service.ReservationService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping("/addReservation")
    @ResponseStatus(HttpStatus.CREATED)
    public String reservationBooking(@RequestBody ReservationRequest reservationRequest) {
        reservationService.createReservation(reservationRequest);
        return "Created Reservation";
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.CREATED)
    public String getReservations(@RequestBody ReservationRequest reservationRequest) {
        reservationService.getAllReservations();
        return "Created Train";
    }

}
