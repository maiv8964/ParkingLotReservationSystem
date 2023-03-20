package reservations;
import java.sql.Time;
import java.util.Map;

import parking.*;
import paymentStrategy.*;
import users.*;

public class ReservationSystemFacade {
	
	private static ReservationSystemFacade instance = null;
	private ParkingSystem parkingSystem = null;
	
	// Retrieve singleton object of ReservationSystem
	public static ReservationSystemFacade getInstance() {
		if(instance == null) {
			instance = new ReservationSystemFacade();
		}
		return instance;
	}
	
	private ReservationSystemFacade(){//Singleton constructor
		this.parkingSystem = ParkingSystem.getInstance();
	}
	
	// Create a reservation for user
	public Reservation createReservation(UserInfo userInfo, int duration, Time start_time, String licence_plate, ParkingSpace space, PaymentProvider payment_provider) {
		if(userInfo.getIsValid() && space.getCurrentReservation() == null && userInfo.currentReservation == null) {//Check that user and space can accept a reservation
			if(payment_provider.handlePayment(userInfo.getPaymentInfo(),(double)userInfo.getParkingRate())==true) {
				Reservation reservation = new Reservation(duration, start_time, licence_plate, space);
				space.setCurrentReservation(reservation);
				userInfo.currentReservation = reservation;
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
	
	public void cancelBooking(Reservation reservation, UserInfo userInfo) {
		reservation.getSpace().setCurrentReservation(null);//Clear 
		userInfo.currentReservation = null;
	}
	
	public void payBalance(Reservation reservation, UserInfo userInfo, PaymentProvider provider) {
		if(reservation.getDuration()>1) {//The user booked for more than 1 hour, deposit does not cover full payment
			provider.handlePayment(userInfo.getPaymentInfo(), this.calculateOutstanding(reservation, userInfo));
		}else {
			//No extra payment outstanding, rejoice!
		}
	}
	
	private double calculateOutstanding(Reservation reservation,UserInfo userInfo) {
		return (double)(reservation.getDuration()-1) * userInfo.getParkingRate();
	}

}
