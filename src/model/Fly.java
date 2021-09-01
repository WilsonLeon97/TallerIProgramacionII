package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import exceptions.ExceptionDate;

public class Fly {

    private String number;

    private LocalDate date;

    private LocalTime time;

    private Airplane airplane;
    
    private Target target;
    
    private ArrayList<Passenger> passengers;

    public Fly(String number, LocalDate date, LocalTime time, Airplane airplane, Target target) {
    	
    	passengers = new ArrayList<>();
    	this.number = number;
    	this.date = date;
    	this.time = time;
    	this.airplane = airplane;
    	this.target = target;

    }

    public void setDate(LocalDate date) throws ExceptionDate {

        if( date.isBefore( LocalDate.now())) {
        	//throw new ExceptionDate(String);
        }
        this.date = date;
        
    }

    public void setTime(LocalTime time) {

        this.time = time;
        
    }

    public LocalDate getDate() {

        return date;
    }

    public LocalTime getTime() {

        return time;
    } 

    public boolean addPassenger(Passenger passenger) {
    	if(airplane.getCapacity() > passengers.size() && !passengers.contains(passenger)) {
    		passengers.add(passenger);
    		if( passenger instanceof Registered ) {
    			((Registered) passenger).setMiles( ((Registered) passenger).getMiles() + target.getDistance());
    		}
    		
    		return true;
    	}

        return false;
    }

    public boolean addPassenger(ArrayList<Passenger> passengers) {
    	if ( airplane.getCapacity() - this.passengers.size() > passengers.size()) {
    		passengers.forEach( passenger -> this.passengers.add(passenger));
    		return true;
    	}
    	return false;
 
    }

    public ArrayList<Passenger> getPassengers() {

        return passengers;
    }

    public void setTarget(Target target) {

        this.target = target;
    }


    public Target getTarget() {

        return target;
    }


    public void setAirplane(Airplane airplane) {

        this.airplane = airplane;
    }


    public Airplane getAirplane() {

        return airplane;
    }


    public void setnumber(String number) {

        this.number = number;
    }


    public String getnumber() {

        return number;
    }

    /**
     * @return
     */
    public double calcTotal() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public Passenger getLessAge() {
        // TODO implement here
        return null;
    }

}