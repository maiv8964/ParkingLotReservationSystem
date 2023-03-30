import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        int int2 = csvReader1.getEscapeMode();
        boolean boolean3 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.toString();
        java.lang.String str11 = user6.toString();
        java.lang.String str12 = user6.getFName();
        user6.setPassword("password_112325847983500");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str11, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        reservationSystemFacade0.editBooking(reservation11, (int) (byte) 100);
        java.lang.String str14 = reservation11.getPlate();
        int int15 = reservation11.getMonth();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setTextQualifier(' ');
        char char10 = csvWriter1.getDelimiter();
        boolean boolean11 = csvWriter1.getUseTextQualifier();
        csvWriter1.close();
        csvWriter1.setUseTextQualifier(false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getRecordDelimiter();
        char char5 = csvWriter1.getComment();
        csvWriter1.setDelimiter(' ');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider2 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int9 = paymentInfo8.getSecurityCode();
        java.lang.String str10 = paymentInfo8.getBillingAddress();
        java.util.Date date12 = null;
        paymentInfo8.parkingInfo(0, date12, "hi!", "hi!", (int) (short) 1);
        boolean boolean18 = mobilePaymentProvider2.handlePayment(paymentInfo8, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo24 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        boolean boolean26 = mobilePaymentProvider2.handlePayment(paymentInfo24, (double) (-1.0f));
        boolean boolean28 = debitPaymentProvider0.handlePayment(paymentInfo24, (double) 0);
        java.lang.String str29 = paymentInfo24.getBillingName();
        java.lang.String str30 = paymentInfo24.getBillingName();
        paymentInfo24.setCardBallance(1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FALSE" + "'", str29, "FALSE");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FALSE" + "'", str30, "FALSE");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        boolean boolean8 = csvWriter1.getUseTextQualifier();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        user6.type = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str19 = user6.email;
        user6.setEmail("password_112312047073100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.fname = "";
        java.lang.String str12 = user6.toString();
        java.lang.String str13 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.setEmail("hi!");
        user6.isValidated = false;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        users.FacultyMember facultyMember2 = new users.FacultyMember("manager_112327586653400", "manager_112327586653400");
        facultyMember2.parkingspacenum = 100;
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("password_112359916102100", '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        char char3 = csvWriter1.getComment();
        csvWriter1.setComment('\000');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        char char5 = csvReader1.getDelimiter();
        csvReader1.setDelimiter('4');
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.getSafetySwitch();
        java.lang.String str11 = csvReader1.get("password_112338187831000");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.path = "admin";
        java.util.ArrayList<userLogin.User> userList3 = null;
        maintainUser0.users = userList3;
        java.lang.String str5 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = superManager0.firstName;
        users.FacultyMember facultyMember7 = new users.FacultyMember("", "hi!");
        int int8 = facultyMember7.parkingspacenum;
        facultyMember7.parkinglot = "hi!";
        java.lang.String str11 = facultyMember7.getPassword();
        boolean boolean12 = superManager0.validateUser((users.UserInfo) facultyMember7);
        superManager0.firstName = "password_112358838017900";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        boolean boolean9 = csvReader1.getUseComments();
        char char10 = csvReader1.getDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        parkingState.Disabled disabled0 = new parkingState.Disabled();
        java.lang.String str1 = disabled0.handleState();
        java.lang.String str2 = disabled0.handleState();
        java.lang.String str3 = disabled0.handleState();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        char char10 = csvWriter1.getRecordDelimiter();
        csvWriter1.setRecordDelimiter('a');
        com.csvreader.CsvWriter csvWriter14 = new com.csvreader.CsvWriter("");
        csvWriter14.setRecordDelimiter('\"');
        csvWriter14.setTextQualifier('\"');
        char char19 = csvWriter14.getComment();
        boolean boolean20 = csvWriter14.getUseTextQualifier();
        char char21 = csvWriter14.getRecordDelimiter();
        com.csvreader.CsvWriter csvWriter23 = new com.csvreader.CsvWriter("");
        boolean boolean24 = csvWriter23.getUseTextQualifier();
        com.csvreader.CsvReader csvReader26 = com.csvreader.CsvReader.parse("hi!");
        char char27 = csvReader26.getComment();
        char char28 = csvReader26.getTextQualifier();
        java.lang.String[] strArray29 = csvReader26.getHeaders();
        java.lang.String[] strArray30 = csvReader26.getValues();
        csvWriter23.writeRecord(strArray30);
        csvWriter14.writeRecord(strArray30, false);
        csvWriter1.writeRecord(strArray30, false);
        boolean boolean36 = csvWriter1.getUseTextQualifier();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '#' + "'", char19 == '#');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\"' + "'", char21 == '\"');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(csvReader26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '#' + "'", char27 == '#');
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\"' + "'", char28 == '\"');
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parkingSpace7.setEnabled(false);
        parkingState.State state10 = parkingSpace7.getSensorStatus();
        parkingSpace7.setId((int) (byte) -1);
        java.util.ArrayList<reservations.Reservation> reservationList13 = parkingSpace7.getReservations();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        users.Visitor visitor2 = new users.Visitor("", "");
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) '#', (int) (short) -1, "password_112284545599300", "password_112284545599300", (int) (short) 1);
        visitor2.setPaymentInfo(paymentInfo8);
        paymentStrategy.PaymentInfo paymentInfo10 = visitor2.getPaymentInfo();
        int int11 = visitor2.getParkingRate();
        org.junit.Assert.assertNotNull(paymentInfo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        reservations.ReservationSystemFacade reservationSystemFacade5 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap6 = reservationSystemFacade5.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade7 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot15 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace17 = parkingLot15.getParkingSpace((int) ' ');
        reservations.Reservation reservation18 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace17);
        users.FacultyMember facultyMember21 = new users.FacultyMember("", "hi!");
        int int22 = facultyMember21.parkingspacenum;
        int int23 = reservationSystemFacade7.calculateOutstanding(reservation18, (users.UserInfo) facultyMember21);
        manager.SuperManager superManager24 = manager.SuperManager.getInstance();
        java.lang.String str25 = superManager24.firstName;
        users.Student student28 = new users.Student("", "hi!");
        boolean boolean29 = superManager24.validateUser((users.UserInfo) student28);
        paymentStrategy.PaymentInfo paymentInfo30 = student28.getPaymentInfo();
        student28.setValid();
        int int32 = reservationSystemFacade5.calculateOutstanding(reservation18, (users.UserInfo) student28);
        users.NonFacultyStaff nonFacultyStaff35 = new users.NonFacultyStaff("", "");
        int int36 = nonFacultyStaff35.parkingspacenum;
        parking.ParkingLot parkingLot44 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace46 = parkingLot44.getParkingSpace((int) ' ');
        reservations.Reservation reservation47 = null;
        parkingSpace46.setReservation(reservation47);
        paymentStrategy.OtherTypeProvider otherTypeProvider49 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context50 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider49);
        paymentStrategy.PaymentInfo paymentInfo56 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo56.setBillingName("FALSE");
        paymentInfo56.setCardNum(1);
        boolean boolean62 = context50.execute(paymentInfo56, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo68 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int69 = paymentInfo68.getSecurityCode();
        java.lang.String str70 = paymentInfo68.getBillingAddress();
        java.util.Date date72 = null;
        paymentInfo68.parkingInfo(0, date72, "hi!", "hi!", (int) (short) 1);
        int int77 = paymentInfo68.getExpDate();
        boolean boolean79 = context50.execute(paymentInfo68, (double) 5);
        reservations.Reservation reservation80 = reservationSystemFacade5.createReservation((users.UserInfo) nonFacultyStaff35, 32, 5, (int) (short) -1, (int) (byte) 10, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace46, context50);
        reservations.Reservation reservation81 = new reservations.Reservation(97, 1, (int) (byte) 10, (int) ',', "User [name= FALSE, id=1, email=hi!, password=hi!]", parkingSpace46);
        parkingSpace46.setId(0);
        int int84 = parkingSpace46.getId();
        org.junit.Assert.assertNotNull(reservationSystemFacade5);
        org.junit.Assert.assertNotNull(intMap6);
        org.junit.Assert.assertNotNull(reservationSystemFacade7);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(superManager24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "password_112358838017900" + "'", str25, "password_112358838017900");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(paymentInfo30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(parkingSpace46);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 97 + "'", int69 == 97);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(reservation80);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        student4.setValid();
        java.lang.String str8 = student4.parkinglot;
        java.lang.String str9 = student4.parkinglot;
        student4.parkinglot = "FALSE";
        java.lang.String str12 = student4.getPassword();
        java.lang.String str13 = student4.parkinglot;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "password_112358838017900" + "'", str1, "password_112358838017900");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getEmail();
        java.lang.String str10 = user6.getFName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        superManager0.firstName = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]";
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        boolean boolean3 = csvReader1.skipRecord();
        char char4 = csvReader1.getTextQualifier();
        boolean boolean6 = csvReader1.isQualified((int) (byte) 1);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        reservations.Reservation reservation17 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace16);
        reservationSystemFacade6.editBooking(reservation17, (int) (byte) 100);
        facultyMember2.currentReservation = reservation17;
        parking.ParkingSpace parkingSpace21 = reservation17.getSpace();
        int int22 = reservation17.getDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.email = "User [name= hi!, id=97, email=hi!, password=admin]";
        user6.password = "password_112354709083600";
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        parking.ParkingSystem parkingSystem5 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace8 = parkingSystem5.getParkingSpace(10, (int) (byte) 1);
        boolean boolean10 = false; // flaky: parkingSystem5.isLotEnabled(0);
        parking.ParkingSpace parkingSpace13 = null; // flaky: parkingSystem5.getParkingSpace(0, 0);
