package main.java.model;

public class Review {

	//Attributes
	private int idReview;
	private int rate;
	private int idPassenger;
	private String review;
	private int idTravel;
	
	//Constructor
	public Review() {
		super();
	}

	//Getters & Setters
	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getIdPassenger() {
		return idPassenger;
	}

	public void setIdPassenger(int idPassenger) {
		this.idPassenger = idPassenger;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getIdTravel() {
		return idTravel;
	}

	public void setIdTravel(int idTravel) {
		this.idTravel = idTravel;
	}

	public int getIdReview() {
		return idReview;
	}

	public void setIdReview(int idReview) {
		this.idReview = idReview;
	}
	
	
	
	
}
