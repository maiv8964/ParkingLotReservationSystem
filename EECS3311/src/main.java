import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Payment.*;
import Strategy.*;
import users.*;

public class main implements ActionListener {

	private static JFrame Frame;
	private static MaintainUser maintain = new MaintainUser();
	private static String path = "user.csv";
	private static UserInfo currentuser;
	private static UserList userList;

	// Login Page
	private static JPanel mainPanel0;
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passwordlabel;
	private static JTextField passwordText;
	private static JButton loginButton;
	private static JLabel success;
	private static JPanel loginPanel;
	private static JButton register;
	
	// Register Page
	private static JButton regBack;
	private static JPanel mainPanel1;
	private static JPanel registerPanel;
	private static JPanel typesPanel;
	private static JLabel fnameLabel;
	private static JTextField fnameText;
	private static JLabel lnameLabel;
	private static JTextField lnameText;
	private static JLabel userRegLabel;
	private static JTextField userRegText;
	private static JLabel passwordRegLabel;
	private static JTextField passwordRegText;
	private static JButton registerUser;
	private static JLabel regsuccess;
	
	private static JRadioButton student = new JRadioButton("Students");
	private static JRadioButton faculty = new JRadioButton("Faculty");
	private static JRadioButton nfaculty = new JRadioButton("Non-Faculty");
	private static JRadioButton visitor = new JRadioButton("Visitor");
	
	// Main Page
	private static JButton mainBack;
	private static JPanel mainPanel2;
	private static JPanel topPanel;
	private static JPanel bottomPanel;
	private static JComboBox lots;
	private static JButton[] parkingspot = new JButton[101];
	
	// Payment Page
	private static JButton payBack;
	private static JPanel mainPanel3;
	private static JPanel ptypesPanel;
	private static JPanel paymentPanel;
	
	private static JRadioButton debit = new JRadioButton("Debit Card");
	private static JRadioButton credit = new JRadioButton("Credit Card");
	private static ButtonGroup group = new ButtonGroup();
	
	private static JLabel costLabel;
	private static JLabel cardNameLabel;
	private static JTextField cardNameText;
	private static JLabel cardNumLabel;
	private static JTextField cardNumText;
	private static JLabel expiryLabel;
	private static JTextField expiryText;
	private static JLabel billingLabel;
	private static JTextField billingText;
	private static JLabel securityCodeLabel;
	private static JTextField securityCodeText;
	private static JButton pay;
	private static JLabel paysuccess;
	

	public static void main(String[] args) throws Exception {
		
		Frame = new JFrame("YorkU Parking Booking System");
		Frame.setResizable(false);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(800, 800);
		
		userList = new UserList();
		maintain.load(path);
		
		// add already created users into the userList
		ArrayList<User> users = maintain.users;
		
		for(int i = 0; i < maintain.users.size(); i++) {
			String email = users.get(i).getEmail();
			String password = users.get(i).getPassword();
			String type = users.get(i).getType();
			
			if(type.equals("student")) {
				
				Student student = new Student(email, password);
				userList.getList().add(student);
				
			}else if(type.equals("faculty")) {
				
				FacultyMember faculty = new FacultyMember(email, password);
				userList.getList().add(faculty);
				
			}else if(type.equals("non-faculty")) {
				
				NonFacultyStaff nfaculty = new NonFacultyStaff(email, password);
				userList.getList().add(nfaculty);
				
			}else if(type.equals("visitor")) {
				
				Visitor visitor = new Visitor(email, password);
				userList.getList().add(visitor);
				
			}	
			
		}
		
		loginPage();

		registerPage();
		
		mainPage();
		
		paymentPage();

	}

