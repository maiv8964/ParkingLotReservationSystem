import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("password_112306347644100");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112306347644100 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        superManager0.lastName = "hi!";
        superManager0.lastName = "FALSE";
        reservations.ReservationSystemFacade reservationSystemFacade7 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap8 = reservationSystemFacade7.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade9 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace19 = parkingLot17.getParkingSpace((int) ' ');
        reservations.Reservation reservation20 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace19);
        users.FacultyMember facultyMember23 = new users.FacultyMember("", "hi!");
        int int24 = facultyMember23.parkingspacenum;
        int int25 = reservationSystemFacade9.calculateOutstanding(reservation20, (users.UserInfo) facultyMember23);
        manager.SuperManager superManager26 = manager.SuperManager.getInstance();
        java.lang.String str27 = superManager26.firstName;
        users.Student student30 = new users.Student("", "hi!");
        boolean boolean31 = superManager26.validateUser((users.UserInfo) student30);
        paymentStrategy.PaymentInfo paymentInfo32 = student30.getPaymentInfo();
        student30.setValid();
        int int34 = reservationSystemFacade7.calculateOutstanding(reservation20, (users.UserInfo) student30);
        java.lang.String str35 = student30.getPassword();
        boolean boolean36 = superManager0.validateUser((users.UserInfo) student30);
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(reservationSystemFacade7);
        org.junit.Assert.assertNotNull(intMap8);
        org.junit.Assert.assertNotNull(reservationSystemFacade9);
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(superManager26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(paymentInfo32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        userLogin.User user6 = new userLogin.User("User [name= hi!, id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]", (-1), "password_112284545599300", "admin", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        user6.setType("Password!23");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        user6.fname = "FALSE";
        user6.email = "admin";
        user6.isValidated = true;
        java.lang.String str14 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        reservations.Reservation reservation17 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace16);
        reservationSystemFacade6.editBooking(reservation17, (int) (byte) 100);
        facultyMember2.currentReservation = reservation17;
        java.lang.String str21 = facultyMember2.getPassword();
        java.lang.String str22 = facultyMember2.getEmail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.fname = "";
        user6.setPassword("password_112284545599300");
        user6.isValidated = true;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot7 = parkingSystem0.addLot(5, "admin");
        parking.ParkingLot parkingLot9 = parkingSystem0.getLot((int) ',');
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertNotNull(parkingLot7);
        org.junit.Assert.assertNull(parkingLot9);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("FALSE", "password_112310734370300", "password_112296757334200");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) (byte) 10, "password_112284545599300");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = creditPaymentProvide0.handlePayment(paymentInfo6, (double) 8);
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int23 = paymentInfo22.getSecurityCode();
        java.lang.String str24 = paymentInfo22.getBillingAddress();
        java.lang.String str25 = paymentInfo22.getBillingAddress();
        boolean boolean27 = creditPaymentProvide0.handlePayment(paymentInfo22, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String[] strArray7 = csvReader1.getValues();
        int int8 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        reservations.Reservation reservation7 = student4.currentReservation;
        student4.parkingspacenum = 264;
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(reservation7);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("", "hi!", "FALSE");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name= hi!, id=97, email=hi!, password=admin]", "User [name= hi!, id=97, email=hi!, password=]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=]", "FALSE", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        users.UserInfo userInfo16 = userInfoFactory0.makeUser("", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
        org.junit.Assert.assertNull(userInfo16);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        java.lang.String str17 = user6.getFName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        csvReader1.setDelimiter('4');
        csvReader1.setSafetySwitch(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        boolean boolean7 = user6.isValidated;
        user6.type = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]";
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        manager.Manager manager2 = new manager.Manager("", "admin");
        java.lang.String str3 = manager2.getUsername();
        manager2.lastName = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        csvReader1.close();
        csvReader1.setTextQualifier('\"');
        csvReader1.setSafetySwitch(true);
        char char7 = csvReader1.getTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = csvReader1.isQualified(5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str9 = csvReader1.getRawRecord();
        boolean boolean10 = csvReader1.getTrimWhitespace();
        int int11 = csvReader1.getColumnCount();
        boolean boolean12 = csvReader1.getTrimWhitespace();
        java.lang.String str14 = csvReader1.get("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        csvReader1.setUseTextQualifier(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) 100, (int) (byte) 1, "", "admin", (int) ' ');
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        java.lang.String str12 = reservation11.getPlate();
        int int13 = reservation11.getMonth();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password!23" + "'", str12, "Password!23");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        csvWriter1.setForceQualifier(true);
        int int12 = csvWriter1.getEscapeMode();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("password_112310734370300");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        users.UserList userList0 = new users.UserList();
        java.util.ArrayList<users.UserInfo> userInfoList1 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList2 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList3 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList4 = userList0.getList();
        java.lang.Class<?> wildcardClass5 = userList0.getClass();
        org.junit.Assert.assertNotNull(userInfoList1);
        org.junit.Assert.assertNotNull(userInfoList2);
        org.junit.Assert.assertNotNull(userInfoList3);
        org.junit.Assert.assertNotNull(userInfoList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        int int7 = paymentInfo5.getSecurityCode();
        double double8 = paymentInfo5.getCardBallance();
        int int9 = paymentInfo5.getExpDate();
        paymentInfo5.setBillingAddress("hi!");
        int int12 = paymentInfo5.getExpDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        reservations.ReservationSystemFacade reservationSystemFacade11 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap12 = reservationSystemFacade11.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade13 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot21 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace23 = parkingLot21.getParkingSpace((int) ' ');
        reservations.Reservation reservation24 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace23);
        users.FacultyMember facultyMember27 = new users.FacultyMember("", "hi!");
        int int28 = facultyMember27.parkingspacenum;
        int int29 = reservationSystemFacade13.calculateOutstanding(reservation24, (users.UserInfo) facultyMember27);
        users.Student student32 = new users.Student("", "hi!");
        int int33 = student32.getParkingRate();
        reservationSystemFacade11.cancelBooking(reservation24, (users.UserInfo) student32);
        int int35 = reservation24.getDay();
        int int36 = reservation24.getDay();
        parking.ParkingSpace parkingSpace37 = reservation24.getSpace();
        parkingSpace9.setReservation(reservation24);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(reservationSystemFacade11);
        org.junit.Assert.assertNotNull(intMap12);
        org.junit.Assert.assertNotNull(reservationSystemFacade13);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(parkingSpace37);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "User [name= FALSE, id=97, email=, password=]");
        java.lang.String str3 = nonFacultyStaff2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name= FALSE, id=97, email=, password=]" + "'", str3, "User [name= FALSE, id=97, email=, password=]");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.csvreader.CsvReader csvReader2 = null; // flaky: new com.csvreader.CsvReader("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", 'a');
        com.csvreader.CsvReader csvReader4 = com.csvreader.CsvReader.parse("hi!");
        char char5 = csvReader4.getComment();
        char char6 = csvReader4.getTextQualifier();
        java.lang.String[] strArray7 = csvReader4.getHeaders();
        java.lang.String[] strArray8 = csvReader4.getValues();
