package users;

public class FacultyMember extends UserInfo {

	public FacultyMember(String username, String password) {
		super(username, password);
	}

	//need to decide the rates for each user
	@Override
	public int getParkingRate() {
		return 8;
	}
}
