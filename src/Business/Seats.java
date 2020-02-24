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
        availableSeats = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getAvailableSeats() {
        for(int i = 1; i<= totalSeats.size(); i++){
            //for(int j = 1; j<= seatsTaken.size(); j++){
                if(!seatsTaken.contains(i)){
                    System.out.println("Avaiable seats "+i);
                    availableSeats.add(i);
                }
            //}
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
        for(int i = 1; i<=seatCount ; i++)
        {
            System.out.println("Setting seat in total seats "+ i);
            totalSeats.add(i);
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
