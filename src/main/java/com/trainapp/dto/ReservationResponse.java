package com.trainapp.dto;

import java.util.Date;
import java.util.List;
import lombok.*;

@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationResponse {
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
