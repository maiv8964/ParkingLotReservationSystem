package parking;

import parkingState.*;
import reservations.Reservation;

public class ParkingSpace {
	private int id;
	private boolean is_enabled;
	private Reservation current_reservation;
	private State current_state;
	
	public ParkingSpace(int id) {
		this.id = id;
		this.is_enabled = true;
		this.setState(new Enabled());
		this.current_reservation = null;
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

	public Reservation getCurrentReservation() {
		return current_reservation;
	}

	public void setCurrentReservation(Reservation current_reservation) {
		this.current_reservation = current_reservation;
	}

	public State getSensorStatus() {
		return this.current_state;
	}
	
	public void setState(State state) {
		this.current_state = state;
	}
}