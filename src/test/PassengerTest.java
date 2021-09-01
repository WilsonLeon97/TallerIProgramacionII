package test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import org.junit.Test;


import model.Airplane;
import model.ETypeAirplane;
import exceptions.ExceptionDate;
import model.Fly;
import model.Occasional;
import model.Registered;
import model.Target;

class PassengerTest {

	private Fly fly;
    private Airplane  plane;
    private Target Tokio;
    Registered andres;
    Occasional carlos;

    private void setup() throws ExceptionDate {
        plane = new Airplane("AB-45",(short)120,(short)2015, ETypeAirplane.AirbusA330 );
        Tokio = new Target("TG-01","Tokio",2_500_000,7890f);
        fly = new Fly("Fl874",LocalDate.of(2021, Month.APRIL,12), LocalTime.of(16,30),plane,Tokio);

        andres = new Registered("7456546","andres Eduardo","Valencia Orduz","Colombia",LocalDate.of(1970,Month.JANUARY,11));

        carlos = new Occasional( "46576787","carlos","Peña","Italia",LocalDate.of(1996,Month.JULY,20),LocalDate.of(2017,Month.FEBRUARY,12));
    }

    @Test
    public void testRegistered() throws ExceptionDate {
        setup( );

        fly.addPassenger( andres );

        andres.setFly( fly );

        assertEquals(2_125_000,andres.getTicketCost(),0.1);

        plane.setYear((short)2005);
        assertEquals(1_875_000,andres.getTicketCost(),0.1);
    }

    @Test
    public void testMilles() throws ExceptionDate {
        setup();

        fly.addPassenger( andres );

        andres.setFly( fly );
        assertEquals(7890,andres.getMiles());
    }

    @Test
    public void testGetAge() throws ExceptionDate {
        setup();
        assertEquals(51, andres.getAge());
        assertEquals(24, carlos.getAge());
    }

}
