package main.java.model;

public class Passenger  extends User{

	//Attributes
	private long credit;
	
	
	public Passenger() {
		super();
	}
	//Getters & Setters
	public long getCredit() {
		return credit;
	}
	public void setCredit(long credit) {
		this.credit = credit;
	}
	
}
