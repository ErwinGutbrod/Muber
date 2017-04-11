package main.java.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Travel {

	//Attributes
	private int origin;
	private int destination;
	private Calendar date;
	private int passengerCount;
	private long totalAmount;
	private boolean isFinalised = false;
	private int idDriver;
	private int idTravel;
	private List<Integer> passengers = new ArrayList<Integer>();
	
	//Constructors
	public Travel(){
		super();
	}
	
	
	//Getters & Setters
	
	public List<Integer> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Integer> passengers) {
		this.passengers = passengers;
	}

	public int getIdTravel() {
		return idTravel;
	}
	public void setIdTravel(int idTravel) {
		this.idTravel = idTravel;
	}
	public int getOrigin() {
		return origin;
	}
	public void setOrigin(int origin) {
		this.origin = origin;
	}
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
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
	public int getIdDriver() {
		return idDriver;
	}
	public void setIdDriver(int idDriver) {
		this.idDriver = idDriver;
	}
	
	
}