// flaky:         parkingSpace13.setEnabled(false);
        reservations.Reservation reservation16 = new reservations.Reservation((int) (byte) -1, 8, (int) 'a', 264, "User [name= hi!, id=97, email=hi!, password=]", parkingSpace13);
        parking.ParkingSpace parkingSpace17 = reservation16.getSpace();
        org.junit.Assert.assertNotNull(parkingSystem5);
        org.junit.Assert.assertNotNull(parkingSpace8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace13);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace17);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        char char10 = csvWriter1.getRecordDelimiter();
        csvWriter1.setRecordDelimiter('a');
        com.csvreader.CsvWriter csvWriter14 = new com.csvreader.CsvWriter("");
        csvWriter14.setRecordDelimiter('\"');
        csvWriter14.setTextQualifier('\"');
        char char19 = csvWriter14.getComment();
        boolean boolean20 = csvWriter14.getUseTextQualifier();
        char char21 = csvWriter14.getRecordDelimiter();
        com.csvreader.CsvWriter csvWriter23 = new com.csvreader.CsvWriter("");
        boolean boolean24 = csvWriter23.getUseTextQualifier();
        com.csvreader.CsvReader csvReader26 = com.csvreader.CsvReader.parse("hi!");
        char char27 = csvReader26.getComment();
        char char28 = csvReader26.getTextQualifier();
        java.lang.String[] strArray29 = csvReader26.getHeaders();
        java.lang.String[] strArray30 = csvReader26.getValues();
        csvWriter23.writeRecord(strArray30);
        csvWriter14.writeRecord(strArray30, false);
        csvWriter1.writeRecord(strArray30, false);
        csvWriter1.setTextQualifier(' ');
        csvWriter1.setComment('a');
        csvWriter1.setRecordDelimiter(' ');
        char char42 = csvWriter1.getComment();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '#' + "'", char19 == '#');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\"' + "'", char21 == '\"');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(csvReader26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '#' + "'", char27 == '#');
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\"' + "'", char28 == '\"');
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + 'a' + "'", char42 == 'a');
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        parkingState.State state16 = parkingSpace14.getSensorStatus();
        parkingState.State state17 = parkingSpace14.getSensorStatus();
        int int18 = parkingSpace14.getId();
        reservations.Reservation reservation19 = new reservations.Reservation((int) (byte) 0, 8, (int) (byte) -1, 1, "password_112284545599300", parkingSpace14);
        int int20 = reservation19.getStartTime();
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=hi!, password=]", "");
        manager2.lastName = "FALSE";
        java.lang.String str5 = manager2.lastName;
        manager2.firstName = "manager_112369653203000";
        manager2.setUsername("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FALSE" + "'", str5, "FALSE");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        userLogin.User user6 = new userLogin.User("admin", "password_112338187831000", (int) (short) 100, "Password!23", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("password_112296757334200", "hi!");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str4 = superManager0.lastName;
        java.lang.String str5 = superManager0.getUsername();
        manager.Manager manager6 = superManager0.autoGenerator();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FALSE" + "'", str4, "FALSE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(manager6);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        manager.Manager manager2 = new manager.Manager("admin", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        java.lang.String str3 = manager2.lastName;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        java.lang.String str15 = user6.getEmail();
        user6.setId((int) (short) 1);
        user6.fname = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]";
        user6.id = 2;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("FALSE");
        csvReader1.setUseComments(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getValidation();
        boolean boolean13 = user6.isValidated;
        user6.fname = "User [name= FALSE, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user6.email;
        user6.setId((int) '4');
        java.lang.String str19 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        int int8 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        java.lang.String[] strArray10 = csvReader1.getValues();
        csvReader1.setSafetySwitch(true);
        java.lang.String str14 = csvReader1.get((int) (short) 0);
        int int15 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("FALSE");
        java.lang.String str9 = csvReader1.getHeader(264);
        csvReader1.setSafetySwitch(true);
        boolean boolean12 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade2 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((int) ' ');
        reservations.Reservation reservation13 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace12);
        users.FacultyMember facultyMember16 = new users.FacultyMember("", "hi!");
        int int17 = facultyMember16.parkingspacenum;
        int int18 = reservationSystemFacade2.calculateOutstanding(reservation13, (users.UserInfo) facultyMember16);
        users.Student student21 = new users.Student("", "hi!");
        int int22 = student21.getParkingRate();
        reservationSystemFacade0.cancelBooking(reservation13, (users.UserInfo) student21);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap24 = reservationSystemFacade0.getLots();
        users.Student student27 = new users.Student("hi!", "User [name= FALSE, id=97, email=, password=]");
        parking.ParkingLot parkingLot40 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace42 = parkingLot40.getParkingSpace((int) ' ');
        reservations.Reservation reservation43 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace42);
        int int44 = reservation43.getDay();
        reservation43.updateDuration(2);
        parking.ParkingSpace parkingSpace47 = reservation43.getSpace();
        parking.ParkingSpace parkingSpace48 = reservation43.getSpace();
        reservations.ReservationSystemFacade reservationSystemFacade49 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap50 = reservationSystemFacade49.getLots();
        parking.ParkingLot parkingLot58 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace60 = parkingLot58.getParkingSpace((int) ' ');
        reservations.Reservation reservation61 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace60);
        int int62 = reservation61.getDay();
        int int63 = reservation61.getDuration();
        users.FacultyMember facultyMember66 = new users.FacultyMember("", "hi!");
        int int67 = facultyMember66.parkingspacenum;
        int int68 = facultyMember66.getParkingRate();
        paymentStrategy.CreditPaymentProvide creditPaymentProvide69 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider70 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo76 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo76.setBillingName("FALSE");
        boolean boolean80 = otherTypeProvider70.handlePayment(paymentInfo76, (double) (short) 1);
        boolean boolean82 = creditPaymentProvide69.handlePayment(paymentInfo76, (double) (short) 0);
        reservationSystemFacade49.payBalance(reservation61, (users.UserInfo) facultyMember66, (paymentStrategy.PaymentProvider) creditPaymentProvide69);
        paymentStrategy.Context context84 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) creditPaymentProvide69);
        reservations.Reservation reservation85 = reservationSystemFacade0.createReservation((users.UserInfo) student27, (int) 'a', 768, (int) 'a', 10, "User [name= FALSE, id=97, email=hi!, password=hi!]", parkingSpace48, context84);
        int int86 = student27.getParkingRate();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intMap24);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(parkingSpace47);
        org.junit.Assert.assertNotNull(parkingSpace48);
        org.junit.Assert.assertNotNull(reservationSystemFacade49);
        org.junit.Assert.assertNotNull(intMap50);
        org.junit.Assert.assertNotNull(parkingSpace60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8 + "'", int68 == 8);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(reservation85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 5 + "'", int86 == 5);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) ' ');
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot(0, "FALSE");
        parking.ParkingSpace parkingSpace8 = parkingLot6.getParkingSpace((int) '#');
        int int9 = parkingLot6.getId();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertNotNull(parkingSpace8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        char char9 = csvWriter1.getDelimiter();
        boolean boolean10 = csvWriter1.getForceQualifier();
        boolean boolean11 = csvWriter1.getForceQualifier();
        csvWriter1.setComment('4');
        com.csvreader.CsvReader csvReader15 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean16 = csvReader15.readRecord();
        csvReader15.setSafetySwitch(true);
        java.lang.String[] strArray19 = csvReader15.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray19);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(csvReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        boolean boolean10 = csvReader1.skipLine();
        boolean boolean12 = csvReader1.isQualified(0);
        int int13 = csvReader1.getHeaderCount();
        boolean boolean14 = csvReader1.getSafetySwitch();
        char char15 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\"' + "'", char15 == '\"');
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot4 = parkingSystem0.getLot((int) '\000');
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot(100);
        parking.ParkingLot parkingLot8 = parkingSystem0.getLot(34);
        parking.ParkingLot parkingLot10 = parkingSystem0.getLot(0);
        parking.ParkingLot parkingLot12 = parkingSystem0.getLot(97);
        parking.ParkingLot parkingLot14 = parkingSystem0.getLot(0);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot4);
