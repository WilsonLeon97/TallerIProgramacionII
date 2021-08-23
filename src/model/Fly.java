package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Fly {

    private String idFly;

    private LocalDate date;

    private LocalTime time;

    private Airplane airplane;
    
    private Target target;
    
    private ArrayList<Passenger> passengers;

    public Fly(String idFly, LocalDate date, LocalTime time, Airplane airplane, Target target) {
    	
    	passengers = new ArrayList<>();
    	this.idFly = idFly;
    	this.date = date;
    	this.time = time;
    	this.airplane = airplane;
    	this.target = target;

    }

    public void setDate(LocalDate date) {

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

    public boolean addPassenger(Passenger passengers) {

        return true;
    }

    public void addPassenger(ArrayList<Passenger> passengers) {
 
    }

    public ArrayList<Passenger> getPassengers() {

        return null;
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


    public void setIdFly(String idFly) {

        this.idFly = idFly;
    }


    public String getIdFly() {

        return idFly;
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