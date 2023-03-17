import java.util.ArrayList;

import users.*;

public class UserList {

	// stores all of the registered users information in one big list
	private ArrayList<UserInfo> list = new ArrayList<>();
	
	public UserList() {
		
	}
	
	public ArrayList<UserInfo> getList(){
		return this.list;
	}
}
