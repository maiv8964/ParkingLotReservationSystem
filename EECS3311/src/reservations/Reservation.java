package reservations;
import java.sql.Time;

import users.*;

public class Reservation {

	private int duration;
	private Time start_time;
	private String licence_plate;
	//private ParkingSpace space;
	
	public Reservation(User user, int duration, Time start_time, String licence_plate) { // add ParkingSpace space

		this.duration = duration;
		this.start_time = start_time;
		this.licence_plate = licence_plate;
		//this.space = space;
		
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
	
//	public ParkingSpace getSpace() {
//		
//		return this.space;
//		
//	}

}
