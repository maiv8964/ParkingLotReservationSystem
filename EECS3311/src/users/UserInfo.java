package users;

import reservations.Reservation;
import Payment.*;

public abstract class UserInfo{
	private PaymentInfo payment_info;
	private String username;
	private String password;
	private boolean isValidated;
	//public Reservation currentReservation;
	public Reservation currentReservation;
	
	public UserInfo(String username, String password) {
		this.username=username;
		this.password=password;
	}
	//need further implementation
	public void bookParking() {
		//communicate with Reservation system !?
	}
	
	public boolean getIsValidated() {
		return this.isValidated;
	}
	
	public abstract int getParkingRate();
	
	public String getEmail() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	
	
	public void setValid() {
		this.isValidated = true;
		
	}
	
	
}