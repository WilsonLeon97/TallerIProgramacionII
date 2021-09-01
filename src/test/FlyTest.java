package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

import org.junit.Test;

import exceptions.ExceptionDate;
import model.Airplane;
import model.ETypeAirplane;
import model.Fly;
import model.Occasional;
import model.Passenger;
import model.Registered;
import model.Target;

class FlyTest {
	
	private Fly fly;
    private Airplane  plane;
    private Target Berlin;
    Passenger andres;
    Passenger carlos;
    Passenger ximena;

    private void setup() throws ExceptionDate {
        plane = new Airplane("AB-45",(short)120,(short)2015, ETypeAirplane.AirbusA330 );
        Berlin = new Target("TG-01","Madrid",2500000,7890f);
        fly = new Fly("Fl01",LocalDate.of(2021,Month.APRIL,12),LocalTime.of(16,30),plane,Berlin);

        andres = new Registered("7456546","andres Eduardo","Valencia Orduz","Colombia",LocalDate.of(1970,Month.JANUARY,11));

        carlos = new Occasional( "46576787","carlos","Peña","Italia",LocalDate.of(1996,Month.JULY,20),LocalDate.of(2017,Month.FEBRUARY,12));
       
        ximena = new Registered("9735435","Ximena","Hurtado","El Salvador",LocalDate.of(2000,Month.DECEMBER,4));
    }


    void testAddPassenger() throws ExceptionDate {
        setup();
        assertTrue( fly.addPassenger( ximena ) );
        assertFalse( fly.addPassenger( ximena ) );
        assertTrue( fly.addPassenger( andres ) );
        assertTrue( fly.addPassenger( carlos ) );
        assertEquals(3, fly.getPassengers().size());
        Airplane cesna = new Airplane("LT63",(short) 2, (short)2019,ETypeAirplane.Cesna);
        Fly auxFly = new Fly( "Fl1111",LocalDate.of(2021,Month.DECEMBER,18), LocalTime.of(19,20),cesna,new Target("7464","Medellin",120000,500f ));
        auxFly.addPassenger(andres);
        auxFly.addPassenger(carlos);
        assertFalse( auxFly.addPassenger( ximena ) );
    }

    void testAddPassengers() throws ExceptionDate {
        setup();
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(ximena);
        passengers.add(andres);
        passengers.add(carlos);
        assertTrue(fly.addPassenger( passengers ));
        assertEquals( 3, fly.getPassengers().size());
        plane.setCapacity( (short)3 );
        Passenger Peter = new Registered("83947555","Peter","Garcia","Colombia",LocalDate.of(1967,Month.JANUARY,30));
        Passenger Cristina = new Occasional( "90395353","Ana Cristina","Vallejo","Colombia",LocalDate.of(2001,Month.NOVEMBER,29),LocalDate.of(2019,Month.FEBRUARY,12));

        passengers = new ArrayList<>();
        passengers.add( Peter );
        passengers.add( Cristina );

        assertFalse(fly.addPassenger( passengers ) );
        assertEquals( 3, fly.getPassengers().size());
    }
    @Test
    void getPassengers() throws ExceptionDate {
        setup();
        fly.addPassenger( carlos );
        fly.addPassenger( ximena );
        fly.addPassenger( andres );
        assertEquals( 3, fly.getPassengers().size());
        assertEquals("ximena",fly.getPassengers().get(1).getFirstName());
    }

    @Test
    public void testCalcTotal() throws ExceptionDate {
        setup();

        fly.addPassenger( ximena);
        ximena.setFly( fly );
        fly.addPassenger( andres );
        andres.setFly( fly );
        fly.addPassenger( carlos );
        carlos.setFly( fly );

        assertEquals(6_750_000,fly.calcTotal(),0.1);

        plane.setYear((short)2000);

        assertEquals(6_000_000,fly.calcTotal(),0.1);
    }

}
