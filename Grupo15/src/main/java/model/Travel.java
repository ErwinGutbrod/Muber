package main.java.model;

import java.util.Calendar;

public class Travel {

	int origin;
	int destination;
	Calendar date;
	int passengerCount;
	long totalAmount;
	boolean isFinalised = false;
	int idUserDriver;
	
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
	public boolean isFinalised() {
		return isFinalised;
	}
	public void setFinalised(boolean isFinalised) {
		this.isFinalised = isFinalised;
	}
	public int getIdUserDriver() {
		return idUserDriver;
	}
	public void setIdUserDriver(int idUserDriver) {
		this.idUserDriver = idUserDriver;
	}
	
	
}
