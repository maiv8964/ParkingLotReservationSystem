package parking;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {
	private Map<Integer, ParkingLot> lots;
	private static ParkingSystem instance = null;//singleton pattern
	
	private ParkingSystem() {
		this.lots = new HashMap<Integer,ParkingLot>();
		ParkingLot lot = new ParkingLot(1, "Lot 1");
		lot.setEnabled(true);
		this.lots.put(1, lot); // initialize with 1 parking lot
	}
	
	public static ParkingSystem getInstance() {
		if(instance == null) {
			instance = new ParkingSystem();
		}
		return instance;
	}
	
	public boolean isLotEnabled(int id) {
		return this.lots.get(id).getEnabled();
	}
	
	public Map<Integer,ParkingLot> getLots(){
		return this.lots;
	}
	
	public ParkingLot getLot(int id) {
		return this.lots.get(id);
	}
	
	public ParkingLot addLot(int id, String address) {
		ParkingLot lot = new ParkingLot(id,address);
		this.lots.put(id, lot);
		return lot;
	}
	
	public void setEnableLot(int id, boolean isEnabled) {
		this.lots.get(id).setEnabled(isEnabled);
	}
	
	public ParkingSpace getParkingSpace(int spaceId,int lotId) {
		return this.getLot(lotId).getParkingSpace(spaceId);
	}
}