package main.java.model;

import java.util.Calendar;
import java.util.Set;

public class Travel {

	//Attributes
	private String origin;
	private String destination;
	private Calendar date;
	private int passengerCount;
	private long totalAmount;
	private boolean isFinalised = false;
	private Driver driver;
	private int idTravel;
	private Set<Passenger> passengers;
	
	//Constructors
	public Travel(){
		super();
	}
	
	
	//Getters & Setters
	
	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}

	public int getIdTravel() {
		return idTravel;
	}
	public void setIdTravel(int idTravel) {
		this.idTravel = idTravel;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public boolean getIsFinalised() {
		return isFinalised;
	}
	public void setIsFinalised(boolean isFinalised) {
		this.isFinalised = isFinalised;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
}
