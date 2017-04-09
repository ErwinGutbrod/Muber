package main.java.model;

import java.util.Calendar;

public class Driver  extends User{

	//Attributes
	private Calendar licenseExpirationDate;
	
	//Getters & Setters
	public Calendar getLicenseExpirationDate() {
		return licenseExpirationDate;
	}
	public void setLicenseExpirationDate(Calendar licenseExpirationDate) {
		this.licenseExpirationDate = licenseExpirationDate;
	}
	
	
}
