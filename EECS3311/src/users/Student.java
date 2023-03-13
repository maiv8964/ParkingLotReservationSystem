package users;

public class Student extends User {

	public Student(String username, String password) {
		super(username, password);
	}

	//need to decide the rates for each user
	@Override
	public int getParkingRate() {
		return 0;
	}

}
