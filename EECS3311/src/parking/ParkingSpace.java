package parking;

import reservations.Reservation;

public class ParkingSpace {
	private int id;
	private boolean is_enabled;
	private Reservation current_reservation;
	
	public ParkingSpace(int id) {
		this.id = id;
		this.is_enabled = true;
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

	public void setEabled(boolean isEnable) {
		this.is_enabled = isEnable;
	}

	public Reservation getCurrentReservation() {
		return current_reservation;
	}

	public void setCurrentReservation(Reservation current_reservation) {
		this.current_reservation = current_reservation;
	}
	
	/**
	 * Method will return the input parameter as no physical sensor exists. 
	 * This allows the dynamic simulation of different inputs
	 * @param sensorStatus The value to return
	 * @return the sensorStatus parameter value
	 */
	public String getSensorStatus(String sensorStatus) {
		return sensorStatus;
	}
}