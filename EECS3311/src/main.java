import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import paymentStrategy.*;
import manager.*;
import parking.*;
import reservations.*;
import userLogin.*;
import users.*;

public class main implements ActionListener {

	private static JFrame Frame;
	private static MaintainUser maintainusers = new MaintainUser();
	private static String path1 = "user.csv";

	private static MaintainUser maintainmanagement = new MaintainUser();
	private static String path2 = "management.csv";

	// Singleton Variables
	private static ParkingSystem psystem;
	private static SuperManager supermanager;
	private static ReservationSystemFacade rsystem;

	private static UserInfo currentuser = null;
	private static UserList userList; // keeps track of all created accounts
	private static boolean managerLoggedIn = false;
	private static boolean superManagerLoggedIn = false;

	// Login Page
	private static JPanel loginGeneralPanel;
	private static JPanel loginPanel;
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passwordlabel;
	private static JTextField passwordText;
	private static JButton loginButton;
	private static JLabel success;
	private static JButton register;

	// Register Page
	private static JButton regBack;
	private static JPanel registerGeneralPanel;
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
	private static JButton bookings;
	private static JPanel mainGeneralPage;
	private static JPanel mainGeneralManagementPage;
	private static JPanel topManagementPanel;
	private static JPanel navPanel;
	private static JPanel navManagementPanel;
	private static JPanel topPanel;
	private static JPanel licencePanel;
	private static JPanel datePanel;
	private static JPanel bottomPanel;
	private static JComboBox lots;
	private static JComboBox month;
	private static JComboBox day;
	private static JComboBox time;
	private static JButton[] parkingspot = new JButton[101]; // parkingspot[0] isn't used to start from 1-100 spots
	private static JLabel plateLabel;
	private static JTextField plateText;
	private static JLabel licencesuccess;
	private static JButton createManager;
	private static JButton addLot;
	private static JButton setLotVisible;
	private static String lotVisible;
	private static int selectedLotIndex;
	private static int selectedMonthIndex;
	private static int selectedDateIndex;
	private static int selectedTimeIndex;
	private static int parkingspacenum;

	// View Booking Page
	private static JButton viewBack;
	private static JPanel viewGeneralPage;
	private static JPanel optionsPanel;
	private static JPanel bookingPanel;
	private static JButton cancel;
	private static JLabel addTimeLabel;
	private static JButton extend;

	private static JRadioButton one = new JRadioButton("  1 Hour");
	private static JRadioButton two = new JRadioButton("2 Hours  ");
	private static ButtonGroup options = new ButtonGroup();

	// Payment Page
	private static JButton payBack;
	private static JPanel paymentGeneralPage;
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
	private static boolean editbooking = false;

	// Booking Confirmation Page
	private static JPanel confirmationGeneralPage;
	private static JPanel confirmPanel;
	private static JLabel confirmLabel;
	private static JButton confirm;

	// Error Page
	private static JPanel errorLotPage;
	private static JPanel errorPanel;
	private static JLabel errorLabel;
	private static JButton returntomain;
	private static String errorLot;

