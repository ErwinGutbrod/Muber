package main.java.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Travel {

	int origin;
	int destination;
	Calendar date;
	int passengerCount;
	long totalAmount;
	boolean isFinalised = false;
	int idDriver;
	int idTravel;
	List<Integer> idUsers = new ArrayList<Integer>();
	
	public Travel(){
		super();
	}
	
	public List<Integer> getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(List<Integer> idUsers) {
		this.idUsers = idUsers;
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
