package users;

public class FacultryMember extends User {

	public FacultryMember(String username, String password) {
		super(username, password);
	}

	//need to decide the rates for each user
	@Override
	public int getParkingRate() {
		return 0;
	}
}
