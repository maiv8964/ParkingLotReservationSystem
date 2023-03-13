package users;

public abstract class User{
	private PaymentInfo payment_info;
	private String username;
	private String password;
	public String first_name;
	public String last_name;
	private boolean isValidated;
	//public Reservation currentReservation;
	
	public User(String username, String password) {
		this.username=username;
		this.password=password;
	}
	//need further implementation
	public void bookParking() {
		//communicate with Reservation system !?
	}
	
	public PaymentInfo getPaymentInfo() {
		return this.payment_info;
	}
	
	public boolean getIsValidated() {
		return this.isValidated;
	}
	
	public abstract int getParkingRate();
	
	
}