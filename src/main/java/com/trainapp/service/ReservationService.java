package com.trainapp.service;

import com.trainapp.dto.ReservationResponse;
import com.trainapp.model.ReservationDetails;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainapp.dto.ReservationRequest;
import com.trainapp.repository.ReservationRepository;

import java.util.List;

@Service
@Slf4j
public class ReservationService {
    @Autowired
    private ReservationRepository repository;

    @SuppressWarnings("null")
    public void createReservation(ReservationRequest reservation) {
        ReservationDetails reservationSave = ReservationDetails.builder()
                .trainId(reservation.getTrainId())
                .trainName(reservation.getTrainName())
                .trainType(reservation.getTrainType())
                .trainRoute(reservation.getTrainRoute())
                .trainFare(reservation.getTrainFare())
                .passengerName(reservation.getPassengerName())
                .passengerNo(reservation.getPassengerNo())
                .totalFare(reservation.getTotalFare())
                .date(reservation.getDate())
                .build();
        repository.save(reservationSave);
        log.info(reservationSave + " has been added");
    }

    public List<ReservationResponse> getAllReservations() {
        List<ReservationDetails> reservations = repository.findAll();
        return reservations.stream().map(this::mapToReservationResponse).toList();

    }

    private ReservationResponse mapToReservationResponse(ReservationDetails reservation) {
        return ReservationResponse.builder()
                .trainId(reservation.getTrainId())
                .trainName(reservation.getTrainName())
                .trainType(reservation.getTrainType())
                .trainRoute(reservation.getTrainRoute())
                .trainFare(reservation.getTrainFare())
                .passengerName(reservation.getPassengerName())
                .passengerNo(reservation.getPassengerNo())
                .totalFare(reservation.getTotalFare())
                .date(reservation.getDate())
                .build();
    }
}
