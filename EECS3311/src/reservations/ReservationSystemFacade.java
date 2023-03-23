package reservations;
import java.util.ArrayList;
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
	public Reservation createReservation(UserInfo userInfo, int duration, int month, int day, int start_time, String licence_plate, ParkingSpace space, Context context) {
		if(userInfo.getIsValid() && userInfo.currentReservation == null) {//Check that user and space can accept a reservation
			if(context.execute(userInfo.getPaymentInfo(),(double)userInfo.getParkingRate())==true) {
				System.out.println("User is valid, proceeding to book reservation");
				Reservation reservation = new Reservation(duration, month, day, start_time, licence_plate, space);
				space.setReservation(reservation);
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
		
		ArrayList<Reservation> reservations = reservation.getSpace().getReservations();
		reservations.remove(reservation);
		reservation = null;
		userInfo.currentReservation = null;
	}
	
	public void payBalance(Reservation reservation, UserInfo userInfo, PaymentProvider provider) {
		if(reservation.getDuration()>1) {//The user booked for more than 1 hour, deposit does not cover full payment
			provider.handlePayment(userInfo.getPaymentInfo(), this.calculateOutstanding(reservation, userInfo));
		}else {
			//No extra payment outstanding, rejoice!
		}
	}
	
	public int calculateOutstanding(Reservation reservation,UserInfo userInfo) {
		return (reservation.getDuration()-1) * userInfo.getParkingRate();
	}

}