	private static Manager validationManagement;
	private static ArrayList<String> months = new ArrayList<>();
	private static String[] monthsList = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };
	private static String[] daysList = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	private static String[] timesList = { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00",
			"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00",
			"20:00", "21:00", "22:00", "23:00" };

	public static void main(String[] args) throws Exception {

		Frame = new JFrame("YorkU Parking Booking System");
		Frame.setResizable(false);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(800, 800);

		userList = new UserList();
		maintainusers.load(path1);
		maintainmanagement.load(path2);

		//validationManagement deals with validifying new accounts
		validationManagement = new Manager("validation", "validation");
		psystem = ParkingSystem.getInstance();
		lotVisible = "Disable";
		selectedLotIndex = 0;

		rsystem = ReservationSystemFacade.getInstance();

		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");

		// Add already created users into the userList
		ArrayList<User> users = maintainusers.users;

		for (int i = 0; i < maintainusers.users.size(); i++) {

			String email = users.get(i).getEmail();
			String password = users.get(i).getPassword();
			String type = users.get(i).getType();

			addToUserList(email, password, type);

		}

		loginPage();
		loginGeneralPanel.setVisible(true);

	}

	private static void addToUserList(String email, String password, String type) {

		UserInfoFactory factory = new UserInfoFactory();

		UserInfo user = factory.makeUser(type, email, password);
		userList.getList().add(user);

	}

	private static void loginPage() {

		loginGeneralPanel = new JPanel();
		loginGeneralPanel.setVisible(false);
		loginGeneralPanel.setLayout(new BoxLayout(loginGeneralPanel, BoxLayout.PAGE_AXIS));
		loginGeneralPanel.setBackground(Color.gray);
		Frame.getContentPane().add(loginGeneralPanel);

		loginPanel = new JPanel();
		loginPanel.setBorder(new EmptyBorder(200, 10, 10, 10));
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.PAGE_AXIS));
		loginPanel.setBackground(Color.gray);

		// Username/Email
		userlabel = new JLabel("Email");
		userlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginPanel.add(userlabel);

		userText = new JTextField();
		userText.setAlignmentX(Component.CENTER_ALIGNMENT);
		userText.setMaximumSize(new Dimension(150, 25));
		loginPanel.add(userText);

		loginPanel.add(Box.createVerticalStrut(10)); // spacer

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

		loginGeneralPanel.add(loginPanel, BorderLayout.PAGE_START);
		Frame.setVisible(true);

	}

	private static void registerPage() {

		registerGeneralPanel = new JPanel();
		registerGeneralPanel.setVisible(false);
		registerGeneralPanel.setLayout(new BoxLayout(registerGeneralPanel, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(registerGeneralPanel);

		registerGeneralPanel.add(Box.createVerticalStrut(50)); // spacer

		regBack = new JButton("Back");
		regBack.setAlignmentX(Component.CENTER_ALIGNMENT);
		regBack.addActionListener(new main());
		registerGeneralPanel.add(regBack);

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

		registerGeneralPanel.add(typesPanel, BorderLayout.PAGE_START);
		registerGeneralPanel.add(registerPanel, BorderLayout.PAGE_START);

	}

	// validate users
	private static void mainPage() {

		if (managerLoggedIn || superManagerLoggedIn) {
			mainManagementPage();
			Frame.add(mainGeneralManagementPage);
			mainGeneralManagementPage.setVisible(true);
		} else {
			mainClientPage();
			Frame.add(mainGeneralPage);
			mainGeneralPage.setVisible(true);
		}

	}

	private static void mainManagementPage() {

		mainGeneralManagementPage = new JPanel();
		mainGeneralManagementPage.setVisible(false);
		mainGeneralManagementPage.setLayout(new BoxLayout(mainGeneralManagementPage, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(mainGeneralManagementPage);

		// Buttons at top of screen
		navManagementPanel = new JPanel(new FlowLayout());

		navManagementPanel.add(Box.createVerticalStrut(10)); // spacer

		mainBack = new JButton("Logout");
		mainBack.addActionListener(new main());
		navManagementPanel.add(mainBack);

		if (superManagerLoggedIn) {
			createManager = new JButton("Create New Manager Account");
			createManager.addActionListener(new main());
			navManagementPanel.add(createManager);
		}

		navManagementPanel.setBackground(Color.gray);

		// Top part of screen
		topManagementPanel = new JPanel();
		topManagementPanel.setBorder(new EmptyBorder(0, 10, 10, 10));
		topManagementPanel.setLayout(new BoxLayout(topManagementPanel, BoxLayout.PAGE_AXIS));

		addLot = new JButton("Add Lot");
		addLot.addActionListener(new main());
		addLot.setAlignmentX(Component.CENTER_ALIGNMENT);
		topManagementPanel.add(addLot);

		topManagementPanel.add(Box.createVerticalStrut(10)); // spacer

		int numLots = psystem.getLots().size();
		String[] parkingLots = new String[numLots];
		int i = 0;
		Map<Integer, ParkingLot> lotlist = psystem.getLots();

		for (ParkingLot lot : lotlist.values()) {

			parkingLots[i] = lot.getAddress();
			i++;

		}

		lots = new JComboBox(parkingLots);
		lots.setSelectedIndex(selectedLotIndex);
		lots.setMaximumSize(new Dimension(150, 25));
		lots.addActionListener(new main());
		topManagementPanel.add(lots);

		topManagementPanel.add(Box.createVerticalStrut(10)); // spacer

		// Enable/Disable Lot
		setLotVisible = new JButton(lotVisible);
		setLotVisible.addActionListener(new main());
		setLotVisible.setAlignmentX(Component.CENTER_ALIGNMENT);
		topManagementPanel.add(setLotVisible);

		topManagementPanel.add(Box.createVerticalStrut(10)); // spacer
		topManagementPanel.setBackground(Color.gray);

		// Bottom part of screen
		bottomPanel = new JPanel(new GridLayout(0, 10, 10, 10));
		bottomPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		bottomPanel.setBackground(Color.DARK_GRAY);

		loadSpots();

		mainGeneralManagementPage.add(navManagementPanel, BorderLayout.PAGE_START);
		mainGeneralManagementPage.add(topManagementPanel, BorderLayout.PAGE_START);
		mainGeneralManagementPage.add(bottomPanel, BorderLayout.PAGE_END);

	}

	private static void mainClientPage() {

		mainGeneralPage = new JPanel();
		mainGeneralPage.setVisible(false);
		mainGeneralPage.setLayout(new BoxLayout(mainGeneralPage, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(mainGeneralPage);

		// Buttons at top of screen
		navPanel = new JPanel(new FlowLayout());

		navPanel.add(Box.createVerticalStrut(10)); // spacer

		bookings = new JButton("View/Edit Current Booking");
		bookings.addActionListener(new main());
		navPanel.add(bookings);

		mainBack = new JButton("Logout");
		mainBack.addActionListener(new main());
		navPanel.add(mainBack);
		navPanel.setBackground(Color.gray);

		// Top part of screen
		topPanel = new JPanel();
		topPanel.setBorder(new EmptyBorder(0, 10, 10, 10));
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.PAGE_AXIS));

		JLabel label = new JLabel("Select Parking Lot, Time, and Parking Spot:");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		topPanel.add(label);
		topPanel.setBackground(Color.gray);

		topPanel.add(Box.createVerticalStrut(10)); // spacer

		int numLots = psystem.getLots().size();
		String[] parkingLots = new String[numLots];
		int i = 0;
		Map<Integer, ParkingLot> lotlist = psystem.getLots();

		for (ParkingLot lot : lotlist.values()) {

			parkingLots[i] = lot.getAddress();
			i++;

		}

		lots = new JComboBox(parkingLots);
		lots.setSelectedIndex(selectedLotIndex);
		lots.setMaximumSize(new Dimension(150, 25));
		lots.addActionListener(new main());
		topPanel.add(lots);
		topPanel.setBackground(Color.gray);

		// Licence plate
		licencePanel = new JPanel(new FlowLayout());
		plateLabel = new JLabel("Licence Plate:");
		licencePanel.add(plateLabel);
		plateText = new JTextField(10);
		licencePanel.setBackground(Color.gray);
		licencePanel.add(plateText);

		// Select date
		datePanel = new JPanel(new FlowLayout());

		JLabel selectMonth = new JLabel("Month:");
		datePanel.add(selectMonth);
		month = new JComboBox(monthsList);
		month.setSelectedIndex(selectedMonthIndex);
		month.setMaximumSize(new Dimension(150, 25));
		month.addActionListener(new main());
		datePanel.add(month);
		datePanel.setBackground(Color.gray);

		datePanel.add(Box.createHorizontalStrut(10)); // spacer

		JLabel selectDay = new JLabel("Day:");
		datePanel.add(selectDay);
		day = new JComboBox(daysList);
		day.setSelectedIndex(selectedDateIndex);
		day.setMaximumSize(new Dimension(150, 25));
		day.addActionListener(new main());

		datePanel.add(day);

		datePanel.add(Box.createHorizontalStrut(10)); // spacer

		JLabel selectTime = new JLabel("Starting Time (1 Hour Duration Initially):");
		datePanel.add(selectTime);
		time = new JComboBox(timesList);
		time.setSelectedIndex(selectedTimeIndex);
		time.setMaximumSize(new Dimension(150, 25));
		time.addActionListener(new main());
		datePanel.add(time);

		// Success message
		licencesuccess = new JLabel("");
		licencesuccess.setAlignmentX(Component.CENTER_ALIGNMENT);
		datePanel.add(licencesuccess);

		// Bottom part of screen
		bottomPanel = new JPanel(new GridLayout(0, 10, 10, 10));
		bottomPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		bottomPanel.setBackground(Color.DARK_GRAY);

		loadSpots();

		mainGeneralPage.add(navPanel, BorderLayout.PAGE_START);
		mainGeneralPage.add(topPanel, BorderLayout.PAGE_START);
		mainGeneralPage.add(licencePanel, BorderLayout.PAGE_START);
		mainGeneralPage.add(datePanel, BorderLayout.PAGE_START);
		mainGeneralPage.add(bottomPanel, BorderLayout.PAGE_END);

	}

	private static void loadParkingSpots(int i, int j) {

		psystem = ParkingSystem.getInstance();
		ParkingLot lot = psystem.getLot(selectedLotIndex + 1);

		if (superManagerLoggedIn || managerLoggedIn) {

			for (int a = i; a <= j; a++) {

				parkingspot[a] = new JButton("" + a);

				// Available
				if (lot.getParkingSpace(a - 1).isEnabled()) {

					parkingspot[a].setBackground(new Color(0, 153, 0));
					parkingspot[a].addActionListener(new main());

				} else { // Not Available

					parkingspot[a].setBackground(new Color(204, 0, 0));
					parkingspot[a].addActionListener(new main());

				}

				parkingspot[a].setForeground(Color.black);
				bottomPanel.add(parkingspot[a]);

			}

		} else {

			// Convert month string to number 1-12
			String monthValue = "";
			monthValue = (String) month.getSelectedItem();
			int monthInt = 0;

			monthInt = months.indexOf(monthValue) + 1;

			int dayValue = 0;
			dayValue = Integer.parseInt((String) day.getSelectedItem());

			String timeValueString = "";
			timeValueString = (String) time.getSelectedItem();

			int timeValue = Integer.parseInt(timeValueString.substring(0, 2));

			for (int a = i; a <= j; a++) {

				parkingspot[a] = new JButton("" + a);

				ParkingSpace space = lot.getParkingSpace(a - 1);

				// Is Disabled
				if (!(lot.getParkingSpace(a - 1).isEnabled())) {
					parkingspot[a].setBackground(new Color(204, 0, 0));
					parkingspot[a].setEnabled(false);
					parkingspot[a].setForeground(Color.black);
					bottomPanel.add(parkingspot[a]);

				} else { // Is Enabled

					// No reservations exist in the space
					if (space.getReservations().size() == 0) {

						parkingspot[a].setBackground(new Color(0, 153, 0));
						parkingspot[a].addActionListener(new main());
						parkingspot[a].setForeground(Color.black);
						bottomPanel.add(parkingspot[a]);

					}

					else { // There exists a reservation

						String monthValue1 = "";
						monthValue = (String) month.getSelectedItem();
						int currentMonth = months.indexOf(monthValue) + 1;
						int currentdayValue = Integer.parseInt((String) day.getSelectedItem());
						String currenttimeValueString = (String) time.getSelectedItem();
						int currenttimeValue = Integer.parseInt(timeValueString.substring(0, 2));

						for (Reservation reservation : space.getReservations()) {

							// Same date, need to check time
							if (reservation.getMonth() == currentMonth && reservation.getDay() == currentdayValue) {

								// If times conflict
								if (reservation.getStartTime() == currenttimeValue
										|| (currenttimeValue < (reservation.getStartTime() + reservation.getDuration())
												&& currenttimeValue >= reservation.getStartTime())) {

									parkingspot[a].setBackground(new Color(204, 0, 0));
									parkingspot[a].setEnabled(false);
									parkingspot[a].setForeground(Color.black);
									bottomPanel.add(parkingspot[a]);

								} else {// No conflict

									parkingspot[a].setBackground(new Color(0, 153, 0));
									parkingspot[a].addActionListener(new main());
									parkingspot[a].setForeground(Color.black);
									bottomPanel.add(parkingspot[a]);

								}

							} else { // No conflict

								parkingspot[a].setBackground(new Color(0, 153, 0));
								parkingspot[a].addActionListener(new main());
								parkingspot[a].setForeground(Color.black);
								bottomPanel.add(parkingspot[a]);

							}

						}

					}

				}

			}

		}

	}

	// Add update lots when choosing a new lot
	private static void loadSpots() {

		loadParkingSpots(1, 10);
		loadParkingSpots(11, 20);

		addSpace();

		loadParkingSpots(21, 30);
		loadParkingSpots(31, 40);

		addSpace();

		loadParkingSpots(41, 50);
		loadParkingSpots(51, 60);

		addSpace();

		loadParkingSpots(61, 70);
		loadParkingSpots(71, 80);

		addSpace();

		loadParkingSpots(81, 90);
		loadParkingSpots(91, 100);

	}

	private static void addSpace() {
		for (int i = 1; i <= 10; i++) {
			bottomPanel.add(new JLabel(""));
		}
	}

	private static void paymentPage() {

		paymentGeneralPage = new JPanel();
		paymentGeneralPage.setVisible(false);
		paymentGeneralPage.setBackground(Color.gray);
		paymentGeneralPage.setLayout(new BoxLayout(paymentGeneralPage, BoxLayout.PAGE_AXIS));
		Frame.getContentPane().add(paymentGeneralPage);

		paymentGeneralPage.add(Box.createVerticalStrut(10)); // spacer

		payBack = new JButton("Back");
		payBack.setAlignmentX(Component.CENTER_ALIGNMENT);
		payBack.addActionListener(new main());
		paymentGeneralPage.add(payBack);

		paymentGeneralPage.add(Box.createVerticalStrut(20)); // spacer

		int cost;
		
		if(editbooking) {
			
			cost = rsystem.calculateOutstanding(currentuser.currentReservation, currentuser);
			
		}else {
			
			cost = currentuser.getParkingRate();
			
		}
		
		costLabel = new JLabel("You will be charged: $" + cost + "\n");
		costLabel.setFont(new Font("", Font.PLAIN, 30));
		costLabel.setForeground(Color.red);
		costLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		paymentGeneralPage.add(costLabel);

		paymentGeneralPage.add(Box.createVerticalStrut(50)); // spacer

		JLabel label = new JLabel("Insert Payment Information:");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		paymentGeneralPage.add(label);

		ptypesPanel = new JPanel();
		ptypesPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		ptypesPanel.setBounds(0, 0, 500, 100);
		ptypesPanel.setBackground(Color.gray);
		ptypesPanel.setLayout(new BoxLayout(ptypesPanel, BoxLayout.LINE_AXIS));

		// Payment types
		group.add(debit);
		group.add(credit);

		ptypesPanel.add(debit);
		ptypesPanel.add(credit);
		debit.setBackground(Color.gray);
		credit.setBackground(Color.gray);

		paymentPanel = new JPanel();
		paymentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		paymentPanel.setBounds(0, 0, 500, 100);
		paymentPanel.setBackground(Color.gray);
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

		paymentGeneralPage.add(ptypesPanel, BorderLayout.PAGE_START);
		paymentGeneralPage.add(paymentPanel, BorderLayout.PAGE_END);

	}

	private static void confirmedBookingPage() {

		confirmationGeneralPage = new JPanel();
		confirmationGeneralPage.setVisible(false);
		confirmationGeneralPage.setLayout(new BoxLayout(confirmationGeneralPage, BoxLayout.PAGE_AXIS));
		confirmationGeneralPage.setBackground(Color.gray);
		Frame.getContentPane().add(confirmationGeneralPage);

		confirmPanel = new JPanel();
		confirmPanel.setBorder(new EmptyBorder(100, 10, 10, 10));
		confirmPanel.setLayout(new BoxLayout(confirmPanel, BoxLayout.PAGE_AXIS));
		confirmPanel.setBackground(Color.gray);

		// Username/Email
		confirmLabel = new JLabel("You have successfully booked this Parking Space.");
		confirmLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		confirmPanel.add(confirmLabel);

		confirmPanel.add(Box.createVerticalStrut(10)); // spacer

		// Register Button
		confirm = new JButton("Return To Main Screen");
		confirm.setAlignmentX(Component.CENTER_ALIGNMENT);
		confirm.addActionListener(new main());
		confirmPanel.add(confirm);

		confirmationGeneralPage.add(confirmPanel, BorderLayout.PAGE_START);

	}

	private static void ErrorLotPage() {

		errorLotPage = new JPanel();
		errorLotPage.setVisible(false);
		errorLotPage.setLayout(new BoxLayout(errorLotPage, BoxLayout.PAGE_AXIS));
		errorLotPage.setBackground(Color.gray);
		Frame.getContentPane().add(errorLotPage);

		errorPanel = new JPanel();
		errorPanel.setBorder(new EmptyBorder(100, 10, 10, 10));
		errorPanel.setLayout(new BoxLayout(errorPanel, BoxLayout.PAGE_AXIS));
		errorPanel.setBackground(Color.gray);

		// Username/Email
		errorLabel = new JLabel(errorLot + " Is Not Available This Time");
		errorLabel.setFont(new Font("", Font.PLAIN, 30));
		errorLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		errorLabel.setForeground(Color.red);
		errorPanel.add(errorLabel);

		errorPanel.add(Box.createVerticalStrut(10)); // spacer

		// Register Button
		returntomain = new JButton("Return To Main Screen");
		returntomain.setAlignmentX(Component.CENTER_ALIGNMENT);
		returntomain.addActionListener(new main());
		errorPanel.add(returntomain);

		errorLotPage.add(errorPanel, BorderLayout.PAGE_START);

	}

	// Helper class for viewBookingPage()
	private static String getTime(int i) {

		String time = "";

		if (i == 0) {
			time = "12:00 AM";
		} else if (i == 1) {
			time = "1:00 AM";
		} else if (i == 2) {
			time = "2:00 AM";
		} else if (i == 3) {
			time = "3:00 AM";
		} else if (i == 4) {
			time = "4:00 AM";
		} else if (i == 5) {
			time = "5:00 AM";
		} else if (i == 6) {
			time = "6:00 AM";
		} else if (i == 7) {
			time = "7:00 AM";
		} else if (i == 8) {
			time = "8:00 AM";
		} else if (i == 9) {
			time = "9:00 AM";
		} else if (i == 10) {
			time = "10:00 AM";
		} else if (i == 11) {
			time = "11:00 AM";
		} else if (i == 12) {
			time = "12:00 AM";
		} else if (i == 13) {
			time = "1:00 PM";
		} else if (i == 14) {
			time = "2:00 PM";
		} else if (i == 15) {
			time = "3:00 PM";
		} else if (i == 16) {
			time = "4:00 PM";
		} else if (i == 17) {
			time = "5:00 PM";
		} else if (i == 18) {
			time = "6:00 PM";
		} else if (i == 19) {
			time = "7:00 PM";
		} else if (i == 20) {
			time = "8:00 PM";
		} else if (i == 21) {
			time = "9:00 PM";
		} else if (i == 22) {
			time = "10:00 PM";
		} else if (i == 23) {
			time = "11:00 PM";
		}

		return time;

	}

	// Helper class for viewBookingPage()
	private static String getMonth(int i) {

		String month = "";

		if (i == 1) {
			month = "January";
		} else if (i == 2) {
			month = "February";
		} else if (i == 3) {
			month = "March";
		} else if (i == 4) {
			month = "April";
		} else if (i == 5) {
			month = "May";
		} else if (i == 6) {
			month = "June";
		} else if (i == 7) {
			month = "July";
		} else if (i == 8) {
			month = "August";
		} else if (i == 9) {
			month = "September";
		} else if (i == 10) {
			month = "October";
		} else if (i == 11) {
			month = "November";
		} else if (i == 12) {
			month = "December";
		}

		return month;

	}

	private static void viewBookingPage() {

		viewGeneralPage = new JPanel();
		viewGeneralPage.setVisible(false);
		viewGeneralPage.setLayout(new BoxLayout(viewGeneralPage, BoxLayout.PAGE_AXIS));
		viewGeneralPage.setBackground(Color.gray);
		Frame.getContentPane().add(viewGeneralPage);

		viewGeneralPage.add(Box.createVerticalStrut(10)); // spacer

		viewBack = new JButton("Back");
		viewBack.setAlignmentX(Component.CENTER_ALIGNMENT);
		viewBack.addActionListener(new main());
		viewGeneralPage.add(viewBack);

		viewGeneralPage.add(Box.createVerticalStrut(20)); // spacer

		if (currentuser.currentReservation != null) {

			optionsPanel = new JPanel(new FlowLayout());
			optionsPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
			optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.LINE_AXIS));
			optionsPanel.setBackground(Color.gray);

			cancel = new JButton("Cancel Booking");
			cancel.setAlignmentX(Component.CENTER_ALIGNMENT);
			cancel.addActionListener(new main());
			optionsPanel.add(cancel);

			addTimeLabel = new JLabel("    Extend Time:");
			optionsPanel.add(addTimeLabel);

			// Payment types
			options.add(one);
			options.add(two);
			one.setBackground(Color.gray);
			two.setBackground(Color.gray);
			
			optionsPanel.add(one);
			optionsPanel.add(two);
			

			extend = new JButton("Extend Time");
			extend.addActionListener(new main());
			optionsPanel.add(extend);

			bookingPanel = new JPanel(new FlowLayout());
			bookingPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
			bookingPanel.setLayout(new BoxLayout(bookingPanel, BoxLayout.PAGE_AXIS));
			bookingPanel.setBackground(Color.DARK_GRAY);

			String monthstr = getMonth(currentuser.currentReservation.getMonth());
			String timestr = getTime(currentuser.currentReservation.getStartTime());
			System.out.println(monthstr);
			System.out.println(timestr);
			JLabel lot = new JLabel(monthstr + ", " + currentuser.currentReservation.getDay() + " at " + timestr);

			lot.setFont(new Font("", Font.PLAIN, 20));
			lot.setForeground(Color.WHITE);
			lot.setAlignmentX(Component.CENTER_ALIGNMENT);
			bookingPanel.add(lot);

			JLabel location = new JLabel(
					"Location: " + currentuser.parkinglot + ", Parking Space #" + currentuser.parkingspacenum);
			location.setFont(new Font("", Font.PLAIN, 20));
			location.setAlignmentX(Component.CENTER_ALIGNMENT);
			location.setForeground(Color.WHITE);
			bookingPanel.add(location);

			int timelength = currentuser.currentReservation.getDuration();
			JLabel duration;
			
			if(timelength == 1) {
				
				duration = new JLabel("Duration: " + currentuser.currentReservation.getDuration() + " Hour");
				
			}else {
				
				duration = new JLabel("Duration: " + currentuser.currentReservation.getDuration() + " Hours");
				
			}
			
			duration.setFont(new Font("", Font.PLAIN, 20));
			duration.setForeground(Color.WHITE);
			duration.setAlignmentX(Component.CENTER_ALIGNMENT);
			bookingPanel.add(duration);

			viewGeneralPage.add(optionsPanel, BorderLayout.PAGE_START);
			viewGeneralPage.add(bookingPanel, BorderLayout.PAGE_START);

		}

	}

	private boolean checkLogin(String username, String password) throws Exception {

		ClassLoader classLoader = getClass().getClassLoader();

		for (int i = 0; i < maintainmanagement.users.size(); i++) {
			// User exists
			if (maintainmanagement.users.get(i).getEmail().equals(username)
					&& maintainmanagement.users.get(i).getPassword().equals(password)) {

				if (maintainmanagement.users.get(i).getType().equals("super")) {

					supermanager = SuperManager.getInstance();
					System.out.println("Super Manager has logged in");
					managerLoggedIn = true;
					superManagerLoggedIn = true;

				} else {

					managerLoggedIn = true;
					System.out.println("Manager has logged");

				}

				return true;
			}

		}

		for (int i = 0; i < maintainusers.users.size(); i++) {
			// User exists
			if (maintainusers.users.get(i).getEmail().equals(username)
					&& maintainusers.users.get(i).getPassword().equals(password) && maintainusers.users.get(i).getValidation().equals("TRUE")) {

				System.out.println("Logged in user is type: " + maintainusers.users.get(i).getType());

				// Set to current user
				for (int j = 0; j < userList.getList().size(); j++) {
					if (userList.getList().get(j).getEmail().equals(username)
							&& userList.getList().get(j).getPassword().equals(password)) {
						this.currentuser = userList.getList().get(j);
					}
				}
				
				if(this.currentuser.getIsValid()) {
					
					return true;
					
				}else {
					
					return false;
				}
			}

		}

		// User doesn't exist
		return false;
	}

	// New JFrame to display new manager login info
	private static void newManagerInfo() throws Exception {

		JFrame newManagerPanel = new JFrame();
		Manager manager = supermanager.autoGenerator();
		newManagerPanel.setResizable(false);
		newManagerPanel.setDefaultCloseOperation(newManagerPanel.DISPOSE_ON_CLOSE);
		newManagerPanel.setSize(400, 150);
		newManagerPanel.setVisible(true);

		JPanel info = new JPanel();
		info.setBorder(new EmptyBorder(10, 10, 10, 10));
		info.setLayout(new BoxLayout(info, BoxLayout.PAGE_AXIS));
		info.setBackground(Color.gray);

		info.add(Box.createVerticalStrut(10)); // spacer
		JTextField label = new JTextField("New Manager Account:");
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		label.setEditable(false);
		label.setBorder(null);
		label.setForeground(UIManager.getColor("Label.foreground"));
		label.setFont(UIManager.getFont("Label.font"));
		info.add(label);

		info.add(Box.createVerticalStrut(10)); // spacer
		JTextField user = new JTextField("Username: " + manager.getUsername());
		user.setEditable(false);
		user.setBorder(null);
		user.setForeground(UIManager.getColor("Label.foreground"));
		user.setFont(UIManager.getFont("Label.font"));
		user.setAlignmentX(Component.CENTER_ALIGNMENT);
		info.add(user);
		info.add(Box.createVerticalStrut(10)); // spacer

		JTextField pass = new JTextField("Password: " + manager.getPassword());
		pass.setEditable(false);
		pass.setBorder(null);
		pass.setForeground(UIManager.getColor("Label.foreground"));
		pass.setFont(UIManager.getFont("Label.font"));
		pass.setAlignmentX(Component.CENTER_ALIGNMENT);
		info.add(pass);

		newManagerPanel.add(info, BorderLayout.PAGE_START);
		User manageruser = new User("manager", "manager", maintainmanagement.users.size() + 1, manager.getUsername(),
				manager.getPassword(), "manager");
		maintainmanagement.users.add(manageruser);
		maintainmanagement.update(path2);

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

					loginGeneralPanel.setVisible(false);

					mainPage();

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

			loginGeneralPanel.setVisible(false);

			registerPage();
			Frame.add(registerGeneralPanel);
			registerGeneralPanel.setVisible(true);

		}

	}
	
	public void registerActions(ActionEvent e) throws Exception {

		if (e.getSource() == regBack) {

			System.out.println("Back to login page");

			registerGeneralPanel.setVisible(false);

			loginPage();
			loginGeneralPanel.setVisible(true);

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

			if (student.isSelected()) {
				type = "student";
			} else if (faculty.isSelected()) {
				type = "faculty";
			} else if (nfaculty.isSelected()) {
				type = "non-faculty";
			} else if (visitor.isSelected()) {
				type = "visitor";
			}

			if (fname.equals("") || lname.equals("") || email.equals("") || password.equals("") || type.equals("")) {
				regsuccess.setForeground(Color.red);
				regsuccess.setText("Please fill in all the fields");
				System.out.println("Failed Register");
			} else {
				
				UserInfoFactory factory = new UserInfoFactory();

				UserInfo user = factory.makeUser(type, email, password);

				if(validationManagement.validateUser(user)) {
				
					// Adds to user.csv
					User newuser = new User(fname, lname, maintainusers.users.size() + 1, email, password, type);
					newuser.setValidation("TRUE");
					maintainusers.users.add(newuser);
					maintainusers.update(path1);

					// Adds to userlist
					addToUserList(email, password, type);

					System.out.println("Registering user: [type: " + type + ", first name: " + fname + ", last name: "
							+ lname + ", email: " + email + ", password: " + password + "]");

					registerGeneralPanel.setVisible(false);

					loginPage();
					loginGeneralPanel.setVisible(true);
					
				}else {
					
					regsuccess.setForeground(Color.red);
					regsuccess.setText("Invalid Email, Weak Password, or Denied Validation");
					System.out.println("Failed Register");
					
				}


			}

		}

	}

	public void mainActions(ActionEvent e) {

		// Admin controls

		if (e.getSource() == bookings) {

			System.out.println("Edit/View Booking");
			mainGeneralPage.setVisible(false);
			viewBookingPage();
			viewGeneralPage.setVisible(true);

		}

		// Create managers
		if (e.getSource() == createManager) {
			System.out.println("Created new manager");
			try {
				newManagerInfo();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}

		if (e.getSource() == mainBack) {

			userText = null;
			passwordText = null;
			selectedLotIndex = 0; // reset initial JComboBox value to show Lot 1
			selectedMonthIndex = 0;
			selectedDateIndex = 0;
			selectedTimeIndex = 0;
			if (managerLoggedIn || superManagerLoggedIn) {
				System.out.println("Management User logged out");
				mainGeneralManagementPage.removeAll();
				mainGeneralManagementPage.setVisible(false);
				managerLoggedIn = false;
				superManagerLoggedIn = false;
			} else {
				System.out.println("Normal User logged out");
				mainGeneralPage.setVisible(false);
			}

			loginPage();
			loginGeneralPanel.setVisible(true);

		}

		if (e.getSource() == addLot) {

			System.out.println("Created a new Lot");
			Map<Integer, ParkingLot> lotlist = psystem.getLots();
			int lotnum = psystem.getLots().size() + 1;
			String address = "Lot " + lotnum;
			ParkingLot lot = psystem.addLot(psystem.getLots().size() + 1, address);
			lot.setEnabled(true);
			mainGeneralManagementPage.removeAll();
			navManagementPanel.removeAll();
			topManagementPanel.removeAll();
			mainGeneralManagementPage.setVisible(false);
			mainManagementPage();
			mainGeneralManagementPage.setVisible(true);

		}

		String lotValue = "";
		JComboBox lotlist = null;

		// Checks if the lot was changed
		if (e.getSource() == lots) {

			if (superManagerLoggedIn || managerLoggedIn) {

				lotlist = (JComboBox) e.getSource();
				lotValue = (String) lotlist.getSelectedItem();

				Map<Integer, ParkingLot> list = psystem.getLots();
				int i = 0;
				for (ParkingLot lot : list.values()) {

					if (lot.getAddress().equals(lotValue)) {
						selectedLotIndex = i;
						if (lot.getEnabled()) {
							lotVisible = "Disable";
						} else {
							lotVisible = "Enable";
						}

						break;
					}

					i++;

				}

				mainGeneralManagementPage.removeAll();
				navManagementPanel.removeAll();
				topManagementPanel.removeAll();
				mainGeneralManagementPage.setVisible(false);
				mainPage();

			} else {

				lotlist = (JComboBox) e.getSource();
				lotValue = (String) lotlist.getSelectedItem();

				Map<Integer, ParkingLot> list = psystem.getLots();
				int i = 0;
				for (ParkingLot lot : list.values()) {

					if (lot.getAddress().equals(lotValue)) {
						if (lot.getEnabled()) {
							selectedLotIndex = i;

							// Reload
							mainGeneralPage.removeAll();
							navPanel.removeAll();
							topPanel.removeAll();
							bottomPanel.removeAll();
							mainGeneralPage.setVisible(false);
							mainPage();

						} else {

							selectedLotIndex = 0;
							errorLot = lot.getAddress();
							mainGeneralPage.removeAll();
							navPanel.removeAll();
							topPanel.removeAll();
							bottomPanel.removeAll();
							mainGeneralPage.setVisible(false);
							ErrorLotPage();
							errorLotPage.setVisible(true);

						}

						break;
					}

					i++;

				}

			}

		}

		String lotValue1 = "";
		JComboBox lotlist1 = null;

		if (e.getSource() == setLotVisible) {

			lotlist1 = lots;
			lotValue1 = (String) lotlist1.getSelectedItem();
			Map<Integer, ParkingLot> list = psystem.getLots();

			for (ParkingLot lot : list.values()) {

				if (lot.getAddress().equals(lotValue1)) {
					boolean currentstatus = lot.getEnabled();
					if (currentstatus == true) {
						lot.setEnabled(false);
						System.out.println(lot.getAddress() + " set to Disabled");
						lotVisible = "Enable";
						setLotVisible.setText(lotVisible);
					} else {
						lot.setEnabled(true);
						System.out.println(lot.getAddress() + " set to Enabled");
						lotVisible = "Disable";
						setLotVisible.setText(lotVisible);
					}
				}

			}

			// Reload page
			mainGeneralManagementPage.removeAll();
			navManagementPanel.removeAll();
			topManagementPanel.removeAll();
			mainGeneralManagementPage.setVisible(false);
			mainManagementPage();
			mainGeneralManagementPage.setVisible(true);

		}

		String monthValue = "";
		JComboBox monthlist = null;

		// Checks if the month was changed
		if (e.getSource() == month) {

			monthlist = (JComboBox) e.getSource();
			monthValue = (String) monthlist.getSelectedItem();

			// Convert month string to number 1-12
			int monthInt = 0;

			selectedMonthIndex = months.indexOf((String) month.getSelectedItem());

			mainGeneralPage.removeAll();
			navPanel.removeAll();
			topPanel.removeAll();
			bottomPanel.removeAll();
			mainGeneralPage.setVisible(false);
			mainPage();

		}

		String dayValue = "";
		JComboBox daylist = null;

		// Checks if the day was changed
		if (e.getSource() == day) {

			daylist = (JComboBox) e.getSource();
			dayValue = (String) day.getSelectedItem();

			selectedDateIndex = Integer.parseInt(dayValue) - 1;

			mainGeneralPage.removeAll();
			navPanel.removeAll();
			topPanel.removeAll();
			bottomPanel.removeAll();
			mainGeneralPage.setVisible(false);
			mainPage();

		}

		String timeValue = "";
		JComboBox timelist = null;

		// Checks if the time was changed
		if (e.getSource() == time) {

			timelist = (JComboBox) e.getSource();
			timeValue = (String) timelist.getSelectedItem();
			timeValue = timeValue.substring(0, 2);
			selectedTimeIndex = Integer.parseInt(timeValue);

			mainGeneralPage.removeAll();
			navPanel.removeAll();
			topPanel.removeAll();
			bottomPanel.removeAll();
			mainGeneralPage.setVisible(false);
			mainPage();

		}

		int value = -1;
		JButton button = null;
		Object object = e.getSource();

		// Checks if a parking spot number is chosen
		if (object instanceof JButton) {

			try {
				button = (JButton) e.getSource();
				value = Integer.parseInt(button.getText());
			} catch (NumberFormatException a) {
			}

		}

		// User chose a parking spot
		if (value >= 0 && value <= 100 && (!superManagerLoggedIn && !managerLoggedIn)) {

			String licenceplate = plateText.getText();

			if (licenceplate.equals("")) {

				licencesuccess.setForeground(Color.red);
				licencesuccess.setText("Please fill in all the fields correctly");
				System.out.println("Failed to fill in all options");

			} else {

				lotValue = (String) lots.getSelectedItem();

				Map<Integer, ParkingLot> list = psystem.getLots();
				int i = 0;
				for (ParkingLot lot : list.values()) {

					if (lot.getAddress().equals(lotValue)) {
						if (lot.getEnabled()) {
							selectedLotIndex = i;

							System.out.println("User chose: parking spot " + value);
							parkingspacenum = value - 1;
							mainGeneralPage.setVisible(false);

							paymentPage();
							Frame.add(paymentGeneralPage);
							paymentGeneralPage.setVisible(true);

							System.out.println("On payment page");

						} else { // Extra error check to prevent booking a parking space that is disabled

							selectedLotIndex = 0;
							errorLot = lot.getAddress();
							mainGeneralPage.removeAll();
							navPanel.removeAll();
							topPanel.removeAll();
							bottomPanel.removeAll();
							mainGeneralPage.setVisible(false);
							ErrorLotPage();
							errorLotPage.setVisible(true);

						}

						break;
					}

					i++;

				}

			}

		}

		// Management team chose a parking spot
		if (value >= 0 && value <= 100 && (superManagerLoggedIn || managerLoggedIn)) {

			int parkingspacenum = Integer.parseInt(button.getText());
			String lotnum = "";
			JComboBox listlot = null;

			// lotlist = (JComboBox) lots;
			lotValue = (String) lots.getSelectedItem();

			Map<Integer, ParkingLot> list = psystem.getLots();

			for (ParkingLot lot : list.values()) {

				if (lot.getAddress().equals(lotValue)) {

					// Set to disabled
					if (lot.getParkingSpace(parkingspacenum - 1).isEnabled()) {

						System.out.println(
								"Parking Space #" + parkingspacenum + " in " + lotValue + " has been disabled");
						lot.getParkingSpace(parkingspacenum - 1).setEnabled(false);
						button.setBackground(new Color(204, 0, 0));

					} else { // Set to enabled

						System.out.println("Parking Space #" + lotValue + " in " + lotValue + " has been enabled");
						lot.getParkingSpace(parkingspacenum - 1).setEnabled(true);
						button.setBackground(new Color(0, 153, 0));

					}

					break;
				}

			}

		}

	}

	public void viewActions(ActionEvent e) {

		if (e.getSource() == viewBack) {

			viewGeneralPage.removeAll();
			viewGeneralPage.setVisible(false);
			mainPage();
			mainGeneralPage.setVisible(true);
			System.out.println("Back to main menu");

		}

		if (e.getSource() == cancel) {

			System.out.println("Cancelled Reservation");
			rsystem.cancelBooking(currentuser.currentReservation, currentuser);
			currentuser.currentReservation = null;
			currentuser.parkinglot = "";
			currentuser.parkingspacenum = 0;
			viewGeneralPage.removeAll();
			viewGeneralPage.setVisible(false);
			viewBookingPage();
			viewGeneralPage.setVisible(true);

		}

		if (e.getSource() == extend) {

			
			if (one.isSelected()) {
				
				System.out.println("Adding 1 hour to reservation");
				rsystem.editBooking(currentuser.currentReservation, 1 + currentuser.currentReservation.getDuration());
				viewGeneralPage.removeAll();
				viewGeneralPage.setVisible(false);
				editbooking = true;
				paymentPage();
				paymentGeneralPage.setVisible(true);
				
				
			} else if (two.isSelected()) {

				System.out.println("Adding 2 hours to reservation");
				rsystem.editBooking(currentuser.currentReservation, 2 + currentuser.currentReservation.getDuration());
				viewGeneralPage.removeAll();
				viewGeneralPage.setVisible(false);
				editbooking = true;
				paymentPage();
				paymentGeneralPage.setVisible(true);

			}

		}

	}

	public void paymentActions(ActionEvent e) {

		if (e.getSource() == payBack) {

			System.out.println("Back to main page");

			paymentGeneralPage.setVisible(false);

			mainPage();

		}

		if (e.getSource() == pay) {

			String name = "";
			int cardNum = 0;
			int expiry = 0;
			String address = "";
			int code = 0;

			if (cardNameText.getText().equals("") || cardNumText.getText().length() == 0
					|| expiryText.getText().length() == 0 || billingText.getText().equals("")
					|| securityCodeText.getText().length() == 0) {

				paysuccess.setForeground(Color.red);
				paysuccess.setText("Please fill in all the fields correctly");
				System.out.println("Failed Payment");

			} else {

				try {

					name = cardNameText.getText();
					cardNum = Integer.parseInt(cardNumText.getText());
					expiry = Integer.parseInt(expiryText.getText());
					address = billingText.getText();
					code = Integer.parseInt(securityCodeText.getText());

					String type = "";

					Context context = new Context(null);

					if (debit.isSelected()) {

						type = "User is paying with debit";
						context = new Context(new DebitPaymentProvider());

					} else if (credit.isSelected()) {
						type = "User is paying with credit";
						context = new Context(new CreditPaymentProvide());
					}

					if (type.equals("")) {

						paysuccess.setForeground(Color.red);
						paysuccess.setText("Please fill in all the fields correctly");
						System.out.println("Failed Payment");

					} else {

						PaymentInfo paymentinfo = new PaymentInfo(cardNum, expiry, address, name, code);
						currentuser.setPaymentInfo(paymentinfo);

						System.out.println(type);
						boolean success;
						if(editbooking) {

							success = context.execute(paymentinfo, rsystem.calculateOutstanding(currentuser.currentReservation, currentuser));
							editbooking = false;
						}else {
							
							success = context.execute(paymentinfo, this.currentuser.getParkingRate());
						}

						if (success) {

							// Convert month string to number 1-12
							String monthValue = "";
							monthValue = (String) month.getSelectedItem();
							int monthInt = 0;

							ArrayList<String> months = new ArrayList<>();
							months.add("January");
							months.add("February");
							months.add("March");
							months.add("April");
							months.add("May");
							months.add("June");
							months.add("July");
							months.add("August");
							months.add("September");
							months.add("October");
							months.add("November");
							months.add("December");

							monthInt = months.indexOf(monthValue) + 1;

							int dayValue = 0;
							dayValue = Integer.parseInt((String) day.getSelectedItem());

							String timeValueString = "";
							timeValueString = (String) time.getSelectedItem();

							int timeValue = Integer.parseInt(timeValueString.substring(0, 2));

							ParkingLot lot = psystem.getLot(selectedLotIndex + 1);
							System.out.println("Creating Reservation in " + lot.getAddress());
							System.out.println("Adding reservation to Parking Space " + parkingspacenum);

							currentuser.parkinglot = lot.getAddress();
							currentuser.parkingspacenum = parkingspacenum;

							Reservation reservation = rsystem.createReservation(currentuser, 1, monthInt, dayValue,
									timeValue, plateText.getText(), lot.getParkingSpace(parkingspacenum), context);

							paymentGeneralPage.setVisible(false);

							confirmedBookingPage();
							Frame.add(confirmationGeneralPage);
							confirmationGeneralPage.setVisible(true);

						} else {
							paysuccess.setForeground(Color.red);
							paysuccess.setText("Please fill in all the fields correctly");
							System.out.println("Failed Payment");
						}

					}

				} catch (NumberFormatException a) {

					paysuccess.setForeground(Color.red);
					paysuccess.setText("Please fill in all the fields correctly");
					System.out.println("Failed Payment");

				}

			}

		}

	}

	public void confirmActions(ActionEvent e) {

		if (e.getSource() == confirm) {

			confirmationGeneralPage.setVisible(false);
			selectedMonthIndex = 0;
			selectedDateIndex = 0;
			selectedTimeIndex = 0;
			selectedLotIndex = 0;

			mainPage();

		}

	}

	public void errorActions(ActionEvent e) {

		if (e.getSource() == returntomain) {

			errorLotPage.setVisible(false);
			selectedMonthIndex = 0;
			selectedDateIndex = 0;
			selectedTimeIndex = 0;
			selectedLotIndex = 0;

			mainPage();

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		loginActions(e);

		try {
			registerActions(e);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			mainActions(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		viewActions(e);

		paymentActions(e);

		confirmActions(e);

		errorActions(e);

	}

}
