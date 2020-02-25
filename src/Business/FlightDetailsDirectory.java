/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Girija Dhawale
 */
public class FlightDetailsDirectory {
     private ArrayList<FlightDetails> flightDetailsDir;

    public ArrayList<FlightDetails> getFlightDetailsDir() {
        return flightDetailsDir;
    }

    public void setFlightDetailsDir(ArrayList<FlightDetails> flightDetailsDir) {
        this.flightDetailsDir = flightDetailsDir;
    }

    public FlightDetailsDirectory() throws ParseException {
         flightDetailsDir = new ArrayList<FlightDetails>();
         FlightDetails flightdetails= new FlightDetails();
        flightdetails.setAirlineName("Qatar");
        flightdetails.setAirliner("Boeing 377");
        flightdetails.setFlightNumber("33");
        flightdetails.setDeparture("Boston");
        flightdetails.setArrival("NY");
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime depdate = LocalDateTime.parse("2020-02-02 17:00:00", formatter);
        LocalDateTime arrDate = LocalDateTime.parse("2020-02-02 18:00:00", formatter);
        flightdetails.setDepartureDate(depdate);
        flightdetails.setArrivalDate(arrDate);
        flightdetails.setPrice(500);
        flightdetails.setSeats(20);
        flightDetailsDir.add(flightdetails);
    }
    
    public FlightDetails addFlight(FlightDetails fd){
    flightDetailsDir.add(fd);
    return fd;
    
    }
    
    public void removeFlight(String fd){
        for(int i =0; i< flightDetailsDir.size();i++){
            if(flightDetailsDir.get(i).getFlightNumber() == fd){
               flightDetailsDir.remove(i); 
            }
        }
        
    }
}
