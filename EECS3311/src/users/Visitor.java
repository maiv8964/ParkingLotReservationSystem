package users;

public class Visitor extends UserInfo{
	
	

	public Visitor(String username, String password) {
		super(username, password);
		this.setValid();
	}

	//need to decide the rates for each user
	@Override
	public int getParkingRate() {
		return 15;
	}
}
