/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author cnakhare
 */
public class Seats {
    private ArrayList<Integer> seatsTaken;
    private ArrayList<Integer> availableSeats;
    private ArrayList<Integer> totalSeats;
    
    public Seats(){
        seatsTaken = new ArrayList<Integer>();
        totalSeats = new ArrayList<Integer>();
        
    }

    public ArrayList<Integer> getAvailableSeats() {
        availableSeats = new ArrayList<Integer>();
        for(int i = 1; i<= totalSeats.size(); i++){
                if(!seatsTaken.contains(i)){
                    availableSeats.add(i);
                }
    }
        return availableSeats;
    }

    public void setAvailableSeats(ArrayList<Integer> availableSeats) {
        this.availableSeats = availableSeats;
    }

    public ArrayList<Integer> getTotalSeats() {
        return totalSeats;
    }
    
    //Setting all seats on the flight
    public void setTotalSeats(int seatCount) {
        if(totalSeats.isEmpty()){
           for(int i = 1; i<=seatCount ; i++)
            {
                totalSeats.add(i);
            } 
        }
    }
    
    public ArrayList<Integer> getSeatsTaken() {
        return seatsTaken;
    }
    
    public void bookSeats(int seatNo){
        seatsTaken.add(seatNo);
    }
    public void setSeatsTaken(ArrayList<Integer> seatsTaken) {
        this.seatsTaken = seatsTaken;
    }
    
}
