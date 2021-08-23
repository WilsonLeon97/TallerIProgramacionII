package model;

import java.time.LocalDate;
import java.util.*;


public class Registered extends Passenger {

    public Registered(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday) {
		super(idPassenger, firstName, lastName, country, dateBirthday);

	}

	private double miles;

    private float discount = 15;

    private LocalDate dateRegister;


    public void setMiles(double miles) {
    	this.miles = miles;
    }


    public double getMiles() {
        
        return miles;
    }


    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }

    public LocalDate getDateRegister() {
        // TODO implement here
        return dateRegister;
    }

}