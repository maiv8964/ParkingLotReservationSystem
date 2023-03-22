package userLogin;

public class User {
	public String fname;
	public String lname;
	public int id;
	public String email;
	public String password;
	public String type;
	public boolean isValidated;
	
	public User(String fname, String lname, int id, String email, String password, String type) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.id = id;
		this.email = email;
		this.password = password;
		this.type = type;
		if(type.equals("visitor") || type.equals("manager")) {
			this.isValidated = true;
		}else {
			this.isValidated = false;
		}
		
	}
	
	public User(){
		super();
	}

	public String getFName() {
		if(type.equals("super")) {
			return "admin";
		}else if(type.equals("manager")){
			return "manager";
		}else {
			return fname;
		}
	}

	public String getLName() {
		
		if(type.equals("super")) {
			return "admin";
		}else if(type.equals("manager")){
			return "manager";
		}else {
			return lname;
		}
		
	}
	
	public void setName(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}

	public void setValidation(String valid) {
		
		if(valid.equals("TRUE")) {

			this.isValidated = true;
			
		}else {

			this.isValidated = false;
			
		}
		
	}
	
	public String getValidation() {
		
		if(this.isValidated) {
			return "TRUE";
		}else {
			return "FALSE";
		}
		
	}

	@Override
	public String toString() {
		return "User [name=" + fname + " " + lname + ", id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
}
