/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

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

    public FlightDetailsDirectory() {
         flightDetailsDir = new ArrayList<FlightDetails>();
         FlightDetails flightdetails= new FlightDetails();
        flightdetails.setAirlineName("Qatar");
        flightdetails.setAirliner("Boeing 377");
        flightdetails.setFlightNumber("33");
        flightdetails.setDeparture("Boston");
        flightdetails.setArrival("NY");
        flightdetails.setDepartureDate("02-02-2020");
        flightdetails.setArrivalDate("02-02-2020");
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
