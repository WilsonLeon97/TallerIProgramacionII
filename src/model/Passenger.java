package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public abstract class Passenger {
	
    protected String idPassenger;

    protected String firstName;

    protected String lastName;

    protected String country;

    private LocalDate dateBirthday;
    
    private ArrayList<Ticket> tickets;
    
    private Ticket ticket;
    
    private Fly fly;

    
    public Passenger(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday) {
        
    	this.idPassenger = idPassenger;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.country = country;
    	this.dateBirthday = dateBirthday;
    	
    }

    public void setIdPassenger(String idPassenger) {
    	
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
    
    public void setFly(Fly fly) {
    	this.fly = fly;
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
    
    public Fly getFly() {
    	return fly;
    }

    public byte getAge() {
        
    	Period period =  Period.between(dateBirthday, LocalDate.now());
    	
        return (byte) period.getYears();
    }
    
    public boolean addToFly(Fly fly, short shorty) {
    	
    	return false;
    }
    
    public boolean addToFly(Fly fly, short shorty, float flot) {
    	
    	return false;
    }
    
    public ArrayList<Ticket> getTickets(){
    	
    	return tickets;
    }
    
    public double calcOvercrowed() {
    	double overcrowed = fly.getTarget().getValueTicket();
    	if(ticket.getWeight() > 23 && ticket.getWeight() < 33) {
    		return overcrowed  + (overcrowed * 0.1);
    	}else if (ticket.getWeight() > 33) {
    		return overcrowed + (overcrowed * 0.3);
    	}
    	return 0;
    }
    
    public abstract double getTicketCost();

}