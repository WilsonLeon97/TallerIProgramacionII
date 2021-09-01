package model;

import java.time.LocalDate;


public class Occasional extends Passenger {
	
	private LocalDate dateLastFly;
	
	private Fly fly;

    public Occasional(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday, LocalDate dateLastFly) {
		super(idPassenger, firstName, lastName, country, dateBirthday);
    
    }


	public LocalDate getDateLastFly() {
		return dateLastFly;
	}


	public void setDateLastFly(LocalDate dateLastFly) {
		this.dateLastFly = dateLastFly;
	}


	@Override
	public double getTicketCost() {
		
		double valTicket = fly.getTarget().getValueTicket();
    	
    	int years = LocalDate.now().getYear() - fly.getAirplane().getYear();
    	if( years > 10 ) {
    		return valTicket - ( valTicket - valTicket * 0.1);
    	}
    	
    	return valTicket + calcOvercrowed() ;
    	}
    
    
}