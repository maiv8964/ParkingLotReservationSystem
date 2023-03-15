package Others;

import java.util.ArrayList;
import java.util.List;

import Manager.*;

public class Parking_System implements ParkingSystem {
	
	private static Parking_System instance;
	private List<ParkingLot> parkingLots;
	private List<Manager> manager;


	private Parking_System() {
        this.parkingLots = new ArrayList<>();
    }


    public static Parking_System getInstance() {
        if (instance == null) {
            instance = new Parking_System();
        }
        return instance;
    }

	@Override
	public List<ParkingLot> addParkingLot(ParkingLot parkingLot) {
		// TODO Auto-generated method stub
        parkingLots.add(parkingLot);
		return parkingLots;
	}

	@Override
	public boolean enableParkingLot(ParkingLot parkingLot) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean disableParkingLot(ParkingLot parkingLot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enableParkingSpace(ParkingSpace parkingSpace) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean disableParkingSpace(ParkingSpace parkingSpace) {
		// TODO Auto-generated method stub
		return false;
	}


	public void addManager(Manager newManager) {
		// TODO Auto-generated method stub
		manager.add(newManager);
		
	}
    
}
