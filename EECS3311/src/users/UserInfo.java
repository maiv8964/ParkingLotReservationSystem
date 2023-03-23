package users;

import reservations.Reservation;
import paymentStrategy.*;

public abstract class UserInfo{
	private PaymentInfo payment_info;
	private String username;
	private String password;
	private boolean isValidated;
	public Reservation currentReservation;
	public String parkinglot;
	public int parkingspacenum;
	
	
	public UserInfo() {
		
	}
	
	public UserInfo(String username, String password) {
		this.username=username;
		this.password=password;
		this.isValidated = false;
	}
	
	public abstract int getParkingRate();
	
	public void setValid() {
		this.isValidated = true;
	}
	
	public boolean getIsValid() {
		return this.isValidated;
	}
	
	public String getEmail() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	
	public void setPaymentInfo(PaymentInfo payment) {
		this.payment_info = payment;
	}
	
	public PaymentInfo getPaymentInfo() {
		return this.payment_info;
	}

	
	
}