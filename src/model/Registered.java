package model;

import java.time.LocalDate;


public class Registered extends Passenger {
	
	private double miles;

    private static float discount = 15f;

    private LocalDate dateRegister;
    
    private Fly fly;


    public Registered(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday) {
		super(idPassenger, firstName, lastName, country, dateBirthday);

	}


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
    
    	return dateRegister;
    }
    
    @Override
    public double getTicketCost() {
        
    	double valTicket = fly.getTarget().getValueTicket();
    	
    	int years = LocalDate.now().getYear() - fly.getAirplane().getYear();
    	if( years <= 10 ) {
    		return valTicket - ( valTicket * Registered.discount / 100);
    	}
    	
    	return (valTicket - ( valTicket * Registered.discount / 100) - valTicket * 0.1) + calcOvercrowed();
    }
    
    

}