package users;

public class Student extends UserInfo {

	public Student(String username, String password) {
		super(username, password);
	}

	//need to decide the rates for each user
	@Override
	public int getParkingRate() {
		return 5;
	}

}
