package users;

import manager.SuperManager;

public class UserInfoFactory {

	public UserInfo makeUser(String type, String username, String password) {

		UserInfo user = null;

		if (type.equals("student")) {
	
			user = new Student(username, password);

		}

		if (type.equals("faculty")) {

			user = new FacultyMember(username, password);

		}

		if (type.equals("non-faculty")) {

			user = new NonFacultyStaff(username, password);

		}

		if (type.equals("visitor")) {

			user = new Visitor(username, password);

		}

		return user;
	}

}