// flaky:         org.junit.Assert.assertNotNull(parkingLot6);
// flaky:         org.junit.Assert.assertNotNull(parkingLot8);
        org.junit.Assert.assertNotNull(parkingLot10);
// flaky:         org.junit.Assert.assertNotNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingLot14);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        parkingState.State state16 = parkingSpace14.getSensorStatus();
        reservations.Reservation reservation17 = new reservations.Reservation((int) (byte) 0, 2, (int) (byte) 0, 2, "admin", parkingSpace14);
        int int18 = reservation17.getMonth();
        java.lang.String str19 = reservation17.getPlate();
        parking.ParkingSpace parkingSpace20 = reservation17.getSpace();
        parkingState.State state21 = parkingSpace20.getSensorStatus();
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertNotNull(state21);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        csvWriter1.writeComment("User [name= hi!, id=97, email=hi!, password=hi!]");
        char char4 = csvWriter1.getDelimiter();
        com.csvreader.CsvReader csvReader6 = com.csvreader.CsvReader.parse("hi!");
        char char7 = csvReader6.getComment();
        char char8 = csvReader6.getTextQualifier();
        java.lang.String str10 = csvReader6.get(8);
        csvReader6.setDelimiter('\"');
        char char13 = csvReader6.getTextQualifier();
        char char14 = csvReader6.getRecordDelimiter();
        java.lang.String str16 = csvReader6.get(8);
        boolean boolean17 = csvReader6.getSafetySwitch();
        csvReader6.setComment('\000');
        long long20 = csvReader6.getCurrentRecord();
        com.csvreader.CsvWriter csvWriter22 = new com.csvreader.CsvWriter("");
        csvWriter22.setRecordDelimiter('\"');
        char char25 = csvWriter22.getDelimiter();
        csvWriter22.setUseTextQualifier(false);
        com.csvreader.CsvWriter csvWriter29 = new com.csvreader.CsvWriter("");
        csvWriter29.setRecordDelimiter('\"');
        csvWriter29.setTextQualifier('\"');
        char char34 = csvWriter29.getComment();
        csvWriter29.setUseTextQualifier(true);
        char char37 = csvWriter29.getRecordDelimiter();
        char char38 = csvWriter29.getComment();
        com.csvreader.CsvReader csvReader40 = com.csvreader.CsvReader.parse("hi!");
        char char41 = csvReader40.getComment();
        char char42 = csvReader40.getTextQualifier();
        java.lang.String[] strArray43 = csvReader40.getHeaders();
        java.lang.String[] strArray44 = csvReader40.getValues();
        csvWriter29.writeRecord(strArray44, false);
        csvWriter22.writeRecord(strArray44, false);
        csvReader6.setHeaders(strArray44);
        csvWriter1.writeRecord(strArray44, true);
        csvWriter1.setRecordDelimiter('a');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertNotNull(csvReader6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\"' + "'", char13 == '\"');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + ',' + "'", char25 == ',');
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '#' + "'", char34 == '#');
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\"' + "'", char37 == '\"');
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '#' + "'", char38 == '#');
        org.junit.Assert.assertNotNull(csvReader40);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '#' + "'", char41 == '#');
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '\"' + "'", char42 == '\"');
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=hi!, password=]", "");
        manager2.lastName = "FALSE";
        manager2.lastName = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str7 = manager2.lastName;
        java.lang.String str8 = manager2.lastName;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]" + "'", str7, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]" + "'", str8, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        reservations.Reservation reservation5 = null;
        parkingSpace4.setReservation(reservation5);
        parkingSpace4.setId(10);
        parkingState.State state9 = parkingSpace4.getSensorStatus();
        java.lang.String str10 = state9.handleState();
        java.lang.String str11 = state9.handleState();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertNotNull(state9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.type;
        user6.setEmail("Password!23");
        user6.setName("User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]", "password_112338187831000");
        user6.fname = "password_112368470689200";
        user6.setValidation("User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        java.lang.String str6 = csvReader1.get(97);
        csvReader1.setRecordDelimiter('\"');
        csvReader1.close();
        boolean boolean10 = csvReader1.getSkipEmptyRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = csvReader1.isQualified((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        users.FacultyMember facultyMember4 = new users.FacultyMember("", "hi!");
        int int5 = facultyMember4.parkingspacenum;
        facultyMember4.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade8 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot16 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace18 = parkingLot16.getParkingSpace((int) ' ');
        reservations.Reservation reservation19 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace18);
        reservationSystemFacade8.editBooking(reservation19, (int) (byte) 100);
        facultyMember4.currentReservation = reservation19;
        int int23 = reservation19.getMonth();
        reservationSystemFacade0.editBooking(reservation19, (int) (byte) 100);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap26 = reservationSystemFacade0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap27 = reservationSystemFacade0.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade28 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap29 = reservationSystemFacade28.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade30 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot38 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace40 = parkingLot38.getParkingSpace((int) ' ');
        reservations.Reservation reservation41 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace40);
        users.FacultyMember facultyMember44 = new users.FacultyMember("", "hi!");
        int int45 = facultyMember44.parkingspacenum;
        int int46 = reservationSystemFacade30.calculateOutstanding(reservation41, (users.UserInfo) facultyMember44);
        users.Student student49 = new users.Student("", "hi!");
        int int50 = student49.getParkingRate();
        reservationSystemFacade28.cancelBooking(reservation41, (users.UserInfo) student49);
        int int52 = reservation41.getStartTime();
        int int53 = reservation41.getMonth();
        users.NonFacultyStaff nonFacultyStaff56 = new users.NonFacultyStaff("hi!", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        reservations.Reservation reservation57 = nonFacultyStaff56.currentReservation;
        int int58 = nonFacultyStaff56.getParkingRate();
        paymentStrategy.DebitPaymentProvider debitPaymentProvider59 = new paymentStrategy.DebitPaymentProvider();
        reservationSystemFacade0.payBalance(reservation41, (users.UserInfo) nonFacultyStaff56, (paymentStrategy.PaymentProvider) debitPaymentProvider59);
        int int61 = reservation41.getDuration();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intMap26);
        org.junit.Assert.assertNotNull(intMap27);
        org.junit.Assert.assertNotNull(reservationSystemFacade28);
        org.junit.Assert.assertNotNull(intMap29);
        org.junit.Assert.assertNotNull(reservationSystemFacade30);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(reservation57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }
}
