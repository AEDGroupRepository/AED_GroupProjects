/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Girija Dhawale
 */
public class FlightDetails{
    
    private String airliner;
    private String airlineName;
    private String flightNumber;
    private String departure;
    private String arrival;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;
    private String dayTime;
    private double price;
    private int seats;

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public String getDayTime() {
        int hour = departureDate.getHour();
        System.out.println(hour);
        if(hour >= 4 && hour <= 12){
            this.dayTime="Morning";
        } else if(hour > 12 && hour <= 18){
            this.dayTime = "Day Time";
        } else if((hour > 18 && hour < 25) || (hour >= 1 && hour < 4) ){
            this.dayTime = "Night";
        }
        System.out.println(this.dayTime);
        return this.dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    
    
    
//     @Override
//    public String toString(){
//        return this.flightNumber;
//    }

//    @Override
//    public int compareTo(FlightDetails t) {
//        return (int)(price - t.price);
//    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
