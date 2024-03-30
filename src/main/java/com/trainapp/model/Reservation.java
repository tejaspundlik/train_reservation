package com.trainapp.model;

import java.sql.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(value="reservation_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
@Id
private String Id;
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