	private static void loginPage() {
		
		mainPanel0 = new JPanel();
		mainPanel0.setVisible(true);
		mainPanel0.setLayout(new BoxLayout(mainPanel0, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(mainPanel0);

		loginPanel = new JPanel();
		loginPanel.setBorder(new EmptyBorder(100, 10, 10, 10));
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.PAGE_AXIS));

		// Username/Email
		userlabel = new JLabel("Email");
		userlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginPanel.add(userlabel);

		userText = new JTextField();
		userText.setAlignmentX(Component.CENTER_ALIGNMENT);
		userText.setMaximumSize(new Dimension(150, 25));
		loginPanel.add(userText);

		// Password
		passwordlabel = new JLabel("Password");
		passwordlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginPanel.add(passwordlabel);

		passwordText = new JTextField();
		passwordText.setAlignmentX(Component.CENTER_ALIGNMENT);
		passwordText.setMaximumSize(new Dimension(150, 25));
		loginPanel.add(passwordText);
		
		loginPanel.add(Box.createVerticalStrut(10)); // spacer

		// Login Button
		loginButton = new JButton("Login");
		loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginButton.addActionListener(new main());
		loginPanel.add(loginButton);
		
		loginPanel.add(Box.createVerticalStrut(10)); // spacer
		
		// Register Button
		register = new JButton("Register");
		register.setAlignmentX(Component.CENTER_ALIGNMENT);
		register.addActionListener(new main());
		loginPanel.add(register);
		
		loginPanel.add(Box.createVerticalStrut(10)); // spacer
		
		// Success message
		success = new JLabel("");
		success.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginPanel.add(success);
		
		mainPanel0.add(loginPanel, BorderLayout.PAGE_START);
		Frame.setVisible(true);
		
	}
	
