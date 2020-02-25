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
public class AirlineDirectory {
    
    private ArrayList<Airline> airlineDirectory;
    

    public AirlineDirectory(){
        airlineDirectory = new ArrayList<Airline>();
        
        Airline airline1 = new Airline("Qatar","Boeing 377", 1, 200);
        Airline airline2 = new Airline("Emirates","Boeing 370", 2, 300);
        Airline airline3 = new Airline("Qatar","Boeing 777", 3, 250);
        airlineDirectory.add(airline1);
        airlineDirectory.add(airline2);
        airlineDirectory.add(airline3);
        
    }
    public ArrayList<Airline> getAirlineDirectory() {
        return airlineDirectory;
    }

    public void setAirlineDirectory(ArrayList<Airline> airDirect) {
        this.airlineDirectory = airDirect;
    }
    
//    public Airliner addAirline(){
//        Airliner a = new Airliner();
//        airlineDirectory.add(a);
//        return a;
//    }
    
    public void addAirliner(Airline airline){
        airlineDirectory.add(airline);
    }
    public void removeAirline(int row){
        int index = -1;
        for(int i =0; i< airlineDirectory.size();i++){
            if(airlineDirectory.get(i).getAirlineNo() == row){
                index = i;
            }
        }
        if(index >=0){
            airlineDirectory.remove(index);
        }
    }
    public Airline getAirline(int row){
        for(int i =0; i< airlineDirectory.size();i++){
            if(airlineDirectory.get(i).getAirlineNo() == row){
               return airlineDirectory.get(i);
            }
        }
        return null;
    }
    public Airline getAirlineName(String airlinename, String airliner){
        for(Airline a: airlineDirectory){
            if(a.getAirlineName().equalsIgnoreCase(airlinename) && a.getAirlinerName().equalsIgnoreCase(airliner)){
                return a;
            }
        }
        return null;
    }
}
