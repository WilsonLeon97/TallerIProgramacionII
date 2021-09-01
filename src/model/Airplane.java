package model;

public class Airplane {

    private String IdAirplane;

    private short capacity;

    private short year;
    
    private ETypeAirplane typeAirplane;

    public Airplane(String IdAirplane, Short capacity, Short year, ETypeAirplane typeAirplane) {
    	this.IdAirplane = IdAirplane;
    	this.capacity = capacity;
    	this.year = year;
    	this.typeAirplane = typeAirplane;
        
    }

    public void setIdAirplane(String IdAirplane) {
        
    	this.IdAirplane = IdAirplane;
    }

    public void setCapacity(short capacity) {
    	
    	this.capacity = capacity;

    }


    public void setYear(short year) {

        this.year = year;
    }


    public void setTypeAirplane(ETypeAirplane typeAirplane) {
      
        this.typeAirplane = typeAirplane;
    }

    public String getIdAirplane() {
        
        return IdAirplane;
    }

    public short getCapacity() {
        
        return capacity;
    }

    public short getYear() {
 
        return year;
    }

    public ETypeAirplane getTypeAirplane() {
     
        return typeAirplane;
    }


    public String toString() {
    
        return "Airplane { " + '\'' +
        		"idAirplane= " + IdAirplane + '\''
        		+ "capacity = " + capacity + '\''
        		+ "year= "+ year + 
        		"}";
    }

}