package main.java.model;

import java.util.Calendar;

public class UserDriver  extends User{

	int idUserDriver;
	Calendar limitLicenceDate;
	
	public int getIdUserDriver() {
		return idUserDriver;
	}
	public void setIdUserDriver(int idUserDriver) {
		this.idUserDriver = idUserDriver;
	}
	public Calendar getLimitLicenceDate() {
		return limitLicenceDate;
	}
	public void setLimitLicenceDate(Calendar limitLicenceDate) {
		this.limitLicenceDate = limitLicenceDate;
	}
	
	
}
