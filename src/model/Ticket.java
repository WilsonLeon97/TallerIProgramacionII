package model;

public class Ticket {
	private short chairNumber;
	private boolean baggage;
	private float weight;
	private Passenger passenger;
	private Fly fly;
	
	public Ticket(short chairNumber, Passenger passenger, Fly fly) {
		this.chairNumber = chairNumber;
		this.passenger = passenger;
		this.fly = fly;
	}
	
	public Ticket(Fly fly, Passenger passenger, short chairNumber, float weigth) {
		this.fly = fly;
		this.passenger = passenger;
		this.chairNumber = chairNumber;
		this.weight = weigth;
	}

	public short getChairNumber() {
		return chairNumber;
	}

	public void setChairNumber(short chairNumber) {
		this.chairNumber = chairNumber;
	}

	public boolean isBaggage() {
		return baggage;
	}

	public void setBaggage(boolean baggage) {
		this.baggage = baggage;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void setFly(Fly fly) {
		this.fly = fly;
	}
	
	public Fly getFly() {
		return fly;
	}
	
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	public Passenger getPassenger() {
		return passenger;
	}

}
