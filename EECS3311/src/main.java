import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class main implements ActionListener {

	private static JFrame Frame;

	// Login Page
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passwordlabel;
	private static JTextField passwordText;
	private static JButton loginButton;
	private static JLabel success;
	private static JPanel loginPanel;

	// Main Page
	private static JPanel mainPanel;
	private static JPanel topPanel;
	private static JPanel bottomPanel;
	private static JComboBox lots;
	private static JButton[] parkingspot = new JButton[101];
	
	// Payment Page
	private static JPanel paymentPanel;

	public static void main(String[] args) {

		/////////////////////////////////////////////////////////////////////////

		// LOGIN PAGE

		Frame = new JFrame("YorkU Parking Booking System");
		Frame.setResizable(false);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(800, 800);

		loginPanel = new JPanel();
		// loginPanel.setLayout(null);
		loginPanel.setLayout(null);
		Frame.getContentPane().add(loginPanel);

		// Username
		userlabel = new JLabel("Username");
		userlabel.setBounds(10, 10, 100, 25);
		loginPanel.add(userlabel);

		userText = new JTextField();
		userText.setBounds(100, 10, 150, 25);
		userText.setMaximumSize(new Dimension(150, 25));
		loginPanel.add(userText);

		// Password
		passwordlabel = new JLabel("Password");
		passwordlabel.setBounds(10, 50, 100, 25);
		loginPanel.add(passwordlabel);

		passwordText = new JTextField();
		passwordText.setBounds(100, 50, 150, 25);
		passwordText.setMaximumSize(new Dimension(150, 25));
		loginPanel.add(passwordText);

		// Login Button
		loginButton = new JButton("Login");
		loginButton.setBounds(10, 90, 100, 25);
		loginButton.addActionListener(new main());
		loginPanel.add(loginButton);

		// Success message
		success = new JLabel("");
		success.setBounds(10, 120, 300, 25);
		loginPanel.add(success);

		Frame.setVisible(true);

		/////////////////////////////////////////////////////////////////////////

		// MAIN PAGE

		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(mainPanel);

		// Top part of screen
		topPanel = new JPanel();
		topPanel.setVisible(false);
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
		bottomPanel.setVisible(false);
		bottomPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		bottomPanel.setBounds(0, 300, 600, 100);
		bottomPanel.setBackground(Color.gray);

		loadSpots();

		mainPanel.add(topPanel, BorderLayout.PAGE_START);
		mainPanel.add(bottomPanel, BorderLayout.PAGE_END);

		/////////////////////////////////////////////////////////////////////////
		
		// PAYMENT PAGE
		
		paymentPanel = new JPanel();
		paymentPanel.setVisible(false);
		paymentPanel.setLayout(new BoxLayout(paymentPanel, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(mainPanel);
		
		JRadioButton debit = new JRadioButton("Debit Card");
		JRadioButton credit = new JRadioButton("Credit Card");
		
		ButtonGroup group = new ButtonGroup();
		group.add(debit);
		group.add(credit);
		
		paymentPanel.add(debit);
		paymentPanel.add(credit);
		
		JLabel label3 = new JLabel("Insert Payment Information");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		paymentPanel.add(label3);
		
		
		
		/////////////////////////////////////////////////////////////////////////

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


					loginPanel.setVisible(false);
					topPanel.setVisible(true);
					bottomPanel.setVisible(true);
					
					
					Frame.add(mainPanel);

				} else {
					success.setForeground(Color.red);
					success.setText("Login incorrect");
					System.out.println("Failed Login");
				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		} else if (value >= 0 && value <= 100) { // Choose a parking spot

			System.out.println("User chose: parking spot " + value);
			
			
			topPanel.setVisible(false);
			bottomPanel.setVisible(false);
			paymentPanel.setVisible(true);
			
			
			Frame.add(paymentPanel);
			System.out.println("On payment page");

		} else if (lotValue != null) { // Choose a lot

			System.out.println("list update");

		}

	}

}
