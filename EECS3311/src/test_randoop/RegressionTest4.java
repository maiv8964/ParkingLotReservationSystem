import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("Password!23");
        csvWriter1.setUseTextQualifier(true);
        com.csvreader.CsvWriter csvWriter5 = new com.csvreader.CsvWriter("");
        csvWriter5.setRecordDelimiter('\"');
        char char8 = csvWriter5.getDelimiter();
        csvWriter5.setUseTextQualifier(false);
        com.csvreader.CsvWriter csvWriter12 = new com.csvreader.CsvWriter("");
        csvWriter12.setRecordDelimiter('\"');
        csvWriter12.setTextQualifier('\"');
        char char17 = csvWriter12.getComment();
        csvWriter12.setUseTextQualifier(true);
        char char20 = csvWriter12.getRecordDelimiter();
        char char21 = csvWriter12.getComment();
        com.csvreader.CsvReader csvReader23 = com.csvreader.CsvReader.parse("hi!");
        char char24 = csvReader23.getComment();
        char char25 = csvReader23.getTextQualifier();
        java.lang.String[] strArray26 = csvReader23.getHeaders();
        java.lang.String[] strArray27 = csvReader23.getValues();
        csvWriter12.writeRecord(strArray27, false);
        csvWriter5.writeRecord(strArray27, false);
        csvWriter1.writeRecord(strArray27, false);
        csvWriter1.write("User [name= hi!, id=97, email=hi!, password=admin]");
        csvWriter1.setDelimiter('\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '#' + "'", char21 == '#');
        org.junit.Assert.assertNotNull(csvReader23);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '#' + "'", char24 == '#');
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\"' + "'", char25 == '\"');
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        users.FacultyMember facultyMember19 = new users.FacultyMember("", "hi!");
        int int20 = facultyMember19.parkingspacenum;
        facultyMember19.parkinglot = "hi!";
        parking.ParkingLot parkingLot35 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace37 = parkingLot35.getParkingSpace((int) ' ');
        reservations.Reservation reservation38 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace37);
        paymentStrategy.OtherTypeProvider otherTypeProvider39 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context40 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider39);
        paymentStrategy.PaymentInfo paymentInfo46 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo46.setBillingName("FALSE");
        paymentInfo46.setCardNum(1);
        boolean boolean52 = context40.execute(paymentInfo46, (double) 97);
        reservations.Reservation reservation53 = reservationSystemFacade0.createReservation((users.UserInfo) facultyMember19, (int) (short) -1, (-1), (int) ',', (int) (byte) 1, "admin", parkingSpace37, context40);
        reservations.Reservation reservation54 = facultyMember19.currentReservation;
        facultyMember19.parkinglot = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(parkingSpace37);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertNull(reservation54);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.getLName();
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setId((int) '#');
        user6.password = "password_112338187831000";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        paymentStrategy.Context context28 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) creditPaymentProvide0);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide29 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo35 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int36 = paymentInfo35.getSecurityCode();
        java.lang.String str37 = paymentInfo35.getBillingAddress();
        java.util.Date date39 = null;
        paymentInfo35.parkingInfo(0, date39, "hi!", "hi!", (int) (short) 1);
        boolean boolean45 = creditPaymentProvide29.handlePayment(paymentInfo35, (double) 8);
        int int46 = paymentInfo35.getExpDate();
        paymentInfo35.setCardBallance((-1.0d));
        java.util.Date date50 = null;
        paymentInfo35.parkingInfo((int) '\000', date50, "User [name= hi!, id=97, email=hi!, password=hi!]", "password_112296757334200", (int) (short) 100);
        boolean boolean56 = creditPaymentProvide0.handlePayment(paymentInfo35, (double) 1L);
        paymentStrategy.Context context57 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) creditPaymentProvide0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        userLogin.User user0 = new userLogin.User();
        int int1 = user0.id;
        boolean boolean2 = user0.isValidated;
        java.lang.String str3 = user0.getValidation();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        users.Visitor visitor2 = new users.Visitor("", "");
        boolean boolean3 = visitor2.getIsValid();
        int int4 = visitor2.getParkingRate();
        int int5 = visitor2.getParkingRate();
        visitor2.setValid();
        java.lang.String str7 = visitor2.parkinglot;
        int int8 = visitor2.getParkingRate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        char char5 = csvWriter1.getTextQualifier();
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        maintainUser0.path = "";
        java.util.ArrayList<userLogin.User> userList17 = maintainUser0.users;
        userLogin.MaintainUser maintainUser18 = new userLogin.MaintainUser();
        maintainUser18.update("admin");
        maintainUser18.path = "hi!";
        userLogin.MaintainUser maintainUser23 = new userLogin.MaintainUser();
        java.lang.String str24 = maintainUser23.path;
        userLogin.MaintainUser maintainUser25 = new userLogin.MaintainUser();
        maintainUser25.update("admin");
        java.util.ArrayList<userLogin.User> userList28 = maintainUser25.users;
        maintainUser23.users = userList28;
        maintainUser18.users = userList28;
        maintainUser18.path = "hi!";
        java.lang.String str33 = maintainUser18.path;
        userLogin.MaintainUser maintainUser34 = new userLogin.MaintainUser();
        maintainUser34.update("admin");
        maintainUser34.path = "hi!";
        userLogin.MaintainUser maintainUser39 = new userLogin.MaintainUser();
        java.lang.String str40 = maintainUser39.path;
        userLogin.MaintainUser maintainUser41 = new userLogin.MaintainUser();
        maintainUser41.update("admin");
        java.util.ArrayList<userLogin.User> userList44 = maintainUser41.users;
        maintainUser39.users = userList44;
        maintainUser34.users = userList44;
        maintainUser18.users = userList44;
        maintainUser0.users = userList44;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        paymentInfo69.setBillingAddress("User [name=null null, id=0, email=null, password=null]");
        int int75 = paymentInfo69.getCardNum();
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        java.util.Date date12 = null;
        paymentInfo6.parkingInfo((int) ' ', date12, "hi!", "hi!", 5);
        double double17 = paymentInfo6.getCardBallance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        user6.fname = "password_112310734370300";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String[] strArray7 = csvReader1.getValues();
        boolean boolean8 = csvReader1.readHeaders();
        csvReader1.setUseComments(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getForceQualifier();
        char char6 = csvWriter1.getTextQualifier();
        char char7 = csvWriter1.getComment();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        parkingState.State state22 = parkingSpace21.getSensorStatus();
        reservations.ReservationSystemFacade reservationSystemFacade23 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot31 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace33 = parkingLot31.getParkingSpace((int) ' ');
        reservations.Reservation reservation34 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace33);
        users.FacultyMember facultyMember37 = new users.FacultyMember("", "hi!");
        int int38 = facultyMember37.parkingspacenum;
        int int39 = reservationSystemFacade23.calculateOutstanding(reservation34, (users.UserInfo) facultyMember37);
        reservation34.updateDuration((int) ' ');
        int int42 = reservation34.getStartTime();
        parkingSpace21.setReservation(reservation34);
        reservation34.updateDuration(97);
        int int46 = reservation34.getDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(state22);
        org.junit.Assert.assertNotNull(reservationSystemFacade23);
        org.junit.Assert.assertNotNull(parkingSpace33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.email;
        java.lang.String str10 = user6.lname;
        user6.password = "password_112284545599300";
        java.lang.String str13 = user6.password;
        boolean boolean14 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "password_112284545599300" + "'", str13, "password_112284545599300");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        int int7 = paymentInfo5.getSecurityCode();
        paymentInfo5.setSecurityCode((int) ',');
        paymentInfo5.setExpDate(10);
        int int12 = paymentInfo5.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        csvWriter1.setComment('a');
        csvWriter1.setDelimiter(',');
        int int14 = csvWriter1.getEscapeMode();
        csvWriter1.setComment(' ');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        paymentInfo23.setCardNum(2);
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        manager.Manager manager2 = new manager.Manager("", "admin");
        manager2.lastName = "Password!23";
        users.NonFacultyStaff nonFacultyStaff7 = new users.NonFacultyStaff("", "hi!");
        java.lang.String str8 = nonFacultyStaff7.getEmail();
        boolean boolean9 = manager2.validateUser((users.UserInfo) nonFacultyStaff7);
        paymentStrategy.PaymentInfo paymentInfo15 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo15.setBillingName("FALSE");
        paymentInfo15.setCardNum(1);
        java.lang.String str20 = paymentInfo15.getBillingName();
        java.lang.String str21 = paymentInfo15.getBillingAddress();
        nonFacultyStaff7.setPaymentInfo(paymentInfo15);
        paymentInfo15.setBillingName("password_112296757334200");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FALSE" + "'", str20, "FALSE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        paymentStrategy.PaymentInfo paymentInfo70 = nonFacultyStaff2.getPaymentInfo();
        java.lang.String str71 = nonFacultyStaff2.getEmail();
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
        org.junit.Assert.assertNull(paymentInfo70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        reservations.Reservation reservation17 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace16);
        reservationSystemFacade6.editBooking(reservation17, (int) (byte) 100);
        facultyMember2.currentReservation = reservation17;
        java.lang.String str21 = facultyMember2.getEmail();
        facultyMember2.parkingspacenum = '\"';
        paymentStrategy.PaymentInfo paymentInfo24 = facultyMember2.getPaymentInfo();
        users.FacultyMember facultyMember27 = new users.FacultyMember("", "hi!");
        int int28 = facultyMember27.parkingspacenum;
        facultyMember27.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade31 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot39 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace41 = parkingLot39.getParkingSpace((int) ' ');
        reservations.Reservation reservation42 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace41);
        reservationSystemFacade31.editBooking(reservation42, (int) (byte) 100);
        facultyMember27.currentReservation = reservation42;
        java.lang.String str46 = reservation42.getPlate();
        parking.ParkingSpace parkingSpace47 = reservation42.getSpace();
        reservation42.updateDuration(0);
        facultyMember2.currentReservation = reservation42;
        java.lang.String str51 = facultyMember2.parkinglot;
        reservations.Reservation reservation52 = facultyMember2.currentReservation;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(paymentInfo24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade31);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "admin" + "'", str46, "admin");
        org.junit.Assert.assertNotNull(parkingSpace47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(reservation52);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getValidation();
        java.lang.String str12 = user6.getPassword();
        java.lang.String str13 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        users.FacultyMember facultyMember2 = new users.FacultyMember("hi!", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        int int3 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        paymentStrategy.PaymentInfo paymentInfo48 = facultyMember27.getPaymentInfo();
        int int49 = facultyMember27.getParkingRate();
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
        org.junit.Assert.assertNull(paymentInfo48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("Password!23");
        csvWriter1.setUseTextQualifier(true);
        com.csvreader.CsvWriter csvWriter5 = new com.csvreader.CsvWriter("");
        csvWriter5.setRecordDelimiter('\"');
        char char8 = csvWriter5.getDelimiter();
        csvWriter5.setUseTextQualifier(false);
        com.csvreader.CsvWriter csvWriter12 = new com.csvreader.CsvWriter("");
        csvWriter12.setRecordDelimiter('\"');
        csvWriter12.setTextQualifier('\"');
        char char17 = csvWriter12.getComment();
        csvWriter12.setUseTextQualifier(true);
        char char20 = csvWriter12.getRecordDelimiter();
        char char21 = csvWriter12.getComment();
        com.csvreader.CsvReader csvReader23 = com.csvreader.CsvReader.parse("hi!");
        char char24 = csvReader23.getComment();
        char char25 = csvReader23.getTextQualifier();
        java.lang.String[] strArray26 = csvReader23.getHeaders();
        java.lang.String[] strArray27 = csvReader23.getValues();
        csvWriter12.writeRecord(strArray27, false);
        csvWriter5.writeRecord(strArray27, false);
        csvWriter1.writeRecord(strArray27, false);
        csvWriter1.write("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean36 = csvWriter1.getForceQualifier();
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '#' + "'", char21 == '#');
        org.junit.Assert.assertNotNull(csvReader23);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '#' + "'", char24 == '#');
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\"' + "'", char25 == '\"');
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        char char7 = csvReader1.getComment();
        boolean boolean9 = csvReader1.isQualified(2);
        csvReader1.setSafetySwitch(true);
        boolean boolean12 = csvReader1.skipRecord();
        csvReader1.setSkipEmptyRecords(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int9 = paymentInfo8.getSecurityCode();
        int int10 = paymentInfo8.getSecurityCode();
        double double11 = paymentInfo8.getCardBallance();
        int int12 = paymentInfo8.getCardNum();
        nonFacultyStaff2.setPaymentInfo(paymentInfo8);
        paymentInfo8.setExpDate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "manager_112327586653400";
        java.lang.String str13 = user6.getPassword();
        user6.fname = "FALSE";
        java.lang.String str16 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "manager_112327586653400" + "'", str13, "manager_112327586653400");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        userLogin.User user6 = new userLogin.User("", "admin", 32, "hi!", "password_112284545599300", "User [name= hi!, id=97, email=hi!, password=admin]");
        java.lang.String str7 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.csvreader.CsvReader csvReader2 = null; // flaky: new com.csvreader.CsvReader("FALSE", 'a');
        java.lang.String[] strArray3 = null; // flaky: csvReader2.getValues();
// flaky:         org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        int int35 = reservation12.getDuration();
        int int36 = reservation12.getMonth();
        int int37 = reservation12.getDay();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        char char5 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String[] strArray7 = csvReader1.getValues();
        boolean boolean8 = csvReader1.getUseTextQualifier();
        csvReader1.setUseComments(false);
        java.lang.String[] strArray11 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        int int37 = paymentInfo24.getSecurityCode();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        char char10 = csvWriter1.getRecordDelimiter();
        int int11 = csvWriter1.getEscapeMode();
        csvWriter1.setForceQualifier(false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        paymentStrategy.CreditPaymentProvide creditPaymentProvide62 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider63 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo69 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo69.setBillingName("FALSE");
        boolean boolean73 = otherTypeProvider63.handlePayment(paymentInfo69, (double) (short) 1);
        boolean boolean75 = creditPaymentProvide62.handlePayment(paymentInfo69, (double) (short) 0);
        double double76 = paymentInfo69.getCardBallance();
        boolean boolean78 = mobilePaymentProvider0.handlePayment(paymentInfo69, (double) (byte) -1);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide79 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo85 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int86 = paymentInfo85.getSecurityCode();
        java.lang.String str87 = paymentInfo85.getBillingAddress();
        java.util.Date date89 = null;
        paymentInfo85.parkingInfo(0, date89, "hi!", "hi!", (int) (short) 1);
        boolean boolean95 = creditPaymentProvide79.handlePayment(paymentInfo85, (double) 8);
        boolean boolean97 = mobilePaymentProvider0.handlePayment(paymentInfo85, (double) 1.0f);
        int int98 = paymentInfo85.getExpDate();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 97 + "'", int86 == 97);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 1 + "'", int98 == 1);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        paymentStrategy.Context context28 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) creditPaymentProvide0);
        paymentStrategy.OtherTypeProvider otherTypeProvider29 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context30 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider29);
        paymentStrategy.PaymentInfo paymentInfo36 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int37 = paymentInfo36.getSecurityCode();
        java.lang.String str38 = paymentInfo36.getBillingAddress();
        java.util.Date date40 = null;
        paymentInfo36.parkingInfo(0, date40, "hi!", "hi!", (int) (short) 1);
        boolean boolean46 = otherTypeProvider29.handlePayment(paymentInfo36, (double) 0);
        paymentStrategy.PaymentInfo paymentInfo52 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int53 = paymentInfo52.getSecurityCode();
        java.lang.String str54 = paymentInfo52.getBillingAddress();
        java.util.Date date56 = null;
        paymentInfo52.parkingInfo(0, date56, "hi!", "hi!", (int) (short) 1);
        boolean boolean62 = otherTypeProvider29.handlePayment(paymentInfo52, (double) (short) -1);
        boolean boolean64 = creditPaymentProvide0.handlePayment(paymentInfo52, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        csvReader1.setTrimWhitespace(false);
        csvReader1.setTrimWhitespace(true);
        csvReader1.setSkipEmptyRecords(false);
        int int12 = csvReader1.getIndex("password_112337353214100");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        parkingState.Unoccupied unoccupied0 = new parkingState.Unoccupied();
        java.lang.String str1 = unoccupied0.handleState();
        java.lang.String str2 = unoccupied0.handleState();
        java.lang.String str3 = unoccupied0.handleState();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        java.lang.String str11 = user6.getValidation();
        user6.type = "FALSE";
        user6.setEmail("password_112312047073100");
        user6.id = ',';
        user6.password = "password_112306347644100";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        reservation11.updateDuration((int) ' ');
        int int19 = reservation11.getStartTime();
        reservation11.updateDuration(0);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setSafetySwitch(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = csvReader1.skipLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        userLogin.User user6 = new userLogin.User("", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", 8, "Password!23", "", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        user6.setValidation("Password!23");
        user6.type = "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]";
        user6.id = 97;
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        paymentStrategy.Context context53 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(superManager28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str29, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(paymentInfo34);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.util.ArrayList<userLogin.User> userList1 = null;
        maintainUser0.users = userList1;
        maintainUser0.path = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]";
        java.lang.String str5 = maintainUser0.path;
        java.util.ArrayList<userLogin.User> userList6 = maintainUser0.users;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]" + "'", str5, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertNull(userList6);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(8);
        java.lang.String[] strArray12 = csvReader1.getHeaders();
        char char13 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '#' + "'", char13 == '#');
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        reservations.Reservation reservation7 = student4.currentReservation;
        paymentStrategy.PaymentInfo paymentInfo13 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int14 = paymentInfo13.getSecurityCode();
        java.lang.String str15 = paymentInfo13.getBillingAddress();
        java.util.Date date17 = null;
        paymentInfo13.parkingInfo(0, date17, "hi!", "hi!", (int) (short) 1);
        student4.setPaymentInfo(paymentInfo13);
        boolean boolean23 = student4.getIsValid();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str1, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        paymentInfo6.setCardNum(1);
        paymentInfo6.setExpDate(768);
        paymentInfo6.setBillingName("FALSE");
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (short) 10);
        paymentStrategy.Context context17 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) mobilePaymentProvider0);
        paymentStrategy.Context context18 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) mobilePaymentProvider0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        userLogin.MaintainUser maintainUser4 = new userLogin.MaintainUser();
        maintainUser4.update("admin");
        java.util.ArrayList<userLogin.User> userList7 = maintainUser4.users;
        maintainUser0.users = userList7;
        java.util.ArrayList<userLogin.User> userList9 = maintainUser0.users;
        maintainUser0.update("password_112296757334200");
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        java.lang.String str13 = user6.fname;
        user6.email = "";
        java.lang.String str16 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        java.lang.String[] strArray9 = csvReader1.getHeaders();
        boolean boolean10 = csvReader1.skipRecord();
        long long11 = csvReader1.getCurrentRecord();
        boolean boolean12 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        csvReader1.setTextQualifier('4');
        long long6 = csvReader1.getCurrentRecord();
        char char7 = csvReader1.getDelimiter();
        char char8 = csvReader1.getComment();
        csvReader1.setRecordDelimiter('\"');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ',' + "'", char7 == ',');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '#' + "'", char8 == '#');
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        csvWriter1.setForceQualifier(false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("manager_112347878775000", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setSafetySwitch(false);
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(true);
        boolean boolean12 = csvReader1.isQualified((int) (short) 10);
        csvReader1.setCaptureRawRecord(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("FALSE");
        csvReader1.setUseTextQualifier(false);
        int int11 = csvReader1.getIndex("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        boolean boolean12 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) '#', "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        boolean boolean3 = parkingLot2.getEnabled();
        parkingLot2.setEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        java.lang.String str15 = user6.email;
        java.lang.String str16 = user6.password;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        paymentStrategy.PaymentInfo paymentInfo97 = new paymentStrategy.PaymentInfo(2, (int) (byte) 0, "User [name=null null, id=0, email=null, password=null]", "", (int) ' ');
        boolean boolean99 = creditPaymentProvide20.handlePayment(paymentInfo97, (double) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        reservations.ReservationSystemFacade reservationSystemFacade5 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap6 = reservationSystemFacade5.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade7 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot15 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace17 = parkingLot15.getParkingSpace((int) ' ');
        reservations.Reservation reservation18 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace17);
        users.FacultyMember facultyMember21 = new users.FacultyMember("", "hi!");
        int int22 = facultyMember21.parkingspacenum;
        int int23 = reservationSystemFacade7.calculateOutstanding(reservation18, (users.UserInfo) facultyMember21);
        users.Student student26 = new users.Student("", "hi!");
        int int27 = student26.getParkingRate();
        reservationSystemFacade5.cancelBooking(reservation18, (users.UserInfo) student26);
        int int29 = reservation18.getDay();
        parking.ParkingSpace parkingSpace30 = reservation18.getSpace();
        reservations.Reservation reservation31 = new reservations.Reservation((int) (short) 1, (int) (short) -1, 32, (int) (short) 1, "password_112359916102100", parkingSpace30);
        org.junit.Assert.assertNotNull(reservationSystemFacade5);
        org.junit.Assert.assertNotNull(intMap6);
        org.junit.Assert.assertNotNull(reservationSystemFacade7);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(parkingSpace30);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.util.Date date9 = null;
        paymentInfo6.parkingInfo((int) (byte) 1, date9, "hi!", "User [name= hi!, id=97, email=hi!, password=]", 8);
        boolean boolean15 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) 0L);
        paymentStrategy.Context context16 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setComment('\000');
        boolean boolean7 = csvReader1.getSkipEmptyRecords();
        char char8 = csvReader1.getComment();
        com.csvreader.CsvWriter csvWriter10 = new com.csvreader.CsvWriter("hi!");
        char char11 = csvWriter10.getComment();
        csvWriter10.setTextQualifier('#');
        boolean boolean14 = csvWriter10.getUseTextQualifier();
        csvWriter10.setDelimiter('\000');
        csvWriter10.endRecord();
        com.csvreader.CsvReader csvReader19 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean20 = csvReader19.readRecord();
        csvReader19.setSafetySwitch(true);
        csvReader19.setTrimWhitespace(false);
        boolean boolean25 = csvReader19.skipRecord();
        boolean boolean26 = csvReader19.getTrimWhitespace();
        java.lang.String str27 = csvReader19.getRawRecord();
        boolean boolean28 = csvReader19.getCaptureRawRecord();
        boolean boolean29 = csvReader19.getUseTextQualifier();
        csvReader19.setTextQualifier('4');
        com.csvreader.CsvWriter csvWriter33 = new com.csvreader.CsvWriter("");
        csvWriter33.setRecordDelimiter('\"');
        csvWriter33.setTextQualifier('\"');
        char char38 = csvWriter33.getComment();
        boolean boolean39 = csvWriter33.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter41 = new com.csvreader.CsvWriter("");
        csvWriter41.setRecordDelimiter('\"');
        boolean boolean44 = csvWriter41.getUseTextQualifier();
        com.csvreader.CsvReader csvReader46 = com.csvreader.CsvReader.parse("hi!");
        char char47 = csvReader46.getComment();
        char char48 = csvReader46.getTextQualifier();
        java.lang.String[] strArray49 = csvReader46.getHeaders();
        java.lang.String[] strArray50 = csvReader46.getValues();
        csvWriter41.writeRecord(strArray50);
        csvWriter33.writeRecord(strArray50);
        csvReader19.setHeaders(strArray50);
        csvWriter10.writeRecord(strArray50);
        csvReader1.setHeaders(strArray50);
        boolean boolean56 = csvReader1.getCaptureRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '#' + "'", char11 == '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(csvReader19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '#' + "'", char38 == '#');
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(csvReader46);
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '#' + "'", char47 == '#');
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '\"' + "'", char48 == '\"');
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("password_112348536883400", ' ');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112348536883400 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str4 = superManager0.lastName;
        java.lang.String str5 = superManager0.lastName;
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FALSE" + "'", str4, "FALSE");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FALSE" + "'", str5, "FALSE");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        java.lang.String str36 = student23.parkinglot;
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str20, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        paymentStrategy.PaymentInfo paymentInfo3 = facultyMember2.getPaymentInfo();
        int int4 = facultyMember2.getParkingRate();
        org.junit.Assert.assertNull(paymentInfo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot4 = parkingSystem0.getLot((int) '\000');
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot(100);
        parking.ParkingLot parkingLot8 = parkingSystem0.getLot(34);
        parking.ParkingLot parkingLot10 = parkingSystem0.getLot(0);
        parking.ParkingLot parkingLot12 = parkingSystem0.getLot(97);
        parking.ParkingLot parkingLot15 = parkingSystem0.addLot(97, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        java.lang.String str16 = parkingLot15.getAddress();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
// flaky:         org.junit.Assert.assertNotNull(parkingLot4);
// flaky:         org.junit.Assert.assertNotNull(parkingLot6);
// flaky:         org.junit.Assert.assertNotNull(parkingLot8);
// flaky:         org.junit.Assert.assertNotNull(parkingLot10);
// flaky:         org.junit.Assert.assertNotNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingLot15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str16, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        boolean boolean10 = csvReader1.skipLine();
        csvReader1.setCaptureRawRecord(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        csvWriter1.setDelimiter('a');
        boolean boolean12 = csvWriter1.getUseTextQualifier();
        java.lang.String[] strArray13 = null;
        csvWriter1.writeRecord(strArray13, true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getComment();
        char char11 = csvWriter1.getRecordDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("password_112312047073100");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        reservationSystemFacade0.editBooking(reservation11, (int) (byte) 100);
        users.FacultyMember facultyMember16 = new users.FacultyMember("", "hi!");
        int int17 = facultyMember16.parkingspacenum;
        facultyMember16.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade20 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot28 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace30 = parkingLot28.getParkingSpace((int) ' ');
        reservations.Reservation reservation31 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace30);
        reservationSystemFacade20.editBooking(reservation31, (int) (byte) 100);
        facultyMember16.currentReservation = reservation31;
        manager.SuperManager superManager35 = manager.SuperManager.getInstance();
        java.lang.String str36 = superManager35.firstName;
        users.Student student39 = new users.Student("", "hi!");
        boolean boolean40 = superManager35.validateUser((users.UserInfo) student39);
        paymentStrategy.PaymentInfo paymentInfo41 = student39.getPaymentInfo();
        student39.setValid();
        java.lang.String str43 = student39.parkinglot;
        int int44 = student39.getParkingRate();
        reservationSystemFacade0.cancelBooking(reservation31, (users.UserInfo) student39);
        reservations.ReservationSystemFacade reservationSystemFacade46 = reservations.ReservationSystemFacade.getInstance();
        reservations.ReservationSystemFacade reservationSystemFacade47 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap48 = reservationSystemFacade47.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade49 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot57 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace59 = parkingLot57.getParkingSpace((int) ' ');
        reservations.Reservation reservation60 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace59);
        users.FacultyMember facultyMember63 = new users.FacultyMember("", "hi!");
        int int64 = facultyMember63.parkingspacenum;
        int int65 = reservationSystemFacade49.calculateOutstanding(reservation60, (users.UserInfo) facultyMember63);
        users.Student student68 = new users.Student("", "hi!");
        int int69 = student68.getParkingRate();
        reservationSystemFacade47.cancelBooking(reservation60, (users.UserInfo) student68);
        users.FacultyMember facultyMember73 = new users.FacultyMember("", "hi!");
        int int74 = facultyMember73.parkingspacenum;
        facultyMember73.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade77 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot85 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace87 = parkingLot85.getParkingSpace((int) ' ');
        reservations.Reservation reservation88 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace87);
        reservationSystemFacade77.editBooking(reservation88, (int) (byte) 100);
        facultyMember73.currentReservation = reservation88;
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider92 = new paymentStrategy.MobilePaymentProvider();
        reservationSystemFacade46.payBalance(reservation60, (users.UserInfo) facultyMember73, (paymentStrategy.PaymentProvider) mobilePaymentProvider92);
        int int94 = reservation60.getMonth();
        users.Visitor visitor97 = new users.Visitor("", "password_112351534974900");
        java.lang.String str98 = visitor97.getPassword();
        int int99 = reservationSystemFacade0.calculateOutstanding(reservation60, (users.UserInfo) visitor97);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade20);
        org.junit.Assert.assertNotNull(parkingSpace30);
        org.junit.Assert.assertNotNull(superManager35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str36, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(paymentInfo41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertNotNull(reservationSystemFacade46);
        org.junit.Assert.assertNotNull(reservationSystemFacade47);
        org.junit.Assert.assertNotNull(intMap48);
        org.junit.Assert.assertNotNull(reservationSystemFacade49);
        org.junit.Assert.assertNotNull(parkingSpace59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 5 + "'", int69 == 5);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade77);
        org.junit.Assert.assertNotNull(parkingSpace87);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "password_112351534974900" + "'", str98, "password_112351534974900");
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        paymentStrategy.Context context54 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
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
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        users.Visitor visitor2 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=hi!]");
        int int3 = visitor2.getParkingRate();
        int int4 = visitor2.parkingspacenum;
        visitor2.setValid();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingSpace4.isEnabled();
        java.util.ArrayList<reservations.Reservation> reservationList6 = parkingSpace4.getReservations();
        parkingSpace4.setEnabled(false);
        parkingState.State state9 = parkingSpace4.getSensorStatus();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        csvWriter1.setTextQualifier('a');
        char char10 = csvWriter1.getComment();
        csvWriter1.setTextQualifier(' ');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.lang.String str28 = student23.getEmail();
        int int29 = student23.getParkingRate();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str20, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        superManager0.lastName = "hi!";
        superManager0.lastName = "FALSE";
        users.FacultyMember facultyMember9 = new users.FacultyMember("", "hi!");
        int int10 = facultyMember9.parkingspacenum;
        facultyMember9.parkinglot = "hi!";
        facultyMember9.setValid();
        boolean boolean14 = superManager0.validateUser((users.UserInfo) facultyMember9);
        java.lang.String str15 = facultyMember9.getEmail();
        int int16 = facultyMember9.getParkingRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str1, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        users.Visitor visitor2 = new users.Visitor("Password!23", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        int int3 = visitor2.getParkingRate();
        visitor2.setValid();
        visitor2.parkinglot = "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        manager.Manager manager2 = new manager.Manager("hi!", "");
        manager2.firstName = "Password!23";
        manager2.firstName = "password_112337353214100";
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.type = "password_112338187831000";
        user6.email = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]";
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String str7 = csvReader1.getRawRecord();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = csvReader1.get("password_112359916102100");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setDelimiter(',');
        csvReader1.setCaptureRawRecord(false);
        boolean boolean15 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        user6.email = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        java.lang.String str15 = user6.getLName();
        user6.lname = "manager_112327586653400";
        java.lang.String str18 = user6.fname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str15, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        maintainUser0.path = "User [name= FALSE, id=97, email=, password=]";
        maintainUser0.path = "admin";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        java.lang.String str8 = user6.getLName();
        user6.setName("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setName("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        java.lang.String str15 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FALSE" + "'", str15, "FALSE");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.email;
        java.lang.String str10 = user6.lname;
        user6.password = "password_112284545599300";
        user6.setValidation("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=hi!, password=]", "");
        manager2.lastName = "FALSE";
        java.lang.String str5 = manager2.lastName;
        java.lang.String str6 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FALSE" + "'", str5, "FALSE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setSkipEmptyRecords(true);
        long long8 = csvReader1.getCurrentRecord();
        int int9 = csvReader1.getEscapeMode();
        boolean boolean10 = csvReader1.skipLine();
        java.lang.Class<?> wildcardClass11 = csvReader1.getClass();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentStrategy.Context context11 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.DebitPaymentProvider debitPaymentProvider12 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo18 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int19 = paymentInfo18.getSecurityCode();
        java.lang.String str20 = paymentInfo18.getBillingAddress();
        java.lang.String str21 = paymentInfo18.getBillingAddress();
        boolean boolean23 = debitPaymentProvider12.handlePayment(paymentInfo18, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo29 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int30 = paymentInfo29.getSecurityCode();
        java.lang.String str31 = paymentInfo29.getBillingAddress();
        java.util.Date date33 = null;
        paymentInfo29.parkingInfo(0, date33, "hi!", "hi!", (int) (short) 1);
        boolean boolean39 = debitPaymentProvider12.handlePayment(paymentInfo29, (double) (short) -1);
        manager.SuperManager superManager40 = manager.SuperManager.getInstance();
        java.lang.String str41 = superManager40.firstName;
        users.Student student44 = new users.Student("", "hi!");
        boolean boolean45 = superManager40.validateUser((users.UserInfo) student44);
        paymentStrategy.PaymentInfo paymentInfo46 = student44.getPaymentInfo();
        reservations.Reservation reservation47 = student44.currentReservation;
        paymentStrategy.PaymentInfo paymentInfo53 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int54 = paymentInfo53.getSecurityCode();
        java.lang.String str55 = paymentInfo53.getBillingAddress();
        java.util.Date date57 = null;
        paymentInfo53.parkingInfo(0, date57, "hi!", "hi!", (int) (short) 1);
        student44.setPaymentInfo(paymentInfo53);
        boolean boolean64 = debitPaymentProvider12.handlePayment(paymentInfo53, 1.0d);
        paymentInfo53.setBillingName("");
        int int67 = paymentInfo53.getSecurityCode();
        boolean boolean69 = otherTypeProvider0.handlePayment(paymentInfo53, (-1.0d));
        paymentStrategy.Context context70 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.Context context71 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(superManager40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str41, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(paymentInfo46);
        org.junit.Assert.assertNull(reservation47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        boolean boolean5 = csvReader1.getSafetySwitch();
        int int6 = csvReader1.getHeaderCount();
        long long7 = csvReader1.getCurrentRecord();
        int int8 = csvReader1.getHeaderCount();
        java.lang.String str9 = csvReader1.getRawRecord();
        java.lang.Class<?> wildcardClass10 = csvReader1.getClass();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        csvWriter1.setTextQualifier('#');
        csvWriter1.setComment(' ');
        csvWriter1.setTextQualifier('a');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        paymentInfo57.setCardBallance((double) 10L);
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
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("password_112348536883400", "User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112348536883400" + "'", str3, "password_112348536883400");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.setEmail("hi!");
        int int14 = user6.getId();
        java.lang.String str15 = user6.lname;
        java.lang.String str16 = user6.getPassword();
        user6.password = "FALSE";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        boolean boolean2 = user0.isValidated;
        int int3 = user0.getId();
        user0.setPassword("User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("User [name= hi!, id=97, email=hi!, password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=97, email=hi!, password=admin] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.skipLine();
        csvReader1.setComment('\"');
        csvReader1.setTrimWhitespace(false);
        long long11 = csvReader1.getCurrentRecord();
        java.lang.String str12 = csvReader1.getRawRecord();
        csvReader1.setRecordDelimiter(',');
        java.lang.String[] strArray15 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(15, 0, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "password_112359916102100", 44);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str9 = csvReader1.getRawRecord();
        boolean boolean10 = csvReader1.getTrimWhitespace();
        csvReader1.setCaptureRawRecord(true);
        boolean boolean13 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.getSafetySwitch();
        boolean boolean10 = csvReader1.skipRecord();
        csvReader1.setSafetySwitch(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        parkingState.Occupied occupied1 = new parkingState.Occupied("User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        int int9 = csvReader1.getColumnCount();
        java.lang.String str10 = csvReader1.getRawRecord();
        boolean boolean11 = csvReader1.skipRecord();
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("", "hi!", "FALSE");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name= hi!, id=97, email=hi!, password=admin]", "User [name= hi!, id=97, email=hi!, password=]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("User [name= FALSE, id=97, email=, password=]", "User [name= FALSE, id=97, email=hi!, password=hi!]", "password_112336809022100");
        users.UserInfo userInfo16 = userInfoFactory0.makeUser("manager_112347878775000", "password_112347399105200", "password_112348536883400");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
        org.junit.Assert.assertNull(userInfo16);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        boolean boolean10 = csvReader1.readRecord();
        boolean boolean11 = csvReader1.getCaptureRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        boolean boolean5 = false; // flaky: parkingSystem0.isLotEnabled((int) (byte) 100);
        boolean boolean7 = false; // flaky: parkingSystem0.isLotEnabled((int) (short) -1);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap8 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intMap8);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        boolean boolean4 = csvReader1.isQualified((int) '#');
        boolean boolean5 = csvReader1.skipRecord();
        csvReader1.setTrimWhitespace(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        int int30 = paymentInfo22.getSecurityCode();
        paymentInfo22.setBillingName("password_112348536883400");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) ' ');
        parking.ParkingLot parkingLot5 = parkingSystem0.getLot((int) '\"');
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap6 = parkingSystem0.getLots();
        parking.ParkingSpace parkingSpace9 = null; // flaky: parkingSystem0.getParkingSpace((int) '\"', (int) (byte) 10);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNull(parkingLot3);
// flaky:         org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(intMap6);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace9);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        manager.Manager manager3 = superManager0.autoGenerator();
        superManager0.setUsername("User [name= hi!, id=97, email=hi!, password=hi!]");
        manager.Manager manager6 = superManager0.autoGenerator();
        reservations.ReservationSystemFacade reservationSystemFacade7 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot15 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace17 = parkingLot15.getParkingSpace((int) ' ');
        reservations.Reservation reservation18 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace17);
        users.FacultyMember facultyMember21 = new users.FacultyMember("", "hi!");
        int int22 = facultyMember21.parkingspacenum;
        int int23 = reservationSystemFacade7.calculateOutstanding(reservation18, (users.UserInfo) facultyMember21);
        users.FacultyMember facultyMember26 = new users.FacultyMember("", "hi!");
        int int27 = facultyMember26.parkingspacenum;
        facultyMember26.parkinglot = "hi!";
        parking.ParkingLot parkingLot42 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace44 = parkingLot42.getParkingSpace((int) ' ');
        reservations.Reservation reservation45 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace44);
        paymentStrategy.OtherTypeProvider otherTypeProvider46 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context47 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider46);
        paymentStrategy.PaymentInfo paymentInfo53 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo53.setBillingName("FALSE");
        paymentInfo53.setCardNum(1);
        boolean boolean59 = context47.execute(paymentInfo53, (double) 97);
        reservations.Reservation reservation60 = reservationSystemFacade7.createReservation((users.UserInfo) facultyMember26, (int) (short) -1, (-1), (int) ',', (int) (byte) 1, "admin", parkingSpace44, context47);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap61 = reservationSystemFacade7.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap62 = reservationSystemFacade7.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade63 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap64 = reservationSystemFacade63.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade65 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot73 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace75 = parkingLot73.getParkingSpace((int) ' ');
        reservations.Reservation reservation76 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace75);
        users.FacultyMember facultyMember79 = new users.FacultyMember("", "hi!");
        int int80 = facultyMember79.parkingspacenum;
        int int81 = reservationSystemFacade65.calculateOutstanding(reservation76, (users.UserInfo) facultyMember79);
        users.Student student84 = new users.Student("", "hi!");
        int int85 = student84.getParkingRate();
        reservationSystemFacade63.cancelBooking(reservation76, (users.UserInfo) student84);
        int int87 = reservation76.getStartTime();
        users.Student student90 = new users.Student("", "hi!");
        int int91 = student90.getParkingRate();
        student90.setValid();
        student90.setValid();
        int int94 = student90.getParkingRate();
        int int95 = student90.getParkingRate();
        student90.parkinglot = "password_112338187831000";
        reservationSystemFacade7.cancelBooking(reservation76, (users.UserInfo) student90);
        boolean boolean99 = manager6.validateUser((users.UserInfo) student90);
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str1, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertNotNull(manager6);
        org.junit.Assert.assertNotNull(reservationSystemFacade7);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(parkingSpace44);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(reservation60);
        org.junit.Assert.assertNotNull(intMap61);
        org.junit.Assert.assertNotNull(intMap62);
        org.junit.Assert.assertNotNull(reservationSystemFacade63);
        org.junit.Assert.assertNotNull(intMap64);
        org.junit.Assert.assertNotNull(reservationSystemFacade65);
        org.junit.Assert.assertNotNull(parkingSpace75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 5 + "'", int85 == 5);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 100 + "'", int87 == 100);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 5 + "'", int91 == 5);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 5 + "'", int94 == 5);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 5 + "'", int95 == 5);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String str7 = csvReader1.getRawRecord();
        int int8 = csvReader1.getColumnCount();
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        boolean boolean10 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingLot parkingLot3 = parkingSystem0.addLot((int) '\"', "User [name= FALSE, id=97, email=hi!, password=hi!]");
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingLot3);
        org.junit.Assert.assertNotNull(intMap4);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("admin", "password_112284545599300");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.email;
        java.lang.String str10 = user6.lname;
        user6.password = "password_112284545599300";
        user6.setValidation("User [name= hi!, id=97, email=hi!, password=admin]");
        java.lang.String str15 = user6.type;
        java.lang.String str16 = user6.lname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.setEmail("hi!");
        int int14 = user6.getId();
        user6.isValidated = true;
        user6.id = 35;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        maintainUser0.path = "User [name= hi!, id=97, email=hi!, password=]";
