package parking;

import java.util.ArrayList;

import parkingState.*;
import reservations.Reservation;

public class ParkingSpace {
	private int id;
	private boolean is_enabled;
	private ArrayList<Reservation> listofreservations = new ArrayList<>();
	private State current_state;
	
	public ParkingSpace(int id) {
		this.id = id;
		this.is_enabled = true;
		this.setState(new Enabled());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEnabled() {
		return is_enabled;
	}

	public void setEnabled(boolean isEnable) {
		this.is_enabled = isEnable;
		if(this.isEnabled()) {
			this.setState(new Enabled());
		}else {
			this.setState(new Disabled());
		}
	}

	public ArrayList<Reservation> getReservations() {
		return listofreservations;
	}

	public void setReservation(Reservation reservation) {
		this.listofreservations.add(reservation);
	}

	public State getSensorStatus() {
		return this.current_state;
	}
	
	public void setState(State state) {
		this.current_state = state;
	}
}