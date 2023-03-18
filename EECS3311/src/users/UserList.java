package users;
import java.util.ArrayList;

public class UserList {

	// Stores all of the registered users information in one big list
	private ArrayList<UserInfo> list = new ArrayList<>();
	
	public UserList() {
		
	}
	
	public ArrayList<UserInfo> getList(){
		return this.list;
	}
}
