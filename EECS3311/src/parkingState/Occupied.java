package parkingState;

public class Occupied implements State{
	private String plate;
	public Occupied(String license) {
		this.plate = license;
	}
	@Override
	public String handleState() {
		return this.plate;
	}

}
