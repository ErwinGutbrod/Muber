package main.java.model;

import java.util.Calendar;

public abstract class User {

	//Attributes
	private int idUser;
	private String name;
	private String password;
	private Calendar startDate;
	
	//Constructors
	public User() {
		super();
	}

	//Getters & Setters
	public int getIdUser(){
		return idUser;
	}
	
	public void setIdUser(int idUser){
		this.idUser = idUser;
	}
			
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	
	
}
