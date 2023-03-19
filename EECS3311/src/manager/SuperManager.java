package manager;

import java.util.UUID;


import parking.ParkingSystem;

public class SuperManager extends Manager {
    private static SuperManager instance;

    private SuperManager(String username, String password) {
    	super("admin", "Password!23"); // set default credentials for SuperManager
    }

    public static SuperManager getInstance(String username, String password) {
        if (instance == null) {
            instance = new SuperManager(username, password);
        }
        return instance;
    }

    // implementation for autoGenerator
    public Manager autoGenerator() {
    	String username = "manager_" + String.valueOf(System.nanoTime());
    	String password = "password_" + String.valueOf(System.nanoTime());
        Manager newManager = new Manager(username, password);
        //ParkingSystem.getInstance().addManager(newManager);
        return newManager;
    }
}