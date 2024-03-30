package com.trainapp.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainapp.dto.ReservationRequest;
import com.trainapp.model.Reservation;
import com.trainapp.repository.ReservationRepository;

@Service
public class ReservationService {
@Autowired 
private ReservationRepository repository;

    public void createReservation(ReservationRequest reservationRequest){
Reservation reservation = new Reservation();
reservation.setReservationNumber(UUID.randomUUID().toString());
reservation.setName(reservationRequest.getName());
reservation.setSex(reservationRequest.getSex());
reservation.setAge(reservationRequest.getAge());
reservation.setAddress(reservationRequest.getAddress());
reservation.setCreditno(reservationRequest.getCreditno());
reservation.setBank(reservationRequest.getBank());
reservation.setClassName(reservationRequest.getClassName());
reservation.setQuantity(reservationRequest.getQuantity());
reservation.setDate(reservationRequest.getDate());
reservation.setTrainId(reservationRequest.getTrainId());
reservation.setPnr(reservationRequest.getPnr());
repository.save(reservation);


// public List<ReservationResponse> getAllReservations(){
// implement this
// }
}
}
