package com.trainapp.model;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Document(value="reservation_details")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ReservationDetails {
    private String trainId;
    private String trainName;
    private String trainType;
    private int trainRoute;
    private int trainFare;
    private List<String> passengerName;
    private int passengerNo;
    private int totalFare;
    private Date date;
}