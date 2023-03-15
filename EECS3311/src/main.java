import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class main implements ActionListener {

	private static JFrame Frame;

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
	private static JPanel mainPanel1;
	private static JPanel registerPanel;
	private static JPanel typesPanel;
	private static JLabel nameLabel;
	private static JTextField nameText;
	private static JLabel userRegLabel;
	private static JTextField userRegText;
	private static JLabel passwordRegLabel;
	private static JTextField passwordRegText;
	private static JButton registerUser;
	
	private static JRadioButton student = new JRadioButton("Students");
	private static JRadioButton faculty = new JRadioButton("Faculty");
	private static JRadioButton nfaculty = new JRadioButton("Non-Faculty");
	private static JRadioButton visitor = new JRadioButton("Visitor");
	
	// Main Page
	private static JPanel mainPanel2;
	private static JPanel topPanel;
	private static JPanel bottomPanel;
	private static JComboBox lots;
	private static JButton[] parkingspot = new JButton[101];
	
	// Payment Page
	private static JPanel paymentPanel;

	public static void main(String[] args) {
		
		loginPage();

		registerPage();
		
		mainPage();
		
		// PAYMENT PAGE
		
//		paymentPanel = new JPanel();
//		paymentPanel.setVisible(false);
//		paymentPanel.setLayout(new BoxLayout(paymentPanel, BoxLayout.PAGE_AXIS));
//		//Frame.getContentPane().add(mainPanel);
//		
//		JRadioButton debit = new JRadioButton("Debit Card");
//		JRadioButton credit = new JRadioButton("Credit Card");
//		
//		ButtonGroup group = new ButtonGroup();
//		group.add(debit);
//		group.add(credit);
//		
//		paymentPanel.add(debit);
//		paymentPanel.add(credit);
//		
//		JLabel label3 = new JLabel("Insert Payment Information");
//		label.setAlignmentX(Component.CENTER_ALIGNMENT);
//		paymentPanel.add(label3);
		
		
		
		/////////////////////////////////////////////////////////////////////////

	}

	public static void loginPage() {
		
		Frame = new JFrame("YorkU Parking Booking System");
		Frame.setResizable(false);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(800, 800);
		
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
		
		// Success message
		success = new JLabel("");
		success.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginPanel.add(success);
		
		mainPanel0.add(loginPanel, BorderLayout.PAGE_START);
		Frame.setVisible(true);
		
	}
	
	public static void registerPage() {
		
		mainPanel1 = new JPanel();
		mainPanel1.setVisible(false);
		mainPanel1.setLayout(new BoxLayout(mainPanel1, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(mainPanel1);
		
		typesPanel = new JPanel();
		typesPanel.setBorder(new EmptyBorder(100, 10, 10, 10));
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
		registerPanel.setVisible(false);
		registerPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		registerPanel.setBounds(0, 300, 600, 100);
		registerPanel.setLayout(new BoxLayout(registerPanel, BoxLayout.PAGE_AXIS));
		
		// Name
		nameLabel = new JLabel("Name");
		nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		registerPanel.add(nameLabel);
		
		nameText = new JTextField();
		nameText.setAlignmentX(Component.CENTER_ALIGNMENT);
		nameText.setMaximumSize(new Dimension(150, 25));
		registerPanel.add(nameText);
		
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
		
		mainPanel1.add(typesPanel, BorderLayout.PAGE_START);
		mainPanel1.add(registerPanel, BorderLayout.PAGE_START);
		
	}
	
	public static void mainPage() {
		
		mainPanel2 = new JPanel();
		mainPanel2.setVisible(false);
		mainPanel2.setLayout(new BoxLayout(mainPanel2, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(mainPanel2);

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
	
	public static void loadSpots() {

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

	public boolean checkLogin(String username, String password) throws Exception {

		MaintainUser maintain = new MaintainUser();
		ClassLoader classLoader = getClass().getClassLoader();
		String path = "user.csv";

		maintain.load(path);

		for (int i = 0; i < maintain.users.size(); i++) {

			// User exists
			if (maintain.users.get(i).getEmail().equals(username)
					&& maintain.users.get(i).getPassword().equals(password)) {
				return true;
			}

		}

		// User doesn't exist
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

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

		// Login Check
		if (e.getSource() == loginButton) { // Press login button

			String username = userText.getText();
			String password = passwordText.getText();
			System.out.println("Login Info: [username: " + username + ", password: " + password + "]");

			try {

				if (checkLogin(username, password)) {
					success.setForeground(new Color(0, 153, 0));
					System.out.println("Successful Login");

					mainPanel0.setVisible(false);
					loginPanel.setVisible(false);
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
			
			loginPanel.setVisible(false);
			mainPanel0.setVisible(false);
			registerPanel.setVisible(true);
			mainPanel1.setVisible(true);
			
			Frame.add(mainPanel1);
			
		}
		
		if (e.getSource() == registerUser) {
			
			String name = nameText.getText();
			String email = userRegText.getText();
			String password = passwordRegText.getText();
			String type = "";
			
			if(student.isSelected()) {
				type = "student";
			}else if(faculty.isSelected()) {
				type = "faculty";
			}else if(nfaculty.isSelected()) {
				type = "non-faculty";
			}else if(visitor.isSelected()) {
				type = "visitor";
			}
			
			System.out.println("Registering user: [type: " + type + ", name: " + name + ", email: " + email + ", password: " + password + "]");

		}
		
		if (value >= 0 && value <= 100) { // Choose a parking spot

			System.out.println("User chose: parking spot " + value);
			
			topPanel.setVisible(false);
			bottomPanel.setVisible(false);
			paymentPanel.setVisible(true);
			
			Frame.add(paymentPanel);
			
			System.out.println("On payment page");

		}
		
		if (!(lotValue.equals(""))) { // Choose a lot

			System.out.println(lotValue + " chosen");

		}

	}

}
