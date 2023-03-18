package Manager;

import java.util.Random;

import users.*;

public class Manager {
	
	public String firstName;
	public String lastName;
	private String username;
    private String password;
      
    
	public Manager(String username, String password) {
		this.username = username;
        this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validateUser(UserInfo userInfo) {
		
		// instanceof is a binary operator we use to test if an object is of a given type
		// If the user is registering as a student, faculty member, or non-faculty staff, their registration requires further validation from the management team
		
		if(userInfo instanceof Student || userInfo instanceof FacultyMember || userInfo instanceof NonFacultyStaff) {
			System.out.println("New " + userInfo.toString() + " registration requires validation:\n");
			
			if (validateWithManagement(userInfo) == false) {
	            System.out.println("User validation with management team failed.");
	            return false;
	        }else {
			   // Check if the email address is in a valid format
			   if (isValidEmail(userInfo.getEmail()) == false) {
			      System.out.println("Invalid email address.");
			      return false;
			   }

			   // Check if the password is strong enough
			   if (isStrongPassword(userInfo.getPassword()) == false) {
			      System.out.println("Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.");
			      return false;
			   }
			   return true;
	        }
			
		// If the user is registering as a visitor, no further validation required
		}else if(userInfo instanceof Visitor) {
			// Check if the email address is in a valid format
			   if (isValidEmail(userInfo.getEmail()) == false) {
			      System.out.println("Invalid email address.");
			      return false;
			   }

			   // Check if the password is strong enough
			   if (isStrongPassword(userInfo.getPassword()) == false) {
			      System.out.println("Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.");
			      return false;
			   }
			   return true;
		}else {
			System.out.println("Not Valid User for the System");
			return false;
		}
		  
	}

		private boolean validateWithManagement(UserInfo userInfo) {
		// TODO Auto-generated method stub
			Random random = new Random();
		    boolean randomBoolean = random.nextBoolean();
		    return randomBoolean;
		}
		
		// Check if the email address is in a valid format
		private boolean isValidEmail(String email) {
		   // Regular expression pattern for email validation
		   String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		   return email.matches(emailRegex);
		}

		// Check if the password is strong enough
		private boolean isStrongPassword(String password) {
		   // Regular expression pattern for password validation
		   String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		   return password.matches(passwordRegex);
		}

}
