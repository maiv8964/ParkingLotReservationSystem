package Others;

import java.util.List;

public interface ParkingSystem {
    // Methods for enabling/disabling parking lots and spaces
	List<ParkingLot> addParkingLot(ParkingLot parkingLot);
    boolean enableParkingLot(ParkingLot parkingLot);
    boolean disableParkingLot(ParkingLot parkingLot);
    boolean enableParkingSpace(ParkingSpace parkingSpace);
    boolean disableParkingSpace(ParkingSpace parkingSpace);

    // Other parking system methods
}