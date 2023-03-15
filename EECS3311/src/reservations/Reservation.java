package reservations;

import java.sql.Time;

import parking.ParkingSpace;
import users.*;

public class Reservation {

	private int duration;
	private Time start_time;
	private String licence_plate;
	private ParkingSpace space;
	
	public Reservation(int duration, Time start_time, String licence_plate, ParkingSpace space) {
		this.duration = duration;
		this.start_time = start_time;
		this.licence_plate = licence_plate;
		this.space = space;
		
	}
	
	public int getDuration() {
		return this.duration;
		
	}
	
	public Time getStartTime() {
		return this.start_time;
		
	}
	
	public String getPlate() {
		return this.licence_plate;
		
	}
	
	public ParkingSpace getSpace() {
		return this.space;	
	}
	
	public void updateDuration(int newDuration) {
		this.duration = newDuration;
	}

}
