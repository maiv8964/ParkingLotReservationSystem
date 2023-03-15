package parking;

public class ParkingLot {
	private int id;
	private boolean is_enabled;
	private ParkingSpace[] spaces;
	private String address;
	
	public ParkingLot(int id,String address) {
		this.id = id;
		this.address = address;
		this.is_enabled = true;
		this.spaces = new ParkingSpace[100];
		for(int x = 0; x < 100; x++) {//100 Parking Spaces
			this.spaces[x] = new ParkingSpace(x);
		}
	}
	
	public ParkingSpace getParkingSpace(int id) throws IndexOutOfBoundsException{
		if(id < 0 || id > 99) {
			throw new IndexOutOfBoundsException("Invalid space id");
		}
		return this.spaces[id];
	}
	
	public int getId() {
		return this.id;
	}
	
	public boolean getEnabled() {
		return this.is_enabled;
	}
	
	public void setEnabled(boolean isEnabled) {
		this.is_enabled = isEnabled;
	}
	
	public String getAddress() {
		return this.address;
	}
}