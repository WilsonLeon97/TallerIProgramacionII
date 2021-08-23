package model;

import java.time.LocalDate;
import java.util.*;

public class Occasional extends Passenger {

    public Occasional(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday) {
		super(idPassenger, firstName, lastName, country, dateBirthday);
		// TODO Auto-generated constructor stub
	}

	public byte OVERCROWDED = 100;

    private boolean overcrowed;

   // public void Occasional(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday, boolean overcrowed) {
    //	
    	//this.idPassenger = idPassenger;
//    	this.firstName = firstName;
  //  	this.lastName = lastName;
    //	this.country = country;
    	//this.dateBirthday = dateBirthday;
        
    //}

    public void setOvercrowed(boolean overcrowed) {

        this.overcrowed = overcrowed;
    }

    public boolean isOvercrowed() {
        
        return false;
    }

}