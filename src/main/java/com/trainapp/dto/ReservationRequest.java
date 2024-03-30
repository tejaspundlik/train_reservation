package com.trainapp.dto;

import java.util.Date;
import java.util.List;
import lombok.*;

@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
    private String trainId;
    private String trainName;
    private String trainType;
    private int trainRoute;
    private int trainFare;
    private List<String> passengerName;
    private int passengerNo;
    private int totalFare;
    private Date date;

//    public String getTrainId() {
//        return this.trainId;
//    }
//
//    public String getTrainName() {
//        return this.trainName;
//    }
//
//    public String getTrainType() {
//        return this.trainType;
//    }
//
//    public int getTrainRoute() {
//        return this.trainRoute;
//    }
//
//    public int getTrainFare() {
//        return this.trainFare;
//    }
//
//    public int getTrainCapacity() {
//        return this.trainCapacity;
//    }
}
