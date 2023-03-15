package reservations;
import java.sql.Time;
import java.util.Map;

import parking.ParkingLot;
import parking.ParkingSpace;
import parking.ParkingSystem;
import payments.PaymentProvider;
import users.*;

public class ReservationSystem {
	
	private static ReservationSystem instance = null;
	private ParkingSystem parkingSystem = null;
	
	// Retrieve singleton object of ReservationSystem
	public static ReservationSystem getInstance() {
		if(instance == null) {
			instance = new ReservationSystem();
		}
		return instance;
	}
	
	private ReservationSystem(){//Singleton constructor
		this.parkingSystem = ParkingSystem.getInstance();
	}
	
	// Create a reservation for user
	public Reservation createReservation(User user, int duration, Time start_time, String licence_plate, ParkingSpace space, PaymentProvider payment_provider) {
		if(user.getIsValidated() && space.getCurrentReservation() == null && user.currentReservation == null) {//Check that user and space can accept a reservation
			if(payment_provider.handlePayment(user.getPaymentInfo(),(double)user.getParkingRate())==true) {
				Reservation reservation = new Reservation(duration, start_time, licence_plate, space);
				space.setCurrentReservation(reservation);
				user.currentReservation = reservation;
				return reservation;
			}else {
				return null;//Payment failed
			}
		}else {
			return null;//Space or user has existing reservation
		}
		
	}
	
	public void editBooking(Reservation reservation, int newDuration) {
		if(newDuration >= 1) {//somewhat arbitrary constraints on booking time
			reservation.updateDuration(newDuration);
		}
	}
	
	public Map<Integer, ParkingLot> getLots() {
		return this.parkingSystem.getLots();
	}
	
	public void cancelBooking(Reservation reservation, User user) {
		reservation.getSpace().setCurrentReservation(null);//Clear 
		user.currentReservation = null;
	}
	
	public void payBalance(Reservation reservation, User user, PaymentProvider provider) {
		if(reservation.getDuration()>1) {//The user booked for more than 1 hour, deposit does not cover full payment
			provider.handlePayment(user.getPaymentInfo(), this.calculateOutstanding(reservation, user));
		}else {
			//No extra payment outstanding, rejoice!
		}
	}
	
	private double calculateOutstanding(Reservation reservation,User user) {
		return (double)(reservation.getDuration()-1) * user.getParkingRate();
	}

}
