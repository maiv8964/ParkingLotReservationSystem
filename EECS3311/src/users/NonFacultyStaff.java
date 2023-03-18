package users;

public class NonFacultyStaff extends UserInfo{

	public NonFacultyStaff(String username, String password) {
		super(username, password);
	}

	//need to decide the rates for each user
	@Override
	public int getParkingRate() {
		return 10;
	}
}
