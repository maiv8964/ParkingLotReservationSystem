package users;

public class UserInfoFactory {

	public UserInfo makeUser(String type, String username, String password) {

		UserInfo user = null;

		if (type.equals("student")) {
			System.out.println("student");
			user = new Student(username, password);

		}

		if (type.equals("faculty")) {
			System.out.println("faculty");
			user = new FacultyMember(username, password);

		}

		if (type.equals("non-faculty")) {
			System.out.println("non-faculty");
			user = new NonFacultyStaff(username, password);

		}

		if (type.equals("visitor")) {
			System.out.println("visitor");
			user = new Visitor(username, password);

		}

		return user;
	}

}
