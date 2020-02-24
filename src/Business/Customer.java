/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Girija Dhawale
 */
public class Customer {
    private String name;
    private String passportNumber;
    private String phoneNumber;
    private String email;
    private String setSeatNo;
    private String flightNumer;
    private int BookingId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetSeatNo() {
        return setSeatNo;
    }

    public void setSetSeatNo(String setSeatNo) {
        this.setSeatNo = setSeatNo;
    }

    public String getFlightNumer() {
        return flightNumer;
    }

    public void setFlightNumer(String flightNumer) {
        this.flightNumer = flightNumer;
    }

    public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int BookingId) {
        this.BookingId = BookingId;
    }
    
    
    
}
