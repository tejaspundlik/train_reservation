package com.trainapp.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
private String reservationNumber;
private String name;
private String sex;
private int age;
private String address;
private long creditno;
private String bank;
private String className;
private int quantity;
private Date date;
private String trainId;
private long pnr;
}
