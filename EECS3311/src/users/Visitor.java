package users;

public class Visitor extends User{

	public Visitor(String username, String password) {
		super(username, password);
	}

	//need to decide the rates for each user
	@Override
	public int getParkingRate() {
		return 0;
	}
	
	// what is +Visitor() for in class diagram?
}
