package reservations;

import java.sql.Time;

import parking.ParkingSpace;
import users.*;

public class Reservation {

	private int duration;
	private int month;
	private int day;
	private int start_time;
	private String licence_plate;
	private ParkingSpace space;
	
	public Reservation(int duration, int month, int day, int start_time, String licence_plate, ParkingSpace space) {
		this.duration = duration;
		this.month = month;
		this.day = day;
		this.start_time = start_time;
		this.licence_plate = licence_plate;
		this.space = space;
		
	}
	
	public int getDuration() {
		return this.duration;
		
	}
	
	public int getStartTime() {
		return this.start_time;
		
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
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
