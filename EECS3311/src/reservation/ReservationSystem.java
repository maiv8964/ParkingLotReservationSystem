package reservation;
import java.sql.Time;
import java.util.Map;

import users.*;

public class ReservationSystem {
	
	private static ReservationSystem instance = null;
	
	
	// Retrieve singleton object of ReservationSystem
	public static ReservationSystem getInstance() {
		
		if(instance == null) {
			
			instance = new ReservationSystem();
			
		}
		
		return instance;
		
	}
	
	// Create a reservation for user
	public Reservation createReservation(int duration, Time start_time, String licence_plate, ParkingSpace space) {
		
		Reservation reservation = new Reservation(duration, start_time, licence_plate, space);
		return reservation;
		
	}
	
	
	public Map<Integer, ParkingLot> getLots() {
		
		//to be completed
		
	}
	
	// Cancel Booking
	public void cancelBooking(Reservation reservation) {
		
		reservation = null;
		
	}
	
	public void payBalance(Reservation reservation, PaymentInfo payment_info, PaymentProvider provider) {
		
		//to be completed
		
	}

}