// flaky:         maintainUser0.load("password_112310734370300");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        boolean boolean7 = csvReader1.skipRecord();
        int int8 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        paymentStrategy.OtherTypeProvider otherTypeProvider29 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo35 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo35.setBillingName("FALSE");
        boolean boolean39 = otherTypeProvider29.handlePayment(paymentInfo35, (double) (short) 1);
        boolean boolean41 = debitPaymentProvider0.handlePayment(paymentInfo35, (double) 100L);
        int int42 = paymentInfo35.getCardNum();
        int int43 = paymentInfo35.getExpDate();
        paymentInfo35.setBillingName("admin");
        int int46 = paymentInfo35.getExpDate();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace(97);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(35, "password_112284545599300");
        // The following exception was thrown during execution in test generation
        try {
            parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid space id");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        java.lang.String str17 = paymentInfo15.getBillingName();
        int int18 = paymentInfo15.getSecurityCode();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str1, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str17, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) (short) 1, "password_112296757334200");
        parkingLot2.setEnabled(true);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        users.Visitor visitor2 = new users.Visitor("password_112351534974900", "password_112338187831000");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        java.lang.String str13 = user6.fname;
        user6.email = "";
        user6.email = "User [name=null null, id=0, email=null, password=null]";
        java.lang.String str18 = user6.type;
        java.lang.String str19 = user6.lname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.close();
        csvWriter1.close();
        csvWriter1.setForceQualifier(false);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        paymentStrategy.CreditPaymentProvide creditPaymentProvide62 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider63 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo69 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo69.setBillingName("FALSE");
        boolean boolean73 = otherTypeProvider63.handlePayment(paymentInfo69, (double) (short) 1);
        boolean boolean75 = creditPaymentProvide62.handlePayment(paymentInfo69, (double) (short) 0);
        double double76 = paymentInfo69.getCardBallance();
        boolean boolean78 = mobilePaymentProvider0.handlePayment(paymentInfo69, (double) (byte) -1);
        paymentStrategy.PaymentInfo paymentInfo79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = mobilePaymentProvider0.handlePayment(paymentInfo79, (double) (-30));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("FALSE");
        csvReader1.setDelimiter(',');
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        users.UserList userList0 = new users.UserList();
        java.util.ArrayList<users.UserInfo> userInfoList1 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList2 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList3 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList4 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList5 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList6 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList7 = userList0.getList();
        java.util.ArrayList<users.UserInfo> userInfoList8 = userList0.getList();
        org.junit.Assert.assertNotNull(userInfoList1);
        org.junit.Assert.assertNotNull(userInfoList2);
        org.junit.Assert.assertNotNull(userInfoList3);
        org.junit.Assert.assertNotNull(userInfoList4);
        org.junit.Assert.assertNotNull(userInfoList5);
        org.junit.Assert.assertNotNull(userInfoList6);
        org.junit.Assert.assertNotNull(userInfoList7);
        org.junit.Assert.assertNotNull(userInfoList8);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str9 = csvReader1.getRawRecord();
        boolean boolean10 = csvReader1.getTrimWhitespace();
        int int11 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        boolean boolean14 = csvReader1.getSafetySwitch();
        boolean boolean15 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(32);
        boolean boolean12 = csvReader1.readRecord();
        java.lang.String str14 = csvReader1.get((int) (short) 10);
        csvReader1.setDelimiter('4');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(264, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) (short) 0);
        parkingLot2.setEnabled(true);
        int int7 = parkingLot2.getId();
        parkingLot2.setEnabled(false);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 264 + "'", int7 == 264);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("User [name=null null, id=0, email=null, password=null]", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setComment('4');
        boolean boolean7 = csvReader1.skipLine();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        csvReader1.setUseTextQualifier(false);
        boolean boolean11 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        csvReader1.setComment('a');
        boolean boolean11 = csvReader1.readRecord();
        char char12 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        parking.ParkingLot parkingLot55 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace57 = parkingLot55.getParkingSpace((int) ' ');
        reservations.Reservation reservation58 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace57);
        parkingState.State state59 = parkingSpace57.getSensorStatus();
        parkingState.State state60 = parkingSpace57.getSensorStatus();
        reservations.Reservation reservation61 = new reservations.Reservation((int) '\"', (-1), (int) (byte) 100, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=]", parkingSpace57);
        int int62 = reservation61.getDuration();
        users.Student student65 = new users.Student("FALSE", "Password!23");
        student65.parkinglot = "password_112310734370300";
        paymentStrategy.PaymentInfo paymentInfo68 = student65.getPaymentInfo();
        reservationSystemFacade0.cancelBooking(reservation61, (users.UserInfo) student65);
        reservation61.updateDuration((int) ' ');
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
        org.junit.Assert.assertNotNull(parkingSpace57);
        org.junit.Assert.assertNotNull(state59);
        org.junit.Assert.assertNotNull(state60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 34 + "'", int62 == 34);
        org.junit.Assert.assertNull(paymentInfo68);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(8);
        boolean boolean12 = csvReader1.getSafetySwitch();
        com.csvreader.CsvReader csvReader14 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean15 = csvReader14.readRecord();
        csvReader14.setSafetySwitch(true);
        csvReader14.setTrimWhitespace(false);
        boolean boolean20 = csvReader14.skipRecord();
        char char21 = csvReader14.getDelimiter();
        boolean boolean22 = csvReader14.skipLine();
        boolean boolean23 = csvReader14.skipLine();
        com.csvreader.CsvWriter csvWriter25 = new com.csvreader.CsvWriter("");
        csvWriter25.setRecordDelimiter('\"');
        boolean boolean28 = csvWriter25.getUseTextQualifier();
        com.csvreader.CsvReader csvReader30 = com.csvreader.CsvReader.parse("hi!");
        char char31 = csvReader30.getComment();
        char char32 = csvReader30.getTextQualifier();
        java.lang.String[] strArray33 = csvReader30.getHeaders();
        java.lang.String[] strArray34 = csvReader30.getValues();
        csvWriter25.writeRecord(strArray34);
        csvReader14.setHeaders(strArray34);
        csvReader1.setHeaders(strArray34);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(csvReader14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + ',' + "'", char21 == ',');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(csvReader30);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '#' + "'", char31 == '#');
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\"' + "'", char32 == '\"');
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        facultyMember2.setValid();
        facultyMember2.setValid();
        facultyMember2.parkingspacenum = (byte) 0;
        reservations.ReservationSystemFacade reservationSystemFacade10 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap11 = reservationSystemFacade10.getLots();
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        facultyMember14.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade18 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot26 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace28 = parkingLot26.getParkingSpace((int) ' ');
        reservations.Reservation reservation29 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace28);
        reservationSystemFacade18.editBooking(reservation29, (int) (byte) 100);
        facultyMember14.currentReservation = reservation29;
        int int33 = reservation29.getMonth();
        reservationSystemFacade10.editBooking(reservation29, (int) (byte) 100);
        facultyMember2.currentReservation = reservation29;
        facultyMember2.parkingspacenum = 10;
        facultyMember2.parkinglot = "password_112325847983500";
        users.FacultyMember facultyMember43 = new users.FacultyMember("", "hi!");
        int int44 = facultyMember43.parkingspacenum;
        facultyMember43.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade47 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot55 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace57 = parkingLot55.getParkingSpace((int) ' ');
        reservations.Reservation reservation58 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace57);
        reservationSystemFacade47.editBooking(reservation58, (int) (byte) 100);
        facultyMember43.currentReservation = reservation58;
        parking.ParkingSpace parkingSpace62 = reservation58.getSpace();
        parkingState.State state63 = parkingSpace62.getSensorStatus();
        reservations.ReservationSystemFacade reservationSystemFacade64 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot72 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace74 = parkingLot72.getParkingSpace((int) ' ');
        reservations.Reservation reservation75 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace74);
        users.FacultyMember facultyMember78 = new users.FacultyMember("", "hi!");
        int int79 = facultyMember78.parkingspacenum;
        int int80 = reservationSystemFacade64.calculateOutstanding(reservation75, (users.UserInfo) facultyMember78);
        reservation75.updateDuration((int) ' ');
        int int83 = reservation75.getStartTime();
        parkingSpace62.setReservation(reservation75);
        int int85 = reservation75.getDuration();
        java.lang.String str86 = reservation75.getPlate();
        facultyMember2.currentReservation = reservation75;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade10);
        org.junit.Assert.assertNotNull(intMap11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade18);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade47);
        org.junit.Assert.assertNotNull(parkingSpace57);
        org.junit.Assert.assertNotNull(parkingSpace62);
        org.junit.Assert.assertNotNull(state63);
        org.junit.Assert.assertNotNull(reservationSystemFacade64);
        org.junit.Assert.assertNotNull(parkingSpace74);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 32 + "'", int85 == 32);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "admin" + "'", str86, "admin");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) ',', "User [name=null null, id=0, email=null, password=null]");
        boolean boolean3 = parkingLot2.getEnabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        boolean boolean6 = csvWriter1.getUseTextQualifier();
        csvWriter1.close();
        com.csvreader.CsvWriter csvWriter9 = new com.csvreader.CsvWriter("");
        csvWriter9.setRecordDelimiter('\"');
        csvWriter9.setTextQualifier('\"');
        char char14 = csvWriter9.getComment();
        boolean boolean15 = csvWriter9.getForceQualifier();
        char char16 = csvWriter9.getRecordDelimiter();
        com.csvreader.CsvWriter csvWriter18 = new com.csvreader.CsvWriter("");
        csvWriter18.setRecordDelimiter('\"');
        csvWriter18.setTextQualifier('\"');
        char char23 = csvWriter18.getComment();
        boolean boolean24 = csvWriter18.getUseTextQualifier();
        char char25 = csvWriter18.getRecordDelimiter();
        com.csvreader.CsvWriter csvWriter27 = new com.csvreader.CsvWriter("");
        boolean boolean28 = csvWriter27.getUseTextQualifier();
        com.csvreader.CsvReader csvReader30 = com.csvreader.CsvReader.parse("hi!");
        char char31 = csvReader30.getComment();
        char char32 = csvReader30.getTextQualifier();
        java.lang.String[] strArray33 = csvReader30.getHeaders();
        java.lang.String[] strArray34 = csvReader30.getValues();
        csvWriter27.writeRecord(strArray34);
        csvWriter18.writeRecord(strArray34, false);
        csvWriter9.writeRecord(strArray34);
        csvWriter1.writeRecord(strArray34, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '#' + "'", char14 == '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '#' + "'", char23 == '#');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\"' + "'", char25 == '\"');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(csvReader30);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '#' + "'", char31 == '#');
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\"' + "'", char32 == '\"');
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        int int8 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        java.lang.String[] strArray10 = csvReader1.getValues();
        csvReader1.setSkipEmptyRecords(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getForceQualifier();
        csvWriter1.writeComment("User [name= hi!, id=97, email=hi!, password=hi!]");
        char char8 = csvWriter1.getDelimiter();
        char char9 = csvWriter1.getTextQualifier();
        csvWriter1.write("password_112357424381900", true);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '#' + "'", char9 == '#');
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        char char7 = csvReader1.getComment();
        boolean boolean9 = csvReader1.isQualified(2);
        boolean boolean10 = csvReader1.getTrimWhitespace();
        csvReader1.setComment('a');
        boolean boolean13 = csvReader1.getUseComments();
        csvReader1.setTrimWhitespace(true);
        int int16 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        user6.setType("FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        paymentInfo7.setCardNum(1);
        paymentInfo7.setExpDate(768);
        boolean boolean15 = debitPaymentProvider0.handlePayment(paymentInfo7, (double) (byte) 1);
        paymentStrategy.PaymentInfo paymentInfo21 = new paymentStrategy.PaymentInfo((int) (short) 0, 100, "", "password_112306347644100", 35);
        paymentInfo21.setBillingAddress("password_112338187831000");
        boolean boolean25 = debitPaymentProvider0.handlePayment(paymentInfo21, (-1.0d));
        users.NonFacultyStaff nonFacultyStaff28 = new users.NonFacultyStaff("hi!", "admin");
        paymentStrategy.PaymentInfo paymentInfo34 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo34.setBillingName("FALSE");
        paymentInfo34.setCardNum(1);
        java.lang.String str39 = paymentInfo34.getBillingName();
        java.lang.String str40 = paymentInfo34.getBillingAddress();
        nonFacultyStaff28.setPaymentInfo(paymentInfo34);
        boolean boolean43 = debitPaymentProvider0.handlePayment(paymentInfo34, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "FALSE" + "'", str39, "FALSE");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        student4.setValid();
        student4.parkingspacenum = 264;
        paymentStrategy.PaymentInfo paymentInfo10 = student4.getPaymentInfo();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str1, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(paymentInfo10);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        userLogin.User user6 = new userLogin.User("password_112284545599300", "password_112325847983500", (int) '\"', "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "manager_112327586653400", "User [name=null null, id=0, email=null, password=null]");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("hi!", "");
        int int3 = nonFacultyStaff2.getParkingRate();
        int int4 = nonFacultyStaff2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = manager3.getPassword();
        users.FacultyMember facultyMember7 = new users.FacultyMember("admin", "FALSE");
        paymentStrategy.PaymentInfo paymentInfo8 = facultyMember7.getPaymentInfo();
        boolean boolean9 = manager3.validateUser((users.UserInfo) facultyMember7);
        manager3.lastName = "";
        java.lang.String str12 = manager3.getPassword();
        manager3.firstName = "admin";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112368470689200" + "'", str4, "password_112368470689200");
        org.junit.Assert.assertNull(paymentInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "password_112368470689200" + "'", str12, "password_112368470689200");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        paymentInfo69.setBillingAddress("User [name=null null, id=0, email=null, password=null]");
        java.util.Date date76 = null;
        paymentInfo69.parkingInfo((int) (byte) 0, date76, "password_112306347644100", "password_112343396437900", 155);
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
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.close();
        char char4 = csvWriter1.getDelimiter();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setDelimiter('4');
        csvWriter1.setUseTextQualifier(false);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        int int17 = paymentInfo15.getExpDate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        parking.ParkingLot parkingLot35 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace37 = parkingLot35.getParkingSpace((int) ' ');
        reservations.Reservation reservation38 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace37);
        int int39 = reservation38.getDay();
        parking.ParkingSpace parkingSpace40 = reservation38.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList41 = parkingSpace40.getReservations();
        parkingSpace40.setId(0);
        int int44 = parkingSpace40.getId();
        parking.ParkingLot parkingLot52 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace54 = parkingLot52.getParkingSpace((int) ' ');
        reservations.Reservation reservation55 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace54);
        int int56 = reservation55.getDay();
        int int57 = reservation55.getDuration();
        parkingSpace40.setReservation(reservation55);
        users.Visitor visitor61 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        visitor61.setValid();
        java.lang.String str63 = visitor61.parkinglot;
        reservations.Reservation reservation64 = visitor61.currentReservation;
        reservationSystemFacade0.cancelBooking(reservation55, (users.UserInfo) visitor61);
        boolean boolean66 = visitor61.getIsValid();
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
        org.junit.Assert.assertNotNull(parkingSpace37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertNotNull(reservationList41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(parkingSpace54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(reservation64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) 0, 0, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "hi!", (int) ',');
        java.util.Date date7 = null;
        paymentInfo5.parkingInfo(768, date7, "password_112351534974900", "", 272);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        csvReader1.close();
        csvReader1.setTextQualifier('\"');
        char char5 = csvReader1.getTextQualifier();
        int int6 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        java.lang.String str15 = user6.getType();
        user6.id = 100;
        java.lang.String str18 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FALSE" + "'", str18, "FALSE");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        userLogin.User user6 = new userLogin.User("password_112347399105200", "hi!", (int) (byte) 100, "User [name=null null, id=0, email=null, password=null]", "hi!", "password_112359916102100");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        int int9 = user6.id;
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = superManager0.firstName;
        users.FacultyMember facultyMember7 = new users.FacultyMember("", "hi!");
        int int8 = facultyMember7.parkingspacenum;
        facultyMember7.parkinglot = "hi!";
        java.lang.String str11 = facultyMember7.getPassword();
        boolean boolean12 = superManager0.validateUser((users.UserInfo) facultyMember7);
        superManager0.lastName = "password_112338187831000";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        reservations.ReservationSystemFacade reservationSystemFacade5 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap6 = reservationSystemFacade5.getLots();
        users.FacultyMember facultyMember9 = new users.FacultyMember("", "hi!");
        int int10 = facultyMember9.parkingspacenum;
        facultyMember9.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade13 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot21 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace23 = parkingLot21.getParkingSpace((int) ' ');
        reservations.Reservation reservation24 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace23);
        reservationSystemFacade13.editBooking(reservation24, (int) (byte) 100);
        facultyMember9.currentReservation = reservation24;
        int int28 = reservation24.getMonth();
        reservationSystemFacade5.editBooking(reservation24, (int) (byte) 100);
        parking.ParkingLot parkingLot38 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace40 = parkingLot38.getParkingSpace((int) ' ');
        reservations.Reservation reservation41 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace40);
        int int42 = reservation41.getDay();
        parking.ParkingSpace parkingSpace43 = reservation41.getSpace();
        users.FacultyMember facultyMember46 = new users.FacultyMember("", "hi!");
        int int47 = reservationSystemFacade5.calculateOutstanding(reservation41, (users.UserInfo) facultyMember46);
        parking.ParkingLot parkingLot55 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace57 = parkingLot55.getParkingSpace((int) ' ');
        reservations.Reservation reservation58 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace57);
        int int59 = reservation58.getDay();
        parking.ParkingSpace parkingSpace60 = reservation58.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList61 = parkingSpace60.getReservations();
        parkingSpace60.setId(0);
        users.FacultyMember facultyMember66 = new users.FacultyMember("", "hi!");
        int int67 = facultyMember66.parkingspacenum;
        facultyMember66.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade70 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot78 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace80 = parkingLot78.getParkingSpace((int) ' ');
        reservations.Reservation reservation81 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace80);
        reservationSystemFacade70.editBooking(reservation81, (int) (byte) 100);
        facultyMember66.currentReservation = reservation81;
        int int85 = reservation81.getMonth();
        parkingSpace60.setReservation(reservation81);
        manager.SuperManager superManager87 = manager.SuperManager.getInstance();
        java.lang.String str88 = superManager87.firstName;
        users.Student student91 = new users.Student("", "hi!");
        boolean boolean92 = superManager87.validateUser((users.UserInfo) student91);
        paymentStrategy.PaymentInfo paymentInfo93 = student91.getPaymentInfo();
        int int94 = student91.getParkingRate();
        reservationSystemFacade5.cancelBooking(reservation81, (users.UserInfo) student91);
        parking.ParkingSpace parkingSpace96 = reservation81.getSpace();
        reservations.Reservation reservation97 = new reservations.Reservation(8, 2, 34, 155, "password_112338187831000", parkingSpace96);
        org.junit.Assert.assertNotNull(reservationSystemFacade5);
        org.junit.Assert.assertNotNull(intMap6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade13);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(parkingSpace43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(parkingSpace57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(parkingSpace60);
        org.junit.Assert.assertNotNull(reservationList61);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade70);
        org.junit.Assert.assertNotNull(parkingSpace80);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(superManager87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(paymentInfo93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 5 + "'", int94 == 5);
        org.junit.Assert.assertNotNull(parkingSpace96);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setDelimiter('\000');
        csvWriter1.writeComment("password_112296757334200");
        csvWriter1.setDelimiter('a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace(100);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace((int) '#');
        parkingSpace1.setEnabled(true);
        parkingSpace1.setEnabled(false);
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap7 = reservationSystemFacade6.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade8 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot16 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace18 = parkingLot16.getParkingSpace((int) ' ');
        reservations.Reservation reservation19 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace18);
        users.FacultyMember facultyMember22 = new users.FacultyMember("", "hi!");
        int int23 = facultyMember22.parkingspacenum;
        int int24 = reservationSystemFacade8.calculateOutstanding(reservation19, (users.UserInfo) facultyMember22);
        manager.SuperManager superManager25 = manager.SuperManager.getInstance();
        java.lang.String str26 = superManager25.firstName;
        users.Student student29 = new users.Student("", "hi!");
        boolean boolean30 = superManager25.validateUser((users.UserInfo) student29);
        paymentStrategy.PaymentInfo paymentInfo31 = student29.getPaymentInfo();
        student29.setValid();
        int int33 = reservationSystemFacade6.calculateOutstanding(reservation19, (users.UserInfo) student29);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap34 = reservationSystemFacade6.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap35 = reservationSystemFacade6.getLots();
        parking.ParkingLot parkingLot48 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace50 = parkingLot48.getParkingSpace((int) ' ');
        reservations.Reservation reservation51 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace50);
        int int52 = reservation51.getDay();
        parking.ParkingSpace parkingSpace53 = reservation51.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList54 = parkingSpace53.getReservations();
        parkingSpace53.setId(0);
        int int57 = parkingSpace53.getId();
        reservations.Reservation reservation58 = new reservations.Reservation((int) (byte) -1, 97, (int) (short) -1, 768, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", parkingSpace53);
        users.NonFacultyStaff nonFacultyStaff61 = new users.NonFacultyStaff("hi!", "");
        java.lang.String str62 = nonFacultyStaff61.getEmail();
        int int63 = nonFacultyStaff61.getParkingRate();
        paymentStrategy.DebitPaymentProvider debitPaymentProvider64 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context65 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider64);
        paymentStrategy.PaymentInfo paymentInfo71 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo71.setBillingName("FALSE");
        paymentInfo71.setCardNum(1);
        paymentInfo71.setExpDate(768);
        boolean boolean79 = debitPaymentProvider64.handlePayment(paymentInfo71, (double) (byte) 1);
        reservationSystemFacade6.payBalance(reservation58, (users.UserInfo) nonFacultyStaff61, (paymentStrategy.PaymentProvider) debitPaymentProvider64);
        parkingSpace1.setReservation(reservation58);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(intMap7);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(superManager25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(paymentInfo31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intMap34);
        org.junit.Assert.assertNotNull(intMap35);
        org.junit.Assert.assertNotNull(parkingSpace50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(parkingSpace53);
        org.junit.Assert.assertNotNull(reservationList54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("admin", '#');
        csvReader2.setTrimWhitespace(false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        char char12 = csvWriter1.getDelimiter();
        boolean boolean13 = csvWriter1.getUseTextQualifier();
        csvWriter1.setEscapeMode(264);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setUseTextQualifier(true);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("Password!23");
        csvWriter1.setUseTextQualifier(true);
        com.csvreader.CsvWriter csvWriter5 = new com.csvreader.CsvWriter("");
        csvWriter5.setRecordDelimiter('\"');
        csvWriter5.setTextQualifier('\"');
        char char10 = csvWriter5.getComment();
        boolean boolean11 = csvWriter5.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter13 = new com.csvreader.CsvWriter("");
        csvWriter13.setRecordDelimiter('\"');
        boolean boolean16 = csvWriter13.getUseTextQualifier();
        com.csvreader.CsvReader csvReader18 = com.csvreader.CsvReader.parse("hi!");
        char char19 = csvReader18.getComment();
        char char20 = csvReader18.getTextQualifier();
        java.lang.String[] strArray21 = csvReader18.getHeaders();
        java.lang.String[] strArray22 = csvReader18.getValues();
        csvWriter13.writeRecord(strArray22);
        csvWriter5.writeRecord(strArray22);
        csvWriter1.writeRecord(strArray22);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(csvReader18);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '#' + "'", char19 == '#');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", (int) (short) 1, "FALSE", "User [name= hi!, id=97, email=hi!, password=admin]", "FALSE");
        java.lang.String str7 = user6.email;
        user6.type = "manager_112351534964500";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setValidation("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.type;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        paymentStrategy.OtherTypeProvider otherTypeProvider29 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo35 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo35.setBillingName("FALSE");
        boolean boolean39 = otherTypeProvider29.handlePayment(paymentInfo35, (double) (short) 1);
        boolean boolean41 = debitPaymentProvider0.handlePayment(paymentInfo35, (double) 100L);
        int int42 = paymentInfo35.getCardNum();
        int int43 = paymentInfo35.getExpDate();
        paymentInfo35.setBillingName("admin");
        int int46 = paymentInfo35.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getValidation();
        java.lang.String str12 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingSpace parkingSpace7 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation8 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace7);
        reservationSystemFacade0.editBooking(reservation8, 0);
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
        int int35 = reservation24.getStartTime();
        int int36 = reservation24.getMonth();
        int int37 = reservation24.getMonth();
        users.FacultyMember facultyMember40 = new users.FacultyMember("", "hi!");
        int int41 = facultyMember40.parkingspacenum;
        facultyMember40.parkinglot = "hi!";
        facultyMember40.setValid();
        java.lang.String str45 = facultyMember40.getPassword();
        int int46 = facultyMember40.parkingspacenum;
        reservations.Reservation reservation47 = facultyMember40.currentReservation;
        int int48 = reservationSystemFacade0.calculateOutstanding(reservation24, (users.UserInfo) facultyMember40);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(reservationSystemFacade11);
        org.junit.Assert.assertNotNull(intMap12);
        org.junit.Assert.assertNotNull(reservationSystemFacade13);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(reservation47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap5 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertNotNull(intMap5);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.getValidation();
        java.lang.String str13 = user6.getFName();
        java.lang.String str14 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FALSE" + "'", str14, "FALSE");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        int int48 = reservation14.getMonth();
        int int49 = reservation14.getMonth();
        int int50 = reservation14.getStartTime();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getValidation();
        java.lang.String str13 = user6.getPassword();
        java.lang.String str14 = user6.getValidation();
        java.lang.String str15 = user6.password;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FALSE" + "'", str14, "FALSE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        paymentStrategy.PaymentProvider paymentProvider0 = null;
        paymentStrategy.Context context1 = new paymentStrategy.Context(paymentProvider0);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        boolean boolean5 = false; // flaky: parkingSystem0.isLotEnabled((int) (byte) 100);
        boolean boolean7 = false; // flaky: parkingSystem0.isLotEnabled((int) (short) -1);
        parking.ParkingLot parkingLot9 = parkingSystem0.getLot(0);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertNotNull(parkingLot9);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.setId(97);
        user6.isValidated = false;
        java.lang.String str16 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        int int10 = user6.getId();
        java.lang.String str11 = user6.getEmail();
        int int12 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.setEmail("hi!");
        boolean boolean14 = user6.isValidated;
        user6.setPassword("User [name= FALSE, id=97, email=, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        boolean boolean6 = false; // flaky: parkingSystem0.isLotEnabled((int) (byte) 100);
        parking.ParkingSpace parkingSpace9 = null; // flaky: parkingSystem0.getParkingSpace(5, (int) (short) 0);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace9);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = creditPaymentProvide0.handlePayment(paymentInfo6, (double) 8);
        int int17 = paymentInfo6.getExpDate();
        paymentInfo6.setCardBallance(0.0d);
        int int20 = paymentInfo6.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        int int24 = reservation13.getDay();
        parking.ParkingSpace parkingSpace25 = reservation13.getSpace();
        users.FacultyMember facultyMember28 = new users.FacultyMember("", "hi!");
        int int29 = facultyMember28.parkingspacenum;
        facultyMember28.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade32 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot40 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace42 = parkingLot40.getParkingSpace((int) ' ');
        reservations.Reservation reservation43 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace42);
        reservationSystemFacade32.editBooking(reservation43, (int) (byte) 100);
        facultyMember28.currentReservation = reservation43;
        java.lang.String str47 = reservation43.getPlate();
        parking.ParkingSpace parkingSpace48 = reservation43.getSpace();
        parking.ParkingSpace parkingSpace49 = reservation43.getSpace();
        parkingSpace25.setReservation(reservation43);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade32);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "admin" + "'", str47, "admin");
        org.junit.Assert.assertNotNull(parkingSpace48);
        org.junit.Assert.assertNotNull(parkingSpace49);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('\000');
        char char4 = csvReader1.getDelimiter();
        boolean boolean5 = csvReader1.skipLine();
        boolean boolean6 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean11 = csvReader1.getSkipEmptyRecords();
        csvReader1.setEscapeMode((int) (short) 1);
        boolean boolean14 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parkingSpace7.setId((int) (byte) 10);
        parkingState.Disabled disabled10 = new parkingState.Disabled();
        parkingSpace7.setState((parkingState.State) disabled10);
        parking.ParkingLot parkingLot19 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace21 = parkingLot19.getParkingSpace((int) ' ');
        reservations.Reservation reservation22 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace21);
        parkingState.State state23 = parkingSpace21.getSensorStatus();
        parking.ParkingLot parkingLot26 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace28 = parkingLot26.getParkingSpace((int) ' ');
        boolean boolean29 = parkingLot26.getEnabled();
        parking.ParkingSpace parkingSpace31 = parkingLot26.getParkingSpace(10);
        parkingSpace31.setId((int) (byte) 10);
        parkingState.Disabled disabled34 = new parkingState.Disabled();
        parkingSpace31.setState((parkingState.State) disabled34);
        parkingSpace21.setState((parkingState.State) disabled34);
        parkingSpace7.setState((parkingState.State) disabled34);
        java.util.ArrayList<reservations.Reservation> reservationList38 = parkingSpace7.getReservations();
        users.FacultyMember facultyMember41 = new users.FacultyMember("", "hi!");
        int int42 = facultyMember41.parkingspacenum;
        facultyMember41.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade45 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot53 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace55 = parkingLot53.getParkingSpace((int) ' ');
        reservations.Reservation reservation56 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace55);
        reservationSystemFacade45.editBooking(reservation56, (int) (byte) 100);
        facultyMember41.currentReservation = reservation56;
        parking.ParkingSpace parkingSpace60 = reservation56.getSpace();
        parkingSpace7.setReservation(reservation56);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(state23);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(parkingSpace31);
        org.junit.Assert.assertNotNull(reservationList38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade45);
        org.junit.Assert.assertNotNull(parkingSpace55);
        org.junit.Assert.assertNotNull(parkingSpace60);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("", "hi!", "FALSE");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("manager_112327586653400", "User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("manager_112347878775000", "password_112336809022100", "manager_112351534964500");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]", "password_112310734370300");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        java.lang.String str9 = user6.toString();
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str9, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getComment();
        char char11 = csvWriter1.getRecordDelimiter();
        char char12 = csvWriter1.getComment();
        int int13 = csvWriter1.getEscapeMode();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '#' + "'", char12 == '#');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        java.lang.String str15 = user6.type;
        int int16 = user6.id;
        boolean boolean17 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setForceQualifier(false);
        csvWriter1.setRecordDelimiter('#');
        char char10 = csvWriter1.getComment();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getEscapeMode();
        csvReader1.setSafetySwitch(true);
        boolean boolean10 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        user6.setValidation("manager_112351534964500");
        java.lang.String str13 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        int int5 = parkingSpace4.getId();
        parkingSpace4.setId(155);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        int int24 = reservation13.getDay();
        parking.ParkingSpace parkingSpace25 = reservation13.getSpace();
        boolean boolean26 = parkingSpace25.isEnabled();
        parkingSpace25.setId((int) ',');
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        users.Visitor visitor2 = new users.Visitor("User [name= hi!, id=97, email=hi!, password=]", "password_112284545599300");
        visitor2.setValid();
        int int4 = visitor2.getParkingRate();
        int int5 = visitor2.getParkingRate();
        java.lang.String str6 = visitor2.parkinglot;
        paymentStrategy.PaymentInfo paymentInfo12 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo12.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str15 = paymentInfo12.getBillingAddress();
        paymentInfo12.setSecurityCode((int) (byte) -1);
        int int18 = paymentInfo12.getSecurityCode();
        visitor2.setPaymentInfo(paymentInfo12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str15, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        csvReader1.setUseComments(false);
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
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        paymentInfo41.setBillingName("");
        int int55 = paymentInfo41.getSecurityCode();
        paymentInfo41.setCardBallance((double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getValidation();
        java.lang.String str14 = user6.getType();
        java.lang.String str15 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FALSE" + "'", str15, "FALSE");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        csvReader1.setTrimWhitespace(true);
        int int7 = csvReader1.getColumnCount();
        csvReader1.setSkipEmptyRecords(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("admin");
        char char8 = csvReader1.getDelimiter();
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getComment();
        char char11 = csvWriter1.getRecordDelimiter();
        char char12 = csvWriter1.getComment();
        csvWriter1.setComment('a');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '#' + "'", char12 == '#');
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        csvReader1.setTextQualifier('4');
        csvReader1.setCaptureRawRecord(false);
        char char8 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setDelimiter('#');
        csvWriter1.setUseTextQualifier(true);
        boolean boolean12 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvReader csvReader14 = com.csvreader.CsvReader.parse("hi!");
        char char15 = csvReader14.getComment();
        char char16 = csvReader14.getTextQualifier();
        int int17 = csvReader14.getHeaderCount();
        java.lang.String[] strArray18 = csvReader14.getValues();
        csvWriter1.writeRecord(strArray18, true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(csvReader14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '#' + "'", char15 == '#');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setSkipEmptyRecords(true);
        java.lang.String str9 = csvReader1.getHeader((int) (short) 10);
        boolean boolean10 = csvReader1.getUseTextQualifier();
        csvReader1.setDelimiter('\000');
        boolean boolean13 = csvReader1.skipLine();
        csvReader1.setTrimWhitespace(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        csvReader1.close();
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        int int48 = reservation14.getMonth();
        parking.ParkingSpace parkingSpace49 = reservation14.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList50 = parkingSpace49.getReservations();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(parkingSpace49);
        org.junit.Assert.assertNotNull(reservationList50);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getColumnCount();
        boolean boolean8 = csvReader1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = csvReader1.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        user6.fname = "User [name= FALSE, id=97, email=, password=]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = creditPaymentProvide0.handlePayment(paymentInfo6, (double) 8);
        int int17 = paymentInfo6.getExpDate();
        paymentInfo6.setCardBallance((-1.0d));
        java.util.Date date21 = null;
        paymentInfo6.parkingInfo((int) '\000', date21, "User [name= hi!, id=97, email=hi!, password=hi!]", "password_112296757334200", (int) (short) 100);
        paymentInfo6.setCardBallance((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        java.lang.String str7 = superManager0.lastName;
        users.UserInfo userInfo8 = null;
        boolean boolean9 = superManager0.validateUser(userInfo8);
        manager.Manager manager10 = superManager0.autoGenerator();
        java.lang.String str11 = manager10.getUsername();
        manager10.lastName = "password_112368470689200";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(manager10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "manager_112369653203000" + "'", str11, "manager_112369653203000");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        users.Visitor visitor2 = new users.Visitor("User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", "User [name= FALSE, id=97, email=, password=]");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        user6.type = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str19 = user6.getLName();
        user6.isValidated = false;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        userLogin.MaintainUser maintainUser16 = new userLogin.MaintainUser();
        java.lang.String str17 = maintainUser16.path;
        userLogin.MaintainUser maintainUser18 = new userLogin.MaintainUser();
        maintainUser18.update("admin");
        java.util.ArrayList<userLogin.User> userList21 = maintainUser18.users;
        maintainUser16.users = userList21;
        maintainUser0.users = userList21;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File  does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        users.Student student2 = new users.Student("", "hi!");
        int int3 = student2.getParkingRate();
        java.lang.String str4 = student2.getPassword();
        java.lang.String str5 = student2.parkinglot;
        int int6 = student2.getParkingRate();
        int int7 = student2.getParkingRate();
        java.lang.String str8 = student2.getEmail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("password_112284545599300", "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("password_112348536883400", "User [name= hi!, id=97, email=hi!, password=hi!]", "User [name=null null, id=0, email=null, password=null]");
        users.UserInfo userInfo16 = userInfoFactory0.makeUser("User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", "manager_112365856111300", "");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
        org.junit.Assert.assertNull(userInfo16);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        java.lang.String str4 = facultyMember2.parkinglot;
        java.lang.String str5 = facultyMember2.getEmail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        boolean boolean15 = parkingSpace14.isEnabled();
        int int16 = parkingSpace14.getId();
        parkingState.Occupied occupied18 = new parkingState.Occupied("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        parkingSpace14.setState((parkingState.State) occupied18);
        parkingState.State state20 = parkingSpace14.getSensorStatus();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(state20);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("Password!23", '\000');
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        facultyMember2.setValid();
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        boolean boolean5 = csvReader1.getSafetySwitch();
        int int6 = csvReader1.getHeaderCount();
        boolean boolean7 = csvReader1.getUseTextQualifier();
        java.lang.String str9 = csvReader1.getHeader(0);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        userLogin.User user6 = new userLogin.User("password_112336809022100", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", (int) '4', "password_112368470689200", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", "FALSE");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        user6.setPassword("");
        java.lang.String str13 = user6.type;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]", 'a');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        char char12 = csvWriter1.getTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= FALSE, id=1, email=hi!, password=hi!]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        boolean boolean9 = csvReader1.getSkipEmptyRecords();
        csvReader1.setTrimWhitespace(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        maintainUser0.path = "User [name= hi!, id=97, email=hi!, password=]";
        maintainUser0.path = "User [name=null null, id=0, email=null, password=null]";
        java.lang.String str11 = maintainUser0.path;
        userLogin.MaintainUser maintainUser12 = new userLogin.MaintainUser();
        maintainUser12.update("admin");
        maintainUser12.path = "hi!";
        userLogin.MaintainUser maintainUser17 = new userLogin.MaintainUser();
        java.lang.String str18 = maintainUser17.path;
        userLogin.MaintainUser maintainUser19 = new userLogin.MaintainUser();
        maintainUser19.update("admin");
        java.util.ArrayList<userLogin.User> userList22 = maintainUser19.users;
        maintainUser17.users = userList22;
        maintainUser12.users = userList22;
        maintainUser0.users = userList22;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str11, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        int int52 = paymentInfo36.getSecurityCode();
        int int53 = paymentInfo36.getSecurityCode();
        java.lang.String str54 = paymentInfo36.getBillingName();
        double double55 = paymentInfo36.getCardBallance();
        double double56 = paymentInfo36.getCardBallance();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 34 + "'", int52 == 34);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 34 + "'", int53 == 34);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        java.util.Date date53 = null;
        paymentInfo39.parkingInfo((int) ' ', date53, "User [name= hi!, id=97, email=hi!, password=]", "", 8);
        double double58 = paymentInfo39.getCardBallance();
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        boolean boolean43 = otherTypeProvider0.handlePayment(paymentInfo30, (double) 10.0f);
        paymentStrategy.PaymentInfo paymentInfo49 = new paymentStrategy.PaymentInfo(5, 100, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]", "User [name= FALSE, id=97, email=hi!, password=hi!]", (int) ',');
        int int50 = paymentInfo49.getExpDate();
        boolean boolean52 = otherTypeProvider0.handlePayment(paymentInfo49, (double) ',');
        paymentInfo49.setBillingName("password_112358838017900");
        int int55 = paymentInfo49.getExpDate();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", '\"', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide2 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int9 = paymentInfo8.getSecurityCode();
        java.lang.String str10 = paymentInfo8.getBillingAddress();
        java.util.Date date12 = null;
        paymentInfo8.parkingInfo(0, date12, "hi!", "hi!", (int) (short) 1);
        boolean boolean18 = creditPaymentProvide2.handlePayment(paymentInfo8, (double) 8);
        paymentStrategy.OtherTypeProvider otherTypeProvider19 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context20 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider19);
        paymentStrategy.PaymentInfo paymentInfo26 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo26.setBillingName("FALSE");
        paymentInfo26.setCardNum(1);
        boolean boolean32 = context20.execute(paymentInfo26, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo38 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int39 = paymentInfo38.getSecurityCode();
        java.lang.String str40 = paymentInfo38.getBillingAddress();
        java.util.Date date42 = null;
        paymentInfo38.parkingInfo(0, date42, "hi!", "hi!", (int) (short) 1);
        int int47 = paymentInfo38.getExpDate();
        boolean boolean49 = context20.execute(paymentInfo38, (double) 5);
        paymentInfo38.setSecurityCode((int) '\"');
        boolean boolean53 = creditPaymentProvide2.handlePayment(paymentInfo38, (double) ' ');
        paymentStrategy.PaymentInfo paymentInfo59 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo59.setBillingName("FALSE");
        paymentInfo59.setCardNum(1);
        boolean boolean65 = creditPaymentProvide2.handlePayment(paymentInfo59, (double) (short) 1);
        paymentStrategy.PaymentInfo paymentInfo71 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int72 = paymentInfo71.getSecurityCode();
        boolean boolean74 = creditPaymentProvide2.handlePayment(paymentInfo71, 100.0d);
        boolean boolean76 = context1.execute(paymentInfo71, 100.0d);
        java.lang.String str77 = paymentInfo71.getBillingName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        maintainUser0.path = "User [name= hi!, id=97, email=hi!, password=]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name= FALSE, id=1, email=hi!, password=hi!]");
        boolean boolean2 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter4 = new com.csvreader.CsvWriter("User [name=null null, id=0, email=null, password=null]");
        char char5 = csvWriter4.getTextQualifier();
        csvWriter4.endRecord();
        csvWriter4.setTextQualifier(' ');
        com.csvreader.CsvReader csvReader10 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader10.setComment('#');
        java.lang.String str14 = csvReader10.get(100);
        csvReader10.setSkipEmptyRecords(false);
        csvReader10.setUseComments(false);
        boolean boolean19 = csvReader10.readHeaders();
        csvReader10.setSafetySwitch(false);
        java.lang.String[] strArray22 = csvReader10.getValues();
        java.lang.String[] strArray23 = csvReader10.getValues();
        csvWriter4.writeRecord(strArray23, false);
        csvWriter1.writeRecord(strArray23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
        org.junit.Assert.assertNotNull(csvReader10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        boolean boolean3 = csvWriter1.getForceQualifier();
        csvWriter1.setEscapeMode((int) '\000');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        parking.ParkingSpace parkingSpace6 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation7 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace6);
        parkingSpace6.setEnabled(true);
        int int10 = parkingSpace6.getId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(8);
        boolean boolean12 = csvReader1.skipLine();
        boolean boolean13 = csvReader1.getCaptureRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        superManager0.lastName = "User [name= hi!, id=97, email=hi!, password=]";
        users.Visitor visitor12 = new users.Visitor("", "");
        boolean boolean13 = superManager0.validateUser((users.UserInfo) visitor12);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        double double50 = paymentInfo39.getCardBallance();
        paymentInfo39.setCardBallance((double) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.FacultyMember facultyMember4 = new users.FacultyMember("", "hi!");
        boolean boolean5 = facultyMember4.getIsValid();
        boolean boolean6 = facultyMember4.getIsValid();
        boolean boolean7 = superManager0.validateUser((users.UserInfo) facultyMember4);
        reservations.ReservationSystemFacade reservationSystemFacade8 = reservations.ReservationSystemFacade.getInstance();
        reservations.ReservationSystemFacade reservationSystemFacade9 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap10 = reservationSystemFacade9.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade11 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot19 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace21 = parkingLot19.getParkingSpace((int) ' ');
        reservations.Reservation reservation22 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace21);
        users.FacultyMember facultyMember25 = new users.FacultyMember("", "hi!");
        int int26 = facultyMember25.parkingspacenum;
        int int27 = reservationSystemFacade11.calculateOutstanding(reservation22, (users.UserInfo) facultyMember25);
        users.Student student30 = new users.Student("", "hi!");
        int int31 = student30.getParkingRate();
        reservationSystemFacade9.cancelBooking(reservation22, (users.UserInfo) student30);
        users.FacultyMember facultyMember35 = new users.FacultyMember("", "hi!");
        int int36 = facultyMember35.parkingspacenum;
        facultyMember35.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade39 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot47 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace49 = parkingLot47.getParkingSpace((int) ' ');
        reservations.Reservation reservation50 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace49);
        reservationSystemFacade39.editBooking(reservation50, (int) (byte) 100);
        facultyMember35.currentReservation = reservation50;
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider54 = new paymentStrategy.MobilePaymentProvider();
        reservationSystemFacade8.payBalance(reservation22, (users.UserInfo) facultyMember35, (paymentStrategy.PaymentProvider) mobilePaymentProvider54);
        paymentStrategy.PaymentInfo paymentInfo56 = facultyMember35.getPaymentInfo();
        boolean boolean57 = superManager0.validateUser((users.UserInfo) facultyMember35);
        superManager0.firstName = "";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(reservationSystemFacade9);
        org.junit.Assert.assertNotNull(intMap10);
        org.junit.Assert.assertNotNull(reservationSystemFacade11);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade39);
        org.junit.Assert.assertNotNull(parkingSpace49);
        org.junit.Assert.assertNull(paymentInfo56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("manager_112351534964500", ',');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File manager_112351534964500 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) ' ');
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot((int) '#', "");
        parking.ParkingLot parkingLot9 = parkingSystem0.addLot(0, "User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]");
        parkingLot9.setEnabled(true);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertNotNull(parkingLot9);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        boolean boolean3 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvReader csvReader5 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean6 = csvReader5.readRecord();
        csvReader5.setSafetySwitch(true);
        boolean boolean9 = csvReader5.skipLine();
        java.lang.String[] strArray15 = new java.lang.String[] { "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "password_112284545599300", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "FALSE" };
        csvReader5.setHeaders(strArray15);
        java.lang.String[] strArray17 = csvReader5.getValues();
        csvWriter1.writeRecord(strArray17);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(csvReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        paymentInfo7.setCardNum(1);
        paymentInfo7.setExpDate(768);
        boolean boolean15 = debitPaymentProvider0.handlePayment(paymentInfo7, (double) (byte) 1);
        paymentStrategy.PaymentInfo paymentInfo21 = new paymentStrategy.PaymentInfo((int) (short) 0, 100, "", "password_112306347644100", 35);
        paymentInfo21.setBillingAddress("password_112338187831000");
        boolean boolean25 = debitPaymentProvider0.handlePayment(paymentInfo21, (-1.0d));
        paymentStrategy.PaymentInfo paymentInfo31 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        paymentInfo31.setBillingAddress("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        boolean boolean35 = debitPaymentProvider0.handlePayment(paymentInfo31, (double) 100);
        manager.SuperManager superManager36 = manager.SuperManager.getInstance();
        java.lang.String str37 = superManager36.firstName;
        users.Student student40 = new users.Student("", "hi!");
        boolean boolean41 = superManager36.validateUser((users.UserInfo) student40);
        paymentStrategy.PaymentInfo paymentInfo42 = student40.getPaymentInfo();
        reservations.Reservation reservation43 = student40.currentReservation;
        paymentStrategy.PaymentInfo paymentInfo49 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int50 = paymentInfo49.getSecurityCode();
        java.lang.String str51 = paymentInfo49.getBillingAddress();
        java.util.Date date53 = null;
        paymentInfo49.parkingInfo(0, date53, "hi!", "hi!", (int) (short) 1);
        student40.setPaymentInfo(paymentInfo49);
        paymentInfo49.setExpDate((int) '\000');
        boolean boolean62 = debitPaymentProvider0.handlePayment(paymentInfo49, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(superManager36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(paymentInfo42);
        org.junit.Assert.assertNull(reservation43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        java.lang.String str15 = user6.type;
        int int16 = user6.id;
        java.lang.String str17 = user6.password;
        user6.setId((int) (byte) 0);
        user6.lname = "password_112284545599300";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        char char10 = csvReader1.getComment();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        boolean boolean5 = csvReader1.getSafetySwitch();
        int int6 = csvReader1.getHeaderCount();
        long long7 = csvReader1.getCurrentRecord();
        int int8 = csvReader1.getHeaderCount();
        com.csvreader.CsvWriter csvWriter10 = new com.csvreader.CsvWriter("");
        csvWriter10.setRecordDelimiter('\"');
        csvWriter10.setTextQualifier('\"');
        csvWriter10.setRecordDelimiter('#');
        csvWriter10.setForceQualifier(true);
        csvWriter10.close();
        char char20 = csvWriter10.getTextQualifier();
        char char21 = csvWriter10.getDelimiter();
        com.csvreader.CsvWriter csvWriter23 = new com.csvreader.CsvWriter("");
        csvWriter23.setRecordDelimiter('\"');
        csvWriter23.setTextQualifier('\"');
        csvWriter23.setRecordDelimiter('#');
        csvWriter23.setForceQualifier(true);
        csvWriter23.close();
        char char33 = csvWriter23.getTextQualifier();
        char char34 = csvWriter23.getTextQualifier();
        csvWriter23.setUseTextQualifier(false);
        com.csvreader.CsvReader csvReader38 = com.csvreader.CsvReader.parse("hi!");
        char char39 = csvReader38.getComment();
        char char40 = csvReader38.getTextQualifier();
        boolean boolean41 = csvReader38.getUseTextQualifier();
        java.lang.String str43 = csvReader38.get((int) '#');
        csvReader38.setTrimWhitespace(false);
        com.csvreader.CsvWriter csvWriter47 = new com.csvreader.CsvWriter("");
        boolean boolean48 = csvWriter47.getUseTextQualifier();
        com.csvreader.CsvReader csvReader50 = com.csvreader.CsvReader.parse("hi!");
        char char51 = csvReader50.getComment();
        char char52 = csvReader50.getTextQualifier();
        java.lang.String[] strArray53 = csvReader50.getHeaders();
        java.lang.String[] strArray54 = csvReader50.getValues();
        csvWriter47.writeRecord(strArray54);
        csvReader38.setHeaders(strArray54);
        csvWriter23.writeRecord(strArray54, false);
        csvWriter10.writeRecord(strArray54, true);
        com.csvreader.CsvWriter csvWriter62 = new com.csvreader.CsvWriter("");
        csvWriter62.setRecordDelimiter('\"');
        csvWriter62.setTextQualifier('\"');
        char char67 = csvWriter62.getComment();
        boolean boolean68 = csvWriter62.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter70 = new com.csvreader.CsvWriter("");
        csvWriter70.setRecordDelimiter('\"');
        boolean boolean73 = csvWriter70.getUseTextQualifier();
        com.csvreader.CsvReader csvReader75 = com.csvreader.CsvReader.parse("hi!");
        char char76 = csvReader75.getComment();
        char char77 = csvReader75.getTextQualifier();
        java.lang.String[] strArray78 = csvReader75.getHeaders();
        java.lang.String[] strArray79 = csvReader75.getValues();
        csvWriter70.writeRecord(strArray79);
        csvWriter62.writeRecord(strArray79);
        csvWriter10.writeRecord(strArray79, false);
        csvReader1.setHeaders(strArray79);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + ',' + "'", char21 == ',');
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\"' + "'", char33 == '\"');
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\"' + "'", char34 == '\"');
        org.junit.Assert.assertNotNull(csvReader38);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '#' + "'", char39 == '#');
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\"' + "'", char40 == '\"');
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(csvReader50);
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + '#' + "'", char51 == '#');
        org.junit.Assert.assertTrue("'" + char52 + "' != '" + '\"' + "'", char52 == '\"');
        org.junit.Assert.assertNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + char67 + "' != '" + '#' + "'", char67 == '#');
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(csvReader75);
        org.junit.Assert.assertTrue("'" + char76 + "' != '" + '#' + "'", char76 == '#');
        org.junit.Assert.assertTrue("'" + char77 + "' != '" + '\"' + "'", char77 == '\"');
        org.junit.Assert.assertNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        int int8 = parkingSpace7.getId();
        java.util.ArrayList<reservations.Reservation> reservationList9 = parkingSpace7.getReservations();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        users.FacultyMember facultyMember2 = new users.FacultyMember("password_112306347644100", "User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        parkingState.Occupied occupied1 = new parkingState.Occupied("password_112368470689200");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        paymentStrategy.PaymentInfo paymentInfo41 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        paymentInfo41.setCardNum((int) (byte) 0);
        boolean boolean45 = creditPaymentProvide20.handlePayment(paymentInfo41, (double) (-1L));
        int int46 = paymentInfo41.getSecurityCode();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        paymentInfo6.setCardNum(1);
        paymentInfo6.setExpDate(768);
        paymentInfo6.setBillingName("FALSE");
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (short) 10);
        int int17 = paymentInfo6.getCardNum();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        csvWriter1.setRecordDelimiter('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        com.csvreader.CsvReader csvReader5 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean6 = csvReader5.readRecord();
        csvReader5.setSafetySwitch(true);
        csvReader5.setTrimWhitespace(false);
        boolean boolean11 = csvReader5.skipRecord();
        boolean boolean12 = csvReader5.getTrimWhitespace();
        java.lang.String str13 = csvReader5.getRawRecord();
        boolean boolean14 = csvReader5.getCaptureRawRecord();
        boolean boolean15 = csvReader5.getUseTextQualifier();
        csvReader5.setTextQualifier('4');
        com.csvreader.CsvWriter csvWriter19 = new com.csvreader.CsvWriter("");
        csvWriter19.setRecordDelimiter('\"');
        csvWriter19.setTextQualifier('\"');
        char char24 = csvWriter19.getComment();
        boolean boolean25 = csvWriter19.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter27 = new com.csvreader.CsvWriter("");
        csvWriter27.setRecordDelimiter('\"');
        boolean boolean30 = csvWriter27.getUseTextQualifier();
        com.csvreader.CsvReader csvReader32 = com.csvreader.CsvReader.parse("hi!");
        char char33 = csvReader32.getComment();
        char char34 = csvReader32.getTextQualifier();
        java.lang.String[] strArray35 = csvReader32.getHeaders();
        java.lang.String[] strArray36 = csvReader32.getValues();
        csvWriter27.writeRecord(strArray36);
        csvWriter19.writeRecord(strArray36);
        csvReader5.setHeaders(strArray36);
        csvWriter1.writeRecord(strArray36, false);
        boolean boolean42 = csvWriter1.getForceQualifier();
        org.junit.Assert.assertNotNull(csvReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '#' + "'", char24 == '#');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(csvReader32);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '#' + "'", char33 == '#');
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\"' + "'", char34 == '\"');
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        user6.setId((int) (byte) 100);
        java.lang.String str13 = user6.email;
        boolean boolean14 = user6.isValidated;
        java.lang.String str15 = user6.lname;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = superManager0.firstName;
        superManager0.firstName = "User [name= hi!, id=97, email=hi!, password=]";
        manager.Manager manager7 = superManager0.autoGenerator();
        manager7.setUsername("password_112347399105200");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(manager7);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        int int43 = reservation36.getDay();
        int int44 = reservation36.getMonth();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        int int4 = csvReader1.getEscapeMode();
        int int6 = csvReader1.getIndex("manager_112305914121600");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        user6.setPassword("hi!");
        java.lang.String str15 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FALSE" + "'", str15, "FALSE");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getValidation();
        boolean boolean13 = user6.isValidated;
        user6.fname = "User [name= FALSE, id=1, email=hi!, password=hi!]";
        int int16 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.password = "Password!23";
        java.lang.String str12 = user6.getLName();
        java.lang.String str13 = user6.getLName();
        java.lang.String str14 = user6.type;
        java.lang.String str15 = user6.lname;
        user6.setEmail("password_112284545599300");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        char char5 = csvWriter1.getDelimiter();
        csvWriter1.setDelimiter(',');
        csvWriter1.setForceQualifier(true);
        boolean boolean10 = csvWriter1.getForceQualifier();
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        int int11 = csvWriter1.getEscapeMode();
        csvWriter1.setEscapeMode(97);
        boolean boolean14 = csvWriter1.getForceQualifier();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        users.Student student2 = new users.Student("password_112336809022100", "manager_112347878775000");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        long long4 = csvReader1.getCurrentRecord();
        boolean boolean6 = csvReader1.isQualified((-30));
        boolean boolean7 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingLot7.getEnabled();
        parking.ParkingSpace parkingSpace12 = parkingLot7.getParkingSpace(1);
        reservations.Reservation reservation13 = new reservations.Reservation((int) '4', 15, (int) '\"', (int) (byte) 100, "admin", parkingSpace12);
        parkingState.State state14 = parkingSpace12.getSensorStatus();
        java.lang.String str15 = state14.handleState();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(state14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name= hi!, id=97, email=hi!, password=hi!]", "password_112337353214100");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot(34, "password_112310734370300");
        parking.ParkingLot parkingLot8 = parkingSystem0.getLot((-1));
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertNotNull(parkingLot6);
// flaky:         org.junit.Assert.assertNotNull(parkingLot8);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        boolean boolean2 = csvReader1.skipLine();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(true);
        csvReader1.setComment('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentInfo6.setCardBallance(10.0d);
        double double13 = paymentInfo6.getCardBallance();
        double double14 = paymentInfo6.getCardBallance();
        int int15 = paymentInfo6.getCardNum();
        paymentInfo6.setBillingAddress("password_112310734370300");
        java.lang.Class<?> wildcardClass18 = paymentInfo6.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        user6.email = "password_112284545599300";
        user6.email = "manager_112305914121600";
        user6.email = "FALSE";
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (byte) 100, 768, "password_112347878777100", "manager_112365856111300", (int) (short) -1);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("", "hi!");
        int int3 = nonFacultyStaff2.getParkingRate();
        nonFacultyStaff2.parkinglot = "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.DebitPaymentProvider debitPaymentProvider1 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int8 = paymentInfo7.getSecurityCode();
        java.lang.String str9 = paymentInfo7.getBillingAddress();
        java.lang.String str10 = paymentInfo7.getBillingAddress();
        boolean boolean12 = debitPaymentProvider1.handlePayment(paymentInfo7, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo18 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int19 = paymentInfo18.getSecurityCode();
        java.lang.String str20 = paymentInfo18.getBillingAddress();
        java.util.Date date22 = null;
        paymentInfo18.parkingInfo(0, date22, "hi!", "hi!", (int) (short) 1);
        boolean boolean28 = debitPaymentProvider1.handlePayment(paymentInfo18, (double) (short) -1);
        manager.SuperManager superManager29 = manager.SuperManager.getInstance();
        java.lang.String str30 = superManager29.firstName;
        users.Student student33 = new users.Student("", "hi!");
        boolean boolean34 = superManager29.validateUser((users.UserInfo) student33);
        paymentStrategy.PaymentInfo paymentInfo35 = student33.getPaymentInfo();
        reservations.Reservation reservation36 = student33.currentReservation;
        paymentStrategy.PaymentInfo paymentInfo42 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int43 = paymentInfo42.getSecurityCode();
        java.lang.String str44 = paymentInfo42.getBillingAddress();
        java.util.Date date46 = null;
        paymentInfo42.parkingInfo(0, date46, "hi!", "hi!", (int) (short) 1);
        student33.setPaymentInfo(paymentInfo42);
        boolean boolean53 = debitPaymentProvider1.handlePayment(paymentInfo42, 1.0d);
        paymentInfo42.setBillingName("");
        int int56 = paymentInfo42.getSecurityCode();
        paymentInfo42.setBillingAddress("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        boolean boolean60 = otherTypeProvider0.handlePayment(paymentInfo42, (double) 1);
        int int61 = paymentInfo42.getExpDate();
        paymentInfo42.setBillingAddress("password_112354709083600");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(superManager29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str30, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(paymentInfo35);
        org.junit.Assert.assertNull(reservation36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 97 + "'", int56 == 97);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        java.lang.String str47 = paymentInfo40.getBillingName();
        paymentInfo40.setCardNum(15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str43, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        manager.Manager manager2 = new manager.Manager("hi!", "");
        manager2.firstName = "Password!23";
        manager2.setPassword("password_112296757334200");
        manager2.setPassword("manager_112305914121600");
        reservations.ReservationSystemFacade reservationSystemFacade9 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot17 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace19 = parkingLot17.getParkingSpace((int) ' ');
        reservations.Reservation reservation20 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace19);
        reservationSystemFacade9.editBooking(reservation20, (int) (byte) 100);
        parking.ParkingLot parkingLot30 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace32 = parkingLot30.getParkingSpace((int) ' ');
        boolean boolean33 = parkingSpace32.isEnabled();
        reservations.Reservation reservation34 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace32);
        manager.SuperManager superManager35 = manager.SuperManager.getInstance();
        superManager35.firstName = "";
        manager.Manager manager38 = superManager35.autoGenerator();
        users.FacultyMember facultyMember41 = new users.FacultyMember("", "hi!");
        int int42 = facultyMember41.parkingspacenum;
        facultyMember41.parkinglot = "hi!";
        facultyMember41.setValid();
        boolean boolean46 = manager38.validateUser((users.UserInfo) facultyMember41);
        reservations.Reservation reservation47 = facultyMember41.currentReservation;
        int int48 = reservationSystemFacade9.calculateOutstanding(reservation34, (users.UserInfo) facultyMember41);
        reservations.ReservationSystemFacade reservationSystemFacade49 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot57 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace59 = parkingLot57.getParkingSpace((int) ' ');
        reservations.Reservation reservation60 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace59);
        reservationSystemFacade49.editBooking(reservation60, (int) (byte) 100);
        manager.SuperManager superManager63 = manager.SuperManager.getInstance();
        java.lang.String str64 = superManager63.firstName;
        java.lang.String str65 = superManager63.getUsername();
        superManager63.lastName = "hi!";
        superManager63.lastName = "FALSE";
        users.FacultyMember facultyMember72 = new users.FacultyMember("", "hi!");
        int int73 = facultyMember72.parkingspacenum;
        facultyMember72.parkinglot = "hi!";
        facultyMember72.setValid();
        boolean boolean77 = superManager63.validateUser((users.UserInfo) facultyMember72);
        boolean boolean78 = facultyMember72.getIsValid();
        reservationSystemFacade9.cancelBooking(reservation60, (users.UserInfo) facultyMember72);
        boolean boolean80 = manager2.validateUser((users.UserInfo) facultyMember72);
        manager2.lastName = "User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]";
        org.junit.Assert.assertNotNull(reservationSystemFacade9);
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(superManager35);
        org.junit.Assert.assertNotNull(manager38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(reservation47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 768 + "'", int48 == 768);
        org.junit.Assert.assertNotNull(reservationSystemFacade49);
        org.junit.Assert.assertNotNull(parkingSpace59);
        org.junit.Assert.assertNotNull(superManager63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str65, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "User [name=null null, id=0, email=null, password=null]";
        maintainUser0.path = "password_112351534974900";
        java.lang.String str9 = maintainUser0.path;
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "password_112351534974900" + "'", str9, "password_112351534974900");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        reservations.Reservation reservation7 = student4.currentReservation;
        paymentStrategy.PaymentInfo paymentInfo13 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int14 = paymentInfo13.getSecurityCode();
        java.lang.String str15 = paymentInfo13.getBillingAddress();
        java.util.Date date17 = null;
        paymentInfo13.parkingInfo(0, date17, "hi!", "hi!", (int) (short) 1);
        student4.setPaymentInfo(paymentInfo13);
        paymentInfo13.setExpDate((int) '\000');
        paymentInfo13.setCardBallance((double) 10.0f);
        double double27 = paymentInfo13.getCardBallance();
        paymentInfo13.setCardNum((int) 'a');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.Disabled disabled12 = new parkingState.Disabled();
        parkingSpace9.setState((parkingState.State) disabled12);
        parking.ParkingLot parkingLot16 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace18 = parkingLot16.getParkingSpace((int) ' ');
        boolean boolean19 = parkingLot16.getEnabled();
        parking.ParkingSpace parkingSpace21 = parkingLot16.getParkingSpace(10);
        reservations.ReservationSystemFacade reservationSystemFacade22 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot30 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace32 = parkingLot30.getParkingSpace((int) ' ');
        reservations.Reservation reservation33 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace32);
        users.FacultyMember facultyMember36 = new users.FacultyMember("", "hi!");
        int int37 = facultyMember36.parkingspacenum;
        int int38 = reservationSystemFacade22.calculateOutstanding(reservation33, (users.UserInfo) facultyMember36);
        parkingSpace21.setReservation(reservation33);
        parkingSpace9.setReservation(reservation33);
        int int41 = parkingSpace9.getId();
        java.util.ArrayList<reservations.Reservation> reservationList42 = parkingSpace9.getReservations();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(reservationSystemFacade22);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertNotNull(reservationList42);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        parkingState.Occupied occupied1 = new parkingState.Occupied("password_112343396437900");
        java.lang.String str2 = occupied1.handleState();
        java.lang.String str3 = occupied1.handleState();
        java.lang.String str4 = occupied1.handleState();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "password_112343396437900" + "'", str2, "password_112343396437900");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112343396437900" + "'", str3, "password_112343396437900");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112343396437900" + "'", str4, "password_112343396437900");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) 'a', (int) (short) -1, "manager_112354709081500", "manager_112369653203000", 97);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        java.lang.String str7 = facultyMember2.getPassword();
        facultyMember2.setValid();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.toString();
        java.lang.String str11 = user6.toString();
        user6.fname = "manager_112327586653400";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str11, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        manager.Manager manager2 = new manager.Manager("FALSE", "password_112347399105200");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.util.Date date9 = null;
        paymentInfo5.parkingInfo(0, date9, "hi!", "hi!", (int) (short) 1);
        int int14 = paymentInfo5.getExpDate();
        int int15 = paymentInfo5.getExpDate();
        paymentInfo5.setSecurityCode((int) '4');
        paymentInfo5.setCardBallance((double) (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        parkingSystem0.setEnableLot(0, false);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        csvWriter1.setRecordDelimiter('a');
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        parkingState.Occupied occupied1 = new parkingState.Occupied("User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        char char6 = csvReader1.getRecordDelimiter();
        boolean boolean7 = csvReader1.getSafetySwitch();
        csvReader1.setUseTextQualifier(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        csvReader1.setTrimWhitespace(false);
        long long7 = csvReader1.getCurrentRecord();
        char char8 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '#' + "'", char8 == '#');
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setComment('\000');
        boolean boolean7 = csvReader1.getSkipEmptyRecords();
        char char8 = csvReader1.getComment();
        int int9 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration(2);
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        java.lang.String str15 = reservation10.getPlate();
        java.lang.String str16 = reservation10.getPlate();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setForceQualifier(false);
        int int8 = csvWriter1.getEscapeMode();
        char char9 = csvWriter1.getRecordDelimiter();
        char char10 = csvWriter1.getRecordDelimiter();
        boolean boolean11 = csvWriter1.getForceQualifier();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        java.lang.String str5 = csvReader1.get(100);
        csvReader1.setSkipEmptyRecords(false);
        csvReader1.setUseComments(false);
        boolean boolean10 = csvReader1.readHeaders();
        csvReader1.setUseComments(true);
        boolean boolean13 = csvReader1.getSkipEmptyRecords();
        java.lang.String[] strArray14 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        paymentStrategy.PaymentInfo paymentInfo35 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int36 = paymentInfo35.getSecurityCode();
        paymentInfo35.setCardBallance((double) (short) 100);
        boolean boolean40 = mobilePaymentProvider0.handlePayment(paymentInfo35, (double) 10L);
        paymentStrategy.PaymentInfo paymentInfo46 = new paymentStrategy.PaymentInfo(35, (int) (byte) 0, "manager_112305914121600", "password_112336809022100", (int) ',');
        boolean boolean48 = mobilePaymentProvider0.handlePayment(paymentInfo46, (double) (byte) 100);
        manager.SuperManager superManager49 = manager.SuperManager.getInstance();
        java.lang.String str50 = superManager49.firstName;
        users.Student student53 = new users.Student("", "hi!");
        boolean boolean54 = superManager49.validateUser((users.UserInfo) student53);
        paymentStrategy.PaymentInfo paymentInfo55 = student53.getPaymentInfo();
        student53.setValid();
        java.lang.String str57 = student53.parkinglot;
        int int58 = student53.getParkingRate();
        paymentStrategy.PaymentInfo paymentInfo64 = new paymentStrategy.PaymentInfo(97, 5, "admin", "User [name= hi!, id=97, email=hi!, password=]", 10);
        student53.setPaymentInfo(paymentInfo64);
        boolean boolean67 = mobilePaymentProvider0.handlePayment(paymentInfo64, (double) 5);
        paymentInfo64.setCardNum((-30));
        java.lang.String str70 = paymentInfo64.getBillingAddress();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(superManager49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(paymentInfo55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "admin" + "'", str70, "admin");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.email;
        java.lang.String str12 = user6.email;
        user6.email = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]";
        java.lang.String str15 = user6.fname;
        user6.setId(5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parkingState.State state15 = parkingSpace14.getSensorStatus();
        parkingState.State state16 = parkingSpace14.getSensorStatus();
        java.lang.String str17 = state16.handleState();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.email;
        user6.lname = "password_112325847983500";
        java.lang.String str11 = user6.type;
        user6.type = "manager_112351534964500";
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot(5);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap8 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot11 = parkingSystem0.addLot((-1), "User [name= hi!, id=97, email=hi!, password=admin]");
        parking.ParkingLot parkingLot14 = parkingSystem0.addLot((int) 'a', "User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
// flaky:         org.junit.Assert.assertNotNull(parkingLot7);
        org.junit.Assert.assertNotNull(intMap8);
        org.junit.Assert.assertNotNull(parkingLot11);
        org.junit.Assert.assertNotNull(parkingLot14);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        boolean boolean9 = csvReader1.readHeaders();
        int int11 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setComment('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        superManager0.lastName = "hi!";
        superManager0.lastName = "FALSE";
        users.FacultyMember facultyMember9 = new users.FacultyMember("", "hi!");
        int int10 = facultyMember9.parkingspacenum;
        facultyMember9.parkinglot = "hi!";
        facultyMember9.setValid();
        boolean boolean14 = superManager0.validateUser((users.UserInfo) facultyMember9);
        manager.Manager manager15 = superManager0.autoGenerator();
        users.FacultyMember facultyMember18 = new users.FacultyMember("", "hi!");
        int int19 = facultyMember18.parkingspacenum;
        facultyMember18.parkinglot = "hi!";
        facultyMember18.setValid();
        boolean boolean23 = superManager0.validateUser((users.UserInfo) facultyMember18);
        manager.Manager manager24 = superManager0.autoGenerator();
        java.lang.String str25 = superManager0.getPassword();
        superManager0.firstName = "";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(manager15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(manager24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str25, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        paymentInfo8.setBillingName("password_112354709083600");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        reservations.ReservationSystemFacade reservationSystemFacade35 = reservations.ReservationSystemFacade.getInstance();
        reservations.ReservationSystemFacade reservationSystemFacade36 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap37 = reservationSystemFacade36.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade38 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot46 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace48 = parkingLot46.getParkingSpace((int) ' ');
        reservations.Reservation reservation49 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace48);
        users.FacultyMember facultyMember52 = new users.FacultyMember("", "hi!");
        int int53 = facultyMember52.parkingspacenum;
        int int54 = reservationSystemFacade38.calculateOutstanding(reservation49, (users.UserInfo) facultyMember52);
        users.Student student57 = new users.Student("", "hi!");
        int int58 = student57.getParkingRate();
        reservationSystemFacade36.cancelBooking(reservation49, (users.UserInfo) student57);
        users.FacultyMember facultyMember62 = new users.FacultyMember("", "hi!");
        int int63 = facultyMember62.parkingspacenum;
        facultyMember62.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade66 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot74 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace76 = parkingLot74.getParkingSpace((int) ' ');
        reservations.Reservation reservation77 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace76);
        reservationSystemFacade66.editBooking(reservation77, (int) (byte) 100);
        facultyMember62.currentReservation = reservation77;
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider81 = new paymentStrategy.MobilePaymentProvider();
        reservationSystemFacade35.payBalance(reservation49, (users.UserInfo) facultyMember62, (paymentStrategy.PaymentProvider) mobilePaymentProvider81);
        int int83 = reservation49.getMonth();
        int int84 = reservation49.getMonth();
        users.NonFacultyStaff nonFacultyStaff87 = new users.NonFacultyStaff("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "manager_112305914121600");
        int int88 = reservationSystemFacade0.calculateOutstanding(reservation49, (users.UserInfo) nonFacultyStaff87);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(reservationSystemFacade35);
        org.junit.Assert.assertNotNull(reservationSystemFacade36);
        org.junit.Assert.assertNotNull(intMap37);
        org.junit.Assert.assertNotNull(reservationSystemFacade38);
        org.junit.Assert.assertNotNull(parkingSpace48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade66);
        org.junit.Assert.assertNotNull(parkingSpace76);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        java.util.ArrayList<reservations.Reservation> reservationList4 = parkingSpace3.getReservations();
        int int5 = parkingSpace3.getId();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        int int11 = user6.id;
        int int12 = user6.getId();
        user6.email = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]";
        java.lang.String str15 = user6.password;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str15, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "manager_112327586653400";
        java.lang.String str13 = user6.lname;
        int int14 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setSkipEmptyRecords(true);
        long long8 = csvReader1.getCurrentRecord();
        boolean boolean9 = csvReader1.getSafetySwitch();
        java.lang.String str11 = csvReader1.getHeader((int) (byte) 10);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getComment();
        boolean boolean4 = csvReader1.getUseComments();
        java.lang.String str6 = csvReader1.get("password_112306347644100");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        maintainUser0.update("User [name= hi!, id=97, email=hi!, password=]");
        maintainUser0.update("manager_112305914121600");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        reservations.ReservationSystemFacade reservationSystemFacade8 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot16 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace18 = parkingLot16.getParkingSpace((int) ' ');
        reservations.Reservation reservation19 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace18);
        users.FacultyMember facultyMember22 = new users.FacultyMember("", "hi!");
        int int23 = facultyMember22.parkingspacenum;
        int int24 = reservationSystemFacade8.calculateOutstanding(reservation19, (users.UserInfo) facultyMember22);
        parkingSpace7.setReservation(reservation19);
        int int26 = reservation19.getStartTime();
        int int27 = reservation19.getDuration();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        paymentStrategy.PaymentInfo paymentInfo40 = new paymentStrategy.PaymentInfo(10, 8, "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", (int) '\000');
        boolean boolean42 = mobilePaymentProvider0.handlePayment(paymentInfo40, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        parking.ParkingSpace parkingSpace12 = reservation10.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList13 = parkingSpace12.getReservations();
        parkingSpace12.setId(0);
        int int16 = parkingSpace12.getId();
        parking.ParkingLot parkingLot24 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace26 = parkingLot24.getParkingSpace((int) ' ');
        reservations.Reservation reservation27 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace26);
        int int28 = reservation27.getDay();
        int int29 = reservation27.getDuration();
        parkingSpace12.setReservation(reservation27);
        parking.ParkingSpace parkingSpace31 = reservation27.getSpace();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(parkingSpace31);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        paymentStrategy.OtherTypeProvider otherTypeProvider53 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo59 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo59.setBillingName("FALSE");
        boolean boolean63 = otherTypeProvider53.handlePayment(paymentInfo59, (double) (short) 1);
        paymentInfo59.setBillingAddress("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        int int66 = paymentInfo59.getExpDate();
        boolean boolean68 = debitPaymentProvider0.handlePayment(paymentInfo59, (double) ' ');
        users.Visitor visitor71 = new users.Visitor("", "");
        paymentStrategy.PaymentInfo paymentInfo77 = new paymentStrategy.PaymentInfo((int) '#', (int) (short) -1, "password_112284545599300", "password_112284545599300", (int) (short) 1);
        visitor71.setPaymentInfo(paymentInfo77);
        boolean boolean80 = debitPaymentProvider0.handlePayment(paymentInfo77, (double) '#');
        paymentStrategy.PaymentInfo paymentInfo81 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = debitPaymentProvider0.handlePayment(paymentInfo81, (double) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("password_112344052445500");
        long long2 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getComment();
        char char11 = csvWriter1.getDelimiter();
        boolean boolean12 = csvWriter1.getUseTextQualifier();
        csvWriter1.setDelimiter('\000');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String str7 = csvReader1.getRawRecord();
        boolean boolean8 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.update("manager_112305914121600");
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", (int) (short) 1, "FALSE", "User [name= hi!, id=97, email=hi!, password=admin]", "FALSE");
        java.lang.String str7 = user6.password;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        users.Student student2 = new users.Student("hi!", "password_112347399105200");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        userLogin.User user0 = new userLogin.User();
        user0.isValidated = true;
        user0.setId((int) (byte) 0);
        java.lang.String str5 = user0.type;
        user0.setName("manager_112354709081500", "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        csvWriter1.setEscapeMode((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setSafetySwitch(false);
        boolean boolean9 = csvReader1.getSafetySwitch();
        csvReader1.setUseComments(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        int int3 = parkingLot2.getId();
        parking.ParkingSpace parkingSpace5 = parkingLot2.getParkingSpace(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(parkingSpace5);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getTextQualifier();
        int int11 = csvWriter1.getEscapeMode();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.getLName();
        user6.type = "password_112310734370300";
        java.lang.String str16 = user6.toString();
        java.lang.String str17 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str16, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str17, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setSafetySwitch(false);
        int int7 = csvReader1.getHeaderCount();
        char char8 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        users.Visitor visitor2 = new users.Visitor("password_112325847983500", "password_112296757334200");
        int int3 = visitor2.getParkingRate();
        int int4 = visitor2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.setEmail("hi!");
        int int14 = user6.id;
        user6.type = "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        paymentInfo24.setBillingName("password_112344052445500");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FALSE" + "'", str29, "FALSE");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FALSE" + "'", str30, "FALSE");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setSafetySwitch(false);
        int int7 = csvReader1.getHeaderCount();
        int int8 = csvReader1.getEscapeMode();
        boolean boolean9 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        java.lang.String str17 = maintainUser0.path;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        paymentInfo41.setBillingName("");
        int int55 = paymentInfo41.getSecurityCode();
        paymentInfo41.setBillingName("manager_112347878775000");
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parking.ParkingSpace parkingSpace15 = reservation10.getSpace();
        parkingSpace15.setId((int) (short) 0);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(parkingSpace15);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        user6.setEmail("hi!");
        java.lang.String str13 = user6.getPassword();
        user6.isValidated = false;
        user6.password = "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]";
        boolean boolean18 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.getFName();
        user6.setEmail("hi!");
        java.lang.String str15 = user6.lname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str15, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        users.FacultyMember facultyMember2 = new users.FacultyMember("password_112310734370300", "password_112325847983500");
        java.lang.String str3 = facultyMember2.getPassword();
        int int4 = facultyMember2.getParkingRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112325847983500" + "'", str3, "password_112325847983500");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        userLogin.User user6 = new userLogin.User("", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", 8, "Password!23", "", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String str7 = user6.password;
        user6.lname = "password_112337353214100";
        java.lang.String str10 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= password_112337353214100, id=8, email=Password!23, password=]" + "'", str10, "User [name= password_112337353214100, id=8, email=Password!23, password=]");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "password_112338187831000");
        nonFacultyStaff2.parkinglot = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]";
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(32);
        java.lang.String str13 = csvReader1.get("manager_112305914121600");
        java.lang.String str15 = csvReader1.get("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        user6.id = 0;
        user6.setType("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        csvReader1.setRecordDelimiter('\"');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        boolean boolean6 = parkingSystem0.isLotEnabled((int) (byte) 100);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap7 = parkingSystem0.getLots();
        parking.ParkingSpace parkingSpace10 = parkingSystem0.getParkingSpace(0, 0);
        parking.ParkingLot parkingLot12 = parkingSystem0.getLot((int) (short) -1);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap13 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intMap7);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNotNull(parkingLot12);
        org.junit.Assert.assertNotNull(intMap13);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        boolean boolean7 = csvReader1.getSafetySwitch();
        boolean boolean8 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setType("manager_112305914121600");
        user6.isValidated = true;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        manager.Manager manager2 = new manager.Manager("hi!", "hi!");
        manager2.setUsername("");
        manager2.setUsername("User [name= hi!, id=97, email=hi!, password=]");
        manager2.setPassword("password_112337353214100");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration(2);
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parking.ParkingSpace parkingSpace15 = reservation10.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList16 = parkingSpace15.getReservations();
        boolean boolean17 = parkingSpace15.isEnabled();
        parkingSpace15.setEnabled(true);
        parkingSpace15.setEnabled(false);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        java.lang.String str12 = reservation11.getPlate();
        int int13 = reservation11.getDay();
        int int14 = reservation11.getStartTime();
        parking.ParkingSpace parkingSpace15 = reservation11.getSpace();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password!23" + "'", str12, "Password!23");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(parkingSpace15);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setPassword("admin");
        java.lang.String str11 = user6.getFName();
        user6.fname = "password_112347878777100";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.lang.String str9 = paymentInfo6.getBillingAddress();
        boolean boolean11 = debitPaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.OtherTypeProvider otherTypeProvider12 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo18 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo18.setBillingName("FALSE");
        boolean boolean22 = otherTypeProvider12.handlePayment(paymentInfo18, (double) (short) 1);
        paymentInfo18.setCardBallance(10.0d);
        double double25 = paymentInfo18.getCardBallance();
        paymentInfo18.setExpDate((int) 'a');
        paymentInfo18.setBillingName("User [name= FALSE, id=97, email=hi!, password=hi!]");
        boolean boolean31 = debitPaymentProvider0.handlePayment(paymentInfo18, 0.0d);
        paymentInfo18.setBillingAddress("manager_112327586653400");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        parking.ParkingSpace parkingSpace6 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation7 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace6);
        parking.ParkingSpace parkingSpace8 = reservation7.getSpace();
        int int9 = reservation7.getDuration();
        org.junit.Assert.assertNotNull(parkingSpace8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        int int24 = reservation13.getDay();
        int int25 = reservation13.getDay();
        parking.ParkingSpace parkingSpace26 = reservation13.getSpace();
        int int27 = reservation13.getDuration();
        java.lang.String str28 = reservation13.getPlate();
        int int29 = reservation13.getMonth();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "admin" + "'", str28, "admin");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        java.lang.String str37 = paymentInfo24.getBillingName();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        paymentInfo19.setSecurityCode((int) '\"');
        int int33 = paymentInfo19.getCardNum();
        java.lang.String str34 = paymentInfo19.getBillingName();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        boolean boolean6 = parkingSystem0.isLotEnabled((int) (byte) 100);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap7 = parkingSystem0.getLots();
        parking.ParkingSpace parkingSpace10 = parkingSystem0.getParkingSpace(0, 0);
        parking.ParkingLot parkingLot12 = parkingSystem0.getLot((int) (short) -1);
        parkingSystem0.setEnableLot((int) (short) 100, false);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intMap7);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNotNull(parkingLot12);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        java.lang.String[] strArray9 = csvReader1.getHeaders();
        char char10 = csvReader1.getRecordDelimiter();
        csvReader1.setRecordDelimiter('#');
        int int13 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        users.Visitor visitor2 = new users.Visitor("password_112296757334200", "Password!23");
        int int3 = visitor2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        csvReader1.setSkipEmptyRecords(true);
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        int int6 = paymentInfo5.getSecurityCode();
        int int7 = paymentInfo5.getExpDate();
        paymentInfo5.setExpDate((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.email;
        java.lang.String str12 = user6.getValidation();
        user6.setType("password_112359916102100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        java.lang.String str3 = superManager0.firstName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("password_112347399105200");
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        manager.Manager manager3 = superManager0.autoGenerator();
        superManager0.setUsername("User [name= hi!, id=97, email=hi!, password=hi!]");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.firstName = "password_112284545599300";
        manager.Manager manager10 = superManager0.autoGenerator();
        manager10.firstName = "manager_112347878775000";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str6, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertNotNull(manager10);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("password_112351534974900", "User [name= hi!, id=97, email=hi!, password=admin]", "password_112347399105200");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112351534974900" + "'", str3, "password_112351534974900");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        int int8 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        java.lang.String[] strArray10 = csvReader1.getValues();
        csvReader1.setSafetySwitch(true);
        int int13 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setForceQualifier(false);
        int int8 = csvWriter1.getEscapeMode();
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        userLogin.User user6 = new userLogin.User("", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", 8, "Password!23", "", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        user6.setValidation("hi!");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
// flaky:         maintainUser0.load("User [name= FALSE, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        users.Visitor visitor2 = new users.Visitor("password_112343396437900", "");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getValidation();
        user6.password = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str15 = user6.email;
        boolean boolean16 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        maintainUser0.path = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setDelimiter(',');
        java.lang.String str13 = csvReader1.getRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("FALSE");
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        user6.type = "User [name= hi!, id=97, email=hi!, password=]";
        java.lang.String str17 = user6.fname;
        int int18 = user6.id;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        users.FacultyMember facultyMember31 = new users.FacultyMember("manager_112305914121600", "manager_112327586653400");
        parking.ParkingSpace parkingSpace43 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation44 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace43);
        reservations.ReservationSystemFacade reservationSystemFacade45 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot53 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace55 = parkingLot53.getParkingSpace((int) ' ');
        reservations.Reservation reservation56 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace55);
        users.FacultyMember facultyMember59 = new users.FacultyMember("", "hi!");
        int int60 = facultyMember59.parkingspacenum;
        int int61 = reservationSystemFacade45.calculateOutstanding(reservation56, (users.UserInfo) facultyMember59);
        users.FacultyMember facultyMember64 = new users.FacultyMember("", "hi!");
        int int65 = facultyMember64.parkingspacenum;
        facultyMember64.parkinglot = "hi!";
        parking.ParkingLot parkingLot80 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace82 = parkingLot80.getParkingSpace((int) ' ');
        reservations.Reservation reservation83 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace82);
        paymentStrategy.OtherTypeProvider otherTypeProvider84 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context85 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider84);
        paymentStrategy.PaymentInfo paymentInfo91 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo91.setBillingName("FALSE");
        paymentInfo91.setCardNum(1);
        boolean boolean97 = context85.execute(paymentInfo91, (double) 97);
        reservations.Reservation reservation98 = reservationSystemFacade45.createReservation((users.UserInfo) facultyMember64, (int) (short) -1, (-1), (int) ',', (int) (byte) 1, "admin", parkingSpace82, context85);
        reservations.Reservation reservation99 = reservationSystemFacade0.createReservation((users.UserInfo) facultyMember31, (int) '4', (int) ' ', (int) (short) 0, 8, "", parkingSpace43, context85);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "password_112284545599300" + "'", str20, "password_112284545599300");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intMap28);
        org.junit.Assert.assertNotNull(reservationSystemFacade45);
        org.junit.Assert.assertNotNull(parkingSpace55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(parkingSpace82);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNull(reservation98);
        org.junit.Assert.assertNull(reservation99);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration(2);
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parking.ParkingSpace parkingSpace15 = reservation10.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList16 = parkingSpace15.getReservations();
        boolean boolean17 = parkingSpace15.isEnabled();
        boolean boolean18 = parkingSpace15.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getValidation();
        java.lang.String str13 = user6.getPassword();
        java.lang.String str14 = user6.getValidation();
        java.lang.String str15 = user6.email;
        java.lang.String str16 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FALSE" + "'", str14, "FALSE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        csvReader1.setDelimiter(' ');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        java.lang.String str32 = csvReader1.get("password_112368470689200");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getComment();
        char char11 = csvWriter1.getRecordDelimiter();
        char char12 = csvWriter1.getComment();
        int int13 = csvWriter1.getEscapeMode();
        java.lang.String[] strArray14 = null;
        csvWriter1.writeRecord(strArray14, false);
        char char17 = csvWriter1.getTextQualifier();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '#' + "'", char12 == '#');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\"' + "'", char17 == '\"');
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace((int) (short) -1);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        java.lang.String str7 = maintainUser0.path;
        java.util.ArrayList<userLogin.User> userList8 = maintainUser0.users;
        maintainUser0.path = "password_112348536883400";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parkingSpace7.setId((int) (byte) 10);
        parkingState.Disabled disabled10 = new parkingState.Disabled();
        parkingSpace7.setState((parkingState.State) disabled10);
        int int12 = parkingSpace7.getId();
        boolean boolean13 = parkingSpace7.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        char char10 = csvWriter1.getDelimiter();
        com.csvreader.CsvReader csvReader12 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean13 = csvReader12.readRecord();
        csvReader12.setSafetySwitch(true);
        csvReader12.setTrimWhitespace(false);
        boolean boolean18 = csvReader12.skipRecord();
        char char19 = csvReader12.getDelimiter();
        boolean boolean20 = csvReader12.skipLine();
        boolean boolean21 = csvReader12.skipLine();
        com.csvreader.CsvWriter csvWriter23 = new com.csvreader.CsvWriter("");
        csvWriter23.setRecordDelimiter('\"');
        boolean boolean26 = csvWriter23.getUseTextQualifier();
        com.csvreader.CsvReader csvReader28 = com.csvreader.CsvReader.parse("hi!");
        char char29 = csvReader28.getComment();
        char char30 = csvReader28.getTextQualifier();
        java.lang.String[] strArray31 = csvReader28.getHeaders();
        java.lang.String[] strArray32 = csvReader28.getValues();
        csvWriter23.writeRecord(strArray32);
        csvReader12.setHeaders(strArray32);
        csvWriter1.writeRecord(strArray32);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertNotNull(csvReader12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + ',' + "'", char19 == ',');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(csvReader28);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '#' + "'", char29 == '#');
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\"' + "'", char30 == '\"');
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setTrimWhitespace(false);
        char char9 = csvReader1.getTextQualifier();
        boolean boolean10 = csvReader1.getSafetySwitch();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = csvReader1.getHeaders();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        int int5 = csvWriter1.getEscapeMode();
        csvWriter1.setUseTextQualifier(false);
        csvWriter1.setRecordDelimiter('4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        char char5 = csvReader1.getDelimiter();
        csvReader1.setDelimiter('4');
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setSkipEmptyRecords(true);
        long long8 = csvReader1.getCurrentRecord();
        csvReader1.setTrimWhitespace(false);
        boolean boolean11 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        maintainUser0.update("FALSE");
        java.lang.String str19 = maintainUser0.path;
        java.util.ArrayList<userLogin.User> userList20 = maintainUser0.users;
        java.util.ArrayList<userLogin.User> userList21 = maintainUser0.users;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        java.lang.String str11 = user6.getValidation();
        user6.isValidated = false;
        user6.fname = "User [name= hi!, id=97, email=hi!, password=]";
        java.lang.String str16 = user6.email;
        user6.isValidated = false;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        parking.ParkingSpace parkingSpace6 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation7 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace6);
        parking.ParkingSpace parkingSpace8 = reservation7.getSpace();
        parking.ParkingSpace parkingSpace9 = reservation7.getSpace();
        reservation7.updateDuration(100);
        org.junit.Assert.assertNotNull(parkingSpace8);
        org.junit.Assert.assertNotNull(parkingSpace9);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        userLogin.User user6 = new userLogin.User("", "admin", 32, "hi!", "password_112284545599300", "User [name= hi!, id=97, email=hi!, password=admin]");
        user6.lname = "hi!";
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        java.lang.String str11 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("FALSE", "manager_112305914121600");
        nonFacultyStaff2.parkinglot = "password_112312047073100";
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getValidation();
        user6.password = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        user6.setName("manager_112354709081500", "password_112357424381900");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        paymentStrategy.OtherTypeProvider otherTypeProvider53 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo59 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo59.setBillingName("FALSE");
        boolean boolean63 = otherTypeProvider53.handlePayment(paymentInfo59, (double) (short) 1);
        paymentInfo59.setBillingAddress("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        int int66 = paymentInfo59.getExpDate();
        boolean boolean68 = debitPaymentProvider0.handlePayment(paymentInfo59, (double) ' ');
        users.Visitor visitor71 = new users.Visitor("", "");
        paymentStrategy.PaymentInfo paymentInfo77 = new paymentStrategy.PaymentInfo((int) '#', (int) (short) -1, "password_112284545599300", "password_112284545599300", (int) (short) 1);
        visitor71.setPaymentInfo(paymentInfo77);
        boolean boolean80 = debitPaymentProvider0.handlePayment(paymentInfo77, (double) '#');
        int int81 = paymentInfo77.getExpDate();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(superManager28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "password_112284545599300" + "'", str29, "password_112284545599300");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(paymentInfo34);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getValidation();
        user6.lname = "hi!";
        user6.setValidation("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str16 = user6.getPassword();
        int int17 = user6.id;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        boolean boolean7 = csvReader1.getSafetySwitch();
        csvReader1.setRecordDelimiter('\"');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = csvReader1.skipLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        java.lang.String str31 = disabled25.handleState();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(state24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        csvReader1.setDelimiter('\"');
        int int12 = csvReader1.getHeaderCount();
        int int14 = csvReader1.getIndex("password_112337353214100");
        int int16 = csvReader1.getIndex("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        boolean boolean17 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        paymentStrategy.Context context28 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) creditPaymentProvide0);
        paymentStrategy.PaymentInfo paymentInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = creditPaymentProvide0.handlePayment(paymentInfo29, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setEscapeMode(1);
        csvWriter1.close();
        char char11 = csvWriter1.getDelimiter();
        csvWriter1.setDelimiter('#');
        csvWriter1.setDelimiter(',');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("Password!23");
        csvWriter1.setUseTextQualifier(true);
        com.csvreader.CsvWriter csvWriter5 = new com.csvreader.CsvWriter("");
        csvWriter5.setRecordDelimiter('\"');
        char char8 = csvWriter5.getDelimiter();
        csvWriter5.setUseTextQualifier(false);
        com.csvreader.CsvWriter csvWriter12 = new com.csvreader.CsvWriter("");
        csvWriter12.setRecordDelimiter('\"');
        csvWriter12.setTextQualifier('\"');
        char char17 = csvWriter12.getComment();
        csvWriter12.setUseTextQualifier(true);
        char char20 = csvWriter12.getRecordDelimiter();
        char char21 = csvWriter12.getComment();
        com.csvreader.CsvReader csvReader23 = com.csvreader.CsvReader.parse("hi!");
        char char24 = csvReader23.getComment();
        char char25 = csvReader23.getTextQualifier();
        java.lang.String[] strArray26 = csvReader23.getHeaders();
        java.lang.String[] strArray27 = csvReader23.getValues();
        csvWriter12.writeRecord(strArray27, false);
        csvWriter5.writeRecord(strArray27, false);
        csvWriter1.writeRecord(strArray27, false);
        boolean boolean34 = csvWriter1.getUseTextQualifier();
        csvWriter1.write("password_112343396437900");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '#' + "'", char21 == '#');
        org.junit.Assert.assertNotNull(csvReader23);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '#' + "'", char24 == '#');
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\"' + "'", char25 == '\"');
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) '\000', "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        parkingLot2.setEnabled(false);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        maintainUser0.path = "User [name= hi!, id=97, email=hi!, password=]";
        maintainUser0.path = "User [name=null null, id=0, email=null, password=null]";
        java.util.ArrayList<userLogin.User> userList11 = maintainUser0.users;
        userLogin.MaintainUser maintainUser12 = new userLogin.MaintainUser();
        java.lang.String str13 = maintainUser12.path;
        userLogin.MaintainUser maintainUser14 = new userLogin.MaintainUser();
        maintainUser14.update("admin");
        java.util.ArrayList<userLogin.User> userList17 = maintainUser14.users;
        maintainUser12.users = userList17;
        maintainUser12.path = "User [name= hi!, id=97, email=hi!, password=]";
        java.util.ArrayList<userLogin.User> userList21 = maintainUser12.users;
        maintainUser0.users = userList21;
        java.util.ArrayList<userLogin.User> userList23 = maintainUser0.users;
        maintainUser0.update("manager_112365856111300");
        maintainUser0.update("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        user0.type = "password_112296757334200";
        java.lang.String str4 = user0.type;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112296757334200" + "'", str4, "password_112296757334200");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader(reader0, '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter inputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        char char7 = csvReader1.getComment();
        boolean boolean9 = csvReader1.isQualified(2);
        boolean boolean10 = csvReader1.getTrimWhitespace();
        java.lang.String[] strArray11 = csvReader1.getValues();
        csvReader1.setSkipEmptyRecords(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot((int) (byte) 100);
        parking.ParkingLot parkingLot9 = parkingSystem0.getLot((int) (short) 10);
        boolean boolean11 = parkingSystem0.isLotEnabled((int) (byte) 0);
        parkingSystem0.setEnableLot(0, false);
        parking.ParkingLot parkingLot16 = parkingSystem0.getLot((int) '\000');
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(parkingLot7);
// flaky:         org.junit.Assert.assertNotNull(parkingLot9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingLot16);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.toString();
        java.lang.String str13 = user6.getEmail();
        int int14 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        userLogin.User user6 = new userLogin.User("manager_112369653203000", "manager_112305914121600", 52, "password_112312047073100", "Password!23", "password_112325847983500");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.password = "Password!23";
        java.lang.String str12 = user6.getLName();
        java.lang.String str13 = user6.getLName();
        java.lang.String str14 = user6.type;
        java.lang.String str15 = user6.lname;
        java.lang.String str16 = user6.fname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        csvWriter1.setComment('#');
        csvWriter1.setUseTextQualifier(true);
        int int9 = csvWriter1.getEscapeMode();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.isValidated = true;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        boolean boolean6 = parkingSystem0.isLotEnabled((int) (byte) 100);
        parking.ParkingLot parkingLot9 = parkingSystem0.addLot((-1), "User [name=null null, id=0, email=null, password=null]");
        parking.ParkingLot parkingLot12 = parkingSystem0.addLot((int) (byte) 100, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        parkingLot12.setEnabled(true);
        boolean boolean15 = parkingLot12.getEnabled();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLot9);
        org.junit.Assert.assertNotNull(parkingLot12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        java.lang.String str7 = superManager0.lastName;
        superManager0.setPassword("hi!");
        manager.Manager manager10 = superManager0.autoGenerator();
        superManager0.firstName = "FALSE";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "password_112284545599300" + "'", str1, "password_112284545599300");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertNotNull(manager10);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        int int9 = csvReader1.getColumnCount();
        csvReader1.setCaptureRawRecord(true);
        java.lang.String str12 = csvReader1.getRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        userLogin.User user6 = new userLogin.User("admin", "password_112284545599300", 0, "manager_112305914121600", "FALSE", "password_112310734370300");
        java.lang.String str7 = user6.getEmail();
        user6.setValidation("manager_112351534964500");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "manager_112305914121600" + "'", str7, "manager_112305914121600");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        boolean boolean9 = debitPaymentProvider0.handlePayment(paymentInfo7, (double) 100);
        paymentStrategy.Context context10 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        reservations.ReservationSystemFacade reservationSystemFacade11 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap12 = reservationSystemFacade11.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade13 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot21 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace23 = parkingLot21.getParkingSpace((int) ' ');
        reservations.Reservation reservation24 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace23);
        users.FacultyMember facultyMember27 = new users.FacultyMember("", "hi!");
        int int28 = facultyMember27.parkingspacenum;
        int int29 = reservationSystemFacade13.calculateOutstanding(reservation24, (users.UserInfo) facultyMember27);
        manager.SuperManager superManager30 = manager.SuperManager.getInstance();
        java.lang.String str31 = superManager30.firstName;
        users.Student student34 = new users.Student("", "hi!");
        boolean boolean35 = superManager30.validateUser((users.UserInfo) student34);
        paymentStrategy.PaymentInfo paymentInfo36 = student34.getPaymentInfo();
        student34.setValid();
        int int38 = reservationSystemFacade11.calculateOutstanding(reservation24, (users.UserInfo) student34);
        java.lang.String str39 = student34.getPassword();
        paymentStrategy.PaymentInfo paymentInfo45 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        student34.setPaymentInfo(paymentInfo45);
        double double47 = paymentInfo45.getCardBallance();
        boolean boolean49 = debitPaymentProvider0.handlePayment(paymentInfo45, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reservationSystemFacade11);
        org.junit.Assert.assertNotNull(intMap12);
        org.junit.Assert.assertNotNull(reservationSystemFacade13);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(superManager30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "FALSE" + "'", str31, "FALSE");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(paymentInfo36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setDelimiter(',');
        long long13 = csvReader1.getCurrentRecord();
        boolean boolean14 = csvReader1.readRecord();
        long long15 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        paymentStrategy.OtherTypeProvider otherTypeProvider53 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo59 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo59.setBillingName("FALSE");
        boolean boolean63 = otherTypeProvider53.handlePayment(paymentInfo59, (double) (short) 1);
        paymentInfo59.setBillingAddress("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        int int66 = paymentInfo59.getExpDate();
        boolean boolean68 = debitPaymentProvider0.handlePayment(paymentInfo59, (double) ' ');
        paymentStrategy.PaymentInfo paymentInfo74 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int75 = paymentInfo74.getSecurityCode();
        java.lang.String str76 = paymentInfo74.getBillingAddress();
        java.util.Date date78 = null;
        paymentInfo74.parkingInfo(0, date78, "hi!", "hi!", (int) (short) 1);
        int int83 = paymentInfo74.getExpDate();
        int int84 = paymentInfo74.getExpDate();
        java.lang.String str85 = paymentInfo74.getBillingAddress();
        boolean boolean87 = debitPaymentProvider0.handlePayment(paymentInfo74, (double) (-30));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(superManager28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FALSE" + "'", str29, "FALSE");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(paymentInfo34);
        org.junit.Assert.assertNull(reservation35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        int int9 = csvWriter1.getEscapeMode();
        int int10 = csvWriter1.getEscapeMode();
        csvWriter1.setComment(',');
        csvWriter1.setUseTextQualifier(true);
        boolean boolean15 = csvWriter1.getForceQualifier();
        csvWriter1.setEscapeMode((-1));
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        users.Student student2 = new users.Student("", "hi!");
        int int3 = student2.getParkingRate();
        student2.setValid();
        student2.setValid();
        int int6 = student2.getParkingRate();
        int int7 = student2.getParkingRate();
        student2.parkinglot = "password_112338187831000";
        int int10 = student2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        csvReader1.setTextQualifier('#');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('\000');
        char char4 = csvReader1.getDelimiter();
        boolean boolean5 = csvReader1.skipLine();
        csvReader1.setDelimiter('4');
        boolean boolean8 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        char char2 = csvReader1.getTextQualifier();
        boolean boolean3 = csvReader1.readHeaders();
        csvReader1.setRecordDelimiter(',');
        boolean boolean6 = csvReader1.getUseComments();
        boolean boolean7 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\"' + "'", char2 == '\"');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace((int) (short) 0);
        parkingSpace1.setEnabled(false);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        boolean boolean3 = csvWriter1.getUseTextQualifier();
        char char4 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(false);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '#' + "'", char4 == '#');
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace(35);
        parkingSpace1.setEnabled(false);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        paymentStrategy.DebitPaymentProvider debitPaymentProvider35 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo41 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int42 = paymentInfo41.getSecurityCode();
        java.lang.String str43 = paymentInfo41.getBillingAddress();
        java.lang.String str44 = paymentInfo41.getBillingAddress();
        boolean boolean46 = debitPaymentProvider35.handlePayment(paymentInfo41, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo52 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int53 = paymentInfo52.getSecurityCode();
        java.lang.String str54 = paymentInfo52.getBillingAddress();
        java.util.Date date56 = null;
        paymentInfo52.parkingInfo(0, date56, "hi!", "hi!", (int) (short) 1);
        boolean boolean62 = debitPaymentProvider35.handlePayment(paymentInfo52, (double) (short) -1);
        int int63 = paymentInfo52.getExpDate();
        facultyMember2.setPaymentInfo(paymentInfo52);
        java.lang.String str65 = paymentInfo52.getBillingName();
        paymentInfo52.setCardNum(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        csvWriter1.writeComment("User [name= hi!, id=97, email=hi!, password=hi!]");
        int int4 = csvWriter1.getEscapeMode();
        csvWriter1.endRecord();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getValidation();
        user6.type = "password_112306347644100";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        csvWriter1.setTextQualifier('\"');
        boolean boolean10 = csvWriter1.getUseTextQualifier();
        csvWriter1.setForceQualifier(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        maintainUser0.path = "User [name= hi!, id=97, email=hi!, password=]";
        maintainUser0.path = "User [name=null null, id=0, email=null, password=null]";
        java.util.ArrayList<userLogin.User> userList11 = maintainUser0.users;
        userLogin.MaintainUser maintainUser12 = new userLogin.MaintainUser();
        maintainUser12.update("admin");
        java.util.ArrayList<userLogin.User> userList15 = maintainUser12.users;
        userLogin.MaintainUser maintainUser16 = new userLogin.MaintainUser();
        maintainUser16.update("admin");
        java.util.ArrayList<userLogin.User> userList19 = maintainUser16.users;
        maintainUser12.users = userList19;
        maintainUser12.load("admin");
        userLogin.MaintainUser maintainUser23 = new userLogin.MaintainUser();
        java.lang.String str24 = maintainUser23.path;
        userLogin.MaintainUser maintainUser25 = new userLogin.MaintainUser();
        maintainUser25.update("admin");
        java.util.ArrayList<userLogin.User> userList28 = maintainUser25.users;
        maintainUser23.users = userList28;
        maintainUser23.path = "User [name= hi!, id=97, email=hi!, password=]";
        java.util.ArrayList<userLogin.User> userList32 = maintainUser23.users;
        maintainUser12.users = userList32;
        maintainUser0.users = userList32;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name= FALSE, id=97, email=, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= FALSE, id=97, email=, password=] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        manager.Manager manager2 = new manager.Manager("manager_112347878775000", "User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        boolean boolean17 = parkingLot14.getEnabled();
        parking.ParkingSpace parkingSpace19 = parkingLot14.getParkingSpace(10);
        parkingSpace19.setId((int) (byte) 10);
        parkingState.Disabled disabled22 = new parkingState.Disabled();
        parkingSpace19.setState((parkingState.State) disabled22);
        parkingSpace9.setState((parkingState.State) disabled22);
        java.lang.String str25 = disabled22.handleState();
        java.lang.String str26 = disabled22.handleState();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        manager7.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str10 = manager7.getPassword();
        manager7.lastName = "";
        java.lang.String str13 = manager7.firstName;
        manager7.setUsername("FALSE");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FALSE" + "'", str1, "FALSE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        java.lang.String str10 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        paymentStrategy.OtherTypeProvider otherTypeProvider29 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo35 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo35.setBillingName("FALSE");
        boolean boolean39 = otherTypeProvider29.handlePayment(paymentInfo35, (double) (short) 1);
        boolean boolean41 = debitPaymentProvider0.handlePayment(paymentInfo35, (double) 100L);
        int int42 = paymentInfo35.getCardNum();
        java.util.Date date44 = null;
        paymentInfo35.parkingInfo(5, date44, "User [name= hi!, id=97, email=hi!, password=hi!]", "password_112310734370300", 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        java.lang.String str7 = superManager0.lastName;
        java.lang.String str8 = superManager0.getPassword();
        manager.Manager manager9 = superManager0.autoGenerator();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FALSE" + "'", str1, "FALSE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(manager9);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        paymentInfo69.parkingInfo(97, date74, "manager_112327586653400", "admin", 10);
        paymentInfo69.setBillingAddress("");
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
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setSafetySwitch(false);
        int int9 = csvReader1.getHeaderCount();
        csvReader1.setSkipEmptyRecords(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = csvReader1.skipRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        boolean boolean17 = csvWriter1.getUseTextQualifier();
        char char18 = csvWriter1.getDelimiter();
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + ',' + "'", char18 == ',');
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) ' ');
        parkingSystem0.setEnableLot((int) (byte) 100, false);
        parking.ParkingSpace parkingSpace9 = parkingSystem0.getParkingSpace((int) (byte) 1, (int) (byte) 100);
        parkingState.State state10 = parkingSpace9.getSensorStatus();
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state10);
        org.junit.Assert.assertNotNull(state11);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        boolean boolean7 = csvReader1.getUseComments();
        csvReader1.setTrimWhitespace(true);
        boolean boolean10 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot4 = parkingSystem0.getLot((int) '\000');
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot(100);
        parking.ParkingLot parkingLot8 = parkingSystem0.getLot(34);
        parking.ParkingLot parkingLot10 = parkingSystem0.getLot(0);
        // The following exception was thrown during execution in test generation
        try {
            parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid space id");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot4);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertNotNull(parkingLot8);
        org.junit.Assert.assertNotNull(parkingLot10);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        parkingState.State state16 = parkingSpace14.getSensorStatus();
        reservations.Reservation reservation17 = new reservations.Reservation((int) (byte) 0, 2, (int) (byte) 0, 2, "admin", parkingSpace14);
        users.FacultyMember facultyMember20 = new users.FacultyMember("", "hi!");
        int int21 = facultyMember20.parkingspacenum;
        facultyMember20.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade24 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot32 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace34 = parkingLot32.getParkingSpace((int) ' ');
        reservations.Reservation reservation35 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace34);
        reservationSystemFacade24.editBooking(reservation35, (int) (byte) 100);
        facultyMember20.currentReservation = reservation35;
        parking.ParkingSpace parkingSpace39 = reservation35.getSpace();
        parkingState.State state40 = parkingSpace39.getSensorStatus();
        reservations.ReservationSystemFacade reservationSystemFacade41 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot49 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace51 = parkingLot49.getParkingSpace((int) ' ');
        reservations.Reservation reservation52 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace51);
        users.FacultyMember facultyMember55 = new users.FacultyMember("", "hi!");
        int int56 = facultyMember55.parkingspacenum;
        int int57 = reservationSystemFacade41.calculateOutstanding(reservation52, (users.UserInfo) facultyMember55);
        reservation52.updateDuration((int) ' ');
        int int60 = reservation52.getStartTime();
        parkingSpace39.setReservation(reservation52);
        int int62 = reservation52.getDuration();
        java.lang.String str63 = reservation52.getPlate();
        parking.ParkingSpace parkingSpace64 = reservation52.getSpace();
        parkingSpace14.setReservation(reservation52);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade24);
        org.junit.Assert.assertNotNull(parkingSpace34);
        org.junit.Assert.assertNotNull(parkingSpace39);
        org.junit.Assert.assertNotNull(state40);
        org.junit.Assert.assertNotNull(reservationSystemFacade41);
        org.junit.Assert.assertNotNull(parkingSpace51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 32 + "'", int62 == 32);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "admin" + "'", str63, "admin");
        org.junit.Assert.assertNotNull(parkingSpace64);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap61 = reservationSystemFacade0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap62 = reservationSystemFacade0.getLots();
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
        org.junit.Assert.assertNotNull(intMap61);
        org.junit.Assert.assertNotNull(intMap62);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String[] strArray2 = csvReader1.getValues();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.password = "Password!23";
        java.lang.String str12 = user6.getLName();
        user6.setValidation("User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        java.lang.String str47 = reservation39.getPlate();
        int int48 = reservation39.getStartTime();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FALSE" + "'", str20, "FALSE");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade28);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "admin" + "'", str47, "admin");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        userLogin.MaintainUser maintainUser4 = new userLogin.MaintainUser();
        maintainUser4.update("admin");
        java.util.ArrayList<userLogin.User> userList7 = maintainUser4.users;
        maintainUser0.users = userList7;
        maintainUser0.path = "password_112310734370300";
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("manager_112351534964500");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File manager_112351534964500 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        userLogin.User user6 = new userLogin.User("manager_112354709081500", "manager_112347878775000", 8, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "", "password_112296757334200");
        user6.password = "";
        user6.email = "password_112348536883400";
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        boolean boolean3 = csvReader1.skipLine();
        csvReader1.setSafetySwitch(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        user6.setPassword("FALSE");
        java.lang.String str17 = user6.fname;
        java.lang.String str18 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FALSE" + "'", str18, "FALSE");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", ' ');
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        userLogin.User user6 = new userLogin.User("", "User [name= hi!, id=97, email=hi!, password=]", (int) (byte) -1, "FALSE", "admin", "");
        user6.setPassword("password_112348536883400");
        java.lang.String str9 = user6.getLName();
        java.lang.String str10 = user6.lname;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str9, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "User [name=null null, id=0, email=null, password=null]";
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        csvReader1.setUseComments(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = csvReader1.getValues();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        parkingState.Occupied occupied1 = new parkingState.Occupied("password_112348536883400");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setTextQualifier(' ');
        char char10 = csvWriter1.getDelimiter();
        boolean boolean11 = csvWriter1.getUseTextQualifier();
        csvWriter1.setEscapeMode((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setPassword("admin");
        java.lang.String str11 = user6.password;
        java.lang.String str12 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getSafetySwitch();
        java.lang.String str8 = csvReader1.getHeader(0);
        csvReader1.setTrimWhitespace(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.State state12 = parkingSpace9.getSensorStatus();
        boolean boolean13 = parkingSpace9.isEnabled();
        parkingSpace9.setId(10);
        parkingState.Enabled enabled16 = new parkingState.Enabled();
        java.lang.String str17 = enabled16.handleState();
        java.lang.String str18 = enabled16.handleState();
        java.lang.String str19 = enabled16.handleState();
        parkingSpace9.setState((parkingState.State) enabled16);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("admin");
        boolean boolean9 = csvReader1.isQualified(100);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        boolean boolean8 = csvWriter1.getForceQualifier();
        csvWriter1.setComment('\000');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        manager.Manager manager2 = new manager.Manager("password_112284545599300", "");
        manager2.firstName = "admin";
        manager2.lastName = "";
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name= hi!, id=97, email=hi!, password=hi!]", "password_112296757334200");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        user6.setPassword("FALSE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(8);
        java.lang.String[] strArray12 = csvReader1.getHeaders();
        csvReader1.setRecordDelimiter(' ');
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("admin");
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.endRecord();
        csvWriter1.close();
        csvWriter1.setTextQualifier('a');
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        paymentStrategy.PaymentInfo paymentInfo37 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        boolean boolean39 = context11.execute(paymentInfo37, (double) (byte) 0);
        paymentStrategy.PaymentInfo paymentInfo45 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int46 = paymentInfo45.getSecurityCode();
        java.lang.String str47 = paymentInfo45.getBillingAddress();
        java.util.Date date49 = null;
        paymentInfo45.parkingInfo(0, date49, "hi!", "hi!", (int) (short) 1);
        int int54 = paymentInfo45.getExpDate();
        int int55 = paymentInfo45.getExpDate();
        paymentInfo45.setSecurityCode(1);
        java.lang.String str58 = paymentInfo45.getBillingAddress();
        boolean boolean60 = context11.execute(paymentInfo45, (double) 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.Disabled disabled12 = new parkingState.Disabled();
        parkingSpace9.setState((parkingState.State) disabled12);
        parking.ParkingLot parkingLot16 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace18 = parkingLot16.getParkingSpace((int) ' ');
        boolean boolean19 = parkingLot16.getEnabled();
        parking.ParkingSpace parkingSpace21 = parkingLot16.getParkingSpace(10);
        reservations.ReservationSystemFacade reservationSystemFacade22 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot30 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace32 = parkingLot30.getParkingSpace((int) ' ');
        reservations.Reservation reservation33 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace32);
        users.FacultyMember facultyMember36 = new users.FacultyMember("", "hi!");
        int int37 = facultyMember36.parkingspacenum;
        int int38 = reservationSystemFacade22.calculateOutstanding(reservation33, (users.UserInfo) facultyMember36);
        parkingSpace21.setReservation(reservation33);
        parkingSpace9.setReservation(reservation33);
        boolean boolean41 = parkingSpace9.isEnabled();
        java.util.ArrayList<reservations.Reservation> reservationList42 = parkingSpace9.getReservations();
        parking.ParkingLot parkingLot45 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace47 = parkingLot45.getParkingSpace((int) ' ');
        boolean boolean48 = parkingSpace47.isEnabled();
        java.util.ArrayList<reservations.Reservation> reservationList49 = parkingSpace47.getReservations();
        parkingSpace47.setEnabled(false);
        parkingSpace47.setId((int) (byte) -1);
        parkingState.Unoccupied unoccupied54 = new parkingState.Unoccupied();
        java.lang.String str55 = unoccupied54.handleState();
        java.lang.String str56 = unoccupied54.handleState();
        java.lang.String str57 = unoccupied54.handleState();
        parkingSpace47.setState((parkingState.State) unoccupied54);
        parkingSpace9.setState((parkingState.State) unoccupied54);
        java.lang.String str60 = unoccupied54.handleState();
        java.lang.String str61 = unoccupied54.handleState();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(reservationSystemFacade22);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(reservationList42);
        org.junit.Assert.assertNotNull(parkingSpace47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(reservationList49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("admin", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parkingLot2.setEnabled(true);
        java.lang.String str5 = parkingLot2.getAddress();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(8);
        boolean boolean8 = parkingLot2.getEnabled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        boolean boolean10 = csvReader1.skipRecord();
        boolean boolean11 = csvReader1.getUseComments();
        com.csvreader.CsvReader csvReader13 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean14 = csvReader13.readRecord();
        csvReader13.setSafetySwitch(true);
        boolean boolean17 = csvReader13.skipLine();
        java.lang.String str19 = csvReader13.get("FALSE");
        csvReader13.setUseTextQualifier(false);
        com.csvreader.CsvReader csvReader23 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean24 = csvReader23.readRecord();
        csvReader23.setSafetySwitch(true);
        java.lang.String[] strArray27 = csvReader23.getValues();
        boolean boolean28 = csvReader23.getUseComments();
        char char29 = csvReader23.getTextQualifier();
        java.lang.String[] strArray30 = csvReader23.getValues();
        csvReader13.setHeaders(strArray30);
        csvReader1.setHeaders(strArray30);
        int int34 = csvReader1.getIndex("FALSE");
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(csvReader13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(csvReader23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\"' + "'", char29 == '\"');
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        csvReader1.setSafetySwitch(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        users.FacultyMember facultyMember6 = new users.FacultyMember("", "hi!");
        int int7 = facultyMember6.parkingspacenum;
        facultyMember6.parkinglot = "hi!";
        facultyMember6.setValid();
        boolean boolean11 = manager3.validateUser((users.UserInfo) facultyMember6);
        java.lang.String str12 = facultyMember6.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        users.Student student2 = new users.Student("", "hi!");
        int int3 = student2.getParkingRate();
        student2.setValid();
        student2.setValid();
        java.lang.String str6 = student2.getEmail();
        int int7 = student2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider1 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        boolean boolean11 = otherTypeProvider1.handlePayment(paymentInfo7, (double) (short) 1);
        boolean boolean13 = creditPaymentProvide0.handlePayment(paymentInfo7, (double) (short) 0);
        paymentStrategy.DebitPaymentProvider debitPaymentProvider14 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context15 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider14);
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider16 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int23 = paymentInfo22.getSecurityCode();
        java.lang.String str24 = paymentInfo22.getBillingAddress();
        java.util.Date date26 = null;
        paymentInfo22.parkingInfo(0, date26, "hi!", "hi!", (int) (short) 1);
        boolean boolean32 = mobilePaymentProvider16.handlePayment(paymentInfo22, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo38 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        boolean boolean40 = mobilePaymentProvider16.handlePayment(paymentInfo38, (double) (-1.0f));
        boolean boolean42 = debitPaymentProvider14.handlePayment(paymentInfo38, (double) 0);
        java.util.Date date44 = null;
        paymentInfo38.parkingInfo((int) (short) 100, date44, "", "User [name=null null, id=0, email=null, password=null]", (int) '4');
        boolean boolean50 = creditPaymentProvide0.handlePayment(paymentInfo38, (double) 272);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        boolean boolean3 = csvWriter1.getForceQualifier();
        csvWriter1.setUseTextQualifier(true);
        csvWriter1.setUseTextQualifier(false);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        userLogin.User user6 = new userLogin.User("User [name= FALSE, id=97, email=, password=]", "User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]", 0, "password_112347878777100", "manager_112351534964500", "password_112347399105200");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.lname = "User [name= hi!, id=97, email=hi!, password=hi!]";
        java.lang.String str19 = user6.getValidation();
        int int20 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FALSE" + "'", str19, "FALSE");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("password_112284545599300", "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("password_112348536883400", "User [name= hi!, id=97, email=hi!, password=hi!]", "User [name=null null, id=0, email=null, password=null]");
        users.UserInfo userInfo16 = userInfoFactory0.makeUser("User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
        org.junit.Assert.assertNull(userInfo16);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        users.Visitor visitor2 = new users.Visitor("password_112296757334200", "password_112358838017900");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setComment(' ');
        csvReader1.setDelimiter('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        user6.fname = "FALSE";
        user6.email = "admin";
        java.lang.String str12 = user6.getFName();
        int int13 = user6.getId();
        java.lang.String str14 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=FALSE hi!, id=97, email=admin, password=]" + "'", str14, "User [name=FALSE hi!, id=97, email=admin, password=]");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getRecordDelimiter();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("User [name= FALSE, id=1, email=hi!, password=hi!]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "manager_112305914121600");
        boolean boolean3 = nonFacultyStaff2.getIsValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        users.FacultyMember facultyMember19 = new users.FacultyMember("", "hi!");
        int int20 = facultyMember19.parkingspacenum;
        facultyMember19.parkinglot = "hi!";
        parking.ParkingLot parkingLot35 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace37 = parkingLot35.getParkingSpace((int) ' ');
        reservations.Reservation reservation38 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace37);
        paymentStrategy.OtherTypeProvider otherTypeProvider39 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context40 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider39);
        paymentStrategy.PaymentInfo paymentInfo46 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo46.setBillingName("FALSE");
        paymentInfo46.setCardNum(1);
        boolean boolean52 = context40.execute(paymentInfo46, (double) 97);
        reservations.Reservation reservation53 = reservationSystemFacade0.createReservation((users.UserInfo) facultyMember19, (int) (short) -1, (-1), (int) ',', (int) (byte) 1, "admin", parkingSpace37, context40);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap54 = reservationSystemFacade0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap55 = reservationSystemFacade0.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade56 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap57 = reservationSystemFacade56.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade58 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot66 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace68 = parkingLot66.getParkingSpace((int) ' ');
        reservations.Reservation reservation69 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace68);
        users.FacultyMember facultyMember72 = new users.FacultyMember("", "hi!");
        int int73 = facultyMember72.parkingspacenum;
        int int74 = reservationSystemFacade58.calculateOutstanding(reservation69, (users.UserInfo) facultyMember72);
        users.Student student77 = new users.Student("", "hi!");
        int int78 = student77.getParkingRate();
        reservationSystemFacade56.cancelBooking(reservation69, (users.UserInfo) student77);
        int int80 = reservation69.getStartTime();
        users.Student student83 = new users.Student("", "hi!");
        int int84 = student83.getParkingRate();
        student83.setValid();
        student83.setValid();
        int int87 = student83.getParkingRate();
        int int88 = student83.getParkingRate();
        student83.parkinglot = "password_112338187831000";
        reservationSystemFacade0.cancelBooking(reservation69, (users.UserInfo) student83);
        int int92 = reservation69.getMonth();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(parkingSpace37);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertNotNull(intMap54);
        org.junit.Assert.assertNotNull(intMap55);
        org.junit.Assert.assertNotNull(reservationSystemFacade56);
        org.junit.Assert.assertNotNull(intMap57);
        org.junit.Assert.assertNotNull(reservationSystemFacade58);
        org.junit.Assert.assertNotNull(parkingSpace68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 5 + "'", int78 == 5);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 5 + "'", int84 == 5);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 5 + "'", int87 == 5);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 5 + "'", int88 == 5);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        com.csvreader.CsvReader csvReader11 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean12 = csvReader11.readRecord();
        csvReader11.setSafetySwitch(true);
        csvReader11.setTrimWhitespace(false);
        boolean boolean17 = csvReader11.skipRecord();
        char char18 = csvReader11.getDelimiter();
        boolean boolean19 = csvReader11.skipLine();
        boolean boolean20 = csvReader11.skipLine();
        com.csvreader.CsvWriter csvWriter22 = new com.csvreader.CsvWriter("");
        csvWriter22.setRecordDelimiter('\"');
        boolean boolean25 = csvWriter22.getUseTextQualifier();
        com.csvreader.CsvReader csvReader27 = com.csvreader.CsvReader.parse("hi!");
        char char28 = csvReader27.getComment();
        char char29 = csvReader27.getTextQualifier();
        java.lang.String[] strArray30 = csvReader27.getHeaders();
        java.lang.String[] strArray31 = csvReader27.getValues();
        csvWriter22.writeRecord(strArray31);
        csvReader11.setHeaders(strArray31);
        csvWriter1.writeRecord(strArray31, false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(csvReader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + ',' + "'", char18 == ',');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(csvReader27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '#' + "'", char28 == '#');
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\"' + "'", char29 == '\"');
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.State state12 = parkingSpace9.getSensorStatus();
        int int13 = parkingSpace9.getId();
        parkingState.Occupied occupied15 = new parkingState.Occupied("");
        parkingSpace9.setState((parkingState.State) occupied15);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace(0);
        parking.ParkingLot parkingLot4 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace6 = parkingLot4.getParkingSpace((int) ' ');
        boolean boolean7 = parkingLot4.getEnabled();
        parking.ParkingSpace parkingSpace9 = parkingLot4.getParkingSpace(10);
        parkingSpace9.setId((int) (byte) 10);
        parkingState.Disabled disabled12 = new parkingState.Disabled();
        java.lang.String str13 = disabled12.handleState();
        parkingSpace9.setState((parkingState.State) disabled12);
        parkingSpace1.setState((parkingState.State) disabled12);
        parkingSpace1.setId((int) (byte) 100);
        java.util.ArrayList<reservations.Reservation> reservationList18 = parkingSpace1.getReservations();
        parking.ParkingLot parkingLot26 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace28 = parkingLot26.getParkingSpace((int) ' ');
        reservations.Reservation reservation29 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace28);
        int int30 = reservation29.getDuration();
        parkingSpace1.setReservation(reservation29);
        org.junit.Assert.assertNotNull(parkingSpace6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=hi!, password=]", "");
        manager2.lastName = "FALSE";
        manager2.setPassword("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        users.UserInfo userInfo7 = null;
        boolean boolean8 = manager2.validateUser(userInfo7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setPassword("admin");
        java.lang.String str11 = user6.getFName();
        int int12 = user6.getId();
        user6.id = 2;
        java.lang.String str15 = user6.fname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        userLogin.User user6 = new userLogin.User("password_112351534974900", "password_112336809022100", (int) ' ', "User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", "password_112310734370300", "manager_112351534964500");
        user6.type = "password_112310734370300";
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String[] strArray8 = csvReader1.getValues();
        boolean boolean9 = csvReader1.getSkipEmptyRecords();
        boolean boolean10 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
    }
}
