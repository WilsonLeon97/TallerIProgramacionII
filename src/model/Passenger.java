package model;

import java.time.LocalDate;
import java.util.*;


public abstract class Passenger {
	
    protected String idPassenger;

    protected String firstName;

    protected String lastName;

    protected String country;

    private LocalDate dateBirthday;
    
    protected Fly fly;

    
    public Passenger(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday) {
        
    	this.idPassenger = idPassenger;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.country = country;
    	this.dateBirthday = dateBirthday;
    	this.fly = fly;
    	
    }

    public void setIdPassenger(String IdPassenger) {
    	
    	this.idPassenger = idPassenger;

    }

    public void setFirstName(String firstName) {
        
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        
    	this.lastName = lastName;
    }

    public void setCountry(String country) {
        
    	this.country = country;
    }

    public String getIdPassenger() {
        
    	return idPassenger;
    }

    public String getFirstName() {
        
        return firstName;
    }

    public String getLastName() {
        
        return lastName;
    }

    public String getCountry() {
        
        return country;
    }

    public byte getAge() {
        
        return 1;
    }


    public Fly getFly() {
        
        return null;
    }


    public void setFly(Fly fly) {
        
        this.fly = fly;
    }


    public double getTicketCost() {
 
        return 0.0d;
    }

}