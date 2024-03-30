package com.trainapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.trainapp.model.Reservation;

public interface ReservationRepository extends  MongoRepository<Reservation,String> {

}