	private static void registerPage() {
		
		mainPanel1 = new JPanel();
		mainPanel1.setVisible(false);
		mainPanel1.setLayout(new BoxLayout(mainPanel1, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(mainPanel1);
		
		mainPanel1.add(Box.createVerticalStrut(50)); // spacer
		
		regBack = new JButton("Back");
		regBack.setAlignmentX(Component.CENTER_ALIGNMENT);
		regBack.addActionListener(new main());
		mainPanel1.add(regBack);
		
		typesPanel = new JPanel();
		typesPanel.setBorder(new EmptyBorder(30, 10, 10, 10));
		typesPanel.setBounds(0, 0, 500, 100);
		typesPanel.setLayout(new BoxLayout(typesPanel, BoxLayout.LINE_AXIS));
		
		ButtonGroup group = new ButtonGroup();
		group.add(student);
		group.add(faculty);
		group.add(nfaculty);
		group.add(visitor);
		
		typesPanel.add(student);
		typesPanel.add(faculty);
		typesPanel.add(nfaculty);
		typesPanel.add(visitor);
		
		registerPanel = new JPanel();
		registerPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		registerPanel.setBounds(0, 300, 600, 100);
		registerPanel.setLayout(new BoxLayout(registerPanel, BoxLayout.PAGE_AXIS));
		
		// First Name
		fnameLabel = new JLabel("First Name");
		fnameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		fnameLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		registerPanel.add(fnameLabel);
		
		fnameText = new JTextField();
		fnameText.setAlignmentX(Component.CENTER_ALIGNMENT);
		fnameText.setMaximumSize(new Dimension(150, 25));
		registerPanel.add(fnameText);
		
		// Last Name
		lnameLabel = new JLabel("Last Name");
		lnameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lnameLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		registerPanel.add(lnameLabel);
		
		lnameText = new JTextField();
		lnameText.setAlignmentX(Component.CENTER_ALIGNMENT);
		lnameText.setMaximumSize(new Dimension(150, 25));
		registerPanel.add(lnameText);
		
		// Username/Email
		userRegLabel = new JLabel("Email");
		userRegLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		userRegLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		registerPanel.add(userRegLabel);
		
		userRegText = new JTextField();
		userRegText.setAlignmentX(Component.CENTER_ALIGNMENT);
		userRegText.setMaximumSize(new Dimension(150, 25));
		registerPanel.add(userRegText);
		
		// Password
		passwordRegLabel = new JLabel("Password");
		passwordRegLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		passwordRegLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		registerPanel.add(passwordRegLabel);
		
		passwordRegText = new JTextField();
		passwordRegText.setAlignmentX(Component.CENTER_ALIGNMENT);
		passwordRegText.setMaximumSize(new Dimension(150, 25));
		registerPanel.add(passwordRegText);
		
		registerPanel.add(Box.createVerticalStrut(20)); // spacer
		
		// Register Button
		registerUser = new JButton("Register");
		registerUser.setAlignmentX(Component.CENTER_ALIGNMENT);
		registerUser.addActionListener(new main());
		registerPanel.add(registerUser);
		
		registerPanel.add(Box.createVerticalStrut(10)); // spacer
		
		// Success message
		regsuccess = new JLabel("");
		regsuccess.setAlignmentX(Component.CENTER_ALIGNMENT);
		registerPanel.add(regsuccess);
		
		mainPanel1.add(typesPanel, BorderLayout.PAGE_START);
		mainPanel1.add(registerPanel, BorderLayout.PAGE_START);
		
	}
	
	private static void mainPage() {
		
		mainPanel2 = new JPanel();
		mainPanel2.setVisible(false);
		mainPanel2.setLayout(new BoxLayout(mainPanel2, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(mainPanel2);
		
		mainPanel2.add(Box.createVerticalStrut(10)); // spacer
		
		mainBack = new JButton("Logout");
		mainBack.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainBack.addActionListener(new main());
		mainPanel2.add(mainBack);

		// Top part of screen
		topPanel = new JPanel();
		topPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		topPanel.setBounds(0, 0, 500, 100);
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.PAGE_AXIS));

		JLabel label = new JLabel("Main Page");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		topPanel.add(label);
		JLabel label1 = new JLabel("Select Parking Lot and Spot:");
		label1.setAlignmentX(Component.CENTER_ALIGNMENT);
		topPanel.add(label1);

		String[] parkingLots = { "Lot1", "Lot2", "Lot3" }; // change this to only show enabled lots
		lots = new JComboBox(parkingLots);
		lots.setSelectedIndex(0);
		lots.setMaximumSize(new Dimension(150, 25));
		lots.addActionListener(new main());
		topPanel.add(lots);

		// Bottom part of screen
		bottomPanel = new JPanel(new GridLayout(0, 10, 10, 10));
		bottomPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		bottomPanel.setBounds(0, 300, 600, 100);
		bottomPanel.setBackground(Color.gray);

		loadSpots();

		mainPanel2.add(topPanel, BorderLayout.PAGE_START);
		mainPanel2.add(bottomPanel, BorderLayout.PAGE_END);

		
	}
	
	private static void loadSpots() {

		for (int i = 1; i <= 10; i++) {

			parkingspot[i] = new JButton("" + i);
			parkingspot[i].setBackground(new Color(0, 153, 0));
			parkingspot[i].setForeground(Color.black);
			parkingspot[i].addActionListener(new main());
			bottomPanel.add(parkingspot[i]);

		}

		for (int i = 11; i <= 20; i++) {

			parkingspot[i] = new JButton("" + i);
			parkingspot[i].setBackground(new Color(0, 153, 0));
			parkingspot[i].setForeground(Color.black);
			parkingspot[i].addActionListener(new main());
			bottomPanel.add(parkingspot[i]);

		}

		addSpace();

		for (int i = 21; i <= 30; i++) {

			parkingspot[i] = new JButton("" + i);
			parkingspot[i].setBackground(new Color(0, 153, 0));
			parkingspot[i].setForeground(Color.black);
			parkingspot[i].addActionListener(new main());
			bottomPanel.add(parkingspot[i]);

		}

		for (int i = 31; i <= 40; i++) {

			parkingspot[i] = new JButton("" + i);
			parkingspot[i].setBackground(new Color(0, 153, 0));
			parkingspot[i].setForeground(Color.black);
			parkingspot[i].addActionListener(new main());
			bottomPanel.add(parkingspot[i]);

		}

		for (int i = 1; i <= 10; i++) {
			bottomPanel.add(new JLabel(""));
		}

		for (int i = 41; i <= 50; i++) {

			parkingspot[i] = new JButton("" + i);
			parkingspot[i].setBackground(new Color(0, 153, 0));
			parkingspot[i].setForeground(Color.black);
			parkingspot[i].addActionListener(new main());
			bottomPanel.add(parkingspot[i]);

		}

		for (int i = 51; i <= 60; i++) {

			parkingspot[i] = new JButton("" + i);
			parkingspot[i].setBackground(new Color(0, 153, 0));
			parkingspot[i].setForeground(Color.black);
			parkingspot[i].addActionListener(new main());
			bottomPanel.add(parkingspot[i]);

		}

		for (int i = 1; i <= 10; i++) {
			bottomPanel.add(new JLabel(""));
		}

		for (int i = 61; i <= 70; i++) {

			parkingspot[i] = new JButton("" + i);
			parkingspot[i].setBackground(new Color(0, 153, 0));
			parkingspot[i].setForeground(Color.black);
			parkingspot[i].addActionListener(new main());
			bottomPanel.add(parkingspot[i]);

		}

		for (int i = 71; i <= 80; i++) {

			parkingspot[i] = new JButton("" + i);
			parkingspot[i].setBackground(new Color(0, 153, 0));
			parkingspot[i].setForeground(Color.black);
			parkingspot[i].addActionListener(new main());
			bottomPanel.add(parkingspot[i]);

		}

		for (int i = 1; i <= 10; i++) {
			bottomPanel.add(new JLabel(""));
		}

		for (int i = 81; i <= 90; i++) {

			parkingspot[i] = new JButton("" + i);
			parkingspot[i].setBackground(new Color(0, 153, 0));
			parkingspot[i].setForeground(Color.black);
			parkingspot[i].addActionListener(new main());
			bottomPanel.add(parkingspot[i]);

		}

		for (int i = 91; i <= 100; i++) {

			parkingspot[i] = new JButton("" + i);
			parkingspot[i].setBackground(new Color(0, 153, 0));
			parkingspot[i].setForeground(Color.black);
			parkingspot[i].addActionListener(new main());
			bottomPanel.add(parkingspot[i]);

		}

	}

	private static void addSpace() {
		for (int i = 1; i <= 10; i++) {
			bottomPanel.add(new JLabel(""));
		}
	}

	private static void paymentPage() {
		
		// Payment Page
//		private static JButton payBack;
//		private static JPanel mainPanel3;
//		private static JPanel paymentPanel;
		
		mainPanel3 = new JPanel();
		mainPanel3.setVisible(false);
		mainPanel3.setLayout(new BoxLayout(mainPanel3, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(mainPanel3);
		
		mainPanel3.add(Box.createVerticalStrut(10)); // spacer
		
//		JLabel label3 = new JLabel("Insert Payment Information");
//		label3.setAlignmentX(Component.CENTER_ALIGNMENT);
//		paymentPanel.add(label3);
		
		payBack = new JButton("Back");
		payBack.setAlignmentX(Component.CENTER_ALIGNMENT);
		payBack.addActionListener(new main());
		mainPanel3.add(payBack);
		
		ptypesPanel = new JPanel();
		ptypesPanel.setBorder(new EmptyBorder(30, 10, 10, 10));
		ptypesPanel.setBounds(0, 0, 500, 100);
		ptypesPanel.setLayout(new BoxLayout(ptypesPanel, BoxLayout.LINE_AXIS));
		
		// Payment types
		group.add(debit);
		group.add(credit);
		
		ptypesPanel.add(debit);
		ptypesPanel.add(credit);
		
		paymentPanel = new JPanel();
		paymentPanel.setBorder(new EmptyBorder(30, 10, 10, 10));
		paymentPanel.setBounds(0, 0, 500, 100);
		paymentPanel.setLayout(new BoxLayout(paymentPanel, BoxLayout.PAGE_AXIS));
		
		// Cardholder name
		cardNameLabel = new JLabel("Cardholder Name");
		cardNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		cardNameLabel.setBounds(0, 0, 500, 100);
		cardNameLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		paymentPanel.add(cardNameLabel);
		
		cardNameText = new JTextField();
		cardNameText.setAlignmentX(Component.CENTER_ALIGNMENT);
		cardNameText.setMaximumSize(new Dimension(150, 25));
		paymentPanel.add(cardNameText);
		
		// Card number
		cardNumLabel = new JLabel("Card Number");
		cardNumLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		cardNumLabel.setBounds(0, 0, 500, 100);
		cardNumLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		paymentPanel.add(cardNumLabel);
		
		cardNumText = new JTextField();
		cardNumText.setAlignmentX(Component.CENTER_ALIGNMENT);
		cardNumText.setMaximumSize(new Dimension(150, 25));
		paymentPanel.add(cardNumText);
		
		// Expiry
		expiryLabel = new JLabel("Expiry (MMYY)");
		expiryLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		expiryLabel.setBounds(0, 0, 500, 100);
		expiryLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		paymentPanel.add(expiryLabel);
		
		expiryText = new JTextField();
		expiryText.setAlignmentX(Component.CENTER_ALIGNMENT);
		expiryText.setMaximumSize(new Dimension(150, 25));
		paymentPanel.add(expiryText);
		
		// Billing address
		billingLabel = new JLabel("Billing Address");
		billingLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		billingLabel.setBounds(0, 0, 500, 100);
		billingLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		paymentPanel.add(billingLabel);
		
		billingText = new JTextField();
		billingText.setAlignmentX(Component.CENTER_ALIGNMENT);
		billingText.setMaximumSize(new Dimension(150, 25));
		paymentPanel.add(billingText);
		
		// Security number
		securityCodeLabel = new JLabel("Security Code");
		securityCodeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		securityCodeLabel.setBounds(0, 0, 500, 100);
		securityCodeLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
		paymentPanel.add(securityCodeLabel);
		
		securityCodeText = new JTextField();
		securityCodeText.setAlignmentX(Component.CENTER_ALIGNMENT);
		securityCodeText.setMaximumSize(new Dimension(150, 25));
		paymentPanel.add(securityCodeText);
		
		paymentPanel.add(Box.createVerticalStrut(30)); // spacer
		
		// Confirm and pay
		pay = new JButton("Confirm and Pay");
		pay.setAlignmentX(Component.CENTER_ALIGNMENT);
		pay.addActionListener(new main());
		paymentPanel.add(pay);
		
		paymentPanel.add(Box.createVerticalStrut(10)); // spacer
		
		// Success message
		paysuccess = new JLabel("");
		paysuccess.setAlignmentX(Component.CENTER_ALIGNMENT);
		paymentPanel.add(paysuccess);
		
		mainPanel3.add(ptypesPanel, BorderLayout.PAGE_START);
		mainPanel3.add(paymentPanel, BorderLayout.PAGE_END);
		
	}
	
	
	private boolean checkLogin(String username, String password) throws Exception {

		ClassLoader classLoader = getClass().getClassLoader();

		for (int i = 0; i < maintain.users.size(); i++) {
			// User exists
			if (maintain.users.get(i).getEmail().equals(username)
					&& maintain.users.get(i).getPassword().equals(password)) {
				
				System.out.println("Logged in user is type: " + maintain.users.get(i).getType());
				return true;
			}

		}

		// User doesn't exist
		return false;
	}
	
	private void loginActions(ActionEvent e) {
		
		if (e.getSource() == loginButton) { // Press login button

			String username = userText.getText();
			String password = passwordText.getText();
			System.out.println("Login Info: [username: " + username + ", password: " + password + "]");

			try {

				if (checkLogin(username, password)) {
					success.setForeground(new Color(0, 153, 0));
					System.out.println("Successful Login");

					mainPanel0.setVisible(false);
					mainPanel2.setVisible(true);
					
					
					Frame.add(mainPanel2);

				} else {
					success.setForeground(Color.red);
					success.setText("Login incorrect");
					System.out.println("Failed Login");
				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
		
		if (e.getSource() == register) { // user wants to register account
			
			System.out.println("Register new user");
			
			mainPanel0.setVisible(false);
			Frame.add(mainPanel1);
			registerPage();
			mainPanel1.setVisible(true);
			
		}
		
	}
	
	public void registerActions(ActionEvent e) throws Exception {
		
		if(e.getSource() == regBack) {
			
			System.out.println("Back to login page");
			mainPanel1.setVisible(false);
			loginPage();
			
		}
		
		if (e.getSource() == registerUser) {
			
			String fname = "";
			String lname = "";
			String email = "";
			String password = "";
			String type = "";
			
			fname = fnameText.getText();
			lname = lnameText.getText();
			email = userRegText.getText();
			password = passwordRegText.getText();
			
			if(student.isSelected()) {
				type = "student";
			}else if(faculty.isSelected()) {
				type = "faculty";
			}else if(nfaculty.isSelected()) {
				type = "non-faculty";
			}else if(visitor.isSelected()) {
				type = "visitor";
			}
			
			if(fname.equals("") || lname.equals("") || email.equals("") || password.equals("") || type.equals("")) {
				regsuccess.setForeground(Color.red);
				regsuccess.setText("Please fill in all the fields");
				System.out.println("Failed Register");
			}else {
				
				// Adds to user.csv
				User newuser = new User(fname, lname, maintain.users.size() + 1, email, password, type);
				maintain.users.add(newuser);
				maintain.update(path);
				
				// Adds to userlist
				if(type.equals("student")) {
					
					Student student = new Student(email, password);
					userList.getList().add(student);
					
				}else if(type.equals("faculty")) {
					
					FacultyMember faculty = new FacultyMember(email, password);
					userList.getList().add(faculty);
					
				}else if(type.equals("non-faculty")) {
					
					NonFacultyStaff nfaculty = new NonFacultyStaff(email, password);
					userList.getList().add(nfaculty);
					
				}else if(type.equals("visitor")) {
					
					Visitor visitor = new Visitor(email, password);
					userList.getList().add(visitor);
					
				}
				
				System.out.println("Registering user: [type: " + type + ", first name: " + fname + ", last name: "+ lname + ", email: " + email + ", password: " + password + "]");
				
				mainPanel1.setVisible(false);
				loginPage();
				
			}

		}
		
	}

	public void mainActions(ActionEvent e) {
		
		if(e.getSource() == mainBack) {
			
			System.out.println("Logout");
			userText = null;
			passwordText = null;
			mainPanel2.setVisible(false);
			loginPage();
			
		}
		
		int value = -1;
		JButton button = null;
		JComboBox lotlist = null;
		String lotValue = "";
		Object object = e.getSource();

		// Checks if a parking spot is chosen
		if (object instanceof JButton) {
			
			try {
				button = (JButton) e.getSource();
				value = Integer.parseInt(button.getText());
			} catch (NumberFormatException a) {}
			
		}

		// Checks if the lot was changed
		if (object instanceof JComboBox) {

			lotlist = (JComboBox) e.getSource();
			lotValue = (String) lotlist.getSelectedItem();

		}
		
		if (value >= 0 && value <= 100) { // Choose a parking spot

			System.out.println("User chose: parking spot " + value);
		
			mainPanel2.setVisible(false);
			mainPanel3.setVisible(true);
			Frame.add(mainPanel3);
			
			System.out.println("On payment page");

		}
		
		if (!(lotValue.equals(""))) { // Choose a lot

			System.out.println(lotValue + " chosen");

		}
		
	}
	
	public void paymentActions(ActionEvent e) {
		
		if(e.getSource() == payBack) {
			
			System.out.println("Back to main page");
			mainPanel3.setVisible(false);
			mainPanel2.setVisible(true);
			paymentPage();
			
		}
		
		if(e.getSource() == pay) {
			
			String name = "";
			int cardNum = 0;
			int expiry = 0;
			String address = "";
			int code = 0;
		
			
			if(cardNameText.getText().equals("") || cardNumText.getText().length() == 0 || expiryText.getText().length() == 0 || billingText.getText().equals("") || securityCodeText.getText().length() == 0) {
				
				paysuccess.setForeground(Color.red);
				paysuccess.setText("Please fill in all the fields correctly");
				System.out.println("Failed Payment");
				
			}else {
				
				try {
					
					name = cardNameText.getText();
					cardNum = Integer.parseInt(cardNumText.getText());
					expiry = Integer.parseInt(expiryText.getText()); 
					address = billingText.getText();
					code = Integer.parseInt(securityCodeText.getText());
					
					String type = "";
					
					Context context = new Context(null);
					
					if(debit.isSelected()) {
						
						type = "User is paying with debit";
						context = new Context(new DebitPaymentProvider());
						
					}else if(credit.isSelected()) {
						type = "User is paying with credit";
						context = new Context(new CreditPaymentProvide());
					}
					
					if(type.equals("")) {
						
						paysuccess.setForeground(Color.red);
						paysuccess.setText("Please fill in all the fields correctly");
						System.out.println("Failed Payment");
						
					}else {
						
						PaymentInfo paymentinfo = new PaymentInfo(cardNum, expiry, address, name, code);
						System.out.println(type);
						boolean success = context.execute(paymentinfo);
						if(success) {
							System.out.println("gong");
						}else {
							paysuccess.setForeground(Color.red);
							paysuccess.setText("Please fill in all the fields correctly");
							System.out.println("Failed Payment");
						}
						
					}
					
				}catch(NumberFormatException a) {
					
					paysuccess.setForeground(Color.red);
					paysuccess.setText("Please fill in all the fields correctly");
					System.out.println("Failed Payment");
					
				}

			}
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		loginActions(e);
		
		try {
			registerActions(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		mainActions(e);
		
		paymentActions(e);

	}

}