// flaky:         csvReader2.setHeaders(strArray8);
        org.junit.Assert.assertNotNull(csvReader4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        boolean boolean5 = false; // flaky: parkingSystem0.isLotEnabled((int) (byte) 10);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        java.lang.String str3 = superManager0.getPassword();
        superManager0.setPassword("password_112306347644100");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        char char10 = csvWriter1.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("", "hi!");
        java.lang.String str3 = nonFacultyStaff2.getEmail();
        boolean boolean4 = nonFacultyStaff2.getIsValid();
        nonFacultyStaff2.parkingspacenum = 0;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setPassword("admin");
        java.lang.String str11 = user6.toString();
        user6.fname = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        user6.setId(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str11, "User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        boolean boolean10 = csvReader1.getTrimWhitespace();
        long long11 = csvReader1.getCurrentRecord();
        boolean boolean12 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        manager.Manager manager2 = new manager.Manager("manager_112305914121600", "");
        reservations.ReservationSystemFacade reservationSystemFacade3 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot11 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace13 = parkingLot11.getParkingSpace((int) ' ');
        reservations.Reservation reservation14 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace13);
        int int15 = reservation14.getDay();
        int int16 = reservation14.getDuration();
        reservations.ReservationSystemFacade reservationSystemFacade17 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap18 = reservationSystemFacade17.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade19 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot27 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace29 = parkingLot27.getParkingSpace((int) ' ');
        reservations.Reservation reservation30 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace29);
        users.FacultyMember facultyMember33 = new users.FacultyMember("", "hi!");
        int int34 = facultyMember33.parkingspacenum;
        int int35 = reservationSystemFacade19.calculateOutstanding(reservation30, (users.UserInfo) facultyMember33);
        manager.SuperManager superManager36 = manager.SuperManager.getInstance();
        java.lang.String str37 = superManager36.firstName;
        users.Student student40 = new users.Student("", "hi!");
        boolean boolean41 = superManager36.validateUser((users.UserInfo) student40);
        paymentStrategy.PaymentInfo paymentInfo42 = student40.getPaymentInfo();
        student40.setValid();
        int int44 = reservationSystemFacade17.calculateOutstanding(reservation30, (users.UserInfo) student40);
        reservationSystemFacade3.cancelBooking(reservation14, (users.UserInfo) student40);
        reservations.Reservation reservation46 = student40.currentReservation;
        java.lang.String str47 = student40.getEmail();
        boolean boolean48 = manager2.validateUser((users.UserInfo) student40);
        org.junit.Assert.assertNotNull(reservationSystemFacade3);
        org.junit.Assert.assertNotNull(parkingSpace13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(reservationSystemFacade17);
        org.junit.Assert.assertNotNull(intMap18);
        org.junit.Assert.assertNotNull(reservationSystemFacade19);
        org.junit.Assert.assertNotNull(parkingSpace29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(superManager36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(paymentInfo42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(reservation46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        boolean boolean6 = parkingLot5.getEnabled();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        user6.setPassword("Password!23");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.getValidation();
        java.lang.String str13 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str13, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingSpace4.isEnabled();
        java.util.ArrayList<reservations.Reservation> reservationList6 = parkingSpace4.getReservations();
        parkingSpace4.setEnabled(false);
        reservations.ReservationSystemFacade reservationSystemFacade9 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap10 = reservationSystemFacade9.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade11 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot19 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace21 = parkingLot19.getParkingSpace((int) ' ');
        reservations.Reservation reservation22 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace21);
        users.FacultyMember facultyMember25 = new users.FacultyMember("", "hi!");
        int int26 = facultyMember25.parkingspacenum;
        int int27 = reservationSystemFacade11.calculateOutstanding(reservation22, (users.UserInfo) facultyMember25);
        manager.SuperManager superManager28 = manager.SuperManager.getInstance();
        java.lang.String str29 = superManager28.firstName;
        users.Student student32 = new users.Student("", "hi!");
        boolean boolean33 = superManager28.validateUser((users.UserInfo) student32);
        paymentStrategy.PaymentInfo paymentInfo34 = student32.getPaymentInfo();
        student32.setValid();
        int int36 = reservationSystemFacade9.calculateOutstanding(reservation22, (users.UserInfo) student32);
        reservations.ReservationSystemFacade reservationSystemFacade37 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot45 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace47 = parkingLot45.getParkingSpace((int) ' ');
        reservations.Reservation reservation48 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace47);
        users.FacultyMember facultyMember51 = new users.FacultyMember("", "hi!");
        int int52 = facultyMember51.parkingspacenum;
        int int53 = reservationSystemFacade37.calculateOutstanding(reservation48, (users.UserInfo) facultyMember51);
        reservationSystemFacade9.editBooking(reservation48, (int) (short) -1);
        reservations.ReservationSystemFacade reservationSystemFacade56 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot64 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace66 = parkingLot64.getParkingSpace((int) ' ');
        reservations.Reservation reservation67 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace66);
        users.FacultyMember facultyMember70 = new users.FacultyMember("", "hi!");
        int int71 = facultyMember70.parkingspacenum;
        int int72 = reservationSystemFacade56.calculateOutstanding(reservation67, (users.UserInfo) facultyMember70);
        reservation67.updateDuration((int) ' ');
        reservationSystemFacade9.editBooking(reservation67, (int) (short) 100);
        parkingSpace4.setReservation(reservation67);
        int int78 = reservation67.getStartTime();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationSystemFacade9);
        org.junit.Assert.assertNotNull(intMap10);
        org.junit.Assert.assertNotNull(reservationSystemFacade11);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(superManager28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(paymentInfo34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade37);
        org.junit.Assert.assertNotNull(parkingSpace47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade56);
        org.junit.Assert.assertNotNull(parkingSpace66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parkingLot2.setEnabled(true);
        java.lang.String str5 = parkingLot2.getAddress();
        // The following exception was thrown during execution in test generation
        try {
            parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid space id");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        reservations.Reservation reservation17 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace16);
        reservationSystemFacade6.editBooking(reservation17, (int) (byte) 100);
        facultyMember2.currentReservation = reservation17;
        java.lang.String str21 = facultyMember2.getPassword();
        facultyMember2.parkinglot = "Password!23";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getColumnCount();
        int int8 = csvReader1.getEscapeMode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = csvReader1.readRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setComment('4');
        boolean boolean7 = csvReader1.skipLine();
        long long8 = csvReader1.getCurrentRecord();
        char char9 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        parkingState.Occupied occupied1 = new parkingState.Occupied("password_112312047073100");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        userLogin.User user6 = new userLogin.User("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", 100, "User [name=null null, id=0, email=null, password=null]", "manager_112305914121600", "password_112312047073100");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parkingLot2.setEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            parking.ParkingSpace parkingSpace9 = parkingLot2.getParkingSpace(264);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid space id");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setComment('\000');
        char char7 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        char char8 = csvReader1.getComment();
        boolean boolean9 = csvReader1.getTrimWhitespace();
        csvReader1.setUseTextQualifier(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '#' + "'", char8 == '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        int int12 = reservation10.getDuration();
        reservation10.updateDuration((int) ',');
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("admin");
        csvWriter1.endRecord();
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        char char2 = csvReader1.getTextQualifier();
        csvReader1.setRecordDelimiter(',');
        boolean boolean6 = csvReader1.isQualified(1);
        csvReader1.setUseTextQualifier(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\"' + "'", char2 == '\"');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.password = "Password!23";
        java.lang.String str12 = user6.getLName();
        java.lang.String str13 = user6.getLName();
        user6.setEmail("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo17 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int18 = paymentInfo17.getSecurityCode();
        java.lang.String str19 = paymentInfo17.getBillingAddress();
        java.util.Date date21 = null;
        paymentInfo17.parkingInfo(0, date21, "hi!", "hi!", (int) (short) 1);
        boolean boolean27 = debitPaymentProvider0.handlePayment(paymentInfo17, (double) (short) -1);
        manager.SuperManager superManager28 = manager.SuperManager.getInstance();
        java.lang.String str29 = superManager28.firstName;
        users.Student student32 = new users.Student("", "hi!");
        boolean boolean33 = superManager28.validateUser((users.UserInfo) student32);
        paymentStrategy.PaymentInfo paymentInfo34 = student32.getPaymentInfo();
        reservations.Reservation reservation35 = student32.currentReservation;
        paymentStrategy.PaymentInfo paymentInfo41 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int42 = paymentInfo41.getSecurityCode();
        java.lang.String str43 = paymentInfo41.getBillingAddress();
        java.util.Date date45 = null;
        paymentInfo41.parkingInfo(0, date45, "hi!", "hi!", (int) (short) 1);
        student32.setPaymentInfo(paymentInfo41);
        boolean boolean52 = debitPaymentProvider0.handlePayment(paymentInfo41, 1.0d);
        paymentStrategy.PaymentInfo paymentInfo58 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int59 = paymentInfo58.getSecurityCode();
        int int60 = paymentInfo58.getSecurityCode();
        paymentInfo58.setSecurityCode((int) ',');
        boolean boolean64 = debitPaymentProvider0.handlePayment(paymentInfo58, (double) (short) -1);
        paymentInfo58.setCardBallance((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(superManager28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(paymentInfo34);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        reservations.Reservation reservation3 = facultyMember2.currentReservation;
        paymentStrategy.OtherTypeProvider otherTypeProvider4 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo10 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo10.setBillingName("FALSE");
        boolean boolean14 = otherTypeProvider4.handlePayment(paymentInfo10, (double) (short) 1);
        paymentStrategy.Context context15 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider4);
        paymentStrategy.DebitPaymentProvider debitPaymentProvider16 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int23 = paymentInfo22.getSecurityCode();
        java.lang.String str24 = paymentInfo22.getBillingAddress();
        java.lang.String str25 = paymentInfo22.getBillingAddress();
        boolean boolean27 = debitPaymentProvider16.handlePayment(paymentInfo22, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo33 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int34 = paymentInfo33.getSecurityCode();
        java.lang.String str35 = paymentInfo33.getBillingAddress();
        java.util.Date date37 = null;
        paymentInfo33.parkingInfo(0, date37, "hi!", "hi!", (int) (short) 1);
        boolean boolean43 = debitPaymentProvider16.handlePayment(paymentInfo33, (double) (short) -1);
        manager.SuperManager superManager44 = manager.SuperManager.getInstance();
        java.lang.String str45 = superManager44.firstName;
        users.Student student48 = new users.Student("", "hi!");
        boolean boolean49 = superManager44.validateUser((users.UserInfo) student48);
        paymentStrategy.PaymentInfo paymentInfo50 = student48.getPaymentInfo();
        reservations.Reservation reservation51 = student48.currentReservation;
        paymentStrategy.PaymentInfo paymentInfo57 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int58 = paymentInfo57.getSecurityCode();
        java.lang.String str59 = paymentInfo57.getBillingAddress();
        java.util.Date date61 = null;
        paymentInfo57.parkingInfo(0, date61, "hi!", "hi!", (int) (short) 1);
        student48.setPaymentInfo(paymentInfo57);
        boolean boolean68 = debitPaymentProvider16.handlePayment(paymentInfo57, 1.0d);
        paymentInfo57.setBillingName("");
        int int71 = paymentInfo57.getSecurityCode();
        boolean boolean73 = otherTypeProvider4.handlePayment(paymentInfo57, (-1.0d));
        paymentStrategy.PaymentInfo paymentInfo79 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo79.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        paymentInfo79.setBillingAddress("User [name=null null, id=0, email=null, password=null]");
        boolean boolean85 = otherTypeProvider4.handlePayment(paymentInfo79, (double) 'a');
        facultyMember2.setPaymentInfo(paymentInfo79);
        org.junit.Assert.assertNull(reservation3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(superManager44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(paymentInfo50);
        org.junit.Assert.assertNull(reservation51);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        java.lang.String str4 = csvReader1.getRawRecord();
        java.lang.String str6 = csvReader1.get("Password!23");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        parking.ParkingLot parkingLot9 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace11 = parkingLot9.getParkingSpace((int) ' ');
        reservations.Reservation reservation12 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace11);
        int int13 = reservation12.getDay();
        int int14 = reservation12.getDuration();
        users.FacultyMember facultyMember17 = new users.FacultyMember("", "hi!");
        int int18 = facultyMember17.parkingspacenum;
        int int19 = facultyMember17.getParkingRate();
        paymentStrategy.CreditPaymentProvide creditPaymentProvide20 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider21 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo27 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo27.setBillingName("FALSE");
        boolean boolean31 = otherTypeProvider21.handlePayment(paymentInfo27, (double) (short) 1);
        boolean boolean33 = creditPaymentProvide20.handlePayment(paymentInfo27, (double) (short) 0);
        reservationSystemFacade0.payBalance(reservation12, (users.UserInfo) facultyMember17, (paymentStrategy.PaymentProvider) creditPaymentProvide20);
        parking.ParkingLot parkingLot47 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace49 = parkingLot47.getParkingSpace((int) ' ');
        reservations.Reservation reservation50 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace49);
        parkingState.State state51 = parkingSpace49.getSensorStatus();
        parkingState.State state52 = parkingSpace49.getSensorStatus();
        reservations.Reservation reservation53 = new reservations.Reservation((int) '\"', (-1), (int) (byte) 100, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=]", parkingSpace49);
        int int54 = reservation53.getStartTime();
        users.FacultyMember facultyMember57 = new users.FacultyMember("", "hi!");
        int int58 = facultyMember57.parkingspacenum;
        facultyMember57.parkinglot = "hi!";
        facultyMember57.setValid();
        java.lang.String str62 = facultyMember57.getEmail();
        int int63 = reservationSystemFacade0.calculateOutstanding(reservation53, (users.UserInfo) facultyMember57);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap64 = reservationSystemFacade0.getLots();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parkingSpace49);
        org.junit.Assert.assertNotNull(state51);
        org.junit.Assert.assertNotNull(state52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 264 + "'", int63 == 264);
        org.junit.Assert.assertNotNull(intMap64);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        userLogin.MaintainUser maintainUser4 = new userLogin.MaintainUser();
        java.lang.String str5 = maintainUser4.path;
        userLogin.MaintainUser maintainUser6 = new userLogin.MaintainUser();
        maintainUser6.update("admin");
        java.util.ArrayList<userLogin.User> userList9 = maintainUser6.users;
        maintainUser4.users = userList9;
        maintainUser0.users = userList9;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File  does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        java.lang.String str7 = superManager0.lastName;
        users.UserInfo userInfo8 = null;
        boolean boolean9 = superManager0.validateUser(userInfo8);
        java.lang.Class<?> wildcardClass10 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.util.Date date9 = null;
        paymentInfo5.parkingInfo(0, date9, "hi!", "hi!", (int) (short) 1);
        int int14 = paymentInfo5.getExpDate();
        paymentInfo5.setExpDate(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo17 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int18 = paymentInfo17.getSecurityCode();
        java.lang.String str19 = paymentInfo17.getBillingAddress();
        java.util.Date date21 = null;
        paymentInfo17.parkingInfo(0, date21, "hi!", "hi!", (int) (short) 1);
        boolean boolean27 = debitPaymentProvider0.handlePayment(paymentInfo17, (double) (short) -1);
        paymentInfo17.setBillingName("Password!23");
        paymentInfo17.setBillingAddress("");
        int int32 = paymentInfo17.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("password_112284545599300", "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("admin", "FALSE", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("FALSE", "User [name= FALSE, id=97, email=, password=]", "password_112312047073100");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        java.lang.String[] strArray2 = null;
        csvWriter1.writeRecord(strArray2, true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        maintainUser0.path = "hi!";
        userLogin.MaintainUser maintainUser5 = new userLogin.MaintainUser();
        java.lang.String str6 = maintainUser5.path;
        userLogin.MaintainUser maintainUser7 = new userLogin.MaintainUser();
        maintainUser7.update("admin");
        java.util.ArrayList<userLogin.User> userList10 = maintainUser7.users;
        maintainUser5.users = userList10;
        maintainUser0.users = userList10;
        maintainUser0.path = "hi!";
        maintainUser0.update("User [name= hi!, id=97, email=hi!, password=hi!]");
        maintainUser0.path = "User [name= hi!, id=97, email=hi!, password=hi!]";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        user6.setPassword("");
        user6.password = "User [name= hi!, id=97, email=hi!, password=admin]";
        java.lang.Class<?> wildcardClass15 = user6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.setValid();
        users.FacultyMember facultyMember7 = new users.FacultyMember("", "hi!");
        int int8 = facultyMember7.parkingspacenum;
        facultyMember7.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade11 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot19 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace21 = parkingLot19.getParkingSpace((int) ' ');
        reservations.Reservation reservation22 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace21);
        reservationSystemFacade11.editBooking(reservation22, (int) (byte) 100);
        facultyMember7.currentReservation = reservation22;
        paymentStrategy.OtherTypeProvider otherTypeProvider26 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo32 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo32.setBillingName("FALSE");
        boolean boolean36 = otherTypeProvider26.handlePayment(paymentInfo32, (double) (short) 1);
        paymentInfo32.setCardBallance(10.0d);
        facultyMember7.setPaymentInfo(paymentInfo32);
        facultyMember2.setPaymentInfo(paymentInfo32);
        int int41 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade11);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        int int22 = reservation17.getStartTime();
        java.lang.String str23 = reservation17.getPlate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        int int8 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        java.lang.String[] strArray10 = csvReader1.getValues();
        csvReader1.setSafetySwitch(true);
        java.lang.String str14 = csvReader1.get("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        reservations.Reservation reservation3 = facultyMember2.currentReservation;
        org.junit.Assert.assertNull(reservation3);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide2 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int9 = paymentInfo8.getSecurityCode();
        java.lang.String str10 = paymentInfo8.getBillingAddress();
        java.util.Date date12 = null;
        paymentInfo8.parkingInfo(0, date12, "hi!", "hi!", (int) (short) 1);
        boolean boolean18 = creditPaymentProvide2.handlePayment(paymentInfo8, (double) 8);
        boolean boolean20 = context1.execute(paymentInfo8, (double) '\000');
        int int21 = paymentInfo8.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        users.FacultyMember facultyMember6 = new users.FacultyMember("", "hi!");
        int int7 = facultyMember6.parkingspacenum;
        facultyMember6.parkinglot = "hi!";
        facultyMember6.setValid();
        boolean boolean11 = manager3.validateUser((users.UserInfo) facultyMember6);
        reservations.Reservation reservation12 = facultyMember6.currentReservation;
        int int13 = facultyMember6.parkingspacenum;
        java.lang.String str14 = facultyMember6.parkinglot;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reservation12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getComment();
        char char11 = csvWriter1.getRecordDelimiter();
        csvWriter1.setDelimiter('\000');
        char char14 = csvWriter1.getDelimiter();
        char char15 = csvWriter1.getRecordDelimiter();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\"' + "'", char15 == '\"');
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("", "manager_112327586653400");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider1 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        boolean boolean11 = otherTypeProvider1.handlePayment(paymentInfo7, (double) (short) 1);
        paymentInfo7.setCardBallance(10.0d);
        double double14 = paymentInfo7.getCardBallance();
        int int15 = paymentInfo7.getCardNum();
        boolean boolean17 = creditPaymentProvide0.handlePayment(paymentInfo7, (double) '4');
        paymentStrategy.PaymentInfo paymentInfo23 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int24 = paymentInfo23.getSecurityCode();
        java.lang.String str25 = paymentInfo23.getBillingAddress();
        boolean boolean27 = creditPaymentProvide0.handlePayment(paymentInfo23, (double) 97);
        int int28 = paymentInfo23.getSecurityCode();
        paymentInfo23.setBillingAddress("User [name= FALSE, id=97, email=hi!, password=hi!]");
        paymentInfo23.setBillingName("User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getColumnCount();
        char char8 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        student4.setValid();
        java.lang.String str8 = student4.parkinglot;
        int int9 = student4.getParkingRate();
        paymentStrategy.PaymentInfo paymentInfo15 = new paymentStrategy.PaymentInfo(97, 5, "admin", "User [name= hi!, id=97, email=hi!, password=]", 10);
        student4.setPaymentInfo(paymentInfo15);
        student4.parkinglot = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        reservations.Reservation reservation17 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace16);
        reservationSystemFacade6.editBooking(reservation17, (int) (byte) 100);
        facultyMember2.currentReservation = reservation17;
        int int21 = reservation17.getMonth();
        int int22 = reservation17.getDuration();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        java.lang.String str10 = user6.getType();
        java.lang.String str11 = user6.getFName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("password_112310734370300", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.PaymentInfo paymentInfo2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = otherTypeProvider0.handlePayment(paymentInfo2, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        users.Visitor visitor2 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=hi!]");
        int int3 = visitor2.getParkingRate();
        int int4 = visitor2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        boolean boolean6 = parkingSystem0.isLotEnabled((int) (byte) 100);
        parking.ParkingLot parkingLot9 = parkingSystem0.addLot((int) (byte) 0, "hi!");
        int int10 = parkingLot9.getId();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLot9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name=null null, id=0, email=null, password=null]");
        char char2 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = csvReader1.isQualified((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setSafetySwitch(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = csvReader1.get("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "Password!23");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        int int12 = reservation11.getDay();
        int int13 = reservation11.getDuration();
        reservations.ReservationSystemFacade reservationSystemFacade14 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap15 = reservationSystemFacade14.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade16 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot24 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace26 = parkingLot24.getParkingSpace((int) ' ');
        reservations.Reservation reservation27 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace26);
        users.FacultyMember facultyMember30 = new users.FacultyMember("", "hi!");
        int int31 = facultyMember30.parkingspacenum;
        int int32 = reservationSystemFacade16.calculateOutstanding(reservation27, (users.UserInfo) facultyMember30);
        manager.SuperManager superManager33 = manager.SuperManager.getInstance();
        java.lang.String str34 = superManager33.firstName;
        users.Student student37 = new users.Student("", "hi!");
        boolean boolean38 = superManager33.validateUser((users.UserInfo) student37);
        paymentStrategy.PaymentInfo paymentInfo39 = student37.getPaymentInfo();
        student37.setValid();
        int int41 = reservationSystemFacade14.calculateOutstanding(reservation27, (users.UserInfo) student37);
        reservationSystemFacade0.cancelBooking(reservation11, (users.UserInfo) student37);
        reservations.Reservation reservation43 = student37.currentReservation;
        java.lang.String str44 = student37.getEmail();
        java.lang.String str45 = student37.getPassword();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(reservationSystemFacade14);
        org.junit.Assert.assertNotNull(intMap15);
        org.junit.Assert.assertNotNull(reservationSystemFacade16);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(superManager33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(paymentInfo39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(reservation43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        manager.Manager manager2 = new manager.Manager("hi!", "");
        manager2.firstName = "Password!23";
        manager2.setPassword("password_112296757334200");
        java.lang.String str7 = manager2.firstName;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password!23" + "'", str7, "Password!23");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        java.lang.String str3 = parkingLot2.getAddress();
        boolean boolean4 = parkingLot2.getEnabled();
        int int5 = parkingLot2.getId();
        java.lang.String str6 = parkingLot2.getAddress();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        users.Student student2 = new users.Student("password_112325847983500", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        student2.setValid();
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        userLogin.User user6 = new userLogin.User("admin", "password_112284545599300", 0, "manager_112305914121600", "FALSE", "password_112310734370300");
        int int7 = user6.id;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        user6.setId(1);
        java.lang.String str17 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name= FALSE, id=1, email=hi!, password=hi!]" + "'", str17, "User [name= FALSE, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        users.Student student2 = new users.Student("manager_112305914121600", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        paymentInfo5.setCardBallance((double) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        parkingState.Occupied occupied1 = new parkingState.Occupied("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        java.lang.String str2 = occupied1.handleState();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]" + "'", str2, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        char char7 = csvReader1.getComment();
        java.lang.String str9 = csvReader1.get("FALSE");
        boolean boolean11 = csvReader1.isQualified(8);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.type;
        java.lang.String str10 = user6.getLName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade2 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((int) ' ');
        reservations.Reservation reservation13 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace12);
        users.FacultyMember facultyMember16 = new users.FacultyMember("", "hi!");
        int int17 = facultyMember16.parkingspacenum;
        int int18 = reservationSystemFacade2.calculateOutstanding(reservation13, (users.UserInfo) facultyMember16);
        manager.SuperManager superManager19 = manager.SuperManager.getInstance();
        java.lang.String str20 = superManager19.firstName;
        users.Student student23 = new users.Student("", "hi!");
        boolean boolean24 = superManager19.validateUser((users.UserInfo) student23);
        paymentStrategy.PaymentInfo paymentInfo25 = student23.getPaymentInfo();
        student23.setValid();
        int int27 = reservationSystemFacade0.calculateOutstanding(reservation13, (users.UserInfo) student23);
        reservations.ReservationSystemFacade reservationSystemFacade28 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot36 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace38 = parkingLot36.getParkingSpace((int) ' ');
        reservations.Reservation reservation39 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace38);
        users.FacultyMember facultyMember42 = new users.FacultyMember("", "hi!");
        int int43 = facultyMember42.parkingspacenum;
        int int44 = reservationSystemFacade28.calculateOutstanding(reservation39, (users.UserInfo) facultyMember42);
        reservationSystemFacade0.editBooking(reservation39, (int) (short) -1);
        reservations.ReservationSystemFacade reservationSystemFacade47 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot55 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace57 = parkingLot55.getParkingSpace((int) ' ');
        reservations.Reservation reservation58 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace57);
        users.FacultyMember facultyMember61 = new users.FacultyMember("", "hi!");
        int int62 = facultyMember61.parkingspacenum;
        int int63 = reservationSystemFacade47.calculateOutstanding(reservation58, (users.UserInfo) facultyMember61);
        reservation58.updateDuration((int) ' ');
        reservationSystemFacade0.editBooking(reservation58, (int) (short) 100);
        int int68 = reservation58.getMonth();
        parking.ParkingSpace parkingSpace69 = reservation58.getSpace();
        java.lang.String str70 = reservation58.getPlate();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade28);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade47);
        org.junit.Assert.assertNotNull(parkingSpace57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(parkingSpace69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "admin" + "'", str70, "admin");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        int int12 = reservation11.getDay();
        int int13 = reservation11.getDuration();
        reservations.ReservationSystemFacade reservationSystemFacade14 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap15 = reservationSystemFacade14.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade16 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot24 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace26 = parkingLot24.getParkingSpace((int) ' ');
        reservations.Reservation reservation27 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace26);
        users.FacultyMember facultyMember30 = new users.FacultyMember("", "hi!");
        int int31 = facultyMember30.parkingspacenum;
        int int32 = reservationSystemFacade16.calculateOutstanding(reservation27, (users.UserInfo) facultyMember30);
        manager.SuperManager superManager33 = manager.SuperManager.getInstance();
        java.lang.String str34 = superManager33.firstName;
        users.Student student37 = new users.Student("", "hi!");
        boolean boolean38 = superManager33.validateUser((users.UserInfo) student37);
        paymentStrategy.PaymentInfo paymentInfo39 = student37.getPaymentInfo();
        student37.setValid();
        int int41 = reservationSystemFacade14.calculateOutstanding(reservation27, (users.UserInfo) student37);
        reservationSystemFacade0.cancelBooking(reservation11, (users.UserInfo) student37);
        int int43 = student37.getParkingRate();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(reservationSystemFacade14);
        org.junit.Assert.assertNotNull(intMap15);
        org.junit.Assert.assertNotNull(reservationSystemFacade16);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(superManager33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(paymentInfo39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("manager_112327586653400", '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        int int9 = csvReader1.getColumnCount();
        csvReader1.setCaptureRawRecord(true);
        char char12 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '4' + "'", char12 == '4');
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("FALSE");
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getValidation();
        java.lang.String str13 = user6.getPassword();
        java.lang.String str14 = user6.getValidation();
        user6.password = "";
        int int17 = user6.getId();
        user6.setType("User [name= FALSE, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FALSE" + "'", str14, "FALSE");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.email;
        java.lang.String str12 = user6.email;
        user6.email = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]";
        java.lang.String str15 = user6.fname;
        java.lang.String str16 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FALSE" + "'", str16, "FALSE");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        java.lang.String str8 = user6.getLName();
        java.lang.String str9 = user6.getType();
        java.lang.String str10 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        manager.Manager manager2 = new manager.Manager("hi!", "hi!");
        manager2.setPassword("");
        java.lang.String str5 = manager2.firstName;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        reservations.ReservationSystemFacade reservationSystemFacade1 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = reservationSystemFacade1.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade3 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot11 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace13 = parkingLot11.getParkingSpace((int) ' ');
        reservations.Reservation reservation14 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace13);
        users.FacultyMember facultyMember17 = new users.FacultyMember("", "hi!");
        int int18 = facultyMember17.parkingspacenum;
        int int19 = reservationSystemFacade3.calculateOutstanding(reservation14, (users.UserInfo) facultyMember17);
        users.Student student22 = new users.Student("", "hi!");
        int int23 = student22.getParkingRate();
        reservationSystemFacade1.cancelBooking(reservation14, (users.UserInfo) student22);
        users.FacultyMember facultyMember27 = new users.FacultyMember("", "hi!");
        int int28 = facultyMember27.parkingspacenum;
        facultyMember27.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade31 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot39 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace41 = parkingLot39.getParkingSpace((int) ' ');
        reservations.Reservation reservation42 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace41);
        reservationSystemFacade31.editBooking(reservation42, (int) (byte) 100);
        facultyMember27.currentReservation = reservation42;
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider46 = new paymentStrategy.MobilePaymentProvider();
        reservationSystemFacade0.payBalance(reservation14, (users.UserInfo) facultyMember27, (paymentStrategy.PaymentProvider) mobilePaymentProvider46);
        reservations.ReservationSystemFacade reservationSystemFacade48 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot56 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace58 = parkingLot56.getParkingSpace((int) ' ');
        reservations.Reservation reservation59 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace58);
        users.FacultyMember facultyMember62 = new users.FacultyMember("", "hi!");
        int int63 = facultyMember62.parkingspacenum;
        int int64 = reservationSystemFacade48.calculateOutstanding(reservation59, (users.UserInfo) facultyMember62);
        reservationSystemFacade0.editBooking(reservation59, 768);
        reservation59.updateDuration(100);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(reservationSystemFacade1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(reservationSystemFacade3);
        org.junit.Assert.assertNotNull(parkingSpace13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade31);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertNotNull(reservationSystemFacade48);
        org.junit.Assert.assertNotNull(parkingSpace58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot4 = parkingSystem0.addLot((int) (short) 10, "");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingLot4);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.setValid();
        paymentStrategy.PaymentInfo paymentInfo5 = facultyMember2.getPaymentInfo();
        facultyMember2.parkinglot = "FALSE";
        java.lang.String str8 = facultyMember2.parkinglot;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(paymentInfo5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FALSE" + "'", str8, "FALSE");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        char char2 = csvReader1.getTextQualifier();
        java.lang.String str4 = csvReader1.get("");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\"' + "'", char2 == '\"');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getValidation();
        java.lang.String str14 = user6.getType();
        user6.isValidated = false;
        java.lang.String str17 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        java.lang.String str15 = user6.email;
        user6.type = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        user6.fname = "Password!23";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration(2);
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parkingState.State state15 = parkingSpace14.getSensorStatus();
        java.lang.String str16 = state15.handleState();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=]");
        user6.id = 5;
        user6.password = "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        user6.email = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        java.lang.String str15 = user6.type;
        user6.id = 0;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        char char5 = csvWriter1.getDelimiter();
        char char6 = csvWriter1.getTextQualifier();
        boolean boolean7 = csvWriter1.getForceQualifier();
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        manager.Manager manager3 = superManager0.autoGenerator();
        superManager0.setUsername("User [name= hi!, id=97, email=hi!, password=hi!]");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.lastName = "User [name= hi!, id=97, email=hi!, password=admin]";
        java.lang.String str10 = superManager0.firstName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "password_112306347644100" + "'", str6, "password_112306347644100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "password_112306347644100" + "'", str7, "password_112306347644100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setPassword("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        superManager0.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("Password!23", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        boolean boolean8 = parkingSpace7.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        parking.ParkingLot parkingLot33 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace35 = parkingLot33.getParkingSpace((int) ' ');
        reservations.Reservation reservation36 = null;
        parkingSpace35.setReservation(reservation36);
        java.util.ArrayList<reservations.Reservation> reservationList38 = parkingSpace35.getReservations();
        reservations.Reservation reservation39 = new reservations.Reservation((-1), (int) 'a', (int) '#', 0, "password_112306347644100", parkingSpace35);
        users.Visitor visitor42 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        visitor42.setValid();
        java.lang.String str44 = visitor42.parkinglot;
        int int45 = visitor42.getParkingRate();
        int int46 = reservationSystemFacade0.calculateOutstanding(reservation39, (users.UserInfo) visitor42);
        users.Visitor visitor49 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        visitor49.setValid();
        parking.ParkingSpace parkingSpace57 = new parking.ParkingSpace((int) '#');
        paymentStrategy.OtherTypeProvider otherTypeProvider58 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context59 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider58);
        paymentStrategy.PaymentInfo paymentInfo65 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo65.setBillingName("FALSE");
        paymentInfo65.setCardNum(1);
        boolean boolean71 = context59.execute(paymentInfo65, (double) 97);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide72 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider73 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo79 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo79.setBillingName("FALSE");
        boolean boolean83 = otherTypeProvider73.handlePayment(paymentInfo79, (double) (short) 1);
        boolean boolean85 = creditPaymentProvide72.handlePayment(paymentInfo79, (double) (short) 0);
        paymentInfo79.setBillingName("password_112284545599300");
        boolean boolean89 = context59.execute(paymentInfo79, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            reservations.Reservation reservation90 = reservationSystemFacade0.createReservation((users.UserInfo) visitor49, 768, (int) (byte) -1, 768, 2, "FALSE", parkingSpace57, context59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertNotNull(reservationList38);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15 + "'", int45 == 15);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-30) + "'", int46 == (-30));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        char char12 = csvWriter1.getDelimiter();
        boolean boolean13 = csvWriter1.getUseTextQualifier();
        csvWriter1.setRecordDelimiter('4');
        boolean boolean16 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvReader csvReader18 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean19 = csvReader18.readRecord();
        csvReader18.setSafetySwitch(true);
        csvReader18.setTrimWhitespace(false);
        boolean boolean24 = csvReader18.skipRecord();
        boolean boolean25 = csvReader18.getTrimWhitespace();
        java.lang.String str26 = csvReader18.getRawRecord();
        boolean boolean27 = csvReader18.getCaptureRawRecord();
        boolean boolean28 = csvReader18.getUseTextQualifier();
        csvReader18.setTextQualifier('4');
        com.csvreader.CsvWriter csvWriter32 = new com.csvreader.CsvWriter("");
        csvWriter32.setRecordDelimiter('\"');
        csvWriter32.setTextQualifier('\"');
        char char37 = csvWriter32.getComment();
        boolean boolean38 = csvWriter32.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter40 = new com.csvreader.CsvWriter("");
        csvWriter40.setRecordDelimiter('\"');
        boolean boolean43 = csvWriter40.getUseTextQualifier();
        com.csvreader.CsvReader csvReader45 = com.csvreader.CsvReader.parse("hi!");
        char char46 = csvReader45.getComment();
        char char47 = csvReader45.getTextQualifier();
        java.lang.String[] strArray48 = csvReader45.getHeaders();
        java.lang.String[] strArray49 = csvReader45.getValues();
        csvWriter40.writeRecord(strArray49);
        csvWriter32.writeRecord(strArray49);
        csvReader18.setHeaders(strArray49);
        csvWriter1.writeRecord(strArray49, false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(csvReader18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '#' + "'", char37 == '#');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(csvReader45);
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '#' + "'", char46 == '#');
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\"' + "'", char47 == '\"');
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        user6.type = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str19 = user6.fname;
        boolean boolean20 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("");
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name= hi!, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        int int12 = reservation11.getDay();
        int int13 = reservation11.getDuration();
        reservations.ReservationSystemFacade reservationSystemFacade14 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap15 = reservationSystemFacade14.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade16 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot24 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace26 = parkingLot24.getParkingSpace((int) ' ');
        reservations.Reservation reservation27 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace26);
        users.FacultyMember facultyMember30 = new users.FacultyMember("", "hi!");
        int int31 = facultyMember30.parkingspacenum;
        int int32 = reservationSystemFacade16.calculateOutstanding(reservation27, (users.UserInfo) facultyMember30);
        manager.SuperManager superManager33 = manager.SuperManager.getInstance();
        java.lang.String str34 = superManager33.firstName;
        users.Student student37 = new users.Student("", "hi!");
        boolean boolean38 = superManager33.validateUser((users.UserInfo) student37);
        paymentStrategy.PaymentInfo paymentInfo39 = student37.getPaymentInfo();
        student37.setValid();
        int int41 = reservationSystemFacade14.calculateOutstanding(reservation27, (users.UserInfo) student37);
        reservationSystemFacade0.cancelBooking(reservation11, (users.UserInfo) student37);
        java.lang.String str43 = student37.getEmail();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(reservationSystemFacade14);
        org.junit.Assert.assertNotNull(intMap15);
        org.junit.Assert.assertNotNull(reservationSystemFacade16);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(superManager33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(paymentInfo39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        userLogin.MaintainUser maintainUser4 = new userLogin.MaintainUser();
        java.lang.String str5 = maintainUser4.path;
        userLogin.MaintainUser maintainUser6 = new userLogin.MaintainUser();
        maintainUser6.update("admin");
        java.util.ArrayList<userLogin.User> userList9 = maintainUser6.users;
        maintainUser4.users = userList9;
        maintainUser0.users = userList9;
        maintainUser0.update("User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name= hi!, id=97, email=hi!, password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap17 = reservationSystemFacade0.getLots();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intMap17);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        java.lang.String str4 = csvReader1.getRawRecord();
        boolean boolean5 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        boolean boolean9 = debitPaymentProvider0.handlePayment(paymentInfo7, (double) 100);
        int int10 = paymentInfo7.getSecurityCode();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) ' ');
        parking.ParkingLot parkingLot5 = parkingSystem0.getLot((int) '\"');
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap6 = parkingSystem0.getLots();
        parkingSystem0.setEnableLot(0, true);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNull(parkingLot3);
// flaky:         org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(intMap6);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        java.lang.String str12 = user6.type;
        java.lang.String str13 = user6.getEmail();
        java.lang.String str14 = user6.getValidation();
        user6.email = "User [name= FALSE, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FALSE" + "'", str14, "FALSE");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("FALSE", '\000', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        maintainUser0.path = "hi!";
        userLogin.MaintainUser maintainUser5 = new userLogin.MaintainUser();
        java.lang.String str6 = maintainUser5.path;
        userLogin.MaintainUser maintainUser7 = new userLogin.MaintainUser();
        maintainUser7.update("admin");
        java.util.ArrayList<userLogin.User> userList10 = maintainUser7.users;
        maintainUser5.users = userList10;
        maintainUser0.users = userList10;
        maintainUser0.path = "hi!";
        maintainUser0.load("admin");
        userLogin.MaintainUser maintainUser17 = new userLogin.MaintainUser();
        java.lang.String str18 = maintainUser17.path;
        userLogin.MaintainUser maintainUser19 = new userLogin.MaintainUser();
        maintainUser19.update("admin");
        java.util.ArrayList<userLogin.User> userList22 = maintainUser19.users;
        maintainUser17.users = userList22;
        maintainUser17.path = "User [name= hi!, id=97, email=hi!, password=]";
        maintainUser17.path = "User [name=null null, id=0, email=null, password=null]";
        java.util.ArrayList<userLogin.User> userList28 = maintainUser17.users;
        maintainUser0.users = userList28;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo17 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int18 = paymentInfo17.getSecurityCode();
        java.lang.String str19 = paymentInfo17.getBillingAddress();
        java.util.Date date21 = null;
        paymentInfo17.parkingInfo(0, date21, "hi!", "hi!", (int) (short) 1);
        boolean boolean27 = debitPaymentProvider0.handlePayment(paymentInfo17, (double) (short) -1);
        paymentStrategy.PaymentInfo paymentInfo33 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo33.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str36 = paymentInfo33.getBillingAddress();
        paymentInfo33.setSecurityCode((int) (byte) -1);
        boolean boolean40 = debitPaymentProvider0.handlePayment(paymentInfo33, 100.0d);
        paymentStrategy.OtherTypeProvider otherTypeProvider41 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context42 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider41);
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider43 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo49 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int50 = paymentInfo49.getSecurityCode();
        java.lang.String str51 = paymentInfo49.getBillingAddress();
        java.util.Date date53 = null;
        paymentInfo49.parkingInfo(0, date53, "hi!", "hi!", (int) (short) 1);
        boolean boolean59 = mobilePaymentProvider43.handlePayment(paymentInfo49, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo65 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int66 = paymentInfo65.getSecurityCode();
        java.lang.String str67 = paymentInfo65.getBillingAddress();
        java.lang.String str68 = paymentInfo65.getBillingAddress();
        int int69 = paymentInfo65.getCardNum();
        int int70 = paymentInfo65.getExpDate();
        boolean boolean72 = mobilePaymentProvider43.handlePayment(paymentInfo65, (double) 100.0f);
        int int73 = paymentInfo65.getSecurityCode();
        paymentInfo65.setSecurityCode(0);
        boolean boolean77 = otherTypeProvider41.handlePayment(paymentInfo65, (double) 'a');
        boolean boolean79 = debitPaymentProvider0.handlePayment(paymentInfo65, 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str36, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        userLogin.User user0 = new userLogin.User();
        user0.setValidation("");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.OtherTypeProvider otherTypeProvider17 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo23 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo23.setBillingName("FALSE");
        boolean boolean27 = otherTypeProvider17.handlePayment(paymentInfo23, (double) (short) 1);
        paymentInfo23.setCardBallance(10.0d);
        double double30 = paymentInfo23.getCardBallance();
        paymentInfo23.setExpDate((int) 'a');
        boolean boolean34 = mobilePaymentProvider0.handlePayment(paymentInfo23, (double) 2);
        int int35 = paymentInfo23.getExpDate();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        manager.Manager manager2 = new manager.Manager("hi!", "hi!");
        manager2.setUsername("");
        java.lang.String str5 = manager2.getUsername();
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap7 = reservationSystemFacade6.getLots();
        users.FacultyMember facultyMember10 = new users.FacultyMember("", "hi!");
        int int11 = facultyMember10.parkingspacenum;
        facultyMember10.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade14 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot22 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace24 = parkingLot22.getParkingSpace((int) ' ');
        reservations.Reservation reservation25 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace24);
        reservationSystemFacade14.editBooking(reservation25, (int) (byte) 100);
        facultyMember10.currentReservation = reservation25;
        int int29 = reservation25.getMonth();
        reservationSystemFacade6.editBooking(reservation25, (int) (byte) 100);
        parking.ParkingLot parkingLot39 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace41 = parkingLot39.getParkingSpace((int) ' ');
        reservations.Reservation reservation42 = null;
        parkingSpace41.setReservation(reservation42);
        java.util.ArrayList<reservations.Reservation> reservationList44 = parkingSpace41.getReservations();
        reservations.Reservation reservation45 = new reservations.Reservation((-1), (int) 'a', (int) '#', 0, "password_112306347644100", parkingSpace41);
        users.Visitor visitor48 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        visitor48.setValid();
        java.lang.String str50 = visitor48.parkinglot;
        int int51 = visitor48.getParkingRate();
        int int52 = reservationSystemFacade6.calculateOutstanding(reservation45, (users.UserInfo) visitor48);
        boolean boolean53 = manager2.validateUser((users.UserInfo) visitor48);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(intMap7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade14);
        org.junit.Assert.assertNotNull(parkingSpace24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15 + "'", int51 == 15);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-30) + "'", int52 == (-30));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        users.Student student2 = new users.Student("User [name= hi!, id=97, email=hi!, password=admin]", "");
        java.lang.String str3 = student2.getPassword();
        student2.parkinglot = "User [name=null null, id=0, email=null, password=null]";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("hi!", ',', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("User [name= FALSE, id=1, email=hi!, password=hi!]", '\000');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= FALSE, id=1, email=hi!, password=hi!] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        parking.ParkingLot parkingLot9 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace11 = parkingLot9.getParkingSpace((int) ' ');
        reservations.Reservation reservation12 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace11);
        int int13 = reservation12.getDay();
        int int14 = reservation12.getDuration();
        users.FacultyMember facultyMember17 = new users.FacultyMember("", "hi!");
        int int18 = facultyMember17.parkingspacenum;
        int int19 = facultyMember17.getParkingRate();
        paymentStrategy.CreditPaymentProvide creditPaymentProvide20 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider21 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo27 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo27.setBillingName("FALSE");
        boolean boolean31 = otherTypeProvider21.handlePayment(paymentInfo27, (double) (short) 1);
        boolean boolean33 = creditPaymentProvide20.handlePayment(paymentInfo27, (double) (short) 0);
        reservationSystemFacade0.payBalance(reservation12, (users.UserInfo) facultyMember17, (paymentStrategy.PaymentProvider) creditPaymentProvide20);
        paymentStrategy.Context context35 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) creditPaymentProvide20);
        paymentStrategy.OtherTypeProvider otherTypeProvider36 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo42 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo42.setBillingName("FALSE");
        boolean boolean46 = otherTypeProvider36.handlePayment(paymentInfo42, (double) (short) 1);
        java.util.Date date48 = null;
        paymentInfo42.parkingInfo((int) ' ', date48, "hi!", "hi!", 5);
        boolean boolean54 = creditPaymentProvide20.handlePayment(paymentInfo42, (double) (short) 1);
        paymentStrategy.PaymentInfo paymentInfo60 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int61 = paymentInfo60.getSecurityCode();
        java.lang.String str62 = paymentInfo60.getBillingAddress();
        java.lang.String str63 = paymentInfo60.getBillingAddress();
        int int64 = paymentInfo60.getCardNum();
        int int65 = paymentInfo60.getExpDate();
        double double66 = paymentInfo60.getCardBallance();
        boolean boolean68 = creditPaymentProvide20.handlePayment(paymentInfo60, (double) (-1));
        users.Student student71 = new users.Student("User [name= hi!, id=97, email=hi!, password=admin]", "");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide72 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo78 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int79 = paymentInfo78.getSecurityCode();
        java.lang.String str80 = paymentInfo78.getBillingAddress();
        java.util.Date date82 = null;
        paymentInfo78.parkingInfo(0, date82, "hi!", "hi!", (int) (short) 1);
        boolean boolean88 = creditPaymentProvide72.handlePayment(paymentInfo78, (double) 8);
        student71.setPaymentInfo(paymentInfo78);
        boolean boolean91 = creditPaymentProvide20.handlePayment(paymentInfo78, (double) 32);
        paymentInfo78.setBillingName("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 97 + "'", int79 == 97);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        userLogin.User user6 = new userLogin.User("", "", 5, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "manager_112327586653400", "User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        maintainUser0.path = "hi!";
        userLogin.MaintainUser maintainUser5 = new userLogin.MaintainUser();
        java.lang.String str6 = maintainUser5.path;
        userLogin.MaintainUser maintainUser7 = new userLogin.MaintainUser();
        maintainUser7.update("admin");
        java.util.ArrayList<userLogin.User> userList10 = maintainUser7.users;
        maintainUser5.users = userList10;
        maintainUser0.users = userList10;
        java.lang.String str13 = maintainUser0.path;
        maintainUser0.path = "manager_112305914121600";
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("password_112296757334200");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112296757334200 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        int int9 = csvReader1.getColumnCount();
        boolean boolean10 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("hi!", "");
        java.lang.String str3 = nonFacultyStaff2.getEmail();
        int int4 = nonFacultyStaff2.getParkingRate();
        reservations.ReservationSystemFacade reservationSystemFacade5 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap6 = reservationSystemFacade5.getLots();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        reservations.Reservation reservation17 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace16);
        int int18 = reservation17.getDay();
        int int19 = reservation17.getDuration();
        users.FacultyMember facultyMember22 = new users.FacultyMember("", "hi!");
        int int23 = facultyMember22.parkingspacenum;
        int int24 = facultyMember22.getParkingRate();
        paymentStrategy.CreditPaymentProvide creditPaymentProvide25 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider26 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo32 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo32.setBillingName("FALSE");
        boolean boolean36 = otherTypeProvider26.handlePayment(paymentInfo32, (double) (short) 1);
        boolean boolean38 = creditPaymentProvide25.handlePayment(paymentInfo32, (double) (short) 0);
        reservationSystemFacade5.payBalance(reservation17, (users.UserInfo) facultyMember22, (paymentStrategy.PaymentProvider) creditPaymentProvide25);
        parking.ParkingLot parkingLot52 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace54 = parkingLot52.getParkingSpace((int) ' ');
        reservations.Reservation reservation55 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace54);
        parkingState.State state56 = parkingSpace54.getSensorStatus();
        parkingState.State state57 = parkingSpace54.getSensorStatus();
        reservations.Reservation reservation58 = new reservations.Reservation((int) '\"', (-1), (int) (byte) 100, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=]", parkingSpace54);
        int int59 = reservation58.getStartTime();
        users.FacultyMember facultyMember62 = new users.FacultyMember("", "hi!");
        int int63 = facultyMember62.parkingspacenum;
        facultyMember62.parkinglot = "hi!";
        facultyMember62.setValid();
        java.lang.String str67 = facultyMember62.getEmail();
        int int68 = reservationSystemFacade5.calculateOutstanding(reservation58, (users.UserInfo) facultyMember62);
        nonFacultyStaff2.currentReservation = reservation58;
        nonFacultyStaff2.setValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(reservationSystemFacade5);
        org.junit.Assert.assertNotNull(intMap6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parkingSpace54);
        org.junit.Assert.assertNotNull(state56);
        org.junit.Assert.assertNotNull(state57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 264 + "'", int68 == 264);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader(reader0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter inputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade2 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((int) ' ');
        reservations.Reservation reservation13 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace12);
        users.FacultyMember facultyMember16 = new users.FacultyMember("", "hi!");
        int int17 = facultyMember16.parkingspacenum;
        int int18 = reservationSystemFacade2.calculateOutstanding(reservation13, (users.UserInfo) facultyMember16);
        manager.SuperManager superManager19 = manager.SuperManager.getInstance();
        java.lang.String str20 = superManager19.firstName;
        users.Student student23 = new users.Student("", "hi!");
        boolean boolean24 = superManager19.validateUser((users.UserInfo) student23);
        paymentStrategy.PaymentInfo paymentInfo25 = student23.getPaymentInfo();
        student23.setValid();
        int int27 = reservationSystemFacade0.calculateOutstanding(reservation13, (users.UserInfo) student23);
        reservations.Reservation reservation28 = student23.currentReservation;
        int int29 = student23.parkingspacenum;
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(reservation28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        reservationSystemFacade0.editBooking(reservation11, (int) (byte) 100);
        parking.ParkingSpace parkingSpace14 = reservation11.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList15 = parkingSpace14.getReservations();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(35, "password_112325847983500");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        char char12 = csvWriter1.getTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        int int15 = csvWriter1.getEscapeMode();
        csvWriter1.setDelimiter('a');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        boolean boolean10 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        boolean boolean2 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvReader csvReader4 = com.csvreader.CsvReader.parse("hi!");
        char char5 = csvReader4.getComment();
        char char6 = csvReader4.getTextQualifier();
        java.lang.String[] strArray7 = csvReader4.getHeaders();
        java.lang.String[] strArray8 = csvReader4.getValues();
        csvWriter1.writeRecord(strArray8);
        com.csvreader.CsvReader csvReader11 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean12 = csvReader11.readRecord();
        csvReader11.setSafetySwitch(true);
        boolean boolean15 = csvReader11.skipLine();
        java.lang.String[] strArray21 = new java.lang.String[] { "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "password_112284545599300", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "FALSE" };
        csvReader11.setHeaders(strArray21);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray21);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(csvReader4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(csvReader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        manager.Manager manager2 = new manager.Manager("", "admin");
        manager2.lastName = "Password!23";
        users.NonFacultyStaff nonFacultyStaff7 = new users.NonFacultyStaff("", "hi!");
        java.lang.String str8 = nonFacultyStaff7.getEmail();
        boolean boolean9 = manager2.validateUser((users.UserInfo) nonFacultyStaff7);
        int int10 = nonFacultyStaff7.getParkingRate();
        int int11 = nonFacultyStaff7.getParkingRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        com.csvreader.CsvReader csvReader10 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean11 = csvReader10.readRecord();
        csvReader10.setSafetySwitch(true);
        csvReader10.setTrimWhitespace(false);
        boolean boolean16 = csvReader10.skipRecord();
        char char17 = csvReader10.getDelimiter();
        boolean boolean18 = csvReader10.skipLine();
        boolean boolean19 = csvReader10.skipLine();
        java.lang.String[] strArray20 = csvReader10.getValues();
        csvWriter1.writeRecord(strArray20);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertNotNull(csvReader10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + ',' + "'", char17 == ',');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("manager_112327586653400", "User [name= FALSE, id=97, email=, password=]");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        csvWriter1.setComment('\"');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("password_112325847983500");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        parking.ParkingLot parkingLot33 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace35 = parkingLot33.getParkingSpace((int) ' ');
        reservations.Reservation reservation36 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace35);
        int int37 = reservation36.getDay();
        parking.ParkingSpace parkingSpace38 = reservation36.getSpace();
        users.FacultyMember facultyMember41 = new users.FacultyMember("", "hi!");
        int int42 = reservationSystemFacade0.calculateOutstanding(reservation36, (users.UserInfo) facultyMember41);
        reservations.Reservation reservation43 = null;
        users.FacultyMember facultyMember46 = new users.FacultyMember("", "hi!");
        java.lang.String str47 = facultyMember46.parkinglot;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystemFacade0.cancelBooking(reservation43, (users.UserInfo) facultyMember46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade2 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((int) ' ');
        reservations.Reservation reservation13 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace12);
        users.FacultyMember facultyMember16 = new users.FacultyMember("", "hi!");
        int int17 = facultyMember16.parkingspacenum;
        int int18 = reservationSystemFacade2.calculateOutstanding(reservation13, (users.UserInfo) facultyMember16);
        manager.SuperManager superManager19 = manager.SuperManager.getInstance();
        java.lang.String str20 = superManager19.firstName;
        users.Student student23 = new users.Student("", "hi!");
        boolean boolean24 = superManager19.validateUser((users.UserInfo) student23);
        paymentStrategy.PaymentInfo paymentInfo25 = student23.getPaymentInfo();
        student23.setValid();
        int int27 = reservationSystemFacade0.calculateOutstanding(reservation13, (users.UserInfo) student23);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap28 = reservationSystemFacade0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap29 = reservationSystemFacade0.getLots();
        parking.ParkingLot parkingLot42 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace44 = parkingLot42.getParkingSpace((int) ' ');
        reservations.Reservation reservation45 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace44);
        int int46 = reservation45.getDay();
        parking.ParkingSpace parkingSpace47 = reservation45.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList48 = parkingSpace47.getReservations();
        parkingSpace47.setId(0);
        int int51 = parkingSpace47.getId();
        reservations.Reservation reservation52 = new reservations.Reservation((int) (byte) -1, 97, (int) (short) -1, 768, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", parkingSpace47);
        users.NonFacultyStaff nonFacultyStaff55 = new users.NonFacultyStaff("hi!", "");
        java.lang.String str56 = nonFacultyStaff55.getEmail();
        int int57 = nonFacultyStaff55.getParkingRate();
        paymentStrategy.DebitPaymentProvider debitPaymentProvider58 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context59 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider58);
        paymentStrategy.PaymentInfo paymentInfo65 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo65.setBillingName("FALSE");
        paymentInfo65.setCardNum(1);
        paymentInfo65.setExpDate(768);
        boolean boolean73 = debitPaymentProvider58.handlePayment(paymentInfo65, (double) (byte) 1);
        reservationSystemFacade0.payBalance(reservation52, (users.UserInfo) nonFacultyStaff55, (paymentStrategy.PaymentProvider) debitPaymentProvider58);
        int int75 = nonFacultyStaff55.getParkingRate();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intMap28);
        org.junit.Assert.assertNotNull(intMap29);
        org.junit.Assert.assertNotNull(parkingSpace44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(parkingSpace47);
        org.junit.Assert.assertNotNull(reservationList48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.toString();
        java.lang.Class<?> wildcardClass13 = user6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        csvReader1.setComment('a');
        char char11 = csvReader1.getTextQualifier();
        char char12 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'a' + "'", char12 == 'a');
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.fname = "password_112306347644100";
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("password_112284545599300", '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot((int) (byte) 100);
        parking.ParkingLot parkingLot9 = parkingSystem0.getLot((int) (short) 10);
        parking.ParkingSpace parkingSpace12 = parkingSystem0.getParkingSpace((int) ',', (int) (byte) 0);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(parkingLot7);
        org.junit.Assert.assertNotNull(parkingLot9);
        org.junit.Assert.assertNotNull(parkingSpace12);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        facultyMember2.setValid();
        java.lang.String str7 = facultyMember2.getPassword();
        facultyMember2.parkinglot = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        parking.ParkingSpace parkingSpace12 = reservation10.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList13 = parkingSpace12.getReservations();
        parkingState.State state14 = parkingSpace12.getSensorStatus();
        parkingState.Enabled enabled15 = new parkingState.Enabled();
        java.lang.String str16 = enabled15.handleState();
        java.lang.String str17 = enabled15.handleState();
        java.lang.String str18 = enabled15.handleState();
        parkingSpace12.setState((parkingState.State) enabled15);
        java.lang.String str20 = enabled15.handleState();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        parkingState.Occupied occupied1 = new parkingState.Occupied("Password!23");
        java.lang.String str2 = occupied1.handleState();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Password!23" + "'", str2, "Password!23");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) (byte) 100, "hi!");
        parkingLot2.setEnabled(true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.csvreader.CsvReader csvReader2 = null; // flaky: new com.csvreader.CsvReader("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", '\"');
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.email;
        user6.isValidated = false;
        user6.setType("User [name= FALSE, id=97, email=, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        boolean boolean9 = user6.isValidated;
        java.lang.String str10 = user6.password;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration(2);
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parkingState.State state15 = parkingSpace14.getSensorStatus();
        parkingSpace14.setEnabled(false);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state15);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("password_112325847983500", 'a');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112325847983500 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        boolean boolean10 = csvReader1.getTrimWhitespace();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) '\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        java.lang.String str2 = superManager0.lastName;
        superManager0.lastName = "password_112325847983500";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        char char5 = csvWriter1.getComment();
        csvWriter1.setDelimiter('a');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        java.lang.String str10 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        parking.ParkingLot parkingLot17 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace19 = parkingLot17.getParkingSpace((int) ' ');
        reservations.Reservation reservation20 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace19);
        parkingState.State state21 = parkingSpace19.getSensorStatus();
        reservations.Reservation reservation22 = new reservations.Reservation((int) (byte) 0, 2, (int) (byte) 0, 2, "admin", parkingSpace19);
        reservations.Reservation reservation23 = new reservations.Reservation((int) (byte) 1, (int) (byte) 10, (int) (short) -1, 100, "Password!23", parkingSpace19);
        parkingSpace19.setId(15);
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNotNull(state21);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("", "password_112325847983500", "password_112306347644100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        paymentInfo7.setCardNum(1);
        boolean boolean13 = context1.execute(paymentInfo7, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo19 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int20 = paymentInfo19.getSecurityCode();
        java.lang.String str21 = paymentInfo19.getBillingAddress();
        java.util.Date date23 = null;
        paymentInfo19.parkingInfo(0, date23, "hi!", "hi!", (int) (short) 1);
        int int28 = paymentInfo19.getExpDate();
        boolean boolean30 = context1.execute(paymentInfo19, (double) 5);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide31 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo37 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int38 = paymentInfo37.getSecurityCode();
        java.lang.String str39 = paymentInfo37.getBillingAddress();
        java.util.Date date41 = null;
        paymentInfo37.parkingInfo(0, date41, "hi!", "hi!", (int) (short) 1);
        boolean boolean47 = creditPaymentProvide31.handlePayment(paymentInfo37, (double) 8);
        paymentStrategy.OtherTypeProvider otherTypeProvider48 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context49 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider48);
        paymentStrategy.PaymentInfo paymentInfo55 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo55.setBillingName("FALSE");
        paymentInfo55.setCardNum(1);
        boolean boolean61 = context49.execute(paymentInfo55, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo67 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int68 = paymentInfo67.getSecurityCode();
        java.lang.String str69 = paymentInfo67.getBillingAddress();
        java.util.Date date71 = null;
        paymentInfo67.parkingInfo(0, date71, "hi!", "hi!", (int) (short) 1);
        int int76 = paymentInfo67.getExpDate();
        boolean boolean78 = context49.execute(paymentInfo67, (double) 5);
        paymentInfo67.setSecurityCode((int) '\"');
        boolean boolean82 = creditPaymentProvide31.handlePayment(paymentInfo67, (double) ' ');
        int int83 = paymentInfo67.getSecurityCode();
        int int84 = paymentInfo67.getSecurityCode();
        java.lang.String str85 = paymentInfo67.getBillingName();
        boolean boolean87 = context1.execute(paymentInfo67, (-1.0d));
        double double88 = paymentInfo67.getCardBallance();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 34 + "'", int83 == 34);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 34 + "'", int84 == 34);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("Password!23");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File Password!23 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(264, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        boolean boolean3 = parkingLot2.getEnabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        superManager0.lastName = "hi!";
        java.lang.String str5 = superManager0.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str5, "User [name= hi!, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        boolean boolean4 = csvReader1.isQualified((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        student4.setValid();
        int int8 = student4.getParkingRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            parking.ParkingSpace parkingSpace8 = parkingSystem0.getParkingSpace(264, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid space id");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("hi!", "admin");
        paymentStrategy.PaymentInfo paymentInfo3 = nonFacultyStaff2.getPaymentInfo();
        nonFacultyStaff2.parkinglot = "password_112306347644100";
        org.junit.Assert.assertNull(paymentInfo3);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((-1), "Password!23");
        java.lang.String str3 = parkingLot2.getAddress();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password!23" + "'", str3, "Password!23");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentStrategy.OtherTypeProvider otherTypeProvider11 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context12 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider11);
        paymentStrategy.PaymentInfo paymentInfo18 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo18.setBillingName("FALSE");
        paymentInfo18.setCardNum(1);
        boolean boolean24 = context12.execute(paymentInfo18, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo30 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int31 = paymentInfo30.getSecurityCode();
        java.lang.String str32 = paymentInfo30.getBillingAddress();
        java.util.Date date34 = null;
        paymentInfo30.parkingInfo(0, date34, "hi!", "hi!", (int) (short) 1);
        int int39 = paymentInfo30.getExpDate();
        boolean boolean41 = context12.execute(paymentInfo30, (double) 5);
        boolean boolean43 = otherTypeProvider0.handlePayment(paymentInfo30, (double) 34);
        paymentStrategy.OtherTypeProvider otherTypeProvider44 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo50 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo50.setBillingName("FALSE");
        boolean boolean54 = otherTypeProvider44.handlePayment(paymentInfo50, (double) (short) 1);
        paymentInfo50.setCardBallance(10.0d);
        double double57 = paymentInfo50.getCardBallance();
        paymentInfo50.setExpDate((int) 'a');
        java.util.Date date61 = null;
        paymentInfo50.parkingInfo((int) '4', date61, "User [name= hi!, id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]", (int) (byte) 10);
        paymentInfo50.setSecurityCode((-1));
        boolean boolean69 = otherTypeProvider0.handlePayment(paymentInfo50, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("", ' ');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File  does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("admin");
        manager.Manager manager4 = superManager0.autoGenerator();
        manager4.setPassword("");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) (byte) 0);
        java.lang.String str4 = parkingLot3.getAddress();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingLot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSkipEmptyRecords(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider1 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        boolean boolean11 = otherTypeProvider1.handlePayment(paymentInfo7, (double) (short) 1);
        paymentInfo7.setCardBallance(10.0d);
        double double14 = paymentInfo7.getCardBallance();
        int int15 = paymentInfo7.getCardNum();
        boolean boolean17 = creditPaymentProvide0.handlePayment(paymentInfo7, (double) '4');
        paymentStrategy.PaymentInfo paymentInfo23 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int24 = paymentInfo23.getSecurityCode();
        java.lang.String str25 = paymentInfo23.getBillingAddress();
        boolean boolean27 = creditPaymentProvide0.handlePayment(paymentInfo23, (double) 97);
        int int28 = paymentInfo23.getSecurityCode();
        paymentInfo23.setBillingAddress("User [name= FALSE, id=97, email=hi!, password=hi!]");
        paymentInfo23.setBillingAddress("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        maintainUser0.path = "hi!";
        userLogin.MaintainUser maintainUser5 = new userLogin.MaintainUser();
        java.lang.String str6 = maintainUser5.path;
        userLogin.MaintainUser maintainUser7 = new userLogin.MaintainUser();
        maintainUser7.update("admin");
        java.util.ArrayList<userLogin.User> userList10 = maintainUser7.users;
        maintainUser5.users = userList10;
        maintainUser0.users = userList10;
        maintainUser0.path = "hi!";
        java.lang.String str15 = maintainUser0.path;
        maintainUser0.path = "password_112296757334200";
        maintainUser0.path = "password_112296757334200";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot((int) (byte) 100);
        java.lang.String str8 = parkingLot7.getAddress();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(parkingLot7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        java.lang.String str9 = paymentInfo5.getBillingName();
        java.util.Date date11 = null;
        paymentInfo5.parkingInfo((int) (short) 100, date11, "User [name= FALSE, id=97, email=, password=]", "password_112310734370300", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str8, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        java.lang.String str4 = maintainUser0.path;
        java.util.ArrayList<userLogin.User> userList5 = maintainUser0.users;
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        int int9 = csvReader1.getHeaderCount();
        boolean boolean10 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        userLogin.User user0 = new userLogin.User();
        int int1 = user0.id;
        boolean boolean2 = user0.isValidated;
        java.lang.String str3 = user0.password;
        user0.id = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "User [name= FALSE, id=97, email=, password=]");
        int int3 = nonFacultyStaff2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = csvReader1.getValues();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        csvReader1.setDelimiter('\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = csvReader1.getHeader((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot((int) (byte) 100);
        parking.ParkingLot parkingLot9 = parkingSystem0.getLot(100);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(parkingLot7);
        org.junit.Assert.assertNotNull(parkingLot9);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        userLogin.User user6 = new userLogin.User("User [name= hi!, id=97, email=hi!, password=admin]", "manager_112305914121600", (int) (short) 10, "password_112310734370300", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]", "User [name= FALSE, id=97, email=, password=]");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade2 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((int) ' ');
        reservations.Reservation reservation13 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace12);
        users.FacultyMember facultyMember16 = new users.FacultyMember("", "hi!");
        int int17 = facultyMember16.parkingspacenum;
        int int18 = reservationSystemFacade2.calculateOutstanding(reservation13, (users.UserInfo) facultyMember16);
        manager.SuperManager superManager19 = manager.SuperManager.getInstance();
        java.lang.String str20 = superManager19.firstName;
        users.Student student23 = new users.Student("", "hi!");
        boolean boolean24 = superManager19.validateUser((users.UserInfo) student23);
        paymentStrategy.PaymentInfo paymentInfo25 = student23.getPaymentInfo();
        student23.setValid();
        int int27 = reservationSystemFacade0.calculateOutstanding(reservation13, (users.UserInfo) student23);
        parking.ParkingLot parkingLot30 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace32 = parkingLot30.getParkingSpace((int) ' ');
        boolean boolean33 = parkingLot30.getEnabled();
        parking.ParkingSpace parkingSpace35 = parkingLot30.getParkingSpace(10);
        parking.ParkingSpace parkingSpace42 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation43 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace42);
        parkingSpace35.setReservation(reservation43);
        users.Visitor visitor47 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        visitor47.setValid();
        reservationSystemFacade0.cancelBooking(reservation43, (users.UserInfo) visitor47);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap50 = reservationSystemFacade0.getLots();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertNotNull(intMap50);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("FALSE", ',', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        maintainUser2.path = "hi!";
        userLogin.MaintainUser maintainUser7 = new userLogin.MaintainUser();
        java.lang.String str8 = maintainUser7.path;
        userLogin.MaintainUser maintainUser9 = new userLogin.MaintainUser();
        maintainUser9.update("admin");
        java.util.ArrayList<userLogin.User> userList12 = maintainUser9.users;
        maintainUser7.users = userList12;
        maintainUser2.users = userList12;
        maintainUser0.users = userList12;
        java.util.ArrayList<userLogin.User> userList16 = maintainUser0.users;
        maintainUser0.update("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        java.util.ArrayList<userLogin.User> userList19 = maintainUser0.users;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("password_112310734370300");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112310734370300 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("admin");
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.write("manager_112305914121600", false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        parkingState.State state16 = parkingSpace14.getSensorStatus();
        reservations.Reservation reservation17 = new reservations.Reservation((int) (byte) 0, 2, (int) (byte) 0, 2, "admin", parkingSpace14);
        parkingState.Unoccupied unoccupied18 = new parkingState.Unoccupied();
        java.lang.String str19 = unoccupied18.handleState();
        parkingSpace14.setState((parkingState.State) unoccupied18);
        java.lang.String str21 = unoccupied18.handleState();
        java.lang.String str22 = unoccupied18.handleState();
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.Unoccupied unoccupied11 = new parkingState.Unoccupied();
        java.lang.String str12 = unoccupied11.handleState();
        parkingSpace9.setState((parkingState.State) unoccupied11);
        java.lang.String str14 = unoccupied11.handleState();
        java.lang.String str15 = unoccupied11.handleState();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.toString();
        java.lang.String str12 = user6.getPassword();
        user6.setEmail("password_112296757334200");
        java.lang.String str15 = user6.lname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str11, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str15, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.FacultyMember facultyMember4 = new users.FacultyMember("", "hi!");
        boolean boolean5 = facultyMember4.getIsValid();
        boolean boolean6 = facultyMember4.getIsValid();
        boolean boolean7 = superManager0.validateUser((users.UserInfo) facultyMember4);
        superManager0.setUsername("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        superManager0.firstName = "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace((int) '4');
        reservations.Reservation reservation2 = null;
        parkingSpace1.setReservation(reservation2);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        boolean boolean9 = csvReader1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name=null null, id=0, email=null, password=null]");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        reservations.ReservationSystemFacade reservationSystemFacade1 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = reservationSystemFacade1.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade3 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot11 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace13 = parkingLot11.getParkingSpace((int) ' ');
        reservations.Reservation reservation14 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace13);
        users.FacultyMember facultyMember17 = new users.FacultyMember("", "hi!");
        int int18 = facultyMember17.parkingspacenum;
        int int19 = reservationSystemFacade3.calculateOutstanding(reservation14, (users.UserInfo) facultyMember17);
        users.Student student22 = new users.Student("", "hi!");
        int int23 = student22.getParkingRate();
        reservationSystemFacade1.cancelBooking(reservation14, (users.UserInfo) student22);
        users.FacultyMember facultyMember27 = new users.FacultyMember("", "hi!");
        int int28 = facultyMember27.parkingspacenum;
        facultyMember27.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade31 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot39 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace41 = parkingLot39.getParkingSpace((int) ' ');
        reservations.Reservation reservation42 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace41);
        reservationSystemFacade31.editBooking(reservation42, (int) (byte) 100);
        facultyMember27.currentReservation = reservation42;
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider46 = new paymentStrategy.MobilePaymentProvider();
        reservationSystemFacade0.payBalance(reservation14, (users.UserInfo) facultyMember27, (paymentStrategy.PaymentProvider) mobilePaymentProvider46);
        reservations.ReservationSystemFacade reservationSystemFacade48 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot56 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace58 = parkingLot56.getParkingSpace((int) ' ');
        reservations.Reservation reservation59 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace58);
        users.FacultyMember facultyMember62 = new users.FacultyMember("", "hi!");
        int int63 = facultyMember62.parkingspacenum;
        int int64 = reservationSystemFacade48.calculateOutstanding(reservation59, (users.UserInfo) facultyMember62);
        reservationSystemFacade0.editBooking(reservation59, 768);
        java.lang.String str67 = reservation59.getPlate();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(reservationSystemFacade1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(reservationSystemFacade3);
        org.junit.Assert.assertNotNull(parkingSpace13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade31);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertNotNull(reservationSystemFacade48);
        org.junit.Assert.assertNotNull(parkingSpace58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "admin" + "'", str67, "admin");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("FALSE", "password_112284545599300", "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(1);
        parkingSpace7.setEnabled(false);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("password_112325847983500", '\"', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        char char2 = csvReader1.getTextQualifier();
        long long3 = csvReader1.getCurrentRecord();
        boolean boolean4 = csvReader1.skipRecord();
        csvReader1.setSkipEmptyRecords(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\"' + "'", char2 == '\"');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        maintainUser0.update("User [name= hi!, id=97, email=hi!, password=]");
        maintainUser0.path = "password_112296757334200";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "FALSE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str3, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        csvWriter1.setTextQualifier('a');
        boolean boolean10 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("", "hi!");
        java.lang.String str3 = nonFacultyStaff2.getEmail();
        boolean boolean4 = nonFacultyStaff2.getIsValid();
        nonFacultyStaff2.setValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        parkingState.Occupied occupied1 = new parkingState.Occupied("User [name= hi!, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        userLogin.User user6 = new userLogin.User("", "User [name= FALSE, id=97, email=, password=]", 100, "User [name= FALSE, id=97, email=, password=]", "password_112310734370300", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        userLogin.User user0 = new userLogin.User();
        user0.isValidated = true;
        user0.setId((int) (byte) 0);
        int int5 = user0.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("password_112296757334200", ',', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("password_112310734370300");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112310734370300 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = manager3.getPassword();
        manager3.lastName = "User [name= hi!, id=97, email=hi!, password=admin]";
        manager3.setUsername("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        java.lang.String str9 = manager3.firstName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112338187831000" + "'", str4, "password_112338187831000");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        int int9 = paymentInfo5.getCardNum();
        int int10 = paymentInfo5.getExpDate();
        paymentInfo5.setSecurityCode((int) (byte) 10);
        paymentInfo5.setBillingAddress("password_112284545599300");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        char char9 = csvWriter1.getTextQualifier();
        char char10 = csvWriter1.getRecordDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        csvReader1.setCaptureRawRecord(false);
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo17 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int18 = paymentInfo17.getSecurityCode();
        java.lang.String str19 = paymentInfo17.getBillingAddress();
        java.util.Date date21 = null;
        paymentInfo17.parkingInfo(0, date21, "hi!", "hi!", (int) (short) 1);
        boolean boolean27 = debitPaymentProvider0.handlePayment(paymentInfo17, (double) (short) -1);
        paymentInfo17.setBillingName("Password!23");
        paymentInfo17.setCardBallance((double) 32);
        paymentInfo17.setExpDate((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        manager.Manager manager2 = new manager.Manager("", "admin");
        manager2.setUsername("User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingSpace9.setEnabled(true);
        org.junit.Assert.assertNotNull(parkingSpace9);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter9 = new com.csvreader.CsvWriter("");
        csvWriter9.setRecordDelimiter('\"');
        boolean boolean12 = csvWriter9.getUseTextQualifier();
        com.csvreader.CsvReader csvReader14 = com.csvreader.CsvReader.parse("hi!");
        char char15 = csvReader14.getComment();
        char char16 = csvReader14.getTextQualifier();
        java.lang.String[] strArray17 = csvReader14.getHeaders();
        java.lang.String[] strArray18 = csvReader14.getValues();
        csvWriter9.writeRecord(strArray18);
        csvWriter1.writeRecord(strArray18);
        csvWriter1.setDelimiter('\"');
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(csvReader14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '#' + "'", char15 == '#');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        boolean boolean10 = csvReader1.skipLine();
        com.csvreader.CsvWriter csvWriter12 = new com.csvreader.CsvWriter("");
        csvWriter12.setRecordDelimiter('\"');
        boolean boolean15 = csvWriter12.getUseTextQualifier();
        com.csvreader.CsvReader csvReader17 = com.csvreader.CsvReader.parse("hi!");
        char char18 = csvReader17.getComment();
        char char19 = csvReader17.getTextQualifier();
        java.lang.String[] strArray20 = csvReader17.getHeaders();
        java.lang.String[] strArray21 = csvReader17.getValues();
        csvWriter12.writeRecord(strArray21);
        csvReader1.setHeaders(strArray21);
        boolean boolean24 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(csvReader17);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '#' + "'", char18 == '#');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\"' + "'", char19 == '\"');
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("User [name=null null, id=0, email=null, password=null]");
        users.Visitor visitor6 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=hi!]");
        int int7 = visitor6.getParkingRate();
        boolean boolean8 = superManager0.validateUser((users.UserInfo) visitor6);
        superManager0.firstName = "password_112296757334200";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]" + "'", str1, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) (byte) 0, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        boolean boolean3 = parkingLot2.getEnabled();
        boolean boolean4 = parkingLot2.getEnabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        manager.Manager manager2 = new manager.Manager("hi!", "");
        manager2.setPassword("manager_112305914121600");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str9 = csvReader1.getRawRecord();
        boolean boolean10 = csvReader1.getCaptureRawRecord();
        boolean boolean11 = csvReader1.getUseTextQualifier();
        char char12 = csvReader1.getDelimiter();
        java.lang.String str14 = csvReader1.getHeader(0);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        boolean boolean9 = user6.isValidated;
        user6.setType("Password!23");
        user6.setName("admin", "password_112284545599300");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(768, "password_112338187831000");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentStrategy.Context context11 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.OtherTypeProvider otherTypeProvider12 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo18 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo18.setBillingName("FALSE");
        boolean boolean22 = otherTypeProvider12.handlePayment(paymentInfo18, (double) (short) 1);
        paymentInfo18.setCardBallance(10.0d);
        double double25 = paymentInfo18.getCardBallance();
        paymentInfo18.setExpDate((int) 'a');
        paymentInfo18.setBillingName("User [name= FALSE, id=97, email=hi!, password=hi!]");
        boolean boolean31 = context11.execute(paymentInfo18, (double) (short) 0);
        paymentInfo18.setBillingAddress("User [name= FALSE, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        user6.email = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        java.lang.String str15 = user6.type;
        user6.setEmail("Password!23");
        int int18 = user6.getId();
        java.lang.String str19 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.Disabled disabled12 = new parkingState.Disabled();
        parkingSpace9.setState((parkingState.State) disabled12);
        java.lang.String str14 = disabled12.handleState();
        java.lang.String str15 = disabled12.handleState();
        java.lang.String str16 = disabled12.handleState();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        boolean boolean2 = user0.isValidated;
        java.lang.String str3 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("manager_112327586653400", '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        users.FacultyMember facultyMember2 = new users.FacultyMember("hi!", "User [name= hi!, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.getHeader((int) ',');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getComment();
        boolean boolean4 = csvReader1.getUseComments();
        boolean boolean5 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        reservations.ReservationSystemFacade reservationSystemFacade1 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = reservationSystemFacade1.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade3 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot11 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace13 = parkingLot11.getParkingSpace((int) ' ');
        reservations.Reservation reservation14 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace13);
        users.FacultyMember facultyMember17 = new users.FacultyMember("", "hi!");
        int int18 = facultyMember17.parkingspacenum;
        int int19 = reservationSystemFacade3.calculateOutstanding(reservation14, (users.UserInfo) facultyMember17);
        users.Student student22 = new users.Student("", "hi!");
        int int23 = student22.getParkingRate();
        reservationSystemFacade1.cancelBooking(reservation14, (users.UserInfo) student22);
        users.FacultyMember facultyMember27 = new users.FacultyMember("", "hi!");
        int int28 = facultyMember27.parkingspacenum;
        facultyMember27.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade31 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot39 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace41 = parkingLot39.getParkingSpace((int) ' ');
        reservations.Reservation reservation42 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace41);
        reservationSystemFacade31.editBooking(reservation42, (int) (byte) 100);
        facultyMember27.currentReservation = reservation42;
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider46 = new paymentStrategy.MobilePaymentProvider();
        reservationSystemFacade0.payBalance(reservation14, (users.UserInfo) facultyMember27, (paymentStrategy.PaymentProvider) mobilePaymentProvider46);
        reservations.ReservationSystemFacade reservationSystemFacade48 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot56 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace58 = parkingLot56.getParkingSpace((int) ' ');
        reservations.Reservation reservation59 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace58);
        users.FacultyMember facultyMember62 = new users.FacultyMember("", "hi!");
        int int63 = facultyMember62.parkingspacenum;
        int int64 = reservationSystemFacade48.calculateOutstanding(reservation59, (users.UserInfo) facultyMember62);
        reservationSystemFacade0.editBooking(reservation59, 768);
        reservation59.updateDuration(32);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(reservationSystemFacade1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(reservationSystemFacade3);
        org.junit.Assert.assertNotNull(parkingSpace13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade31);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertNotNull(reservationSystemFacade48);
        org.junit.Assert.assertNotNull(parkingSpace58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setId((-1));
        boolean boolean10 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        java.lang.String str6 = csvReader1.get(97);
        csvReader1.setRecordDelimiter('\"');
        csvReader1.close();
        int int10 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        paymentStrategy.PaymentInfo paymentInfo24 = student21.getPaymentInfo();
        int int25 = student21.getParkingRate();
        boolean boolean26 = student21.getIsValid();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(paymentInfo24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        csvWriter1.setComment('#');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(100, "admin");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.toString();
        java.lang.String str9 = user6.type;
        user6.setEmail("password_112336809022100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str8, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) 0, 100, "", "password_112306347644100", 35);
        double double6 = paymentInfo5.getCardBallance();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = creditPaymentProvide0.handlePayment(paymentInfo6, (double) 8);
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int23 = paymentInfo22.getSecurityCode();
        int int24 = paymentInfo22.getSecurityCode();
        double double25 = paymentInfo22.getCardBallance();
        boolean boolean27 = creditPaymentProvide0.handlePayment(paymentInfo22, (double) '#');
        int int28 = paymentInfo22.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        csvReader1.close();
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = csvReader1.getValues();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("FALSE", "Password!23");
        int int3 = nonFacultyStaff2.parkingspacenum;
        reservations.Reservation reservation4 = nonFacultyStaff2.currentReservation;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(reservation4);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("password_112306347644100", '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("FALSE");
        boolean boolean2 = csvReader1.getSafetySwitch();
        csvReader1.setDelimiter('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        facultyMember14.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade18 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot26 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace28 = parkingLot26.getParkingSpace((int) ' ');
        reservations.Reservation reservation29 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace28);
        reservationSystemFacade18.editBooking(reservation29, (int) (byte) 100);
        facultyMember14.currentReservation = reservation29;
        paymentStrategy.OtherTypeProvider otherTypeProvider33 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo39 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo39.setBillingName("FALSE");
        boolean boolean43 = otherTypeProvider33.handlePayment(paymentInfo39, (double) (short) 1);
        paymentInfo39.setCardBallance(10.0d);
        facultyMember14.setPaymentInfo(paymentInfo39);
        boolean boolean48 = debitPaymentProvider0.handlePayment(paymentInfo39, (double) '4');
        int int49 = paymentInfo39.getExpDate();
        paymentInfo39.setExpDate(8);
        java.lang.String str52 = paymentInfo39.getBillingAddress();
        int int53 = paymentInfo39.getCardNum();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade18);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getColumnCount();
        int int8 = csvReader1.getEscapeMode();
        boolean boolean9 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        user6.email = "";
        int int13 = user6.id;
        java.lang.String str14 = user6.toString();
        java.lang.String str15 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name= FALSE, id=97, email=, password=]" + "'", str14, "User [name= FALSE, id=97, email=, password=]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        manager.Manager manager2 = new manager.Manager("hi!", "hi!");
        manager2.setUsername("");
        java.lang.String str5 = manager2.firstName;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        char char12 = csvWriter1.getTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        parkingState.Occupied occupied1 = new parkingState.Occupied("password_112284545599300");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        user0.type = "password_112296757334200";
        java.lang.String str4 = user0.email;
        user0.setId(15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        maintainUser0.update("User [name= FALSE, id=97, email=hi!, password=hi!]");
        java.lang.String str6 = maintainUser0.path;
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("admin");
        csvReader1.setComment('\"');
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        int int14 = user6.getId();
        java.lang.String str15 = user6.email;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str15, "User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        manager.Manager manager2 = new manager.Manager("hi!", "");
        manager2.firstName = "Password!23";
        users.UserInfo userInfo5 = null;
        boolean boolean6 = manager2.validateUser(userInfo5);
        java.lang.String str7 = manager2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        manager.Manager manager2 = new manager.Manager("", "password_112337353214100");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        reservations.Reservation reservation17 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace16);
        users.FacultyMember facultyMember20 = new users.FacultyMember("", "hi!");
        int int21 = facultyMember20.parkingspacenum;
        int int22 = reservationSystemFacade6.calculateOutstanding(reservation17, (users.UserInfo) facultyMember20);
        reservation17.updateDuration((int) ' ');
        int int25 = reservation17.getStartTime();
        facultyMember2.currentReservation = reservation17;
        parking.ParkingSpace parkingSpace27 = reservation17.getSpace();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(parkingSpace27);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.toString();
        user6.setType("password_112310734370300");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str8, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        char char10 = csvWriter1.getRecordDelimiter();
        int int11 = csvWriter1.getEscapeMode();
        csvWriter1.setRecordDelimiter('a');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        java.lang.String str15 = user6.email;
        user6.id = 5;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader(inputStream0, '\000', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("", "");
        int int3 = nonFacultyStaff2.parkingspacenum;
        parking.ParkingLot parkingLot11 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace13 = parkingLot11.getParkingSpace((int) ' ');
        boolean boolean14 = parkingSpace13.isEnabled();
        reservations.Reservation reservation15 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace13);
        java.lang.String str16 = reservation15.getPlate();
        int int17 = reservation15.getStartTime();
        nonFacultyStaff2.currentReservation = reservation15;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(parkingSpace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Password!23" + "'", str16, "Password!23");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        int int5 = csvWriter1.getEscapeMode();
        char char6 = csvWriter1.getRecordDelimiter();
        csvWriter1.setTextQualifier('\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        boolean boolean15 = parkingSpace14.isEnabled();
        int int16 = parkingSpace14.getId();
        parkingState.Enabled enabled17 = new parkingState.Enabled();
        java.lang.String str18 = enabled17.handleState();
        java.lang.String str19 = enabled17.handleState();
        java.lang.String str20 = enabled17.handleState();
        parkingSpace14.setState((parkingState.State) enabled17);
        parkingSpace14.setEnabled(false);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.csvreader.CsvReader csvReader2 = null; // flaky: new com.csvreader.CsvReader("hi!", ',');
        boolean boolean3 = false; // flaky: csvReader2.getTrimWhitespace();
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        boolean boolean9 = csvReader1.readRecord();
        com.csvreader.CsvReader csvReader11 = com.csvreader.CsvReader.parse("hi!");
        char char12 = csvReader11.getComment();
        char char13 = csvReader11.getTextQualifier();
        boolean boolean14 = csvReader11.getUseTextQualifier();
        java.lang.String str16 = csvReader11.get((int) '#');
        csvReader11.setTrimWhitespace(false);
        com.csvreader.CsvWriter csvWriter20 = new com.csvreader.CsvWriter("");
        boolean boolean21 = csvWriter20.getUseTextQualifier();
        com.csvreader.CsvReader csvReader23 = com.csvreader.CsvReader.parse("hi!");
        char char24 = csvReader23.getComment();
        char char25 = csvReader23.getTextQualifier();
        java.lang.String[] strArray26 = csvReader23.getHeaders();
        java.lang.String[] strArray27 = csvReader23.getValues();
        csvWriter20.writeRecord(strArray27);
        csvReader11.setHeaders(strArray27);
        csvReader1.setHeaders(strArray27);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(csvReader11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '#' + "'", char12 == '#');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\"' + "'", char13 == '\"');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(csvReader23);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '#' + "'", char24 == '#');
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\"' + "'", char25 == '\"');
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=hi!]");
        csvReader1.setSafetySwitch(false);
        boolean boolean5 = csvReader1.isQualified((int) ',');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        reservations.ReservationSystemFacade reservationSystemFacade1 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = reservationSystemFacade1.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade3 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot11 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace13 = parkingLot11.getParkingSpace((int) ' ');
        reservations.Reservation reservation14 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace13);
        users.FacultyMember facultyMember17 = new users.FacultyMember("", "hi!");
        int int18 = facultyMember17.parkingspacenum;
        int int19 = reservationSystemFacade3.calculateOutstanding(reservation14, (users.UserInfo) facultyMember17);
        users.Student student22 = new users.Student("", "hi!");
        int int23 = student22.getParkingRate();
        reservationSystemFacade1.cancelBooking(reservation14, (users.UserInfo) student22);
        users.FacultyMember facultyMember27 = new users.FacultyMember("", "hi!");
        int int28 = facultyMember27.parkingspacenum;
        facultyMember27.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade31 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot39 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace41 = parkingLot39.getParkingSpace((int) ' ');
        reservations.Reservation reservation42 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace41);
        reservationSystemFacade31.editBooking(reservation42, (int) (byte) 100);
        facultyMember27.currentReservation = reservation42;
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider46 = new paymentStrategy.MobilePaymentProvider();
        reservationSystemFacade0.payBalance(reservation14, (users.UserInfo) facultyMember27, (paymentStrategy.PaymentProvider) mobilePaymentProvider46);
        reservations.ReservationSystemFacade reservationSystemFacade48 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot56 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace58 = parkingLot56.getParkingSpace((int) ' ');
        reservations.Reservation reservation59 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace58);
        users.FacultyMember facultyMember62 = new users.FacultyMember("", "hi!");
        int int63 = facultyMember62.parkingspacenum;
        int int64 = reservationSystemFacade48.calculateOutstanding(reservation59, (users.UserInfo) facultyMember62);
        reservationSystemFacade0.editBooking(reservation59, 768);
        int int67 = reservation59.getMonth();
        parking.ParkingSpace parkingSpace68 = reservation59.getSpace();
        int int69 = parkingSpace68.getId();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(reservationSystemFacade1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(reservationSystemFacade3);
        org.junit.Assert.assertNotNull(parkingSpace13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade31);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertNotNull(reservationSystemFacade48);
        org.junit.Assert.assertNotNull(parkingSpace58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(parkingSpace68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 32 + "'", int69 == 32);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]");
        reservations.Reservation reservation3 = facultyMember2.currentReservation;
        reservations.Reservation reservation4 = facultyMember2.currentReservation;
        org.junit.Assert.assertNull(reservation3);
        org.junit.Assert.assertNull(reservation4);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parkingLot2.setEnabled(true);
        int int5 = parkingLot2.getId();
        boolean boolean6 = parkingLot2.getEnabled();
        parkingLot2.setEnabled(true);
        int int9 = parkingLot2.getId();
        boolean boolean10 = parkingLot2.getEnabled();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getDelimiter();
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        java.lang.String str11 = csvReader1.getHeader(0);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        java.lang.String str8 = user6.password;
        user6.id = 1;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setBillingName("FALSE");
        paymentInfo5.setCardNum(1);
        int int10 = paymentInfo5.getExpDate();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.getPassword();
        user6.lname = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        user6.type = "password_112296757334200";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        users.Student student2 = new users.Student("password_112284545599300", "FALSE");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        int int9 = csvWriter1.getEscapeMode();
        char char10 = csvWriter1.getDelimiter();
        int int11 = csvWriter1.getEscapeMode();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("admin", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        csvReader1.setDelimiter('\"');
        int int12 = csvReader1.getHeaderCount();
        csvReader1.setUseTextQualifier(true);
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        char char2 = csvReader1.getTextQualifier();
        long long3 = csvReader1.getCurrentRecord();
        boolean boolean4 = csvReader1.skipRecord();
        boolean boolean5 = csvReader1.readRecord();
        csvReader1.setComment('4');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\"' + "'", char2 == '\"');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.csvreader.CsvReader csvReader2 = null; // flaky: new com.csvreader.CsvReader("hi!", ',');
// flaky:         csvReader2.setUseTextQualifier(false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setDelimiter(',');
        long long13 = csvReader1.getCurrentRecord();
        java.lang.String str15 = csvReader1.get((int) '4');
        boolean boolean16 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String[] strArray11 = new java.lang.String[] { "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "password_112284545599300", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "FALSE" };
        csvReader1.setHeaders(strArray11);
        java.lang.String[] strArray13 = csvReader1.getValues();
        java.lang.String str15 = csvReader1.get((int) (short) 1);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        superManager0.lastName = "hi!";
        superManager0.lastName = "FALSE";
        java.lang.String str7 = superManager0.firstName;
        users.FacultyMember facultyMember10 = new users.FacultyMember("", "hi!");
        boolean boolean11 = facultyMember10.getIsValid();
        boolean boolean12 = facultyMember10.getIsValid();
        boolean boolean13 = facultyMember10.getIsValid();
        boolean boolean14 = superManager0.validateUser((users.UserInfo) facultyMember10);
        java.lang.String str15 = superManager0.lastName;
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str2, "User [name=null null, id=0, email=null, password=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FALSE" + "'", str15, "FALSE");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("password_112337353214100");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112337353214100 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.toString();
        java.lang.String str11 = user6.getFName();
        user6.setPassword("hi!");
        user6.setName("manager_112305914121600", "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        manager.Manager manager2 = new manager.Manager("", "password_112306347644100");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("Password!23");
        boolean boolean2 = csvWriter1.getForceQualifier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) '#', "");
        // The following exception was thrown during execution in test generation
        try {
            parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace(264);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid space id");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("password_112310734370300");
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (byte) 100, (int) (short) -1, "User [name=null null, id=0, email=null, password=null]", "User [name= hi!, id=97, email=hi!, password=admin]", 768);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot((int) (byte) 100);
        boolean boolean9 = parkingSystem0.isLotEnabled((int) (short) 0);
        parking.ParkingSpace parkingSpace12 = null; // flaky: parkingSystem0.getParkingSpace((int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace12);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("password_112284545599300", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        csvReader1.setEscapeMode(2);
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        reservations.ReservationSystemFacade reservationSystemFacade25 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap26 = reservationSystemFacade25.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade27 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot35 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace37 = parkingLot35.getParkingSpace((int) ' ');
        reservations.Reservation reservation38 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace37);
        users.FacultyMember facultyMember41 = new users.FacultyMember("", "hi!");
        int int42 = facultyMember41.parkingspacenum;
        int int43 = reservationSystemFacade27.calculateOutstanding(reservation38, (users.UserInfo) facultyMember41);
        users.Student student46 = new users.Student("", "hi!");
        int int47 = student46.getParkingRate();
        reservationSystemFacade25.cancelBooking(reservation38, (users.UserInfo) student46);
        reservations.ReservationSystemFacade reservationSystemFacade49 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap50 = reservationSystemFacade49.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade51 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot59 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace61 = parkingLot59.getParkingSpace((int) ' ');
        reservations.Reservation reservation62 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace61);
        users.FacultyMember facultyMember65 = new users.FacultyMember("", "hi!");
        int int66 = facultyMember65.parkingspacenum;
        int int67 = reservationSystemFacade51.calculateOutstanding(reservation62, (users.UserInfo) facultyMember65);
        manager.SuperManager superManager68 = manager.SuperManager.getInstance();
        java.lang.String str69 = superManager68.firstName;
        users.Student student72 = new users.Student("", "hi!");
        boolean boolean73 = superManager68.validateUser((users.UserInfo) student72);
        paymentStrategy.PaymentInfo paymentInfo74 = student72.getPaymentInfo();
        student72.setValid();
        int int76 = reservationSystemFacade49.calculateOutstanding(reservation62, (users.UserInfo) student72);
        java.lang.String str77 = student72.getPassword();
        paymentStrategy.PaymentInfo paymentInfo83 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        student72.setPaymentInfo(paymentInfo83);
        int int85 = reservationSystemFacade0.calculateOutstanding(reservation38, (users.UserInfo) student72);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap86 = reservationSystemFacade0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap87 = reservationSystemFacade0.getLots();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intMap24);
        org.junit.Assert.assertNotNull(reservationSystemFacade25);
        org.junit.Assert.assertNotNull(intMap26);
        org.junit.Assert.assertNotNull(reservationSystemFacade27);
        org.junit.Assert.assertNotNull(parkingSpace37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertNotNull(reservationSystemFacade49);
        org.junit.Assert.assertNotNull(intMap50);
        org.junit.Assert.assertNotNull(reservationSystemFacade51);
        org.junit.Assert.assertNotNull(parkingSpace61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(superManager68);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(paymentInfo74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(intMap86);
        org.junit.Assert.assertNotNull(intMap87);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getValidation();
        java.lang.String str13 = user6.getPassword();
        java.lang.String str14 = user6.getValidation();
        user6.id = (byte) 1;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FALSE" + "'", str14, "FALSE");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getColumnCount();
        boolean boolean8 = csvReader1.getUseTextQualifier();
        csvReader1.setSkipEmptyRecords(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("User [name=null null, id=0, email=null, password=null]");
        java.lang.String str4 = superManager0.getUsername();
        users.FacultyMember facultyMember7 = new users.FacultyMember("", "hi!");
        int int8 = facultyMember7.parkingspacenum;
        facultyMember7.parkinglot = "hi!";
        int int11 = facultyMember7.parkingspacenum;
        boolean boolean12 = superManager0.validateUser((users.UserInfo) facultyMember7);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str1, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str4, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        char char6 = csvWriter1.getRecordDelimiter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        csvReader1.setComment('a');
        char char11 = csvReader1.getTextQualifier();
        boolean boolean12 = csvReader1.getCaptureRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        users.FacultyMember facultyMember2 = new users.FacultyMember("password_112296757334200", "hi!");
        java.lang.String str3 = facultyMember2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", '\"', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        reservations.ReservationSystemFacade reservationSystemFacade25 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap26 = reservationSystemFacade25.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade27 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot35 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace37 = parkingLot35.getParkingSpace((int) ' ');
        reservations.Reservation reservation38 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace37);
        users.FacultyMember facultyMember41 = new users.FacultyMember("", "hi!");
        int int42 = facultyMember41.parkingspacenum;
        int int43 = reservationSystemFacade27.calculateOutstanding(reservation38, (users.UserInfo) facultyMember41);
        users.Student student46 = new users.Student("", "hi!");
        int int47 = student46.getParkingRate();
        reservationSystemFacade25.cancelBooking(reservation38, (users.UserInfo) student46);
        reservations.ReservationSystemFacade reservationSystemFacade49 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap50 = reservationSystemFacade49.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade51 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot59 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace61 = parkingLot59.getParkingSpace((int) ' ');
        reservations.Reservation reservation62 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace61);
        users.FacultyMember facultyMember65 = new users.FacultyMember("", "hi!");
        int int66 = facultyMember65.parkingspacenum;
        int int67 = reservationSystemFacade51.calculateOutstanding(reservation62, (users.UserInfo) facultyMember65);
        manager.SuperManager superManager68 = manager.SuperManager.getInstance();
        java.lang.String str69 = superManager68.firstName;
        users.Student student72 = new users.Student("", "hi!");
        boolean boolean73 = superManager68.validateUser((users.UserInfo) student72);
        paymentStrategy.PaymentInfo paymentInfo74 = student72.getPaymentInfo();
        student72.setValid();
        int int76 = reservationSystemFacade49.calculateOutstanding(reservation62, (users.UserInfo) student72);
        java.lang.String str77 = student72.getPassword();
        paymentStrategy.PaymentInfo paymentInfo83 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        student72.setPaymentInfo(paymentInfo83);
        int int85 = reservationSystemFacade0.calculateOutstanding(reservation38, (users.UserInfo) student72);
        int int86 = reservation38.getDuration();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intMap24);
        org.junit.Assert.assertNotNull(reservationSystemFacade25);
        org.junit.Assert.assertNotNull(intMap26);
        org.junit.Assert.assertNotNull(reservationSystemFacade27);
        org.junit.Assert.assertNotNull(parkingSpace37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertNotNull(reservationSystemFacade49);
        org.junit.Assert.assertNotNull(intMap50);
        org.junit.Assert.assertNotNull(reservationSystemFacade51);
        org.junit.Assert.assertNotNull(parkingSpace61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(superManager68);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(paymentInfo74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        maintainUser0.path = "hi!";
        userLogin.MaintainUser maintainUser5 = new userLogin.MaintainUser();
        java.lang.String str6 = maintainUser5.path;
        userLogin.MaintainUser maintainUser7 = new userLogin.MaintainUser();
        maintainUser7.update("admin");
        java.util.ArrayList<userLogin.User> userList10 = maintainUser7.users;
        maintainUser5.users = userList10;
        maintainUser0.users = userList10;
        maintainUser0.path = "hi!";
        maintainUser0.load("admin");
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name= hi!, id=97, email=hi!, password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=97, email=hi!, password=admin] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        users.Student student2 = new users.Student("", "User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setDelimiter('\000');
        csvWriter1.write("password_112337353214100", true);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        long long9 = csvReader1.getCurrentRecord();
        java.lang.String[] strArray10 = csvReader1.getValues();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setRecordDelimiter('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = csvReader1.getValues();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        java.lang.String str9 = paymentInfo5.getBillingName();
        paymentInfo5.setCardBallance((double) 8);
        java.lang.String str12 = paymentInfo5.getBillingName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str8, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader(inputStream0, ' ', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        java.lang.String str7 = facultyMember2.getEmail();
        java.lang.String str8 = facultyMember2.getPassword();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade2 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((int) ' ');
        reservations.Reservation reservation13 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace12);
        users.FacultyMember facultyMember16 = new users.FacultyMember("", "hi!");
        int int17 = facultyMember16.parkingspacenum;
        int int18 = reservationSystemFacade2.calculateOutstanding(reservation13, (users.UserInfo) facultyMember16);
        manager.SuperManager superManager19 = manager.SuperManager.getInstance();
        java.lang.String str20 = superManager19.firstName;
        users.Student student23 = new users.Student("", "hi!");
        boolean boolean24 = superManager19.validateUser((users.UserInfo) student23);
        paymentStrategy.PaymentInfo paymentInfo25 = student23.getPaymentInfo();
        student23.setValid();
        int int27 = reservationSystemFacade0.calculateOutstanding(reservation13, (users.UserInfo) student23);
        reservations.ReservationSystemFacade reservationSystemFacade28 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot36 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace38 = parkingLot36.getParkingSpace((int) ' ');
        reservations.Reservation reservation39 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace38);
        users.FacultyMember facultyMember42 = new users.FacultyMember("", "hi!");
        int int43 = facultyMember42.parkingspacenum;
        int int44 = reservationSystemFacade28.calculateOutstanding(reservation39, (users.UserInfo) facultyMember42);
        reservationSystemFacade0.editBooking(reservation39, (int) (short) -1);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap47 = reservationSystemFacade0.getLots();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade28);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intMap47);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        long long4 = csvReader1.getCurrentRecord();
        csvReader1.setTrimWhitespace(true);
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        csvReader1.setDelimiter('\"');
        int int12 = csvReader1.getHeaderCount();
        csvReader1.setUseTextQualifier(true);
        csvReader1.setUseComments(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        facultyMember14.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade18 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot26 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace28 = parkingLot26.getParkingSpace((int) ' ');
        reservations.Reservation reservation29 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace28);
        reservationSystemFacade18.editBooking(reservation29, (int) (byte) 100);
        facultyMember14.currentReservation = reservation29;
        paymentStrategy.OtherTypeProvider otherTypeProvider33 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo39 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo39.setBillingName("FALSE");
        boolean boolean43 = otherTypeProvider33.handlePayment(paymentInfo39, (double) (short) 1);
        paymentInfo39.setCardBallance(10.0d);
        facultyMember14.setPaymentInfo(paymentInfo39);
        boolean boolean48 = debitPaymentProvider0.handlePayment(paymentInfo39, (double) '4');
        int int49 = paymentInfo39.getExpDate();
        java.lang.String str50 = paymentInfo39.getBillingAddress();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade18);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        java.util.ArrayList<userLogin.User> userList4 = maintainUser0.users;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("password_112310734370300");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112310734370300 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        parkingState.Occupied occupied1 = new parkingState.Occupied("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String str2 = occupied1.handleState();
        java.lang.String str3 = occupied1.handleState();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]" + "'", str2, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]" + "'", str3, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(1);
        int int8 = parkingLot2.getId();
        java.lang.String str9 = parkingLot2.getAddress();
        parkingLot2.setEnabled(true);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        parking.ParkingLot parkingLot9 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace11 = parkingLot9.getParkingSpace((int) ' ');
        reservations.Reservation reservation12 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace11);
        int int13 = reservation12.getDay();
        int int14 = reservation12.getDuration();
        users.FacultyMember facultyMember17 = new users.FacultyMember("", "hi!");
        int int18 = facultyMember17.parkingspacenum;
        int int19 = facultyMember17.getParkingRate();
        paymentStrategy.CreditPaymentProvide creditPaymentProvide20 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider21 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo27 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo27.setBillingName("FALSE");
        boolean boolean31 = otherTypeProvider21.handlePayment(paymentInfo27, (double) (short) 1);
        boolean boolean33 = creditPaymentProvide20.handlePayment(paymentInfo27, (double) (short) 0);
        reservationSystemFacade0.payBalance(reservation12, (users.UserInfo) facultyMember17, (paymentStrategy.PaymentProvider) creditPaymentProvide20);
        facultyMember17.parkingspacenum = (byte) 100;
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.password = "Password!23";
        java.lang.String str12 = user6.getLName();
        java.lang.String str13 = user6.getLName();
        java.lang.String str14 = user6.type;
        java.lang.String str15 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("", '\000', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        superManager0.lastName = "hi!";
        superManager0.lastName = "FALSE";
        java.lang.String str7 = superManager0.firstName;
        users.FacultyMember facultyMember10 = new users.FacultyMember("", "hi!");
        boolean boolean11 = facultyMember10.getIsValid();
        boolean boolean12 = facultyMember10.getIsValid();
        boolean boolean13 = facultyMember10.getIsValid();
        boolean boolean14 = superManager0.validateUser((users.UserInfo) facultyMember10);
        boolean boolean15 = facultyMember10.getIsValid();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str2, "User [name=null null, id=0, email=null, password=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        manager7.setPassword("password_112284545599300");
        java.lang.String str10 = manager7.firstName;
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str2, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        csvWriter1.setUseTextQualifier(false);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setTrimWhitespace(false);
        char char9 = csvReader1.getTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = csvReader1.skipLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider2 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int9 = paymentInfo8.getSecurityCode();
        java.lang.String str10 = paymentInfo8.getBillingAddress();
        java.util.Date date12 = null;
        paymentInfo8.parkingInfo(0, date12, "hi!", "hi!", (int) (short) 1);
        boolean boolean18 = mobilePaymentProvider2.handlePayment(paymentInfo8, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo24 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int25 = paymentInfo24.getSecurityCode();
        java.lang.String str26 = paymentInfo24.getBillingAddress();
        java.lang.String str27 = paymentInfo24.getBillingAddress();
        int int28 = paymentInfo24.getCardNum();
        int int29 = paymentInfo24.getExpDate();
        boolean boolean31 = mobilePaymentProvider2.handlePayment(paymentInfo24, (double) 100.0f);
        int int32 = paymentInfo24.getSecurityCode();
        paymentInfo24.setSecurityCode(0);
        boolean boolean36 = otherTypeProvider0.handlePayment(paymentInfo24, (double) 'a');
        paymentStrategy.PaymentInfo paymentInfo42 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int43 = paymentInfo42.getSecurityCode();
        int int44 = paymentInfo42.getSecurityCode();
        double double45 = paymentInfo42.getCardBallance();
        int int46 = paymentInfo42.getExpDate();
        paymentInfo42.setBillingAddress("hi!");
        boolean boolean50 = otherTypeProvider0.handlePayment(paymentInfo42, (double) (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo17 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int18 = paymentInfo17.getSecurityCode();
        java.lang.String str19 = paymentInfo17.getBillingAddress();
        java.util.Date date21 = null;
        paymentInfo17.parkingInfo(0, date21, "hi!", "hi!", (int) (short) 1);
        boolean boolean27 = debitPaymentProvider0.handlePayment(paymentInfo17, (double) (short) -1);
        paymentStrategy.PaymentInfo paymentInfo33 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo33.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str36 = paymentInfo33.getBillingAddress();
        paymentInfo33.setSecurityCode((int) (byte) -1);
        boolean boolean40 = debitPaymentProvider0.handlePayment(paymentInfo33, 100.0d);
        java.lang.String str41 = paymentInfo33.getBillingAddress();
        paymentInfo33.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str36, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str41, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setForceQualifier(false);
        int int8 = csvWriter1.getEscapeMode();
        char char9 = csvWriter1.getDelimiter();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        java.lang.String str5 = csvReader1.get(100);
        csvReader1.setSkipEmptyRecords(false);
        boolean boolean8 = csvReader1.getTrimWhitespace();
        csvReader1.setDelimiter(',');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("User [name=null null, id=0, email=null, password=null]");
        java.lang.String str4 = superManager0.getUsername();
        superManager0.lastName = "admin";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str1, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str4, "User [name=null null, id=0, email=null, password=null]");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setRecordDelimiter(',');
        csvReader1.setSafetySwitch(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace((int) '4');
        java.util.ArrayList<reservations.Reservation> reservationList2 = parkingSpace1.getReservations();
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(100, (int) ' ', "User [name=null null, id=0, email=null, password=null]", "password_112337353214100", (int) (byte) -1);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        java.lang.String str13 = user6.fname;
        user6.setValidation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        reservation11.updateDuration((-1));
        java.lang.String str14 = reservation11.getPlate();
        int int15 = reservation11.getDuration();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password!23" + "'", str14, "Password!23");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setSafetySwitch(false);
        csvReader1.setSafetySwitch(true);
        com.csvreader.CsvReader csvReader10 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean11 = csvReader10.readRecord();
        csvReader10.setSafetySwitch(true);
        boolean boolean14 = csvReader10.skipLine();
        java.lang.String str16 = csvReader10.get("FALSE");
        csvReader10.setUseTextQualifier(false);
        com.csvreader.CsvReader csvReader20 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean21 = csvReader20.readRecord();
        csvReader20.setSafetySwitch(true);
        java.lang.String[] strArray24 = csvReader20.getValues();
        boolean boolean25 = csvReader20.getUseComments();
        char char26 = csvReader20.getTextQualifier();
        java.lang.String[] strArray27 = csvReader20.getValues();
        csvReader10.setHeaders(strArray27);
        csvReader1.setHeaders(strArray27);
        boolean boolean30 = csvReader1.getUseTextQualifier();
        csvReader1.setUseTextQualifier(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(csvReader10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(csvReader20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\"' + "'", char26 == '\"');
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        facultyMember2.setValid();
        java.lang.String str7 = facultyMember2.getEmail();
        users.FacultyMember facultyMember10 = new users.FacultyMember("", "hi!");
        int int11 = facultyMember10.parkingspacenum;
        facultyMember10.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade14 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot22 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace24 = parkingLot22.getParkingSpace((int) ' ');
        reservations.Reservation reservation25 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace24);
        users.FacultyMember facultyMember28 = new users.FacultyMember("", "hi!");
        int int29 = facultyMember28.parkingspacenum;
        int int30 = reservationSystemFacade14.calculateOutstanding(reservation25, (users.UserInfo) facultyMember28);
        reservation25.updateDuration((int) ' ');
        int int33 = reservation25.getStartTime();
        facultyMember10.currentReservation = reservation25;
        java.lang.String str35 = reservation25.getPlate();
        facultyMember2.currentReservation = reservation25;
        facultyMember2.setValid();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade14);
        org.junit.Assert.assertNotNull(parkingSpace24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "admin" + "'", str35, "admin");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        facultyMember14.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade18 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot26 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace28 = parkingLot26.getParkingSpace((int) ' ');
        reservations.Reservation reservation29 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace28);
        reservationSystemFacade18.editBooking(reservation29, (int) (byte) 100);
        facultyMember14.currentReservation = reservation29;
        paymentStrategy.OtherTypeProvider otherTypeProvider33 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo39 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo39.setBillingName("FALSE");
        boolean boolean43 = otherTypeProvider33.handlePayment(paymentInfo39, (double) (short) 1);
        paymentInfo39.setCardBallance(10.0d);
        facultyMember14.setPaymentInfo(paymentInfo39);
        boolean boolean48 = debitPaymentProvider0.handlePayment(paymentInfo39, (double) '4');
        int int49 = paymentInfo39.getExpDate();
        int int50 = paymentInfo39.getCardNum();
        paymentInfo39.setSecurityCode((int) (byte) 100);
        paymentInfo39.setCardBallance((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade18);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        int int10 = user6.getId();
        java.lang.String str11 = user6.getFName();
        java.lang.String str12 = user6.type;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        parkingState.State state16 = parkingSpace14.getSensorStatus();
        reservations.Reservation reservation17 = new reservations.Reservation((int) (byte) 0, 2, (int) (byte) 0, 2, "admin", parkingSpace14);
        parkingState.Unoccupied unoccupied18 = new parkingState.Unoccupied();
        java.lang.String str19 = unoccupied18.handleState();
        parkingSpace14.setState((parkingState.State) unoccupied18);
        java.lang.String str21 = unoccupied18.handleState();
        java.lang.String str22 = unoccupied18.handleState();
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        // The following exception was thrown during execution in test generation
        try {
            parking.ParkingSpace parkingSpace9 = parkingLot2.getParkingSpace(264);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid space id");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) ' ');
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot((int) '#', "");
        parkingLot6.setEnabled(false);
        java.lang.String str9 = parkingLot6.getAddress();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setPassword("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        manager.Manager manager3 = superManager0.autoGenerator();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        java.lang.String str4 = csvReader1.getRawRecord();
        char char5 = csvReader1.getRecordDelimiter();
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = csvReader1.readRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setSkipEmptyRecords(true);
        long long8 = csvReader1.getCurrentRecord();
        boolean boolean9 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        users.UserList userList0 = new users.UserList();
        java.util.ArrayList<users.UserInfo> userInfoList1 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList2 = userList0.getList();
        java.lang.Class<?> wildcardClass3 = userInfoList2.getClass();
        org.junit.Assert.assertNotNull(userInfoList1);
        org.junit.Assert.assertNotNull(userInfoList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        csvReader1.close();
        csvReader1.close();
        boolean boolean4 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name= hi!, id=97, email=hi!, password=admin]");
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        facultyMember2.setPaymentInfo(paymentInfo8);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        csvWriter1.setUseTextQualifier(false);
        com.csvreader.CsvWriter csvWriter8 = new com.csvreader.CsvWriter("");
        csvWriter8.setRecordDelimiter('\"');
        csvWriter8.setTextQualifier('\"');
        char char13 = csvWriter8.getComment();
        csvWriter8.setUseTextQualifier(true);
        char char16 = csvWriter8.getRecordDelimiter();
        char char17 = csvWriter8.getComment();
        com.csvreader.CsvReader csvReader19 = com.csvreader.CsvReader.parse("hi!");
        char char20 = csvReader19.getComment();
        char char21 = csvReader19.getTextQualifier();
        java.lang.String[] strArray22 = csvReader19.getHeaders();
        java.lang.String[] strArray23 = csvReader19.getValues();
        csvWriter8.writeRecord(strArray23, false);
        csvWriter1.writeRecord(strArray23, false);
        java.lang.Class<?> wildcardClass28 = csvWriter1.getClass();
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '#' + "'", char13 == '#');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
        org.junit.Assert.assertNotNull(csvReader19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\"' + "'", char21 == '\"');
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(97, "User [name=null null, id=0, email=null, password=null]");
        boolean boolean3 = parkingLot2.getEnabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str9 = csvReader1.getRawRecord();
        boolean boolean10 = csvReader1.getCaptureRawRecord();
        boolean boolean11 = csvReader1.getUseTextQualifier();
        char char12 = csvReader1.getDelimiter();
        int int13 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        users.Student student2 = new users.Student("User [name= FALSE, id=97, email=, password=]", "User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.email = "User [name= hi!, id=97, email=hi!, password=admin]";
        user6.setType("manager_112305914121600");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        java.lang.String str6 = csvReader1.get(97);
        csvReader1.setRecordDelimiter('\"');
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = csvReader1.getHeaders();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        boolean boolean15 = parkingSpace14.isEnabled();
        int int16 = parkingSpace14.getId();
        parkingState.Enabled enabled17 = new parkingState.Enabled();
        java.lang.String str18 = enabled17.handleState();
        java.lang.String str19 = enabled17.handleState();
        java.lang.String str20 = enabled17.handleState();
        parkingSpace14.setState((parkingState.State) enabled17);
        parkingSpace14.setId((-1));
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        superManager0.lastName = "hi!";
        superManager0.lastName = "FALSE";
        superManager0.firstName = "User [name= hi!, id=97, email=hi!, password=admin]";
        java.lang.String str9 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str2, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str9, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        csvReader1.setTextQualifier(' ');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        users.FacultyMember facultyMember6 = new users.FacultyMember("", "hi!");
        int int7 = facultyMember6.parkingspacenum;
        facultyMember6.parkinglot = "hi!";
        facultyMember6.setValid();
        boolean boolean11 = manager3.validateUser((users.UserInfo) facultyMember6);
        java.lang.String str12 = facultyMember6.parkinglot;
        facultyMember6.parkinglot = "User [name= hi!, id=97, email=hi!, password=admin]";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        user6.type = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        user6.email = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        parking.ParkingSystem parkingSystem5 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace8 = parkingSystem5.getParkingSpace(10, (int) (byte) 1);
        boolean boolean10 = parkingSystem5.isLotEnabled(0);
        parking.ParkingSpace parkingSpace13 = parkingSystem5.getParkingSpace(0, 0);
        parkingSpace13.setEnabled(false);
        reservations.Reservation reservation16 = new reservations.Reservation((int) (byte) -1, 8, (int) 'a', 264, "User [name= hi!, id=97, email=hi!, password=]", parkingSpace13);
        reservation16.updateDuration((int) (byte) 0);
        org.junit.Assert.assertNotNull(parkingSystem5);
        org.junit.Assert.assertNotNull(parkingSpace8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace13);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setDelimiter(',');
        long long13 = csvReader1.getCurrentRecord();
        csvReader1.setRecordDelimiter('a');
        boolean boolean16 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo17 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int18 = paymentInfo17.getSecurityCode();
        java.lang.String str19 = paymentInfo17.getBillingAddress();
        java.util.Date date21 = null;
        paymentInfo17.parkingInfo(0, date21, "hi!", "hi!", (int) (short) 1);
        boolean boolean27 = debitPaymentProvider0.handlePayment(paymentInfo17, (double) (short) -1);
        manager.SuperManager superManager28 = manager.SuperManager.getInstance();
        java.lang.String str29 = superManager28.firstName;
        users.Student student32 = new users.Student("", "hi!");
        boolean boolean33 = superManager28.validateUser((users.UserInfo) student32);
        paymentStrategy.PaymentInfo paymentInfo34 = student32.getPaymentInfo();
        reservations.Reservation reservation35 = student32.currentReservation;
        paymentStrategy.PaymentInfo paymentInfo41 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int42 = paymentInfo41.getSecurityCode();
        java.lang.String str43 = paymentInfo41.getBillingAddress();
        java.util.Date date45 = null;
        paymentInfo41.parkingInfo(0, date45, "hi!", "hi!", (int) (short) 1);
        student32.setPaymentInfo(paymentInfo41);
        boolean boolean52 = debitPaymentProvider0.handlePayment(paymentInfo41, 1.0d);
        paymentStrategy.PaymentInfo paymentInfo58 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int59 = paymentInfo58.getSecurityCode();
        int int60 = paymentInfo58.getSecurityCode();
        paymentInfo58.setSecurityCode((int) ',');
        boolean boolean64 = debitPaymentProvider0.handlePayment(paymentInfo58, (double) (short) -1);
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider65 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo71 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int72 = paymentInfo71.getSecurityCode();
        java.lang.String str73 = paymentInfo71.getBillingAddress();
        java.util.Date date75 = null;
        paymentInfo71.parkingInfo(0, date75, "hi!", "hi!", (int) (short) 1);
        boolean boolean81 = mobilePaymentProvider65.handlePayment(paymentInfo71, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo87 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int88 = paymentInfo87.getSecurityCode();
        java.lang.String str89 = paymentInfo87.getBillingAddress();
        java.lang.String str90 = paymentInfo87.getBillingAddress();
        int int91 = paymentInfo87.getCardNum();
        int int92 = paymentInfo87.getExpDate();
        boolean boolean94 = mobilePaymentProvider65.handlePayment(paymentInfo87, (double) 100.0f);
        int int95 = paymentInfo87.getSecurityCode();
        paymentInfo87.setSecurityCode(0);
        boolean boolean99 = debitPaymentProvider0.handlePayment(paymentInfo87, (double) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(superManager28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(paymentInfo34);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 97 + "'", int88 == 97);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 97 + "'", int95 == 97);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.setType("User [name= FALSE, id=97, email=, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        reservationSystemFacade0.editBooking(reservation11, (int) (byte) 100);
        int int14 = reservation11.getDuration();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        reservations.Reservation reservation17 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace16);
        reservationSystemFacade6.editBooking(reservation17, (int) (byte) 100);
        facultyMember2.currentReservation = reservation17;
        paymentStrategy.OtherTypeProvider otherTypeProvider21 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo27 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo27.setBillingName("FALSE");
        boolean boolean31 = otherTypeProvider21.handlePayment(paymentInfo27, (double) (short) 1);
        paymentInfo27.setCardBallance(10.0d);
        facultyMember2.setPaymentInfo(paymentInfo27);
        boolean boolean35 = facultyMember2.getIsValid();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", "User [name= FALSE, id=97, email=, password=]");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(32);
        boolean boolean12 = csvReader1.getTrimWhitespace();
        int int14 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.setValid();
        int int5 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.setValid();
        users.FacultyMember facultyMember7 = new users.FacultyMember("", "hi!");
        int int8 = facultyMember7.parkingspacenum;
        facultyMember7.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade11 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot19 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace21 = parkingLot19.getParkingSpace((int) ' ');
        reservations.Reservation reservation22 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace21);
        reservationSystemFacade11.editBooking(reservation22, (int) (byte) 100);
        facultyMember7.currentReservation = reservation22;
        paymentStrategy.OtherTypeProvider otherTypeProvider26 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo32 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo32.setBillingName("FALSE");
        boolean boolean36 = otherTypeProvider26.handlePayment(paymentInfo32, (double) (short) 1);
        paymentInfo32.setCardBallance(10.0d);
        facultyMember7.setPaymentInfo(paymentInfo32);
        facultyMember2.setPaymentInfo(paymentInfo32);
        paymentInfo32.setSecurityCode((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade11);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        parkingState.Occupied occupied1 = new parkingState.Occupied("FALSE");
        java.lang.String str2 = occupied1.handleState();
        java.lang.String str3 = occupied1.handleState();
        java.lang.String str4 = occupied1.handleState();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FALSE" + "'", str2, "FALSE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FALSE" + "'", str4, "FALSE");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        csvWriter1.setForceQualifier(false);
        csvWriter1.close();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("User [name= hi!, id=97, email=hi!, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        superManager0.firstName = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]";
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.lastName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str6, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.getValidation();
        java.lang.String str13 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        boolean boolean24 = mobilePaymentProvider0.handlePayment(paymentInfo22, (double) (-1.0f));
        paymentStrategy.CreditPaymentProvide creditPaymentProvide25 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo31 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int32 = paymentInfo31.getSecurityCode();
        java.lang.String str33 = paymentInfo31.getBillingAddress();
        java.util.Date date35 = null;
        paymentInfo31.parkingInfo(0, date35, "hi!", "hi!", (int) (short) 1);
        boolean boolean41 = creditPaymentProvide25.handlePayment(paymentInfo31, (double) 8);
        paymentStrategy.OtherTypeProvider otherTypeProvider42 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context43 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider42);
        paymentStrategy.PaymentInfo paymentInfo49 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo49.setBillingName("FALSE");
        paymentInfo49.setCardNum(1);
        boolean boolean55 = context43.execute(paymentInfo49, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo61 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int62 = paymentInfo61.getSecurityCode();
        java.lang.String str63 = paymentInfo61.getBillingAddress();
        java.util.Date date65 = null;
        paymentInfo61.parkingInfo(0, date65, "hi!", "hi!", (int) (short) 1);
        int int70 = paymentInfo61.getExpDate();
        boolean boolean72 = context43.execute(paymentInfo61, (double) 5);
        paymentInfo61.setSecurityCode((int) '\"');
        boolean boolean76 = creditPaymentProvide25.handlePayment(paymentInfo61, (double) ' ');
        paymentStrategy.PaymentInfo paymentInfo82 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo82.setBillingName("FALSE");
        paymentInfo82.setCardNum(1);
        boolean boolean88 = creditPaymentProvide25.handlePayment(paymentInfo82, (double) (short) 1);
        boolean boolean90 = mobilePaymentProvider0.handlePayment(paymentInfo82, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        reservations.Reservation reservation7 = facultyMember2.currentReservation;
        reservations.ReservationSystemFacade reservationSystemFacade8 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot16 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace18 = parkingLot16.getParkingSpace((int) ' ');
        reservations.Reservation reservation19 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace18);
        reservationSystemFacade8.editBooking(reservation19, (int) (byte) 100);
        java.lang.String str22 = reservation19.getPlate();
        reservation19.updateDuration((int) (short) -1);
        reservation19.updateDuration((int) (byte) -1);
        facultyMember2.currentReservation = reservation19;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "admin" + "'", str22, "admin");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.CreditPaymentProvide creditPaymentProvide1 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider2 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo8.setBillingName("FALSE");
        boolean boolean12 = otherTypeProvider2.handlePayment(paymentInfo8, (double) (short) 1);
        paymentInfo8.setCardBallance(10.0d);
        double double15 = paymentInfo8.getCardBallance();
        int int16 = paymentInfo8.getCardNum();
        boolean boolean18 = creditPaymentProvide1.handlePayment(paymentInfo8, (double) '4');
        boolean boolean20 = creditPaymentProvide0.handlePayment(paymentInfo8, (double) 1.0f);
        paymentStrategy.OtherTypeProvider otherTypeProvider21 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context22 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider21);
        paymentStrategy.OtherTypeProvider otherTypeProvider23 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo29 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo29.setBillingName("FALSE");
        boolean boolean33 = otherTypeProvider23.handlePayment(paymentInfo29, (double) (short) 1);
        paymentInfo29.setCardBallance(10.0d);
        double double36 = paymentInfo29.getCardBallance();
        int int37 = paymentInfo29.getExpDate();
        boolean boolean39 = otherTypeProvider21.handlePayment(paymentInfo29, 100.0d);
        boolean boolean41 = creditPaymentProvide0.handlePayment(paymentInfo29, (double) 100L);
        java.lang.String str42 = paymentInfo29.getBillingName();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "FALSE" + "'", str42, "FALSE");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        boolean boolean7 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.email;
        user6.lname = "password_112325847983500";
        java.lang.String str11 = user6.type;
        user6.setType("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("admin");
        char char8 = csvReader1.getDelimiter();
        com.csvreader.CsvReader csvReader10 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean11 = csvReader10.readRecord();
        csvReader10.setSafetySwitch(true);
        java.lang.String[] strArray14 = csvReader10.getValues();
        boolean boolean15 = csvReader10.getUseComments();
        int int17 = csvReader10.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean18 = csvReader10.getCaptureRawRecord();
        java.lang.String[] strArray19 = csvReader10.getValues();
        csvReader1.setHeaders(strArray19);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertNotNull(csvReader10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        maintainUser0.update("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str9 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        user6.type = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str19 = user6.getLName();
        boolean boolean20 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        boolean boolean2 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvReader csvReader4 = com.csvreader.CsvReader.parse("hi!");
        char char5 = csvReader4.getComment();
        char char6 = csvReader4.getTextQualifier();
        java.lang.String[] strArray7 = csvReader4.getHeaders();
        java.lang.String[] strArray8 = csvReader4.getValues();
        csvWriter1.writeRecord(strArray8);
        com.csvreader.CsvWriter csvWriter11 = new com.csvreader.CsvWriter("");
        csvWriter11.setRecordDelimiter('\"');
        csvWriter11.setTextQualifier('\"');
        char char16 = csvWriter11.getComment();
        boolean boolean17 = csvWriter11.getForceQualifier();
        csvWriter11.setTextQualifier('a');
        com.csvreader.CsvReader csvReader21 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean22 = csvReader21.readRecord();
        csvReader21.setSafetySwitch(true);
        csvReader21.setTrimWhitespace(false);
        boolean boolean27 = csvReader21.skipRecord();
        boolean boolean28 = csvReader21.getTrimWhitespace();
        java.lang.String str29 = csvReader21.getRawRecord();
        boolean boolean30 = csvReader21.getCaptureRawRecord();
        boolean boolean31 = csvReader21.getUseTextQualifier();
        csvReader21.setTextQualifier('4');
        com.csvreader.CsvWriter csvWriter35 = new com.csvreader.CsvWriter("");
        csvWriter35.setRecordDelimiter('\"');
        csvWriter35.setTextQualifier('\"');
        char char40 = csvWriter35.getComment();
        boolean boolean41 = csvWriter35.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter43 = new com.csvreader.CsvWriter("");
        csvWriter43.setRecordDelimiter('\"');
        boolean boolean46 = csvWriter43.getUseTextQualifier();
        com.csvreader.CsvReader csvReader48 = com.csvreader.CsvReader.parse("hi!");
        char char49 = csvReader48.getComment();
        char char50 = csvReader48.getTextQualifier();
        java.lang.String[] strArray51 = csvReader48.getHeaders();
        java.lang.String[] strArray52 = csvReader48.getValues();
        csvWriter43.writeRecord(strArray52);
        csvWriter35.writeRecord(strArray52);
        csvReader21.setHeaders(strArray52);
        csvWriter11.writeRecord(strArray52);
        csvWriter1.writeRecord(strArray52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(csvReader4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '#' + "'", char16 == '#');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(csvReader21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '#' + "'", char40 == '#');
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(csvReader48);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '#' + "'", char49 == '#');
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + '\"' + "'", char50 == '\"');
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        int int6 = facultyMember2.parkingspacenum;
        facultyMember2.parkingspacenum = ' ';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        parking.ParkingLot parkingLot33 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace35 = parkingLot33.getParkingSpace((int) ' ');
        reservations.Reservation reservation36 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace35);
        int int37 = reservation36.getDay();
        parking.ParkingSpace parkingSpace38 = reservation36.getSpace();
        users.FacultyMember facultyMember41 = new users.FacultyMember("", "hi!");
        int int42 = reservationSystemFacade0.calculateOutstanding(reservation36, (users.UserInfo) facultyMember41);
        java.lang.String str43 = facultyMember41.parkinglot;
        int int44 = facultyMember41.getParkingRate();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        java.lang.String str7 = superManager0.lastName;
        superManager0.setUsername("password_112306347644100");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]" + "'", str1, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setSafetySwitch(false);
        int int7 = csvReader1.getHeaderCount();
        boolean boolean8 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        com.csvreader.CsvWriter csvWriter9 = new com.csvreader.CsvWriter("");
        csvWriter9.setRecordDelimiter('\"');
        csvWriter9.setTextQualifier('\"');
        csvWriter9.setRecordDelimiter('#');
        csvWriter9.setForceQualifier(true);
        csvWriter9.close();
        char char19 = csvWriter9.getTextQualifier();
        char char20 = csvWriter9.getTextQualifier();
        csvWriter9.setUseTextQualifier(false);
        com.csvreader.CsvReader csvReader24 = com.csvreader.CsvReader.parse("hi!");
        char char25 = csvReader24.getComment();
        char char26 = csvReader24.getTextQualifier();
        boolean boolean27 = csvReader24.getUseTextQualifier();
        java.lang.String str29 = csvReader24.get((int) '#');
        csvReader24.setTrimWhitespace(false);
        com.csvreader.CsvWriter csvWriter33 = new com.csvreader.CsvWriter("");
        boolean boolean34 = csvWriter33.getUseTextQualifier();
        com.csvreader.CsvReader csvReader36 = com.csvreader.CsvReader.parse("hi!");
        char char37 = csvReader36.getComment();
        char char38 = csvReader36.getTextQualifier();
        java.lang.String[] strArray39 = csvReader36.getHeaders();
        java.lang.String[] strArray40 = csvReader36.getValues();
        csvWriter33.writeRecord(strArray40);
        csvReader24.setHeaders(strArray40);
        csvWriter9.writeRecord(strArray40, false);
        csvReader1.setHeaders(strArray40);
        char char46 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\"' + "'", char19 == '\"');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertNotNull(csvReader24);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '#' + "'", char25 == '#');
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\"' + "'", char26 == '\"');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(csvReader36);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '#' + "'", char37 == '#');
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\"' + "'", char38 == '\"');
        org.junit.Assert.assertNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\000' + "'", char46 == '\000');
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) '\"', "hi!");
        int int3 = parkingLot2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 34 + "'", int3 == 34);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        int int12 = reservation11.getDay();
        int int13 = reservation11.getDuration();
        reservations.ReservationSystemFacade reservationSystemFacade14 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap15 = reservationSystemFacade14.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade16 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot24 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace26 = parkingLot24.getParkingSpace((int) ' ');
        reservations.Reservation reservation27 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace26);
        users.FacultyMember facultyMember30 = new users.FacultyMember("", "hi!");
        int int31 = facultyMember30.parkingspacenum;
        int int32 = reservationSystemFacade16.calculateOutstanding(reservation27, (users.UserInfo) facultyMember30);
        manager.SuperManager superManager33 = manager.SuperManager.getInstance();
        java.lang.String str34 = superManager33.firstName;
        users.Student student37 = new users.Student("", "hi!");
        boolean boolean38 = superManager33.validateUser((users.UserInfo) student37);
        paymentStrategy.PaymentInfo paymentInfo39 = student37.getPaymentInfo();
        student37.setValid();
        int int41 = reservationSystemFacade14.calculateOutstanding(reservation27, (users.UserInfo) student37);
        reservationSystemFacade0.cancelBooking(reservation11, (users.UserInfo) student37);
        users.FacultyMember facultyMember45 = new users.FacultyMember("", "hi!");
        int int46 = facultyMember45.parkingspacenum;
        facultyMember45.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade49 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot57 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace59 = parkingLot57.getParkingSpace((int) ' ');
        reservations.Reservation reservation60 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace59);
        reservationSystemFacade49.editBooking(reservation60, (int) (byte) 100);
        facultyMember45.currentReservation = reservation60;
        parking.ParkingSpace parkingSpace64 = reservation60.getSpace();
        parkingState.State state65 = parkingSpace64.getSensorStatus();
        reservations.ReservationSystemFacade reservationSystemFacade66 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot74 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace76 = parkingLot74.getParkingSpace((int) ' ');
        reservations.Reservation reservation77 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace76);
        users.FacultyMember facultyMember80 = new users.FacultyMember("", "hi!");
        int int81 = facultyMember80.parkingspacenum;
        int int82 = reservationSystemFacade66.calculateOutstanding(reservation77, (users.UserInfo) facultyMember80);
        reservation77.updateDuration((int) ' ');
        int int85 = reservation77.getStartTime();
        parkingSpace64.setReservation(reservation77);
        users.Student student89 = new users.Student("", "hi!");
        int int90 = student89.getParkingRate();
        student89.setValid();
        student89.setValid();
        java.lang.String str93 = student89.getEmail();
        int int94 = student89.getParkingRate();
        int int95 = reservationSystemFacade0.calculateOutstanding(reservation77, (users.UserInfo) student89);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(reservationSystemFacade14);
        org.junit.Assert.assertNotNull(intMap15);
        org.junit.Assert.assertNotNull(reservationSystemFacade16);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(superManager33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(paymentInfo39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade49);
        org.junit.Assert.assertNotNull(parkingSpace59);
        org.junit.Assert.assertNotNull(parkingSpace64);
        org.junit.Assert.assertNotNull(state65);
        org.junit.Assert.assertNotNull(reservationSystemFacade66);
        org.junit.Assert.assertNotNull(parkingSpace76);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 100 + "'", int85 == 100);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 5 + "'", int90 == 5);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 5 + "'", int94 == 5);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 155 + "'", int95 == 155);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        boolean boolean5 = parkingSystem0.isLotEnabled(0);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap6 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intMap6);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.toString();
        java.lang.String str14 = user6.fname;
        java.lang.String str15 = user6.fname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        int int4 = csvReader1.getColumnCount();
        csvReader1.setCaptureRawRecord(true);
        java.lang.String str8 = csvReader1.getHeader((int) 'a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade2 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((int) ' ');
        reservations.Reservation reservation13 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace12);
        users.FacultyMember facultyMember16 = new users.FacultyMember("", "hi!");
        int int17 = facultyMember16.parkingspacenum;
        int int18 = reservationSystemFacade2.calculateOutstanding(reservation13, (users.UserInfo) facultyMember16);
        manager.SuperManager superManager19 = manager.SuperManager.getInstance();
        java.lang.String str20 = superManager19.firstName;
        users.Student student23 = new users.Student("", "hi!");
        boolean boolean24 = superManager19.validateUser((users.UserInfo) student23);
        paymentStrategy.PaymentInfo paymentInfo25 = student23.getPaymentInfo();
        student23.setValid();
        int int27 = reservationSystemFacade0.calculateOutstanding(reservation13, (users.UserInfo) student23);
        parking.ParkingLot parkingLot30 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace32 = parkingLot30.getParkingSpace((int) ' ');
        boolean boolean33 = parkingLot30.getEnabled();
        parking.ParkingSpace parkingSpace35 = parkingLot30.getParkingSpace(10);
        parking.ParkingSpace parkingSpace42 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation43 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace42);
        parkingSpace35.setReservation(reservation43);
        users.Visitor visitor47 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        visitor47.setValid();
        reservationSystemFacade0.cancelBooking(reservation43, (users.UserInfo) visitor47);
        parking.ParkingLot parkingLot57 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace59 = parkingLot57.getParkingSpace((int) ' ');
        reservations.Reservation reservation60 = null;
        parkingSpace59.setReservation(reservation60);
        java.util.ArrayList<reservations.Reservation> reservationList62 = parkingSpace59.getReservations();
        reservations.Reservation reservation63 = new reservations.Reservation((-1), (int) 'a', (int) '#', 0, "password_112306347644100", parkingSpace59);
        int int64 = reservation63.getStartTime();
        visitor47.currentReservation = reservation63;
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertNotNull(parkingSpace59);
        org.junit.Assert.assertNotNull(reservationList62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parking.ParkingSpace parkingSpace15 = reservation10.getSpace();
        int int16 = reservation10.getStartTime();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        users.Student student2 = new users.Student("password_112337353214100", "FALSE");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        userLogin.User user6 = new userLogin.User("password_112284545599300", "password_112337353214100", 34, "User [name= hi!, id=97, email=hi!, password=]", "Password!23", "Password!23");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        boolean boolean5 = csvReader1.readRecord();
        csvReader1.setTextQualifier('#');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        user6.email = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        java.lang.String str15 = user6.type;
        user6.setEmail("Password!23");
        java.lang.String str18 = user6.getType();
        boolean boolean19 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str10 = csvReader1.get((int) ' ');
        char char11 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        java.lang.String str15 = user6.getEmail();
        user6.fname = "manager_112327586653400";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("password_112296757334200", ' ');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112296757334200 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getUseComments();
        csvReader1.setCaptureRawRecord(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        int int16 = reservation15.getDay();
        parking.ParkingSpace parkingSpace17 = reservation15.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList18 = parkingSpace17.getReservations();
        parkingSpace17.setId(0);
        int int21 = parkingSpace17.getId();
        reservations.Reservation reservation22 = new reservations.Reservation((int) (byte) -1, 97, (int) (short) -1, 768, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", parkingSpace17);
        java.util.ArrayList<reservations.Reservation> reservationList23 = parkingSpace17.getReservations();
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("admin");
        csvWriter1.setRecordDelimiter('#');
        char char4 = csvWriter1.getComment();
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '#' + "'", char4 == '#');
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        int int8 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        boolean boolean10 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.setId(2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        java.lang.String str8 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.email;
        user6.lname = "password_112325847983500";
        int int11 = user6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        paymentInfo7.setCardNum(1);
        paymentInfo7.setExpDate(768);
        boolean boolean15 = debitPaymentProvider0.handlePayment(paymentInfo7, (double) (byte) 1);
        int int16 = paymentInfo7.getSecurityCode();
        paymentInfo7.setBillingAddress("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getValidation();
        java.lang.String str14 = user6.getType();
        user6.isValidated = false;
        user6.setEmail("User [name= FALSE, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot8 = parkingSystem0.addLot((int) (byte) 1, "FALSE");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(parkingLot8);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        char char7 = csvReader1.getComment();
        boolean boolean9 = csvReader1.isQualified(2);
        boolean boolean10 = csvReader1.getTrimWhitespace();
        java.lang.String str12 = csvReader1.get((-30));
        java.lang.String str14 = csvReader1.get("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        csvWriter1.setComment('\"');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("FALSE");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str9 = csvReader1.getRawRecord();
        boolean boolean10 = csvReader1.getTrimWhitespace();
        int int11 = csvReader1.getColumnCount();
        java.lang.String str13 = csvReader1.get((int) '\000');
        boolean boolean14 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.CreditPaymentProvide creditPaymentProvide1 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider2 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo8.setBillingName("FALSE");
        boolean boolean12 = otherTypeProvider2.handlePayment(paymentInfo8, (double) (short) 1);
        paymentInfo8.setCardBallance(10.0d);
        double double15 = paymentInfo8.getCardBallance();
        int int16 = paymentInfo8.getCardNum();
        boolean boolean18 = creditPaymentProvide1.handlePayment(paymentInfo8, (double) '4');
        boolean boolean20 = creditPaymentProvide0.handlePayment(paymentInfo8, (double) 1.0f);
        java.lang.Class<?> wildcardClass21 = paymentInfo8.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.getType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FALSE" + "'", str8, "FALSE");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        maintainUser0.path = "hi!";
        userLogin.MaintainUser maintainUser5 = new userLogin.MaintainUser();
        java.lang.String str6 = maintainUser5.path;
        userLogin.MaintainUser maintainUser7 = new userLogin.MaintainUser();
        maintainUser7.update("admin");
        java.util.ArrayList<userLogin.User> userList10 = maintainUser7.users;
        maintainUser5.users = userList10;
        maintainUser0.users = userList10;
        maintainUser0.path = "hi!";
        maintainUser0.update("User [name= hi!, id=97, email=hi!, password=hi!]");
        java.util.ArrayList<userLogin.User> userList17 = maintainUser0.users;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList17);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setForceQualifier(false);
        int int8 = csvWriter1.getEscapeMode();
        char char9 = csvWriter1.getRecordDelimiter();
        char char10 = csvWriter1.getRecordDelimiter();
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        csvReader1.setTextQualifier('4');
        csvReader1.setComment(',');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.OtherTypeProvider otherTypeProvider17 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo23 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo23.setBillingName("FALSE");
        boolean boolean27 = otherTypeProvider17.handlePayment(paymentInfo23, (double) (short) 1);
        paymentInfo23.setCardBallance(10.0d);
        double double30 = paymentInfo23.getCardBallance();
        paymentInfo23.setExpDate((int) 'a');
        boolean boolean34 = mobilePaymentProvider0.handlePayment(paymentInfo23, (double) 2);
        paymentStrategy.PaymentInfo paymentInfo40 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo40.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str43 = paymentInfo40.getBillingAddress();
        java.lang.String str44 = paymentInfo40.getBillingName();
        boolean boolean46 = mobilePaymentProvider0.handlePayment(paymentInfo40, (double) (short) 0);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide47 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.CreditPaymentProvide creditPaymentProvide48 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider49 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo55 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo55.setBillingName("FALSE");
        boolean boolean59 = otherTypeProvider49.handlePayment(paymentInfo55, (double) (short) 1);
        paymentInfo55.setCardBallance(10.0d);
        double double62 = paymentInfo55.getCardBallance();
        int int63 = paymentInfo55.getCardNum();
        boolean boolean65 = creditPaymentProvide48.handlePayment(paymentInfo55, (double) '4');
        boolean boolean67 = creditPaymentProvide47.handlePayment(paymentInfo55, (double) 1.0f);
        int int68 = paymentInfo55.getExpDate();
        paymentInfo55.setSecurityCode((int) (short) 10);
        boolean boolean72 = mobilePaymentProvider0.handlePayment(paymentInfo55, (double) ',');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str43, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("hi!", "admin");
        int int3 = nonFacultyStaff2.getParkingRate();
        int int4 = nonFacultyStaff2.getParkingRate();
        nonFacultyStaff2.parkinglot = "password_112337353214100";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        int int9 = paymentInfo5.getCardNum();
        int int10 = paymentInfo5.getExpDate();
        paymentInfo5.setSecurityCode((int) (byte) 10);
        paymentInfo5.setBillingName("User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("password_112343396437900", "password_112284545599300", "password_112310734370300");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112343396437900" + "'", str3, "password_112343396437900");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        csvWriter1.setTextQualifier('a');
        char char10 = csvWriter1.getComment();
        csvWriter1.setForceQualifier(false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = creditPaymentProvide0.handlePayment(paymentInfo6, (double) 8);
        paymentStrategy.OtherTypeProvider otherTypeProvider17 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context18 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider17);
        paymentStrategy.PaymentInfo paymentInfo24 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo24.setBillingName("FALSE");
        paymentInfo24.setCardNum(1);
        boolean boolean30 = context18.execute(paymentInfo24, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo36 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int37 = paymentInfo36.getSecurityCode();
        java.lang.String str38 = paymentInfo36.getBillingAddress();
        java.util.Date date40 = null;
        paymentInfo36.parkingInfo(0, date40, "hi!", "hi!", (int) (short) 1);
        int int45 = paymentInfo36.getExpDate();
        boolean boolean47 = context18.execute(paymentInfo36, (double) 5);
        paymentInfo36.setSecurityCode((int) '\"');
        boolean boolean51 = creditPaymentProvide0.handlePayment(paymentInfo36, (double) ' ');
        paymentStrategy.PaymentInfo paymentInfo57 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo57.setBillingName("FALSE");
        paymentInfo57.setCardNum(1);
        boolean boolean63 = creditPaymentProvide0.handlePayment(paymentInfo57, (double) (short) 1);
        paymentStrategy.PaymentInfo paymentInfo69 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int70 = paymentInfo69.getSecurityCode();
        boolean boolean72 = creditPaymentProvide0.handlePayment(paymentInfo69, 100.0d);
        java.util.Date date74 = null;
        paymentInfo69.parkingInfo((-30), date74, "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("hi!", '4');
        csvReader2.setSkipEmptyRecords(false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("User [name=null null, id=0, email=null, password=null]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name=null null, id=0, email=null, password=null] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name=null null, id=0, email=null, password=null]", "User [name= hi!, id=97, email=hi!, password=]");
        reservations.Reservation reservation3 = nonFacultyStaff2.currentReservation;
        int int4 = nonFacultyStaff2.getParkingRate();
        org.junit.Assert.assertNull(reservation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        users.Student student2 = new users.Student("password_112306347644100", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        int int3 = student2.parkingspacenum;
        paymentStrategy.PaymentInfo paymentInfo4 = student2.getPaymentInfo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(paymentInfo4);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        char char8 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.path = "admin";
        maintainUser0.path = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]";
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        int int16 = reservation15.getDay();
        parking.ParkingSpace parkingSpace17 = reservation15.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList18 = parkingSpace17.getReservations();
        parkingSpace17.setId(0);
        int int21 = parkingSpace17.getId();
        reservations.Reservation reservation22 = new reservations.Reservation((int) (byte) -1, 97, (int) (short) -1, 768, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", parkingSpace17);
        boolean boolean23 = parkingSpace17.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) '\000', "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        boolean boolean3 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace5 = parkingLot2.getParkingSpace(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        csvReader1.setDelimiter('\"');
        int int12 = csvReader1.getHeaderCount();
        csvReader1.setUseTextQualifier(true);
        boolean boolean15 = csvReader1.skipRecord();
        boolean boolean16 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getSafetySwitch();
        int int7 = csvReader1.getHeaderCount();
        java.lang.String[] strArray8 = null;
        csvReader1.setHeaders(strArray8);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        parkingSpace21.setEnabled(false);
        parkingState.State state24 = parkingSpace21.getSensorStatus();
        parkingState.Disabled disabled25 = new parkingState.Disabled();
        java.lang.String str26 = disabled25.handleState();
        parkingSpace21.setState((parkingState.State) disabled25);
        java.lang.String str28 = disabled25.handleState();
        java.lang.String str29 = disabled25.handleState();
        java.lang.String str30 = disabled25.handleState();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(state24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        java.lang.String str17 = user6.getLName();
        java.lang.String str18 = user6.getType();
        user6.setName("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name= FALSE, id=97, email=, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        java.lang.String str8 = csvReader1.getHeader((int) ',');
        java.lang.String str10 = csvReader1.get((int) (short) 10);
        long long11 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.email;
        java.lang.String str10 = user6.toString();
        java.lang.String str11 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        char char9 = csvWriter1.getDelimiter();
        boolean boolean10 = csvWriter1.getUseTextQualifier();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        int int5 = parkingLot2.getId();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace((int) ' ');
        int int8 = parkingLot2.getId();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("password_112284545599300", "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("password_112338187831000", "Password!23", "Password!23");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        boolean boolean5 = csvReader1.getSafetySwitch();
        boolean boolean6 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int23 = paymentInfo22.getSecurityCode();
        java.lang.String str24 = paymentInfo22.getBillingAddress();
        java.lang.String str25 = paymentInfo22.getBillingAddress();
        int int26 = paymentInfo22.getCardNum();
        int int27 = paymentInfo22.getExpDate();
        boolean boolean29 = mobilePaymentProvider0.handlePayment(paymentInfo22, (double) 100.0f);
        paymentStrategy.DebitPaymentProvider debitPaymentProvider30 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo36 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int37 = paymentInfo36.getSecurityCode();
        java.lang.String str38 = paymentInfo36.getBillingAddress();
        java.lang.String str39 = paymentInfo36.getBillingAddress();
        boolean boolean41 = debitPaymentProvider30.handlePayment(paymentInfo36, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo47 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int48 = paymentInfo47.getSecurityCode();
        java.lang.String str49 = paymentInfo47.getBillingAddress();
        java.util.Date date51 = null;
        paymentInfo47.parkingInfo(0, date51, "hi!", "hi!", (int) (short) 1);
        boolean boolean57 = debitPaymentProvider30.handlePayment(paymentInfo47, (double) (short) -1);
        paymentInfo47.setBillingName("Password!23");
        boolean boolean61 = mobilePaymentProvider0.handlePayment(paymentInfo47, (double) (byte) -1);
        paymentInfo47.setBillingName("password_112337353214100");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("hi!");
        java.lang.String str4 = superManager0.getUsername();
        manager.SuperManager superManager5 = manager.SuperManager.getInstance();
        java.lang.String str6 = superManager5.firstName;
        users.Student student9 = new users.Student("", "hi!");
        boolean boolean10 = superManager5.validateUser((users.UserInfo) student9);
        paymentStrategy.PaymentInfo paymentInfo11 = student9.getPaymentInfo();
        int int12 = student9.getParkingRate();
        boolean boolean13 = superManager0.validateUser((users.UserInfo) student9);
        int int14 = student9.parkingspacenum;
        java.lang.String str15 = student9.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "password_112306347644100" + "'", str1, "password_112306347644100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(superManager5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(paymentInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        csvReader1.setComment('#');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        int int12 = reservation11.getDay();
        int int13 = reservation11.getDuration();
        reservations.ReservationSystemFacade reservationSystemFacade14 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap15 = reservationSystemFacade14.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade16 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot24 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace26 = parkingLot24.getParkingSpace((int) ' ');
        reservations.Reservation reservation27 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace26);
        users.FacultyMember facultyMember30 = new users.FacultyMember("", "hi!");
        int int31 = facultyMember30.parkingspacenum;
        int int32 = reservationSystemFacade16.calculateOutstanding(reservation27, (users.UserInfo) facultyMember30);
        manager.SuperManager superManager33 = manager.SuperManager.getInstance();
        java.lang.String str34 = superManager33.firstName;
        users.Student student37 = new users.Student("", "hi!");
        boolean boolean38 = superManager33.validateUser((users.UserInfo) student37);
        paymentStrategy.PaymentInfo paymentInfo39 = student37.getPaymentInfo();
        student37.setValid();
        int int41 = reservationSystemFacade14.calculateOutstanding(reservation27, (users.UserInfo) student37);
        reservationSystemFacade0.cancelBooking(reservation11, (users.UserInfo) student37);
        reservations.Reservation reservation43 = student37.currentReservation;
        java.lang.String str44 = student37.getEmail();
        java.lang.String str45 = student37.parkinglot;
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(reservationSystemFacade14);
        org.junit.Assert.assertNotNull(intMap15);
        org.junit.Assert.assertNotNull(reservationSystemFacade16);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(superManager33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(paymentInfo39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(reservation43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        java.lang.String str12 = user6.type;
        user6.password = "User [name= FALSE, id=97, email=, password=]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        csvWriter1.setForceQualifier(true);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", ',', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        double double12 = paymentInfo6.getCardBallance();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        java.lang.String str11 = user6.getValidation();
        user6.isValidated = false;
        user6.fname = "User [name= hi!, id=97, email=hi!, password=]";
        java.lang.String str16 = user6.email;
        java.lang.String str17 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        user6.fname = "FALSE";
        user6.email = "admin";
        user6.setValidation("password_112312047073100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        boolean boolean15 = parkingSpace14.isEnabled();
        int int16 = parkingSpace14.getId();
        parking.ParkingLot parkingLot24 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace26 = parkingLot24.getParkingSpace((int) ' ');
        boolean boolean27 = parkingLot24.getEnabled();
        parking.ParkingSpace parkingSpace29 = parkingLot24.getParkingSpace(1);
        reservations.Reservation reservation30 = new reservations.Reservation((int) '\000', 35, 768, 768, "User [name= hi!, id=97, email=hi!, password=]", parkingSpace29);
        parkingSpace14.setReservation(reservation30);
        int int32 = reservation30.getMonth();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(parkingSpace29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = creditPaymentProvide0.handlePayment(paymentInfo6, (double) 8);
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int23 = paymentInfo22.getSecurityCode();
        int int24 = paymentInfo22.getSecurityCode();
        double double25 = paymentInfo22.getCardBallance();
        boolean boolean27 = creditPaymentProvide0.handlePayment(paymentInfo22, (double) '#');
        java.util.Date date29 = null;
        paymentInfo22.parkingInfo(10, date29, "User [name= FALSE, id=97, email=, password=]", "manager_112305914121600", 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        csvWriter1.setForceQualifier(false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        char char2 = csvReader1.getTextQualifier();
        long long3 = csvReader1.getCurrentRecord();
        int int4 = csvReader1.getColumnCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\"' + "'", char2 == '\"');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        superManager0.setUsername("password_112306347644100");
        manager.Manager manager6 = superManager0.autoGenerator();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112344052445500" + "'", str3, "password_112344052445500");
        org.junit.Assert.assertNotNull(manager6);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int8 = paymentInfo7.getSecurityCode();
        java.lang.String str9 = paymentInfo7.getBillingAddress();
        java.util.Date date11 = null;
        paymentInfo7.parkingInfo(0, date11, "hi!", "hi!", (int) (short) 1);
        boolean boolean17 = otherTypeProvider0.handlePayment(paymentInfo7, (double) 0);
        paymentStrategy.PaymentInfo paymentInfo23 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int24 = paymentInfo23.getSecurityCode();
        java.lang.String str25 = paymentInfo23.getBillingAddress();
        java.util.Date date27 = null;
        paymentInfo23.parkingInfo(0, date27, "hi!", "hi!", (int) (short) 1);
        boolean boolean33 = otherTypeProvider0.handlePayment(paymentInfo23, (double) (short) -1);
        paymentStrategy.OtherTypeProvider otherTypeProvider34 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context35 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider34);
        paymentStrategy.PaymentInfo paymentInfo41 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int42 = paymentInfo41.getSecurityCode();
        java.lang.String str43 = paymentInfo41.getBillingAddress();
        java.util.Date date45 = null;
        paymentInfo41.parkingInfo(0, date45, "hi!", "hi!", (int) (short) 1);
        boolean boolean51 = otherTypeProvider34.handlePayment(paymentInfo41, (double) 0);
        boolean boolean53 = otherTypeProvider0.handlePayment(paymentInfo41, 0.0d);
        paymentInfo41.setExpDate((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        boolean boolean2 = false; // flaky: parkingSystem0.isLotEnabled((int) (byte) -1);
        org.junit.Assert.assertNotNull(parkingSystem0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        superManager0.setPassword("password_112337353214100");
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getSafetySwitch();
        java.lang.String str8 = csvReader1.getHeader(0);
        java.lang.String str10 = csvReader1.get(35);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String[] strArray7 = csvReader1.getValues();
        char char8 = csvReader1.getComment();
        csvReader1.setDelimiter('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '#' + "'", char8 == '#');
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = csvReader1.getIndex("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        parking.ParkingLot parkingLot9 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace11 = parkingLot9.getParkingSpace((int) ' ');
        reservations.Reservation reservation12 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace11);
        int int13 = reservation12.getDay();
        int int14 = reservation12.getDuration();
        users.FacultyMember facultyMember17 = new users.FacultyMember("", "hi!");
        int int18 = facultyMember17.parkingspacenum;
        int int19 = facultyMember17.getParkingRate();
        paymentStrategy.CreditPaymentProvide creditPaymentProvide20 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider21 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo27 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo27.setBillingName("FALSE");
        boolean boolean31 = otherTypeProvider21.handlePayment(paymentInfo27, (double) (short) 1);
        boolean boolean33 = creditPaymentProvide20.handlePayment(paymentInfo27, (double) (short) 0);
        reservationSystemFacade0.payBalance(reservation12, (users.UserInfo) facultyMember17, (paymentStrategy.PaymentProvider) creditPaymentProvide20);
        paymentStrategy.Context context35 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) creditPaymentProvide20);
        paymentStrategy.OtherTypeProvider otherTypeProvider36 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo42 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo42.setBillingName("FALSE");
        boolean boolean46 = otherTypeProvider36.handlePayment(paymentInfo42, (double) (short) 1);
        java.util.Date date48 = null;
        paymentInfo42.parkingInfo((int) ' ', date48, "hi!", "hi!", 5);
        boolean boolean54 = creditPaymentProvide20.handlePayment(paymentInfo42, (double) (short) 1);
        java.lang.String str55 = paymentInfo42.getBillingAddress();
        paymentInfo42.setCardNum(34);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot(34, "password_112310734370300");
// flaky:         parkingSystem0.setEnableLot((int) (short) -1, false);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertNotNull(parkingLot6);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot((int) '\"');
        parking.ParkingLot parkingLot8 = parkingSystem0.getLot(0);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertNotNull(parkingLot8);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        manager.Manager manager2 = new manager.Manager("", "admin");
        java.lang.String str3 = manager2.getUsername();
        users.Visitor visitor6 = new users.Visitor("Password!23", "admin");
        boolean boolean7 = manager2.validateUser((users.UserInfo) visitor6);
        users.NonFacultyStaff nonFacultyStaff10 = new users.NonFacultyStaff("", "");
        int int11 = nonFacultyStaff10.parkingspacenum;
        int int12 = nonFacultyStaff10.getParkingRate();
        users.FacultyMember facultyMember15 = new users.FacultyMember("", "hi!");
        int int16 = facultyMember15.parkingspacenum;
        facultyMember15.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade19 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot27 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace29 = parkingLot27.getParkingSpace((int) ' ');
        reservations.Reservation reservation30 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace29);
        reservationSystemFacade19.editBooking(reservation30, (int) (byte) 100);
        facultyMember15.currentReservation = reservation30;
        int int34 = reservation30.getDuration();
        nonFacultyStaff10.currentReservation = reservation30;
        boolean boolean36 = manager2.validateUser((users.UserInfo) nonFacultyStaff10);
        java.lang.String str37 = nonFacultyStaff10.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade19);
        org.junit.Assert.assertNotNull(parkingSpace29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = reservationSystemFacade0.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade2 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((int) ' ');
        reservations.Reservation reservation13 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace12);
        users.FacultyMember facultyMember16 = new users.FacultyMember("", "hi!");
        int int17 = facultyMember16.parkingspacenum;
        int int18 = reservationSystemFacade2.calculateOutstanding(reservation13, (users.UserInfo) facultyMember16);
        manager.SuperManager superManager19 = manager.SuperManager.getInstance();
        java.lang.String str20 = superManager19.firstName;
        users.Student student23 = new users.Student("", "hi!");
        boolean boolean24 = superManager19.validateUser((users.UserInfo) student23);
        paymentStrategy.PaymentInfo paymentInfo25 = student23.getPaymentInfo();
        student23.setValid();
        int int27 = reservationSystemFacade0.calculateOutstanding(reservation13, (users.UserInfo) student23);
        java.lang.String str28 = student23.getPassword();
        paymentStrategy.PaymentInfo paymentInfo34 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        student23.setPaymentInfo(paymentInfo34);
        paymentInfo34.setBillingAddress("manager_112305914121600");
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        csvReader1.close();
        char char10 = csvReader1.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = csvReader1.getIndex("password_112296757334200");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.setId(97);
        user6.email = "admin";
        user6.setType("Password!23");
        boolean boolean18 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        boolean boolean3 = facultyMember2.getIsValid();
        boolean boolean4 = facultyMember2.getIsValid();
        boolean boolean5 = facultyMember2.getIsValid();
        java.lang.String str6 = facultyMember2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        int int16 = reservation15.getDay();
        parking.ParkingSpace parkingSpace17 = reservation15.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList18 = parkingSpace17.getReservations();
        parkingSpace17.setId(0);
        int int21 = parkingSpace17.getId();
        reservations.Reservation reservation22 = new reservations.Reservation((int) (short) -1, 0, 34, 1, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace17);
        int int23 = reservation22.getMonth();
        reservation22.updateDuration(0);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }
}
