import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        users.NonFacultyStaff nonFacultyStaff30 = new users.NonFacultyStaff("", "");
        int int31 = nonFacultyStaff30.parkingspacenum;
        parking.ParkingLot parkingLot39 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace41 = parkingLot39.getParkingSpace((int) ' ');
        reservations.Reservation reservation42 = null;
        parkingSpace41.setReservation(reservation42);
        paymentStrategy.OtherTypeProvider otherTypeProvider44 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context45 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider44);
        paymentStrategy.PaymentInfo paymentInfo51 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo51.setBillingName("FALSE");
        paymentInfo51.setCardNum(1);
        boolean boolean57 = context45.execute(paymentInfo51, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo63 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int64 = paymentInfo63.getSecurityCode();
        java.lang.String str65 = paymentInfo63.getBillingAddress();
        java.util.Date date67 = null;
        paymentInfo63.parkingInfo(0, date67, "hi!", "hi!", (int) (short) 1);
        int int72 = paymentInfo63.getExpDate();
        boolean boolean74 = context45.execute(paymentInfo63, (double) 5);
        reservations.Reservation reservation75 = reservationSystemFacade0.createReservation((users.UserInfo) nonFacultyStaff30, 32, 5, (int) (short) -1, (int) (byte) 10, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace41, context45);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide76 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider77 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo83 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo83.setBillingName("FALSE");
        boolean boolean87 = otherTypeProvider77.handlePayment(paymentInfo83, (double) (short) 1);
        boolean boolean89 = creditPaymentProvide76.handlePayment(paymentInfo83, (double) (short) 0);
        paymentInfo83.setBillingName("password_112284545599300");
        boolean boolean93 = context45.execute(paymentInfo83, 0.0d);
        int int94 = paymentInfo83.getSecurityCode();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(reservation75);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 97 + "'", int94 == 97);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        boolean boolean2 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvReader csvReader4 = com.csvreader.CsvReader.parse("hi!");
        char char5 = csvReader4.getComment();
        char char6 = csvReader4.getTextQualifier();
        java.lang.String[] strArray7 = csvReader4.getHeaders();
        java.lang.String[] strArray8 = csvReader4.getValues();
        csvWriter1.writeRecord(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
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
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getValidation();
        user6.setName("password_112337353214100", "User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        int int7 = paymentInfo5.getSecurityCode();
        paymentInfo5.setSecurityCode((int) ',');
        paymentInfo5.setBillingAddress("password_112344052445500");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        paymentStrategy.PaymentInfo paymentInfo73 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = creditPaymentProvide0.handlePayment(paymentInfo73, (double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setSafetySwitch(false);
        int int9 = csvReader1.getHeaderCount();
        csvReader1.setRecordDelimiter('\000');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = csvReader1.isQualified((int) '\000');
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(8);
        java.lang.String[] strArray12 = csvReader1.getHeaders();
        java.lang.String[] strArray13 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("password_112351534974900");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        csvWriter1.writeComment("User [name= hi!, id=97, email=hi!, password=hi!]");
        int int4 = csvWriter1.getEscapeMode();
        csvWriter1.setForceQualifier(false);
        csvWriter1.close();
        boolean boolean8 = csvWriter1.getUseTextQualifier();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("password_112284545599300", "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("password_112338187831000", "", "password_112344052445500");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name= FALSE, id=97, email=hi!, password=hi!]", "password_112312047073100");
        int int3 = nonFacultyStaff2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        paymentInfo6.setCardNum(1);
        paymentInfo6.setExpDate(768);
        paymentInfo6.setBillingName("FALSE");
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (short) 10);
        paymentStrategy.Context context17 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) mobilePaymentProvider0);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide18 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo24 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int25 = paymentInfo24.getSecurityCode();
        java.lang.String str26 = paymentInfo24.getBillingAddress();
        java.util.Date date28 = null;
        paymentInfo24.parkingInfo(0, date28, "hi!", "hi!", (int) (short) 1);
        boolean boolean34 = creditPaymentProvide18.handlePayment(paymentInfo24, (double) 8);
        paymentStrategy.OtherTypeProvider otherTypeProvider35 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context36 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider35);
        paymentStrategy.PaymentInfo paymentInfo42 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo42.setBillingName("FALSE");
        paymentInfo42.setCardNum(1);
        boolean boolean48 = context36.execute(paymentInfo42, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo54 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int55 = paymentInfo54.getSecurityCode();
        java.lang.String str56 = paymentInfo54.getBillingAddress();
        java.util.Date date58 = null;
        paymentInfo54.parkingInfo(0, date58, "hi!", "hi!", (int) (short) 1);
        int int63 = paymentInfo54.getExpDate();
        boolean boolean65 = context36.execute(paymentInfo54, (double) 5);
        paymentInfo54.setSecurityCode((int) '\"');
        boolean boolean69 = creditPaymentProvide18.handlePayment(paymentInfo54, (double) ' ');
        paymentStrategy.PaymentInfo paymentInfo75 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo75.setBillingName("FALSE");
        paymentInfo75.setCardNum(1);
        boolean boolean81 = creditPaymentProvide18.handlePayment(paymentInfo75, (double) (short) 1);
        paymentStrategy.PaymentInfo paymentInfo87 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int88 = paymentInfo87.getSecurityCode();
        boolean boolean90 = creditPaymentProvide18.handlePayment(paymentInfo87, 100.0d);
        paymentInfo87.setBillingName("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        boolean boolean94 = mobilePaymentProvider0.handlePayment(paymentInfo87, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 97 + "'", int88 == 97);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        parking.ParkingLot parkingLot60 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace62 = parkingLot60.getParkingSpace((int) ' ');
        reservations.Reservation reservation63 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace62);
        parkingState.State state64 = parkingSpace62.getSensorStatus();
        reservations.Reservation reservation65 = new reservations.Reservation((int) (byte) 0, 2, (int) (byte) 0, 2, "admin", parkingSpace62);
        reservations.Reservation reservation66 = new reservations.Reservation((int) (byte) 1, (int) (byte) 10, (int) (short) -1, 100, "Password!23", parkingSpace62);
        reservationSystemFacade0.editBooking(reservation66, (int) ' ');
        parking.ParkingSystem parkingSystem74 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace77 = parkingSystem74.getParkingSpace(10, (int) (byte) 1);
        boolean boolean79 = false; // flaky: parkingSystem74.isLotEnabled(0);
        parking.ParkingSpace parkingSpace82 = null; // flaky: parkingSystem74.getParkingSpace(0, 0);
// flaky:         parkingSpace82.setEnabled(false);
        reservations.Reservation reservation85 = new reservations.Reservation((int) (byte) -1, 8, (int) 'a', 264, "User [name= hi!, id=97, email=hi!, password=]", parkingSpace82);
        users.FacultyMember facultyMember88 = new users.FacultyMember("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name= hi!, id=97, email=hi!, password=admin]");
        int int89 = facultyMember88.getParkingRate();
// flaky:         reservationSystemFacade0.cancelBooking(reservation85, (users.UserInfo) facultyMember88);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap91 = reservationSystemFacade0.getLots();
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
        org.junit.Assert.assertNotNull(parkingSpace62);
        org.junit.Assert.assertNotNull(state64);
        org.junit.Assert.assertNotNull(parkingSystem74);
        org.junit.Assert.assertNotNull(parkingSpace77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace82);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 8 + "'", int89 == 8);
        org.junit.Assert.assertNotNull(intMap91);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        paymentStrategy.PaymentInfo paymentInfo3 = facultyMember2.getPaymentInfo();
        boolean boolean4 = facultyMember2.getIsValid();
        reservations.ReservationSystemFacade reservationSystemFacade5 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot13 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace15 = parkingLot13.getParkingSpace((int) ' ');
        reservations.Reservation reservation16 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace15);
        reservationSystemFacade5.editBooking(reservation16, (int) (byte) 100);
        java.lang.String str19 = reservation16.getPlate();
        reservation16.updateDuration((int) (short) -1);
        facultyMember2.currentReservation = reservation16;
        int int23 = reservation16.getDuration();
        org.junit.Assert.assertNull(paymentInfo3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(reservationSystemFacade5);
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = superManager0.firstName;
        superManager0.firstName = "User [name= hi!, id=97, email=hi!, password=]";
        manager.Manager manager7 = superManager0.autoGenerator();
        manager7.setPassword("password_112284545599300");
        manager7.setPassword("password_112344052445500");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(manager7);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        java.lang.String str15 = user6.getType();
        java.lang.String str16 = user6.getFName();
        user6.setType("");
        user6.setValidation("password_112325847983500");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.id = (byte) 10;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        csvWriter1.setTextQualifier('#');
        csvWriter1.setUseTextQualifier(true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("", "hi!", "FALSE");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", "admin", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("User [name=null null, id=0, email=null, password=null]", "User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", "User [name= FALSE, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) '\000', "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        java.lang.String str3 = parkingLot2.getAddress();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str3, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        user6.fname = "FALSE";
        user6.email = "admin";
        user6.password = "password_112351534974900";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setCaptureRawRecord(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        int int4 = csvWriter1.getEscapeMode();
        com.csvreader.CsvReader csvReader6 = com.csvreader.CsvReader.parse("hi!");
        char char7 = csvReader6.getComment();
        char char8 = csvReader6.getTextQualifier();
        boolean boolean9 = csvReader6.getUseTextQualifier();
        java.lang.String str11 = csvReader6.get((int) '#');
        char char12 = csvReader6.getComment();
        boolean boolean14 = csvReader6.isQualified(2);
        boolean boolean15 = csvReader6.getTrimWhitespace();
        java.lang.String[] strArray16 = csvReader6.getValues();
        csvWriter1.writeRecord(strArray16, false);
        csvWriter1.setRecordDelimiter('a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(csvReader6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '#' + "'", char12 == '#');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.util.Date date9 = null;
        paymentInfo5.parkingInfo(0, date9, "hi!", "hi!", (int) (short) 1);
        int int14 = paymentInfo5.getExpDate();
        int int15 = paymentInfo5.getExpDate();
        paymentInfo5.setSecurityCode((int) '4');
        int int18 = paymentInfo5.getCardNum();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        reservations.Reservation reservation5 = null;
        parkingSpace4.setReservation(reservation5);
        int int7 = parkingSpace4.getId();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        user6.fname = "FALSE";
        user6.id = 768;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setDelimiter('\"');
        csvReader1.setComment('a');
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        user6.setEmail("hi!");
        java.lang.String str13 = user6.getPassword();
        java.lang.String str14 = user6.getType();
        java.lang.Class<?> wildcardClass15 = user6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        user6.setPassword("FALSE");
        java.lang.String str17 = user6.fname;
        user6.email = "User [name= FALSE, id=97, email=, password=]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        int int14 = user6.getId();
        java.lang.String str15 = user6.getType();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str15, "User [name= hi!, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        manager.Manager manager2 = new manager.Manager("password_112296757334200", "manager_112347878775000");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setPassword("admin");
        int int11 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setTextQualifier('#');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getRecordDelimiter();
        char char5 = csvWriter1.getComment();
        com.csvreader.CsvReader csvReader7 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean8 = csvReader7.readRecord();
        csvReader7.setSafetySwitch(true);
        csvReader7.setTrimWhitespace(false);
        boolean boolean13 = csvReader7.skipRecord();
        char char14 = csvReader7.getDelimiter();
        boolean boolean15 = csvReader7.skipLine();
        boolean boolean16 = csvReader7.skipLine();
        com.csvreader.CsvWriter csvWriter18 = new com.csvreader.CsvWriter("");
        csvWriter18.setRecordDelimiter('\"');
        boolean boolean21 = csvWriter18.getUseTextQualifier();
        com.csvreader.CsvReader csvReader23 = com.csvreader.CsvReader.parse("hi!");
        char char24 = csvReader23.getComment();
        char char25 = csvReader23.getTextQualifier();
        java.lang.String[] strArray26 = csvReader23.getHeaders();
        java.lang.String[] strArray27 = csvReader23.getValues();
        csvWriter18.writeRecord(strArray27);
        csvReader7.setHeaders(strArray27);
        csvWriter1.writeRecord(strArray27);
        char char31 = csvWriter1.getComment();
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertNotNull(csvReader7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(csvReader23);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '#' + "'", char24 == '#');
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\"' + "'", char25 == '\"');
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '#' + "'", char31 == '#');
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        user6.email = "";
        user6.password = "password_112306347644100";
        boolean boolean15 = user6.isValidated;
        boolean boolean16 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=hi!]");
        java.lang.String str9 = user6.type;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader(reader0, ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter inputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        java.lang.String str15 = user6.toString();
        user6.email = "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]";
        int int18 = user6.id;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= FALSE, id=97, email=hi!, password=hi!]" + "'", str15, "User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        char char10 = csvReader1.getComment();
        java.lang.String str12 = csvReader1.get("manager_112327586653400");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        java.lang.String str16 = disabled12.handleState();
        java.lang.String str17 = disabled12.handleState();
        org.junit.Assert.assertNotNull(parkingSpace6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        user6.email = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "password_112325847983500");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parkingSpace7.setEnabled(false);
        java.lang.Class<?> wildcardClass10 = parkingSpace7.getClass();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        char char5 = csvWriter1.getDelimiter();
        csvWriter1.setDelimiter(',');
        csvWriter1.setRecordDelimiter(' ');
        csvWriter1.close();
        java.lang.String[] strArray16 = new java.lang.String[] { "manager_112347878775000", "User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]", "User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]", "password_112354709083600", "User [name= FALSE, id=97, email=hi!, password=hi!]" };
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        parking.ParkingSpace parkingSpace6 = new parking.ParkingSpace((int) (short) 10);
        reservations.Reservation reservation7 = new reservations.Reservation(35, 272, 97, 52, "User [name= FALSE, id=97, email=, password=]", parkingSpace6);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("password_112338187831000", "User [name= hi!, id=97, email=hi!, password=]", "password_112337353214100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112338187831000" + "'", str3, "password_112338187831000");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name= FALSE, id=97, email=, password=]", "User [name= FALSE, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        java.lang.String str6 = csvReader1.get(97);
        csvReader1.setRecordDelimiter('\"');
        csvReader1.close();
        char char10 = csvReader1.getRecordDelimiter();
        csvReader1.setComment('4');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("FALSE");
        int int9 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=hi!]");
        csvReader1.setRecordDelimiter('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name= hi!, id=97, email=hi!, password=hi!]", '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        java.lang.String str19 = user6.type;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        java.lang.String str7 = superManager0.lastName;
        users.UserInfo userInfo8 = null;
        boolean boolean9 = superManager0.validateUser(userInfo8);
        manager.Manager manager10 = superManager0.autoGenerator();
        manager10.firstName = "password_112310734370300";
        manager10.lastName = "FALSE";
        java.lang.String str15 = manager10.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=]");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(manager10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "password_112357424381900" + "'", str15, "password_112357424381900");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        maintainUser0.path = "User [name= hi!, id=97, email=hi!, password=admin]";
        maintainUser0.update("password_112310734370300");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        java.lang.String str5 = csvReader1.get(100);
        boolean boolean7 = csvReader1.isQualified((int) '4');
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        csvReader1.setComment('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        manager.Manager manager2 = new manager.Manager("", "admin");
        manager2.lastName = "Password!23";
        manager2.lastName = "manager_112354709081500";
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.email;
        java.lang.String str10 = user6.lname;
        user6.password = "password_112284545599300";
        user6.email = "User [name= hi!, id=97, email=hi!, password=hi!]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("admin");
        java.lang.String str4 = superManager0.getUsername();
        superManager0.lastName = "password_112344052445500";
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "password_112338187831000" + "'", str7, "password_112338187831000");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        csvWriter1.setForceQualifier(false);
        csvWriter1.setEscapeMode((int) 'a');
        char char14 = csvWriter1.getTextQualifier();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        boolean boolean6 = false; // flaky: parkingSystem0.isLotEnabled((int) (byte) 100);
        parking.ParkingLot parkingLot9 = parkingSystem0.addLot((-1), "User [name=null null, id=0, email=null, password=null]");
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap10 = parkingSystem0.getLots();
        parking.ParkingSpace parkingSpace13 = null; // flaky: parkingSystem0.getParkingSpace(52, 10);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLot9);
        org.junit.Assert.assertNotNull(intMap10);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace13);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(32, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        int int10 = user6.getId();
        java.lang.String str11 = user6.email;
        java.lang.String str12 = user6.getValidation();
        java.lang.String str13 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        long long4 = csvReader1.getCurrentRecord();
        int int5 = csvReader1.getColumnCount();
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        paymentInfo24.setExpDate(768);
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
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        reservations.Reservation reservation4 = facultyMember2.currentReservation;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(reservation4);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.close();
        csvReader1.setEscapeMode((int) (short) 1);
        csvReader1.close();
        char char12 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.lang.String str37 = superManager0.firstName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "admin" + "'", str2, "admin");
        org.junit.Assert.assertNotNull(reservationSystemFacade7);
        org.junit.Assert.assertNotNull(intMap8);
        org.junit.Assert.assertNotNull(reservationSystemFacade9);
        org.junit.Assert.assertNotNull(parkingSpace19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(superManager26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str27, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(paymentInfo32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str37, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        char char7 = csvReader1.getComment();
        boolean boolean9 = csvReader1.isQualified(2);
        long long10 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        int int15 = user6.getId();
        java.lang.String str16 = user6.password;
        java.lang.String str17 = user6.getPassword();
        user6.setEmail("manager_112351534964500");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) '#', "");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) '4');
        boolean boolean5 = parkingLot2.getEnabled();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parkingSpace7.setId((int) (byte) 10);
        parkingSpace7.setEnabled(true);
        java.util.ArrayList<reservations.Reservation> reservationList12 = parkingSpace7.getReservations();
        parkingState.State state13 = parkingSpace7.getSensorStatus();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(state13);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name= FALSE, id=97, email=, password=]", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        boolean boolean2 = csvReader1.skipLine();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(true);
        csvReader1.setUseComments(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        int int10 = user6.getId();
        java.lang.String str11 = user6.getFName();
        user6.setPassword("admin");
        java.lang.String str14 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        boolean boolean12 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("FALSE", "User [name= FALSE, id=97, email=, password=]", "password_112344052445500");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        java.lang.String str11 = csvReader1.get("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        java.lang.String str12 = csvReader1.getRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.setValid();
        paymentStrategy.PaymentInfo paymentInfo5 = facultyMember2.getPaymentInfo();
        facultyMember2.parkinglot = "FALSE";
        boolean boolean8 = facultyMember2.getIsValid();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(paymentInfo5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider35 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo41 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo41.setBillingName("FALSE");
        paymentInfo41.setCardNum(1);
        paymentInfo41.setExpDate(768);
        paymentInfo41.setBillingName("FALSE");
        boolean boolean51 = mobilePaymentProvider35.handlePayment(paymentInfo41, (double) (short) 10);
        boolean boolean53 = mobilePaymentProvider0.handlePayment(paymentInfo41, 10.0d);
        paymentStrategy.PaymentInfo paymentInfo59 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        int int60 = paymentInfo59.getSecurityCode();
        int int61 = paymentInfo59.getExpDate();
        double double62 = paymentInfo59.getCardBallance();
        boolean boolean64 = mobilePaymentProvider0.handlePayment(paymentInfo59, (double) 'a');
        paymentStrategy.OtherTypeProvider otherTypeProvider65 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context66 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider65);
        paymentStrategy.PaymentInfo paymentInfo72 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo72.setBillingName("FALSE");
        paymentInfo72.setCardNum(1);
        boolean boolean78 = context66.execute(paymentInfo72, (double) 97);
        int int79 = paymentInfo72.getSecurityCode();
        paymentInfo72.setBillingName("password_112344052445500");
        boolean boolean83 = mobilePaymentProvider0.handlePayment(paymentInfo72, (double) ',');
        paymentStrategy.Context context84 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) mobilePaymentProvider0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 97 + "'", int79 == 97);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        int int77 = paymentInfo71.getSecurityCode();
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        users.Visitor visitor2 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        visitor2.setValid();
        java.lang.String str4 = visitor2.parkinglot;
        java.lang.String str5 = visitor2.parkinglot;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setComment('4');
        boolean boolean7 = csvReader1.skipLine();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        csvReader1.setCaptureRawRecord(true);
        java.lang.String str12 = csvReader1.get("password_112284545599300");
        csvReader1.setCaptureRawRecord(false);
        boolean boolean15 = csvReader1.getUseTextQualifier();
        boolean boolean16 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getSafetySwitch();
        int int7 = csvReader1.getHeaderCount();
        boolean boolean8 = csvReader1.getUseComments();
        csvReader1.setCaptureRawRecord(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot4 = parkingSystem0.getLot((int) '\000');
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot(100);
        parking.ParkingLot parkingLot8 = parkingSystem0.getLot(34);
        parking.ParkingLot parkingLot10 = parkingSystem0.getLot(0);
        parking.ParkingLot parkingLot12 = parkingSystem0.getLot(97);
        parking.ParkingLot parkingLot15 = parkingSystem0.addLot(97, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        parkingSystem0.setEnableLot(97, true);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
// flaky:         org.junit.Assert.assertNotNull(parkingLot4);
// flaky:         org.junit.Assert.assertNotNull(parkingLot6);
// flaky:         org.junit.Assert.assertNotNull(parkingLot8);
// flaky:         org.junit.Assert.assertNotNull(parkingLot10);
// flaky:         org.junit.Assert.assertNotNull(parkingLot12);
        org.junit.Assert.assertNotNull(parkingLot15);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentStrategy.Context context11 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide12 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.CreditPaymentProvide creditPaymentProvide13 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider14 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo20 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo20.setBillingName("FALSE");
        boolean boolean24 = otherTypeProvider14.handlePayment(paymentInfo20, (double) (short) 1);
        paymentInfo20.setCardBallance(10.0d);
        double double27 = paymentInfo20.getCardBallance();
        int int28 = paymentInfo20.getCardNum();
        boolean boolean30 = creditPaymentProvide13.handlePayment(paymentInfo20, (double) '4');
        boolean boolean32 = creditPaymentProvide12.handlePayment(paymentInfo20, (double) 1.0f);
        int int33 = paymentInfo20.getExpDate();
        boolean boolean35 = otherTypeProvider0.handlePayment(paymentInfo20, (double) (short) 100);
        paymentStrategy.DebitPaymentProvider debitPaymentProvider36 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo42 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int43 = paymentInfo42.getSecurityCode();
        java.lang.String str44 = paymentInfo42.getBillingAddress();
        java.lang.String str45 = paymentInfo42.getBillingAddress();
        boolean boolean47 = debitPaymentProvider36.handlePayment(paymentInfo42, (double) (-1));
        users.FacultyMember facultyMember50 = new users.FacultyMember("", "hi!");
        int int51 = facultyMember50.parkingspacenum;
        facultyMember50.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade54 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot62 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace64 = parkingLot62.getParkingSpace((int) ' ');
        reservations.Reservation reservation65 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace64);
        reservationSystemFacade54.editBooking(reservation65, (int) (byte) 100);
        facultyMember50.currentReservation = reservation65;
        paymentStrategy.OtherTypeProvider otherTypeProvider69 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo75 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo75.setBillingName("FALSE");
        boolean boolean79 = otherTypeProvider69.handlePayment(paymentInfo75, (double) (short) 1);
        paymentInfo75.setCardBallance(10.0d);
        facultyMember50.setPaymentInfo(paymentInfo75);
        boolean boolean84 = debitPaymentProvider36.handlePayment(paymentInfo75, (double) '4');
        int int85 = paymentInfo75.getExpDate();
        paymentInfo75.setExpDate(8);
        int int88 = paymentInfo75.getSecurityCode();
        boolean boolean90 = otherTypeProvider0.handlePayment(paymentInfo75, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade54);
        org.junit.Assert.assertNotNull(parkingSpace64);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 97 + "'", int88 == 97);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((-30), "password_112336809022100");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "manager_112351534964500", "password_112306347644100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]" + "'", str3, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.toString();
        user6.email = "password_112337353214100";
        user6.setId(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        int int50 = reservation43.getDay();
        parking.ParkingSpace parkingSpace51 = reservation43.getSpace();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str20, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(parkingSpace51);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        csvReader1.setTrimWhitespace(false);
        boolean boolean9 = csvReader1.getUseTextQualifier();
        char char10 = csvReader1.getDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        superManager0.lastName = "User [name= hi!, id=97, email=hi!, password=]";
        manager.Manager manager10 = superManager0.autoGenerator();
        manager.Manager manager11 = superManager0.autoGenerator();
        manager11.lastName = "password_112296757334200";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "admin" + "'", str2, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(manager10);
        org.junit.Assert.assertNotNull(manager11);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        csvWriter1.writeComment("User [name= hi!, id=97, email=hi!, password=hi!]");
        int int4 = csvWriter1.getEscapeMode();
        char char5 = csvWriter1.getRecordDelimiter();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setSafetySwitch(false);
        int int7 = csvReader1.getHeaderCount();
        csvReader1.setDelimiter('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        manager.Manager manager2 = superManager0.autoGenerator();
        superManager0.firstName = "password_112296757334200";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("manager_112351534964500");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("password_112336809022100", '\"', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getColumnCount();
        boolean boolean8 = csvReader1.getUseTextQualifier();
        csvReader1.setSafetySwitch(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        java.lang.String str8 = user6.getLName();
        java.lang.String str9 = user6.getType();
        java.lang.String str10 = user6.getType();
        java.lang.String str11 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str11, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        users.Student student2 = new users.Student("", "hi!");
        boolean boolean3 = student2.getIsValid();
        java.lang.String str4 = student2.parkinglot;
        student2.parkinglot = "password_112310734370300";
        java.lang.String str7 = student2.parkinglot;
        int int8 = student2.parkingspacenum;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "password_112310734370300" + "'", str7, "password_112310734370300");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        char char14 = csvWriter1.getTextQualifier();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '#' + "'", char12 == '#');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("admin");
        java.lang.String str4 = superManager0.getUsername();
        superManager0.lastName = "password_112344052445500";
        superManager0.setUsername("User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "admin" + "'", str1, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parkingLot2.setEnabled(true);
        java.lang.String str5 = parkingLot2.getAddress();
        parkingLot2.setEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            parking.ParkingSpace parkingSpace9 = parkingLot2.getParkingSpace(155);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid space id");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parkingSpace7.setId((int) (byte) 10);
        parkingState.Disabled disabled10 = new parkingState.Disabled();
        parkingSpace7.setState((parkingState.State) disabled10);
        int int12 = parkingSpace7.getId();
        int int13 = parkingSpace7.getId();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        parkingState.Occupied occupied1 = new parkingState.Occupied("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        java.lang.String str2 = occupied1.handleState();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]" + "'", str2, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        user6.email = "";
        int int13 = user6.id;
        user6.type = "User [name= hi!, id=97, email=hi!, password=admin]";
        user6.lname = "";
        java.lang.String str18 = user6.lname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=hi!, password=]", "");
        manager2.lastName = "FALSE";
        manager2.setPassword("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        java.lang.String str7 = manager2.firstName;
        reservations.ReservationSystemFacade reservationSystemFacade8 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot16 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace18 = parkingLot16.getParkingSpace((int) ' ');
        reservations.Reservation reservation19 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace18);
        reservationSystemFacade8.editBooking(reservation19, (int) (byte) 100);
        parking.ParkingLot parkingLot29 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace31 = parkingLot29.getParkingSpace((int) ' ');
        boolean boolean32 = parkingSpace31.isEnabled();
        reservations.Reservation reservation33 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace31);
        manager.SuperManager superManager34 = manager.SuperManager.getInstance();
        superManager34.firstName = "";
        manager.Manager manager37 = superManager34.autoGenerator();
        users.FacultyMember facultyMember40 = new users.FacultyMember("", "hi!");
        int int41 = facultyMember40.parkingspacenum;
        facultyMember40.parkinglot = "hi!";
        facultyMember40.setValid();
        boolean boolean45 = manager37.validateUser((users.UserInfo) facultyMember40);
        reservations.Reservation reservation46 = facultyMember40.currentReservation;
        int int47 = reservationSystemFacade8.calculateOutstanding(reservation33, (users.UserInfo) facultyMember40);
        reservations.ReservationSystemFacade reservationSystemFacade48 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot56 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace58 = parkingLot56.getParkingSpace((int) ' ');
        reservations.Reservation reservation59 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace58);
        reservationSystemFacade48.editBooking(reservation59, (int) (byte) 100);
        manager.SuperManager superManager62 = manager.SuperManager.getInstance();
        java.lang.String str63 = superManager62.firstName;
        java.lang.String str64 = superManager62.getUsername();
        superManager62.lastName = "hi!";
        superManager62.lastName = "FALSE";
        users.FacultyMember facultyMember71 = new users.FacultyMember("", "hi!");
        int int72 = facultyMember71.parkingspacenum;
        facultyMember71.parkinglot = "hi!";
        facultyMember71.setValid();
        boolean boolean76 = superManager62.validateUser((users.UserInfo) facultyMember71);
        boolean boolean77 = facultyMember71.getIsValid();
        reservationSystemFacade8.cancelBooking(reservation59, (users.UserInfo) facultyMember71);
        boolean boolean79 = manager2.validateUser((users.UserInfo) facultyMember71);
        manager2.setUsername("password_112343396437900");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertNotNull(parkingSpace31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(superManager34);
        org.junit.Assert.assertNotNull(manager37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(reservation46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 768 + "'", int47 == 768);
        org.junit.Assert.assertNotNull(reservationSystemFacade48);
        org.junit.Assert.assertNotNull(parkingSpace58);
        org.junit.Assert.assertNotNull(superManager62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "User [name= FALSE, id=97, email=hi!, password=hi!]" + "'", str64, "User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        char char9 = csvWriter1.getDelimiter();
        com.csvreader.CsvReader csvReader11 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean12 = csvReader11.readRecord();
        csvReader11.setSafetySwitch(true);
        boolean boolean15 = csvReader11.skipLine();
        java.lang.String[] strArray21 = new java.lang.String[] { "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "password_112284545599300", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "FALSE" };
        csvReader11.setHeaders(strArray21);
        java.lang.String[] strArray23 = csvReader11.getValues();
        csvWriter1.writeRecord(strArray23, true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertNotNull(csvReader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        manager.Manager manager2 = new manager.Manager("", "");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        userLogin.MaintainUser maintainUser4 = new userLogin.MaintainUser();
        maintainUser4.update("admin");
        java.util.ArrayList<userLogin.User> userList7 = maintainUser4.users;
        maintainUser0.users = userList7;
        maintainUser0.load("admin");
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        user6.email = "";
        user6.lname = "password_112325847983500";
        java.lang.String str15 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        java.lang.String str9 = user6.password;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(52, (int) ' ', "password_112337353214100", "password_112351534974900", (int) ',');
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        paymentStrategy.PaymentInfo paymentInfo43 = facultyMember41.getPaymentInfo();
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
        org.junit.Assert.assertNull(paymentInfo43);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setDelimiter('\"');
        boolean boolean7 = csvReader1.getCaptureRawRecord();
        boolean boolean8 = csvReader1.getUseComments();
        boolean boolean9 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        facultyMember2.setValid();
        java.lang.String str7 = facultyMember2.getPassword();
        int int8 = facultyMember2.parkingspacenum;
        reservations.Reservation reservation9 = facultyMember2.currentReservation;
        int int10 = facultyMember2.parkingspacenum;
        int int11 = facultyMember2.getParkingRate();
        int int12 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(reservation9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setComment('4');
        boolean boolean7 = csvReader1.skipLine();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        csvReader1.setCaptureRawRecord(true);
        java.lang.String str12 = csvReader1.get("password_112284545599300");
        int int14 = csvReader1.getIndex("manager_112327586653400");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("admin");
        manager.Manager manager4 = superManager0.autoGenerator();
        manager4.lastName = "User [name= hi!, id=97, email=hi!, password=admin]";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= FALSE, id=97, email=hi!, password=hi!]" + "'", str1, "User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = manager3.getPassword();
        manager3.lastName = "User [name= hi!, id=97, email=hi!, password=admin]";
        manager3.setUsername("User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112358838017900" + "'", str4, "password_112358838017900");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        int int3 = parkingLot2.getId();
        parkingLot2.setEnabled(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        csvWriter1.setForceQualifier(true);
        int int12 = csvWriter1.getEscapeMode();
        csvWriter1.setTextQualifier('4');
        csvWriter1.setEscapeMode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        paymentInfo6.setCardNum(1);
        paymentInfo6.setExpDate(768);
        paymentInfo6.setBillingName("FALSE");
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (short) 10);
        paymentStrategy.Context context17 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) mobilePaymentProvider0);
        paymentStrategy.DebitPaymentProvider debitPaymentProvider18 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo24 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int25 = paymentInfo24.getSecurityCode();
        java.lang.String str26 = paymentInfo24.getBillingAddress();
        java.lang.String str27 = paymentInfo24.getBillingAddress();
        boolean boolean29 = debitPaymentProvider18.handlePayment(paymentInfo24, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo35 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int36 = paymentInfo35.getSecurityCode();
        java.lang.String str37 = paymentInfo35.getBillingAddress();
        java.util.Date date39 = null;
        paymentInfo35.parkingInfo(0, date39, "hi!", "hi!", (int) (short) 1);
        boolean boolean45 = debitPaymentProvider18.handlePayment(paymentInfo35, (double) (short) -1);
        paymentInfo35.setBillingName("Password!23");
        boolean boolean49 = mobilePaymentProvider0.handlePayment(paymentInfo35, (double) (byte) 1);
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider50 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo56 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int57 = paymentInfo56.getSecurityCode();
        java.lang.String str58 = paymentInfo56.getBillingAddress();
        java.util.Date date60 = null;
        paymentInfo56.parkingInfo(0, date60, "hi!", "hi!", (int) (short) 1);
        boolean boolean66 = mobilePaymentProvider50.handlePayment(paymentInfo56, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo72 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int73 = paymentInfo72.getSecurityCode();
        java.lang.String str74 = paymentInfo72.getBillingAddress();
        java.lang.String str75 = paymentInfo72.getBillingAddress();
        int int76 = paymentInfo72.getCardNum();
        int int77 = paymentInfo72.getExpDate();
        boolean boolean79 = mobilePaymentProvider50.handlePayment(paymentInfo72, (double) 100.0f);
        int int80 = paymentInfo72.getSecurityCode();
        boolean boolean82 = mobilePaymentProvider0.handlePayment(paymentInfo72, (double) 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 97 + "'", int80 == 97);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("", "hi!");
        boolean boolean3 = nonFacultyStaff2.getIsValid();
        paymentStrategy.OtherTypeProvider otherTypeProvider4 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo10 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo10.setBillingName("FALSE");
        boolean boolean14 = otherTypeProvider4.handlePayment(paymentInfo10, (double) (short) 1);
        paymentInfo10.setCardBallance(10.0d);
        double double17 = paymentInfo10.getCardBallance();
        paymentInfo10.setExpDate((int) 'a');
        paymentInfo10.setBillingName("User [name= FALSE, id=97, email=hi!, password=hi!]");
        nonFacultyStaff2.setPaymentInfo(paymentInfo10);
        int int23 = nonFacultyStaff2.getParkingRate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getComment();
        java.lang.String str5 = csvReader1.getHeader((int) (short) 1);
        csvReader1.setComment('a');
        csvReader1.setRecordDelimiter('a');
        csvReader1.setUseComments(true);
        java.lang.String[] strArray12 = csvReader1.getValues();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        boolean boolean8 = csvReader1.isQualified(2);
        boolean boolean10 = csvReader1.isQualified(97);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        user6.setEmail("admin");
        user6.setType("admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.getLName();
        java.lang.String str14 = user6.getPassword();
        java.lang.String str15 = user6.lname;
        java.lang.String str16 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str15, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        csvWriter1.setTextQualifier('a');
        com.csvreader.CsvReader csvReader11 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean12 = csvReader11.readRecord();
        csvReader11.setSafetySwitch(true);
        csvReader11.setTrimWhitespace(false);
        boolean boolean17 = csvReader11.skipRecord();
        boolean boolean18 = csvReader11.getTrimWhitespace();
        java.lang.String str19 = csvReader11.getRawRecord();
        boolean boolean20 = csvReader11.getCaptureRawRecord();
        boolean boolean21 = csvReader11.getUseTextQualifier();
        csvReader11.setTextQualifier('4');
        com.csvreader.CsvWriter csvWriter25 = new com.csvreader.CsvWriter("");
        csvWriter25.setRecordDelimiter('\"');
        csvWriter25.setTextQualifier('\"');
        char char30 = csvWriter25.getComment();
        boolean boolean31 = csvWriter25.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter33 = new com.csvreader.CsvWriter("");
        csvWriter33.setRecordDelimiter('\"');
        boolean boolean36 = csvWriter33.getUseTextQualifier();
        com.csvreader.CsvReader csvReader38 = com.csvreader.CsvReader.parse("hi!");
        char char39 = csvReader38.getComment();
        char char40 = csvReader38.getTextQualifier();
        java.lang.String[] strArray41 = csvReader38.getHeaders();
        java.lang.String[] strArray42 = csvReader38.getValues();
        csvWriter33.writeRecord(strArray42);
        csvWriter25.writeRecord(strArray42);
        csvReader11.setHeaders(strArray42);
        csvWriter1.writeRecord(strArray42);
        csvWriter1.setUseTextQualifier(true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(csvReader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '#' + "'", char30 == '#');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(csvReader38);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '#' + "'", char39 == '#');
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\"' + "'", char40 == '\"');
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        java.lang.String str11 = user6.getValidation();
        user6.type = "FALSE";
        java.lang.String str14 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        parkingState.Occupied occupied1 = new parkingState.Occupied("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        java.lang.String str2 = occupied1.handleState();
        java.lang.String str3 = occupied1.handleState();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str2, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str3, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        int int9 = csvReader1.getColumnCount();
        java.lang.String str10 = csvReader1.getRawRecord();
        java.lang.String[] strArray11 = csvReader1.getHeaders();
        long long12 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        manager.Manager manager2 = new manager.Manager("hi!", "hi!");
        manager2.setPassword("");
        manager2.firstName = "password_112354709083600";
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        java.lang.String[] strArray13 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setEscapeMode(1);
        csvWriter1.close();
        char char11 = csvWriter1.getDelimiter();
        csvWriter1.setDelimiter('#');
        com.csvreader.CsvWriter csvWriter15 = new com.csvreader.CsvWriter("");
        csvWriter15.setRecordDelimiter('\"');
        csvWriter15.setTextQualifier('\"');
        char char20 = csvWriter15.getComment();
        csvWriter15.setUseTextQualifier(true);
        char char23 = csvWriter15.getDelimiter();
        char char24 = csvWriter15.getComment();
        char char25 = csvWriter15.getRecordDelimiter();
        com.csvreader.CsvReader csvReader27 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean28 = csvReader27.readRecord();
        csvReader27.setSafetySwitch(true);
        boolean boolean31 = csvReader27.skipLine();
        java.lang.String[] strArray37 = new java.lang.String[] { "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "password_112284545599300", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "FALSE" };
        csvReader27.setHeaders(strArray37);
        java.lang.String[] strArray39 = csvReader27.getValues();
        csvWriter15.writeRecord(strArray39, true);
        csvWriter1.writeRecord(strArray39);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + ',' + "'", char23 == ',');
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '#' + "'", char24 == '#');
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\"' + "'", char25 == '\"');
        org.junit.Assert.assertNotNull(csvReader27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        manager.Manager manager1 = superManager0.autoGenerator();
        manager1.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str4 = manager1.firstName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        java.lang.String str5 = csvReader1.get(100);
        csvReader1.setSkipEmptyRecords(false);
        csvReader1.setUseComments(false);
        boolean boolean10 = csvReader1.readHeaders();
        csvReader1.setUseComments(true);
        boolean boolean13 = csvReader1.getSkipEmptyRecords();
        boolean boolean14 = csvReader1.getCaptureRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str10 = csvReader1.get((int) ' ');
        csvReader1.setSafetySwitch(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        users.Visitor visitor2 = new users.Visitor("password_112325847983500", "password_112296757334200");
        paymentStrategy.PaymentInfo paymentInfo3 = visitor2.getPaymentInfo();
        org.junit.Assert.assertNull(paymentInfo3);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        userLogin.User user6 = new userLogin.User("password_112343396437900", "User [name= FALSE, id=1, email=hi!, password=hi!]", (int) (short) 0, "password_112336809022100", "Password!23", "User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setId(0);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        boolean boolean5 = csvReader1.skipLine();
        char char6 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getForceQualifier();
        csvWriter1.setDelimiter('#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        users.Student student2 = new users.Student("password_112310734370300", "hi!");
        int int3 = student2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        java.lang.String str15 = user6.email;
        int int16 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("password_112351534974900", '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        int int22 = reservation17.getDuration();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getComment();
        java.lang.String str5 = csvReader1.getHeader((int) (short) 1);
        csvReader1.setComment('a');
        csvReader1.setRecordDelimiter('a');
        java.lang.String str11 = csvReader1.getHeader((int) '4');
        csvReader1.setUseTextQualifier(false);
        boolean boolean14 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.toString();
        java.lang.String str12 = user6.getLName();
        user6.setPassword("Password!23");
        java.lang.String str15 = user6.fname;
        user6.email = "manager_112354709081500";
        java.lang.String str18 = user6.lname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str11, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str18, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getEscapeMode();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        java.lang.String str7 = facultyMember2.getPassword();
        java.lang.String str8 = facultyMember2.parkinglot;
        int int9 = facultyMember2.getParkingRate();
        users.Visitor visitor12 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        reservations.ReservationSystemFacade reservationSystemFacade13 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap14 = reservationSystemFacade13.getLots();
        users.FacultyMember facultyMember17 = new users.FacultyMember("", "hi!");
        int int18 = facultyMember17.parkingspacenum;
        facultyMember17.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade21 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot29 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace31 = parkingLot29.getParkingSpace((int) ' ');
        reservations.Reservation reservation32 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace31);
        reservationSystemFacade21.editBooking(reservation32, (int) (byte) 100);
        facultyMember17.currentReservation = reservation32;
        int int36 = reservation32.getMonth();
        reservationSystemFacade13.editBooking(reservation32, (int) (byte) 100);
        parking.ParkingLot parkingLot46 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace48 = parkingLot46.getParkingSpace((int) ' ');
        reservations.Reservation reservation49 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace48);
        int int50 = reservation49.getDay();
        parking.ParkingSpace parkingSpace51 = reservation49.getSpace();
        users.FacultyMember facultyMember54 = new users.FacultyMember("", "hi!");
        int int55 = reservationSystemFacade13.calculateOutstanding(reservation49, (users.UserInfo) facultyMember54);
        int int56 = reservation49.getDay();
        visitor12.currentReservation = reservation49;
        int int58 = reservation49.getDuration();
        int int59 = reservation49.getDuration();
        facultyMember2.currentReservation = reservation49;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(reservationSystemFacade13);
        org.junit.Assert.assertNotNull(intMap14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade21);
        org.junit.Assert.assertNotNull(parkingSpace31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(parkingSpace48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(parkingSpace51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        reservations.Reservation reservation43 = null;
        student37.currentReservation = reservation43;
        java.lang.String str45 = student37.parkinglot;
        student37.setValid();
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
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        csvReader1.setTrimWhitespace(false);
        csvReader1.setUseComments(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("", "hi!", "FALSE");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("password_112284545599300", "", "User [name= hi!, id=97, email=hi!, password=]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("Password!23", "manager_112327586653400", "User [name= FALSE, id=97, email=, password=]");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        reservations.Reservation reservation16 = facultyMember9.currentReservation;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "admin" + "'", str2, "admin");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(reservation16);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setRecordDelimiter('a');
        csvReader1.setDelimiter('\000');
        char char11 = csvReader1.getRecordDelimiter();
        boolean boolean12 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'a' + "'", char11 == 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        char char5 = csvWriter1.getDelimiter();
        csvWriter1.setDelimiter(',');
        csvWriter1.setRecordDelimiter(' ');
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        parkingState.Occupied occupied13 = new parkingState.Occupied("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String str14 = occupied13.handleState();
        parkingSpace9.setState((parkingState.State) occupied13);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]" + "'", str14, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        student72.parkinglot = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]";
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
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(paymentInfo74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        boolean boolean6 = false; // flaky: parkingSystem0.isLotEnabled((int) (byte) 100);
        parking.ParkingLot parkingLot8 = parkingSystem0.getLot(34);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertNotNull(parkingLot8);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot((-30), "password_112325847983500");
        boolean boolean8 = false; // flaky: parkingSystem0.isLotEnabled((-1));
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertNotNull(parkingLot6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        java.lang.String str20 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getDelimiter();
        csvReader1.setComment('\"');
        boolean boolean5 = csvReader1.getCaptureRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ',' + "'", char2 == ',');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
            csvReader1.setEscapeMode(0);
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
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("password_112354709083600", ',');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112354709083600 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) (byte) 100, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) (short) 1);
        parkingLot2.setEnabled(true);
        boolean boolean7 = parkingLot2.getEnabled();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        int int47 = reservation39.getMonth();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.getSafetySwitch();
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        reservationSystemFacade0.editBooking(reservation11, (int) (byte) 100);
        parking.ParkingLot parkingLot21 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace23 = parkingLot21.getParkingSpace((int) ' ');
        boolean boolean24 = parkingSpace23.isEnabled();
        reservations.Reservation reservation25 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace23);
        manager.SuperManager superManager26 = manager.SuperManager.getInstance();
        superManager26.firstName = "";
        manager.Manager manager29 = superManager26.autoGenerator();
        users.FacultyMember facultyMember32 = new users.FacultyMember("", "hi!");
        int int33 = facultyMember32.parkingspacenum;
        facultyMember32.parkinglot = "hi!";
        facultyMember32.setValid();
        boolean boolean37 = manager29.validateUser((users.UserInfo) facultyMember32);
        reservations.Reservation reservation38 = facultyMember32.currentReservation;
        int int39 = reservationSystemFacade0.calculateOutstanding(reservation25, (users.UserInfo) facultyMember32);
        reservations.ReservationSystemFacade reservationSystemFacade40 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot48 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace50 = parkingLot48.getParkingSpace((int) ' ');
        reservations.Reservation reservation51 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace50);
        reservationSystemFacade40.editBooking(reservation51, (int) (byte) 100);
        manager.SuperManager superManager54 = manager.SuperManager.getInstance();
        java.lang.String str55 = superManager54.firstName;
        java.lang.String str56 = superManager54.getUsername();
        superManager54.lastName = "hi!";
        superManager54.lastName = "FALSE";
        users.FacultyMember facultyMember63 = new users.FacultyMember("", "hi!");
        int int64 = facultyMember63.parkingspacenum;
        facultyMember63.parkinglot = "hi!";
        facultyMember63.setValid();
        boolean boolean68 = superManager54.validateUser((users.UserInfo) facultyMember63);
        boolean boolean69 = facultyMember63.getIsValid();
        reservationSystemFacade0.cancelBooking(reservation51, (users.UserInfo) facultyMember63);
        paymentStrategy.PaymentInfo paymentInfo71 = facultyMember63.getPaymentInfo();
        paymentStrategy.PaymentInfo paymentInfo72 = facultyMember63.getPaymentInfo();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(superManager26);
        org.junit.Assert.assertNotNull(manager29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(reservation38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 768 + "'", int39 == 768);
        org.junit.Assert.assertNotNull(reservationSystemFacade40);
        org.junit.Assert.assertNotNull(parkingSpace50);
        org.junit.Assert.assertNotNull(superManager54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "admin" + "'", str56, "admin");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(paymentInfo71);
        org.junit.Assert.assertNull(paymentInfo72);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        boolean boolean31 = parkingSpace30.isEnabled();
        parkingSpace30.setEnabled(true);
        reservations.Reservation reservation34 = new reservations.Reservation(100, 2, (int) (short) 10, (int) ' ', "User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", parkingSpace30);
        org.junit.Assert.assertNotNull(reservationSystemFacade5);
        org.junit.Assert.assertNotNull(intMap6);
        org.junit.Assert.assertNotNull(reservationSystemFacade7);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(parkingSpace30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        reservation13.updateDuration(15);
        int int28 = reservation13.getStartTime();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        boolean boolean5 = false; // flaky: parkingSystem0.isLotEnabled(0);
        parking.ParkingSpace parkingSpace8 = null; // flaky: parkingSystem0.getParkingSpace(0, 0);
// flaky:         parkingSpace8.setEnabled(true);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace8);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        userLogin.User user6 = new userLogin.User("", "admin", 32, "hi!", "password_112284545599300", "User [name= hi!, id=97, email=hi!, password=admin]");
        user6.lname = "hi!";
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        java.lang.String str11 = user6.toString();
        java.lang.String str12 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str11, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(',');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = manager3.getPassword();
        users.FacultyMember facultyMember7 = new users.FacultyMember("admin", "FALSE");
        paymentStrategy.PaymentInfo paymentInfo8 = facultyMember7.getPaymentInfo();
        boolean boolean9 = manager3.validateUser((users.UserInfo) facultyMember7);
        users.NonFacultyStaff nonFacultyStaff12 = new users.NonFacultyStaff("", "hi!");
        boolean boolean13 = manager3.validateUser((users.UserInfo) nonFacultyStaff12);
        manager3.setUsername("password_112325847983500");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112359916102100" + "'", str4, "password_112359916102100");
        org.junit.Assert.assertNull(paymentInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        paymentStrategy.OtherTypeProvider otherTypeProvider6 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context7 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider6);
        paymentStrategy.PaymentInfo paymentInfo13 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int14 = paymentInfo13.getSecurityCode();
        java.lang.String str15 = paymentInfo13.getBillingAddress();
        java.util.Date date17 = null;
        paymentInfo13.parkingInfo(0, date17, "hi!", "hi!", (int) (short) 1);
        boolean boolean23 = otherTypeProvider6.handlePayment(paymentInfo13, (double) 0);
        facultyMember2.setPaymentInfo(paymentInfo13);
        int int25 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        boolean boolean5 = csvReader1.skipRecord();
        csvReader1.setSkipEmptyRecords(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        reservation27.updateDuration(97);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getValidation();
        user6.password = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str15 = user6.email;
        java.lang.String str16 = user6.fname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        reservation11.updateDuration(1);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getRecordDelimiter();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= FALSE, id=1, email=hi!, password=hi!]", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap68 = reservationSystemFacade0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap69 = reservationSystemFacade0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap70 = reservationSystemFacade0.getLots();
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
        org.junit.Assert.assertNotNull(intMap68);
        org.junit.Assert.assertNotNull(intMap69);
        org.junit.Assert.assertNotNull(intMap70);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.getLName();
        user6.lname = "FALSE";
        user6.type = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        java.lang.String str3 = parkingLot2.getAddress();
        java.lang.String str4 = parkingLot2.getAddress();
        int int5 = parkingLot2.getId();
        parkingLot2.setEnabled(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot((int) '\"');
// flaky:         parkingSystem0.setEnableLot((-1), true);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
// flaky:         org.junit.Assert.assertNotNull(parkingLot6);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        paymentInfo7.setCardNum(1);
        boolean boolean13 = context1.execute(paymentInfo7, (double) 97);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide14 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider15 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo21 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo21.setBillingName("FALSE");
        boolean boolean25 = otherTypeProvider15.handlePayment(paymentInfo21, (double) (short) 1);
        boolean boolean27 = creditPaymentProvide14.handlePayment(paymentInfo21, (double) (short) 0);
        paymentInfo21.setBillingName("password_112284545599300");
        boolean boolean31 = context1.execute(paymentInfo21, (double) 100L);
        manager.SuperManager superManager32 = manager.SuperManager.getInstance();
        superManager32.firstName = "";
        manager.Manager manager35 = superManager32.autoGenerator();
        users.FacultyMember facultyMember38 = new users.FacultyMember("", "hi!");
        int int39 = facultyMember38.parkingspacenum;
        facultyMember38.parkinglot = "hi!";
        facultyMember38.setValid();
        boolean boolean43 = manager35.validateUser((users.UserInfo) facultyMember38);
        java.lang.String str44 = facultyMember38.getPassword();
        paymentStrategy.OtherTypeProvider otherTypeProvider45 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context46 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider45);
        paymentStrategy.PaymentInfo paymentInfo52 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int53 = paymentInfo52.getSecurityCode();
        java.lang.String str54 = paymentInfo52.getBillingAddress();
        java.util.Date date56 = null;
        paymentInfo52.parkingInfo(0, date56, "hi!", "hi!", (int) (short) 1);
        boolean boolean62 = otherTypeProvider45.handlePayment(paymentInfo52, (double) 0);
        facultyMember38.setPaymentInfo(paymentInfo52);
        boolean boolean65 = context1.execute(paymentInfo52, (double) 32);
        paymentStrategy.PaymentInfo paymentInfo71 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int72 = paymentInfo71.getSecurityCode();
        boolean boolean74 = context1.execute(paymentInfo71, (double) 35);
        paymentInfo71.setCardBallance((double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(superManager32);
        org.junit.Assert.assertNotNull(manager35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        users.Student student2 = new users.Student("User [name= FALSE, id=97, email=hi!, password=hi!]", "password_112336809022100");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        char char10 = csvWriter1.getComment();
        com.csvreader.CsvReader csvReader12 = com.csvreader.CsvReader.parse("hi!");
        char char13 = csvReader12.getComment();
        char char14 = csvReader12.getTextQualifier();
        java.lang.String[] strArray15 = csvReader12.getHeaders();
        java.lang.String[] strArray16 = csvReader12.getValues();
        csvWriter1.writeRecord(strArray16, false);
        char char19 = csvWriter1.getComment();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertNotNull(csvReader12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '#' + "'", char13 == '#');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '#' + "'", char19 == '#');
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        csvWriter1.setTextQualifier('#');
        csvWriter1.setComment(' ');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("manager_112327586653400");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        boolean boolean3 = facultyMember2.getIsValid();
        boolean boolean4 = facultyMember2.getIsValid();
        reservations.Reservation reservation5 = facultyMember2.currentReservation;
        int int6 = facultyMember2.getParkingRate();
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
        parking.ParkingLot parkingLot68 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace70 = parkingLot68.getParkingSpace((int) ' ');
        boolean boolean71 = parkingLot68.getEnabled();
        parking.ParkingSpace parkingSpace73 = parkingLot68.getParkingSpace(1);
        reservations.Reservation reservation74 = new reservations.Reservation((int) '4', 15, (int) '\"', (int) (byte) 100, "admin", parkingSpace73);
        reservationSystemFacade7.editBooking(reservation74, 34);
        int int77 = reservation74.getDuration();
        facultyMember2.currentReservation = reservation74;
        reservation74.updateDuration(2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(reservationSystemFacade7);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(parkingSpace44);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(reservation60);
        org.junit.Assert.assertNotNull(parkingSpace70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(parkingSpace73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 34 + "'", int77 == 34);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        char char8 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '#' + "'", char8 == '#');
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        parking.ParkingSpace parkingSpace51 = reservation42.getSpace();
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
        org.junit.Assert.assertNotNull(parkingSpace51);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        parkingState.Unoccupied unoccupied16 = new parkingState.Unoccupied();
        java.lang.String str17 = unoccupied16.handleState();
        java.lang.String str18 = unoccupied16.handleState();
        java.lang.String str19 = unoccupied16.handleState();
        parkingSpace14.setState((parkingState.State) unoccupied16);
        reservations.Reservation reservation21 = new reservations.Reservation((int) (byte) 100, 52, (int) (short) 0, 35, "User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]", parkingSpace14);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        maintainUser0.path = "";
        userLogin.MaintainUser maintainUser15 = new userLogin.MaintainUser();
        maintainUser15.update("admin");
        java.util.ArrayList<userLogin.User> userList18 = maintainUser15.users;
        userLogin.MaintainUser maintainUser19 = new userLogin.MaintainUser();
        maintainUser19.update("admin");
        java.util.ArrayList<userLogin.User> userList22 = maintainUser19.users;
        maintainUser15.users = userList22;
        maintainUser15.load("admin");
        userLogin.MaintainUser maintainUser26 = new userLogin.MaintainUser();
        java.lang.String str27 = maintainUser26.path;
        userLogin.MaintainUser maintainUser28 = new userLogin.MaintainUser();
        maintainUser28.update("admin");
        java.util.ArrayList<userLogin.User> userList31 = maintainUser28.users;
        maintainUser26.users = userList31;
        maintainUser26.path = "User [name= hi!, id=97, email=hi!, password=]";
        java.util.ArrayList<userLogin.User> userList35 = maintainUser26.users;
        maintainUser15.users = userList35;
        maintainUser0.users = userList35;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        paymentInfo7.setCardNum(1);
        boolean boolean13 = context1.execute(paymentInfo7, (double) 97);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide14 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider15 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo21 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo21.setBillingName("FALSE");
        boolean boolean25 = otherTypeProvider15.handlePayment(paymentInfo21, (double) (short) 1);
        boolean boolean27 = creditPaymentProvide14.handlePayment(paymentInfo21, (double) (short) 0);
        paymentInfo21.setBillingName("password_112284545599300");
        boolean boolean31 = context1.execute(paymentInfo21, (double) 100L);
        paymentStrategy.DebitPaymentProvider debitPaymentProvider32 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context33 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider32);
        paymentStrategy.PaymentInfo paymentInfo39 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo39.setBillingName("FALSE");
        paymentInfo39.setCardNum(1);
        paymentInfo39.setExpDate(768);
        boolean boolean47 = debitPaymentProvider32.handlePayment(paymentInfo39, (double) (byte) 1);
        paymentStrategy.PaymentInfo paymentInfo53 = new paymentStrategy.PaymentInfo((int) (short) 0, 100, "", "password_112306347644100", 35);
        paymentInfo53.setBillingAddress("password_112338187831000");
        boolean boolean57 = debitPaymentProvider32.handlePayment(paymentInfo53, (-1.0d));
        boolean boolean59 = context1.execute(paymentInfo53, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = csvReader1.getHeaders();
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        userLogin.User user6 = new userLogin.User("User [name=null null, id=0, email=null, password=null]", "manager_112327586653400", 8, "", "password_112284545599300", "User [name= FALSE, id=97, email=, password=]");
        int int7 = user6.id;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        reservationSystemFacade0.editBooking(reservation11, (int) (byte) 100);
        reservations.ReservationSystemFacade reservationSystemFacade14 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap15 = reservationSystemFacade14.getLots();
        users.FacultyMember facultyMember18 = new users.FacultyMember("", "hi!");
        int int19 = facultyMember18.parkingspacenum;
        facultyMember18.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade22 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot30 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace32 = parkingLot30.getParkingSpace((int) ' ');
        reservations.Reservation reservation33 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace32);
        reservationSystemFacade22.editBooking(reservation33, (int) (byte) 100);
        facultyMember18.currentReservation = reservation33;
        int int37 = reservation33.getMonth();
        reservationSystemFacade14.editBooking(reservation33, (int) (byte) 100);
        parking.ParkingLot parkingLot47 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace49 = parkingLot47.getParkingSpace((int) ' ');
        reservations.Reservation reservation50 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace49);
        int int51 = reservation50.getDay();
        parking.ParkingSpace parkingSpace52 = reservation50.getSpace();
        users.FacultyMember facultyMember55 = new users.FacultyMember("", "hi!");
        int int56 = reservationSystemFacade14.calculateOutstanding(reservation50, (users.UserInfo) facultyMember55);
        reservation50.updateDuration((int) '#');
        manager.SuperManager superManager59 = manager.SuperManager.getInstance();
        java.lang.String str60 = superManager59.firstName;
        java.lang.String str61 = superManager59.getUsername();
        superManager59.lastName = "hi!";
        superManager59.lastName = "FALSE";
        users.FacultyMember facultyMember68 = new users.FacultyMember("", "hi!");
        int int69 = facultyMember68.parkingspacenum;
        facultyMember68.parkinglot = "hi!";
        facultyMember68.setValid();
        boolean boolean73 = superManager59.validateUser((users.UserInfo) facultyMember68);
        paymentStrategy.PaymentInfo paymentInfo74 = facultyMember68.getPaymentInfo();
        java.lang.String str75 = facultyMember68.parkinglot;
        int int76 = reservationSystemFacade0.calculateOutstanding(reservation50, (users.UserInfo) facultyMember68);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap77 = reservationSystemFacade0.getLots();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNotNull(reservationSystemFacade14);
        org.junit.Assert.assertNotNull(intMap15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade22);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(parkingSpace49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(superManager59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "admin" + "'", str61, "admin");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(paymentInfo74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 272 + "'", int76 == 272);
        org.junit.Assert.assertNotNull(intMap77);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        char char10 = csvWriter1.getComment();
        com.csvreader.CsvReader csvReader12 = com.csvreader.CsvReader.parse("hi!");
        char char13 = csvReader12.getComment();
        char char14 = csvReader12.getTextQualifier();
        java.lang.String[] strArray15 = csvReader12.getHeaders();
        java.lang.String[] strArray16 = csvReader12.getValues();
        csvWriter1.writeRecord(strArray16, false);
        char char19 = csvWriter1.getRecordDelimiter();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertNotNull(csvReader12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '#' + "'", char13 == '#');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\"' + "'", char19 == '\"');
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        java.lang.String str21 = paymentInfo8.getBillingAddress();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        user6.email = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        java.lang.String str15 = user6.type;
        user6.setEmail("Password!23");
        int int18 = user6.getId();
        user6.setName("", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        java.lang.String str7 = user6.getType();
        user6.setPassword("");
        java.lang.String str10 = user6.type;
        java.lang.String str11 = user6.lname;
        user6.setId((-30));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FALSE" + "'", str10, "FALSE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str11, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        parkingState.Disabled disabled0 = new parkingState.Disabled();
        java.lang.String str1 = disabled0.handleState();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("manager_112351534964500", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "manager_112351534964500" + "'", str3, "manager_112351534964500");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=hi!]");
        csvReader1.setTextQualifier('a');
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("", "hi!", "FALSE");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("password_112284545599300", "", "User [name= hi!, id=97, email=hi!, password=]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("password_112344052445500", "", "password_112310734370300");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot4 = parkingSystem0.getLot((int) '\000');
        parking.ParkingSpace parkingSpace7 = null; // flaky: parkingSystem0.getParkingSpace((int) ',', (int) '\000');
        parking.ParkingLot parkingLot15 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace17 = parkingLot15.getParkingSpace((int) ' ');
        reservations.Reservation reservation18 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace17);
        int int19 = reservation18.getDay();
        parking.ParkingSpace parkingSpace20 = reservation18.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList21 = parkingSpace20.getReservations();
        parkingSpace20.setId(0);
        users.FacultyMember facultyMember26 = new users.FacultyMember("", "hi!");
        int int27 = facultyMember26.parkingspacenum;
        facultyMember26.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade30 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot38 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace40 = parkingLot38.getParkingSpace((int) ' ');
        reservations.Reservation reservation41 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace40);
        reservationSystemFacade30.editBooking(reservation41, (int) (byte) 100);
        facultyMember26.currentReservation = reservation41;
        int int45 = reservation41.getMonth();
        parkingSpace20.setReservation(reservation41);
        int int47 = reservation41.getDuration();
// flaky:         parkingSpace7.setReservation(reservation41);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
// flaky:         org.junit.Assert.assertNotNull(parkingLot4);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade30);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        paymentInfo5.setCardBallance((double) 97);
        paymentInfo5.setExpDate(0);
        int int13 = paymentInfo5.getSecurityCode();
        paymentInfo5.setExpDate(97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str8, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        int int9 = csvWriter1.getEscapeMode();
        int int10 = csvWriter1.getEscapeMode();
        csvWriter1.setTextQualifier('#');
        char char13 = csvWriter1.getDelimiter();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + ',' + "'", char13 == ',');
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setBillingName("FALSE");
        paymentInfo5.setCardNum(1);
        java.lang.String str10 = paymentInfo5.getBillingName();
        java.lang.String str11 = paymentInfo5.getBillingAddress();
        paymentInfo5.setSecurityCode((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FALSE" + "'", str10, "FALSE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider1 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        boolean boolean11 = otherTypeProvider1.handlePayment(paymentInfo7, (double) (short) 1);
        boolean boolean13 = creditPaymentProvide0.handlePayment(paymentInfo7, (double) (short) 0);
        paymentStrategy.Context context14 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) creditPaymentProvide0);
        paymentStrategy.OtherTypeProvider otherTypeProvider15 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo21 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo21.setBillingName("FALSE");
        boolean boolean25 = otherTypeProvider15.handlePayment(paymentInfo21, (double) (short) 1);
        paymentInfo21.setCardBallance(10.0d);
        double double28 = paymentInfo21.getCardBallance();
        paymentInfo21.setExpDate((int) 'a');
        paymentInfo21.setCardBallance((double) (-1L));
        boolean boolean34 = creditPaymentProvide0.handlePayment(paymentInfo21, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        boolean boolean5 = false; // flaky: parkingSystem0.isLotEnabled((int) (byte) 100);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap6 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap7 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intMap6);
        org.junit.Assert.assertNotNull(intMap7);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setSafetySwitch(false);
        int int7 = csvReader1.getHeaderCount();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(264);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        java.lang.String str11 = csvReader1.get(2);
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=hi!, password=]", "");
        manager2.lastName = "FALSE";
        java.lang.String str5 = manager2.lastName;
        java.lang.String str6 = manager2.firstName;
        manager2.lastName = "password_112325847983500";
        manager2.setPassword("manager_112305914121600");
        manager2.setUsername("password_112358838017900");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FALSE" + "'", str5, "FALSE");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        maintainUser0.update("");
        maintainUser0.path = "password_112337353214100";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        manager.Manager manager2 = new manager.Manager("hi!", "hi!");
        manager2.setPassword("");
        manager2.lastName = "manager_112305914121600";
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("password_112310734370300");
        csvWriter1.setEscapeMode((int) (byte) 1);
        csvWriter1.setDelimiter('\000');
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        users.Visitor visitor2 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=hi!]");
        paymentStrategy.PaymentInfo paymentInfo3 = visitor2.getPaymentInfo();
        users.Student student6 = new users.Student("User [name= hi!, id=97, email=hi!, password=admin]", "");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide7 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo13 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int14 = paymentInfo13.getSecurityCode();
        java.lang.String str15 = paymentInfo13.getBillingAddress();
        java.util.Date date17 = null;
        paymentInfo13.parkingInfo(0, date17, "hi!", "hi!", (int) (short) 1);
        boolean boolean23 = creditPaymentProvide7.handlePayment(paymentInfo13, (double) 8);
        student6.setPaymentInfo(paymentInfo13);
        visitor2.setPaymentInfo(paymentInfo13);
        org.junit.Assert.assertNull(paymentInfo3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(272, (int) ',', "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "manager_112327586653400", (int) '\"');
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.close();
        csvReader1.setEscapeMode((int) (short) 1);
        long long11 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        java.lang.String str5 = csvReader1.get(100);
        csvReader1.setSkipEmptyRecords(false);
        csvReader1.setUseComments(false);
        boolean boolean10 = csvReader1.readHeaders();
        csvReader1.setUseComments(true);
        boolean boolean13 = csvReader1.getSkipEmptyRecords();
        boolean boolean14 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        char char2 = csvReader1.getTextQualifier();
        csvReader1.setRecordDelimiter(',');
        boolean boolean6 = csvReader1.isQualified(1);
        csvReader1.setTrimWhitespace(true);
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\"' + "'", char2 == '\"');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        paymentStrategy.DebitPaymentProvider debitPaymentProvider54 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo60 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int61 = paymentInfo60.getSecurityCode();
        java.util.Date date63 = null;
        paymentInfo60.parkingInfo((int) (byte) 1, date63, "hi!", "User [name= hi!, id=97, email=hi!, password=]", 8);
        boolean boolean69 = debitPaymentProvider54.handlePayment(paymentInfo60, (double) 0L);
        boolean boolean71 = otherTypeProvider0.handlePayment(paymentInfo60, (double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        csvWriter1.setUseTextQualifier(false);
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        csvWriter1.writeComment("manager_112354709081500");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        int int24 = reservation13.getStartTime();
        int int25 = reservation13.getDuration();
        java.lang.String str26 = reservation13.getPlate();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "admin" + "'", str26, "admin");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        reservationSystemFacade0.editBooking(reservation11, (int) (byte) 100);
        parking.ParkingSpace parkingSpace14 = reservation11.getSpace();
        int int15 = reservation11.getStartTime();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        boolean boolean9 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        users.Visitor visitor2 = new users.Visitor("password_112325847983500", "password_112296757334200");
        int int3 = visitor2.getParkingRate();
        int int4 = visitor2.getParkingRate();
        int int5 = visitor2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.password = "Password!23";
        java.lang.String str12 = user6.getLName();
        user6.setType("Password!23");
        user6.setName("User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]", "password_112336809022100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        paymentInfo5.setSecurityCode((int) (byte) -1);
        int int11 = paymentInfo5.getSecurityCode();
        paymentInfo5.setBillingName("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str8, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        paymentInfo41.setCardBallance((double) 5);
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
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        boolean boolean9 = csvReader1.getUseTextQualifier();
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        boolean boolean2 = csvReader1.skipLine();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.readHeaders();
        csvReader1.setRecordDelimiter('#');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        reservation11.updateDuration(0);
        int int19 = reservation11.getDay();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        manager.Manager manager2 = new manager.Manager("", "admin");
        manager2.lastName = "Password!23";
        users.NonFacultyStaff nonFacultyStaff7 = new users.NonFacultyStaff("", "hi!");
        java.lang.String str8 = nonFacultyStaff7.getEmail();
        boolean boolean9 = manager2.validateUser((users.UserInfo) nonFacultyStaff7);
        int int10 = nonFacultyStaff7.getParkingRate();
        parking.ParkingLot parkingLot18 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace20 = parkingLot18.getParkingSpace((int) ' ');
        boolean boolean21 = parkingLot18.getEnabled();
        parking.ParkingSpace parkingSpace23 = parkingLot18.getParkingSpace(1);
        reservations.Reservation reservation24 = new reservations.Reservation((int) '\000', 35, 768, 768, "User [name= hi!, id=97, email=hi!, password=]", parkingSpace23);
        nonFacultyStaff7.currentReservation = reservation24;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parkingSpace23);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        user6.type = "FALSE";
        user6.setValidation("password_112357424381900");
        java.lang.String str21 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setId((-1));
        java.lang.String str10 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.id = 32;
        int int10 = user6.id;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        csvReader1.setTrimWhitespace(false);
        java.lang.String str10 = csvReader1.get("password_112338187831000");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("FALSE", "Password!23");
        nonFacultyStaff2.parkingspacenum = 0;
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.getEmail();
        user6.email = "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]";
        user6.fname = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        parking.ParkingSpace parkingSpace12 = reservation10.getSpace();
        int int13 = reservation10.getDuration();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentInfo6.setCardBallance(10.0d);
        double double13 = paymentInfo6.getCardBallance();
        paymentInfo6.setExpDate((int) 'a');
        java.util.Date date17 = null;
        paymentInfo6.parkingInfo((int) '4', date17, "User [name= hi!, id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]", (int) (byte) 10);
        java.util.Date date23 = null;
        paymentInfo6.parkingInfo(97, date23, "User [name= hi!, id=97, email=hi!, password=]", "User [name=null null, id=0, email=null, password=null]", 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentInfo6.setCardBallance(10.0d);
        double double13 = paymentInfo6.getCardBallance();
        paymentInfo6.setExpDate((int) 'a');
        java.util.Date date17 = null;
        paymentInfo6.parkingInfo((int) '4', date17, "User [name= hi!, id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]", (int) (byte) 10);
        paymentInfo6.setCardBallance((double) (short) 0);
        paymentInfo6.setSecurityCode(5);
        java.lang.String str26 = paymentInfo6.getBillingName();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "FALSE" + "'", str26, "FALSE");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getComment();
        boolean boolean11 = csvWriter1.getUseTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        users.Visitor visitor2 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        reservations.ReservationSystemFacade reservationSystemFacade3 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = reservationSystemFacade3.getLots();
        users.FacultyMember facultyMember7 = new users.FacultyMember("", "hi!");
        int int8 = facultyMember7.parkingspacenum;
        facultyMember7.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade11 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot19 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace21 = parkingLot19.getParkingSpace((int) ' ');
        reservations.Reservation reservation22 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace21);
        reservationSystemFacade11.editBooking(reservation22, (int) (byte) 100);
        facultyMember7.currentReservation = reservation22;
        int int26 = reservation22.getMonth();
        reservationSystemFacade3.editBooking(reservation22, (int) (byte) 100);
        parking.ParkingLot parkingLot36 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace38 = parkingLot36.getParkingSpace((int) ' ');
        reservations.Reservation reservation39 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace38);
        int int40 = reservation39.getDay();
        parking.ParkingSpace parkingSpace41 = reservation39.getSpace();
        users.FacultyMember facultyMember44 = new users.FacultyMember("", "hi!");
        int int45 = reservationSystemFacade3.calculateOutstanding(reservation39, (users.UserInfo) facultyMember44);
        int int46 = reservation39.getDay();
        visitor2.currentReservation = reservation39;
        int int48 = visitor2.getParkingRate();
        int int49 = visitor2.getParkingRate();
        org.junit.Assert.assertNotNull(reservationSystemFacade3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade11);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 15 + "'", int48 == 15);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        java.lang.String str9 = user6.toString();
        java.lang.String str10 = user6.getPassword();
        user6.fname = "hi!";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str9, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        users.Visitor visitor2 = new users.Visitor("User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]", "manager_112351534964500");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(272, "password_112325847983500");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingLot7.getEnabled();
        parking.ParkingSpace parkingSpace12 = parkingLot7.getParkingSpace(1);
        reservations.Reservation reservation13 = new reservations.Reservation((int) '\000', 35, 768, 768, "User [name= hi!, id=97, email=hi!, password=]", parkingSpace12);
        parkingState.Disabled disabled14 = new parkingState.Disabled();
        java.lang.String str15 = disabled14.handleState();
        java.lang.String str16 = disabled14.handleState();
        parkingSpace12.setState((parkingState.State) disabled14);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        csvWriter1.setComment('\"');
        csvWriter1.setForceQualifier(false);
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
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        parkingState.Enabled enabled0 = new parkingState.Enabled();
        java.lang.String str1 = enabled0.handleState();
        java.lang.String str2 = enabled0.handleState();
        java.lang.String str3 = enabled0.handleState();
        java.lang.String str4 = enabled0.handleState();
        java.lang.String str5 = enabled0.handleState();
        java.lang.String str6 = enabled0.handleState();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("hi!", ',');
        csvReader2.setCaptureRawRecord(false);
        int int5 = csvReader2.getEscapeMode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        int int8 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        java.lang.String[] strArray10 = csvReader1.getValues();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        paymentInfo5.setBillingAddress("Password!23");
        int int11 = paymentInfo5.getCardNum();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        java.lang.String str4 = superManager0.getPassword();
        manager.Manager manager5 = superManager0.autoGenerator();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112338187831000" + "'", str4, "password_112338187831000");
        org.junit.Assert.assertNotNull(manager5);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        paymentStrategy.PaymentInfo paymentInfo44 = student37.getPaymentInfo();
        reservations.Reservation reservation45 = null;
        student37.currentReservation = reservation45;
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
        org.junit.Assert.assertNull(paymentInfo44);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        int int7 = paymentInfo5.getSecurityCode();
        double double8 = paymentInfo5.getCardBallance();
        double double9 = paymentInfo5.getCardBallance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        int int14 = reservation10.getStartTime();
        reservation10.updateDuration((int) 'a');
        int int17 = reservation10.getStartTime();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parkingLot2.setEnabled(true);
        parkingLot2.setEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            parking.ParkingSpace parkingSpace8 = parkingLot2.getParkingSpace(264);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid space id");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        parking.ParkingSpace parkingSpace6 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation7 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace6);
        parking.ParkingSpace parkingSpace8 = reservation7.getSpace();
        parking.ParkingSpace parkingSpace9 = reservation7.getSpace();
        reservations.ReservationSystemFacade reservationSystemFacade10 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot18 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace20 = parkingLot18.getParkingSpace((int) ' ');
        reservations.Reservation reservation21 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace20);
        reservationSystemFacade10.editBooking(reservation21, (int) (byte) 100);
        java.lang.String str24 = reservation21.getPlate();
        parkingSpace9.setReservation(reservation21);
        org.junit.Assert.assertNotNull(parkingSpace8);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(reservationSystemFacade10);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "admin" + "'", str24, "admin");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        java.lang.String str9 = user6.toString();
        java.lang.String str10 = user6.getPassword();
        user6.lname = "manager_112347878775000";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str9, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        int int4 = parkingSpace3.getId();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        int int8 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        java.lang.String[] strArray10 = csvReader1.getValues();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray13 = csvReader1.getValues();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        users.Visitor visitor2 = new users.Visitor("Password!23", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        int int3 = visitor2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        java.lang.String str16 = maintainUser0.path;
        maintainUser0.path = "password_112337353214100";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.close();
        char char4 = csvWriter1.getDelimiter();
        csvWriter1.setComment(',');
        csvWriter1.setForceQualifier(false);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        userLogin.User user6 = new userLogin.User("", "User [name=null null, id=0, email=null, password=null]", 5, "password_112344052445500", "manager_112305914121600", "password_112325847983500");
        int int7 = user6.id;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        long long4 = csvReader1.getCurrentRecord();
        csvReader1.setTrimWhitespace(true);
        boolean boolean7 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        int int8 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=hi!]");
        boolean boolean9 = csvReader1.getUseTextQualifier();
        char char10 = csvReader1.getTextQualifier();
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(1, "manager_112305914121600");
        java.lang.String str3 = parkingLot2.getAddress();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "manager_112305914121600" + "'", str3, "manager_112305914121600");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        java.lang.String str8 = csvReader1.getHeader((int) ',');
        int int9 = csvReader1.getColumnCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setDelimiter(',');
        csvReader1.setCaptureRawRecord(false);
        java.lang.String str15 = csvReader1.getRawRecord();
        int int16 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        csvReader1.setSafetySwitch(false);
        boolean boolean11 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        superManager0.lastName = "password_112338187831000";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        int int4 = csvReader1.getEscapeMode();
        char char5 = csvReader1.getDelimiter();
        csvReader1.setCaptureRawRecord(true);
        csvReader1.setCaptureRawRecord(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setRecordDelimiter('a');
        char char9 = csvReader1.getTextQualifier();
        char char10 = csvReader1.getRecordDelimiter();
        long long11 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        users.Student student2 = new users.Student("FALSE", "Password!23");
        java.lang.String str3 = student2.getPassword();
        int int4 = student2.getParkingRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password!23" + "'", str3, "Password!23");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        int int27 = parkingSpace26.getId();
        parkingSpace26.setEnabled(false);
        parkingSpace26.setId(5);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        java.lang.String str5 = csvReader1.get(100);
        boolean boolean7 = csvReader1.isQualified((int) '4');
        char char8 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("password_112325847983500", ',');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112325847983500 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        csvWriter1.setTextQualifier('\"');
        boolean boolean10 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        users.Visitor visitor2 = new users.Visitor("", "");
        boolean boolean3 = visitor2.getIsValid();
        int int4 = visitor2.getParkingRate();
        int int5 = visitor2.getParkingRate();
        int int6 = visitor2.getParkingRate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        users.FacultyMember facultyMember46 = new users.FacultyMember("hi!", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        paymentStrategy.OtherTypeProvider otherTypeProvider47 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo53 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo53.setBillingName("FALSE");
        boolean boolean57 = otherTypeProvider47.handlePayment(paymentInfo53, (double) (short) 1);
        paymentInfo53.setCardBallance(10.0d);
        double double60 = paymentInfo53.getCardBallance();
        paymentInfo53.setExpDate((int) 'a');
        java.util.Date date64 = null;
        paymentInfo53.parkingInfo((int) '4', date64, "User [name= hi!, id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]", (int) (byte) 10);
        paymentInfo53.setSecurityCode((-1));
        facultyMember46.setPaymentInfo(paymentInfo53);
        boolean boolean73 = otherTypeProvider0.handlePayment(paymentInfo53, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        users.Student student2 = new users.Student("password_112348536883400", "User [name=null null, id=0, email=null, password=null]");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("password_112312047073100");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112312047073100 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setEscapeMode(1);
        csvWriter1.close();
        char char11 = csvWriter1.getDelimiter();
        csvWriter1.setDelimiter('#');
        csvWriter1.setForceQualifier(true);
        char char16 = csvWriter1.getRecordDelimiter();
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '#' + "'", char16 == '#');
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        superManager0.lastName = "hi!";
        superManager0.lastName = "FALSE";
        superManager0.firstName = "User [name= hi!, id=97, email=hi!, password=admin]";
        java.lang.String str9 = superManager0.lastName;
        manager.Manager manager10 = superManager0.autoGenerator();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertNotNull(manager10);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        users.FacultyMember facultyMember44 = new users.FacultyMember("", "hi!");
        int int45 = facultyMember44.parkingspacenum;
        facultyMember44.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade48 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot56 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace58 = parkingLot56.getParkingSpace((int) ' ');
        reservations.Reservation reservation59 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace58);
        users.FacultyMember facultyMember62 = new users.FacultyMember("", "hi!");
        int int63 = facultyMember62.parkingspacenum;
        int int64 = reservationSystemFacade48.calculateOutstanding(reservation59, (users.UserInfo) facultyMember62);
        reservation59.updateDuration((int) ' ');
        int int67 = reservation59.getStartTime();
        facultyMember44.currentReservation = reservation59;
        int int69 = reservation59.getMonth();
        parkingSpace9.setReservation(reservation59);
        parkingState.State state71 = parkingSpace9.getSensorStatus();
        parking.ParkingSpace parkingSpace73 = new parking.ParkingSpace(0);
        parking.ParkingLot parkingLot76 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace78 = parkingLot76.getParkingSpace((int) ' ');
        boolean boolean79 = parkingLot76.getEnabled();
        parking.ParkingSpace parkingSpace81 = parkingLot76.getParkingSpace(10);
        parkingSpace81.setId((int) (byte) 10);
        parkingState.Disabled disabled84 = new parkingState.Disabled();
        java.lang.String str85 = disabled84.handleState();
        parkingSpace81.setState((parkingState.State) disabled84);
        parkingSpace73.setState((parkingState.State) disabled84);
        java.lang.String str88 = disabled84.handleState();
        parkingSpace9.setState((parkingState.State) disabled84);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade48);
        org.junit.Assert.assertNotNull(parkingSpace58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(state71);
        org.junit.Assert.assertNotNull(parkingSpace78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(parkingSpace81);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        manager.Manager manager4 = superManager0.autoGenerator();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        manager7.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        manager7.setPassword("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        manager7.lastName = "User [name= hi!, id=97, email=hi!, password=hi!]";
        java.lang.String str14 = manager7.firstName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        boolean boolean7 = csvReader1.skipLine();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        user6.email = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        java.lang.String str15 = user6.type;
        java.lang.String str16 = user6.getLName();
        user6.isValidated = false;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str16, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider1 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        boolean boolean11 = otherTypeProvider1.handlePayment(paymentInfo7, (double) (short) 1);
        boolean boolean13 = creditPaymentProvide0.handlePayment(paymentInfo7, (double) (short) 0);
        double double14 = paymentInfo7.getCardBallance();
        paymentInfo7.setExpDate((int) '4');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        maintainUser0.update("User [name= hi!, id=97, email=hi!, password=hi!]");
        java.lang.String str16 = maintainUser0.path;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        superManager0.lastName = "User [name= hi!, id=97, email=hi!, password=]";
        manager.Manager manager10 = superManager0.autoGenerator();
        manager.Manager manager11 = superManager0.autoGenerator();
        users.NonFacultyStaff nonFacultyStaff14 = new users.NonFacultyStaff("FALSE", "password_112296757334200");
        boolean boolean15 = superManager0.validateUser((users.UserInfo) nonFacultyStaff14);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertNotNull(manager10);
        org.junit.Assert.assertNotNull(manager11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot(5);
        parking.ParkingLot parkingLot9 = parkingSystem0.getLot((int) (byte) 0);
        parking.ParkingLot parkingLot12 = parkingSystem0.addLot(8, "");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
// flaky:         org.junit.Assert.assertNotNull(parkingLot7);
// flaky:         org.junit.Assert.assertNotNull(parkingLot9);
        org.junit.Assert.assertNotNull(parkingLot12);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot((int) '\"');
        parking.ParkingLot parkingLot9 = parkingSystem0.addLot(5, "Password!23");
        parking.ParkingSpace parkingSpace11 = parkingLot9.getParkingSpace(0);
        parkingState.State state12 = parkingSpace11.getSensorStatus();
        java.util.ArrayList<reservations.Reservation> reservationList13 = parkingSpace11.getReservations();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
// flaky:         org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertNotNull(parkingLot9);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        paymentInfo35.setBillingName("password_112358838017900");
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
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.getLName();
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.email = "User [name= FALSE, id=97, email=, password=]";
        user6.fname = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str20 = user6.lname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str20, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        int int4 = csvReader1.getEscapeMode();
        int int5 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.email;
        user6.isValidated = false;
        java.lang.String str14 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        parkingState.Enabled enabled0 = new parkingState.Enabled();
        java.lang.String str1 = enabled0.handleState();
        java.lang.String str2 = enabled0.handleState();
        java.lang.String str3 = enabled0.handleState();
        java.lang.String str4 = enabled0.handleState();
        java.lang.String str5 = enabled0.handleState();
        java.lang.String str6 = enabled0.handleState();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        char char5 = csvWriter1.getTextQualifier();
        com.csvreader.CsvWriter csvWriter7 = new com.csvreader.CsvWriter("");
        csvWriter7.setRecordDelimiter('\"');
        csvWriter7.setTextQualifier('\"');
        char char12 = csvWriter7.getComment();
        csvWriter7.setUseTextQualifier(true);
        char char15 = csvWriter7.getRecordDelimiter();
        char char16 = csvWriter7.getRecordDelimiter();
        csvWriter7.setRecordDelimiter('a');
        com.csvreader.CsvWriter csvWriter20 = new com.csvreader.CsvWriter("");
        csvWriter20.setRecordDelimiter('\"');
        csvWriter20.setTextQualifier('\"');
        char char25 = csvWriter20.getComment();
        boolean boolean26 = csvWriter20.getUseTextQualifier();
        char char27 = csvWriter20.getRecordDelimiter();
        com.csvreader.CsvWriter csvWriter29 = new com.csvreader.CsvWriter("");
        boolean boolean30 = csvWriter29.getUseTextQualifier();
        com.csvreader.CsvReader csvReader32 = com.csvreader.CsvReader.parse("hi!");
        char char33 = csvReader32.getComment();
        char char34 = csvReader32.getTextQualifier();
        java.lang.String[] strArray35 = csvReader32.getHeaders();
        java.lang.String[] strArray36 = csvReader32.getValues();
        csvWriter29.writeRecord(strArray36);
        csvWriter20.writeRecord(strArray36, false);
        csvWriter7.writeRecord(strArray36, false);
        csvWriter1.writeRecord(strArray36, false);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '#' + "'", char12 == '#');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\"' + "'", char15 == '\"');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '#' + "'", char25 == '#');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\"' + "'", char27 == '\"');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(csvReader32);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '#' + "'", char33 == '#');
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\"' + "'", char34 == '\"');
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.getValidation();
        int int9 = user6.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FALSE" + "'", str8, "FALSE");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        reservationSystemFacade0.editBooking(reservation11, (int) (byte) 100);
        reservations.ReservationSystemFacade reservationSystemFacade14 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap15 = reservationSystemFacade14.getLots();
        users.FacultyMember facultyMember18 = new users.FacultyMember("", "hi!");
        int int19 = facultyMember18.parkingspacenum;
        facultyMember18.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade22 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot30 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace32 = parkingLot30.getParkingSpace((int) ' ');
        reservations.Reservation reservation33 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace32);
        reservationSystemFacade22.editBooking(reservation33, (int) (byte) 100);
        facultyMember18.currentReservation = reservation33;
        int int37 = reservation33.getMonth();
        reservationSystemFacade14.editBooking(reservation33, (int) (byte) 100);
        parking.ParkingLot parkingLot47 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace49 = parkingLot47.getParkingSpace((int) ' ');
        reservations.Reservation reservation50 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace49);
        int int51 = reservation50.getDay();
        parking.ParkingSpace parkingSpace52 = reservation50.getSpace();
        users.FacultyMember facultyMember55 = new users.FacultyMember("", "hi!");
        int int56 = reservationSystemFacade14.calculateOutstanding(reservation50, (users.UserInfo) facultyMember55);
        reservation50.updateDuration((int) '#');
        manager.SuperManager superManager59 = manager.SuperManager.getInstance();
        java.lang.String str60 = superManager59.firstName;
        java.lang.String str61 = superManager59.getUsername();
        superManager59.lastName = "hi!";
        superManager59.lastName = "FALSE";
        users.FacultyMember facultyMember68 = new users.FacultyMember("", "hi!");
        int int69 = facultyMember68.parkingspacenum;
        facultyMember68.parkinglot = "hi!";
        facultyMember68.setValid();
        boolean boolean73 = superManager59.validateUser((users.UserInfo) facultyMember68);
        paymentStrategy.PaymentInfo paymentInfo74 = facultyMember68.getPaymentInfo();
        java.lang.String str75 = facultyMember68.parkinglot;
        int int76 = reservationSystemFacade0.calculateOutstanding(reservation50, (users.UserInfo) facultyMember68);
        java.lang.String str77 = reservation50.getPlate();
        int int78 = reservation50.getDay();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNotNull(reservationSystemFacade14);
        org.junit.Assert.assertNotNull(intMap15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade22);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(parkingSpace49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(superManager59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str60, "User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(paymentInfo74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 272 + "'", int76 == 272);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "admin" + "'", str77, "admin");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        csvWriter1.setForceQualifier(true);
        int int12 = csvWriter1.getEscapeMode();
        csvWriter1.setTextQualifier('4');
        csvWriter1.setEscapeMode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("FALSE", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("FALSE");
        java.lang.String str9 = csvReader1.getHeader(264);
        csvReader1.setSafetySwitch(true);
        long long12 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        boolean boolean5 = csvReader1.getUseComments();
        boolean boolean6 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setSkipEmptyRecords(true);
        long long8 = csvReader1.getCurrentRecord();
        csvReader1.setTrimWhitespace(false);
        csvReader1.setRecordDelimiter('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.util.Date date8 = null;
        paymentInfo5.parkingInfo((int) (byte) 1, date8, "hi!", "User [name= hi!, id=97, email=hi!, password=]", 8);
        java.util.Date date14 = null;
        paymentInfo5.parkingInfo((int) ',', date14, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "password_112348536883400", (int) ',');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parkingSpace7.setEnabled(false);
        parkingState.Occupied occupied11 = new parkingState.Occupied("hi!");
        parkingSpace7.setState((parkingState.State) occupied11);
        parkingSpace7.setId(2);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("hi!", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        reservations.Reservation reservation3 = nonFacultyStaff2.currentReservation;
        int int4 = nonFacultyStaff2.getParkingRate();
        paymentStrategy.PaymentInfo paymentInfo5 = nonFacultyStaff2.getPaymentInfo();
        int int6 = nonFacultyStaff2.getParkingRate();
        org.junit.Assert.assertNull(reservation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(paymentInfo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setPassword("admin");
        java.lang.String str11 = user6.toString();
        user6.fname = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        user6.setType("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str11, "User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        user6.email = "password_112284545599300";
        java.lang.String str16 = user6.password;
        java.lang.String str17 = user6.password;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str16, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str17, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.close();
        char char4 = csvWriter1.getDelimiter();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setDelimiter('4');
        com.csvreader.CsvReader csvReader9 = com.csvreader.CsvReader.parse("hi!");
        char char10 = csvReader9.getComment();
        char char11 = csvReader9.getTextQualifier();
        java.lang.String str13 = csvReader9.get(8);
        csvReader9.setDelimiter('\"');
        char char16 = csvReader9.getTextQualifier();
        char char17 = csvReader9.getRecordDelimiter();
        java.lang.String str19 = csvReader9.get(8);
        boolean boolean20 = csvReader9.getSafetySwitch();
        csvReader9.setComment('\000');
        long long23 = csvReader9.getCurrentRecord();
        com.csvreader.CsvWriter csvWriter25 = new com.csvreader.CsvWriter("");
        csvWriter25.setRecordDelimiter('\"');
        char char28 = csvWriter25.getDelimiter();
        csvWriter25.setUseTextQualifier(false);
        com.csvreader.CsvWriter csvWriter32 = new com.csvreader.CsvWriter("");
        csvWriter32.setRecordDelimiter('\"');
        csvWriter32.setTextQualifier('\"');
        char char37 = csvWriter32.getComment();
        csvWriter32.setUseTextQualifier(true);
        char char40 = csvWriter32.getRecordDelimiter();
        char char41 = csvWriter32.getComment();
        com.csvreader.CsvReader csvReader43 = com.csvreader.CsvReader.parse("hi!");
        char char44 = csvReader43.getComment();
        char char45 = csvReader43.getTextQualifier();
        java.lang.String[] strArray46 = csvReader43.getHeaders();
        java.lang.String[] strArray47 = csvReader43.getValues();
        csvWriter32.writeRecord(strArray47, false);
        csvWriter25.writeRecord(strArray47, false);
        csvReader9.setHeaders(strArray47);
        csvWriter1.writeRecord(strArray47);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(csvReader9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + ',' + "'", char28 == ',');
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '#' + "'", char37 == '#');
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\"' + "'", char40 == '\"');
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '#' + "'", char41 == '#');
        org.junit.Assert.assertNotNull(csvReader43);
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '#' + "'", char44 == '#');
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\"' + "'", char45 == '\"');
        org.junit.Assert.assertNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        paymentInfo24.setCardBallance(1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "FALSE" + "'", str29, "FALSE");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        int int10 = user6.getId();
        java.lang.String str11 = user6.email;
        java.lang.String str12 = user6.password;
        java.lang.String str13 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        csvReader1.setComment('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        int int10 = parkingSpace9.getId();
        java.util.ArrayList<reservations.Reservation> reservationList11 = parkingSpace9.getReservations();
        reservations.Reservation reservation12 = new reservations.Reservation(8, (int) '#', (int) ' ', 155, "User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", parkingSpace9);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        char char5 = csvWriter1.getDelimiter();
        csvWriter1.setDelimiter(',');
        csvWriter1.setRecordDelimiter(' ');
        com.csvreader.CsvReader csvReader11 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean12 = csvReader11.readRecord();
        csvReader11.setSafetySwitch(true);
        csvReader11.setTrimWhitespace(false);
        boolean boolean17 = csvReader11.skipRecord();
        java.lang.String[] strArray18 = csvReader11.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray18, true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertNotNull(csvReader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.setId(97);
        user6.isValidated = false;
        int int16 = user6.id;
        user6.setEmail("");
        java.lang.String str19 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User [name= FALSE, id=97, email=, password=]" + "'", str19, "User [name= FALSE, id=97, email=, password=]");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getComment();
        csvWriter1.setRecordDelimiter(' ');
        csvWriter1.setEscapeMode(10);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('\000');
        csvReader1.setTextQualifier('a');
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        paymentStrategy.Context context30 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) mobilePaymentProvider0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name= FALSE, id=97, email=, password=]", "password_112310734370300");
        facultyMember2.parkingspacenum = 100;
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "User [name= hi!, id=97, email=hi!, password=]");
        int int3 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        users.Student student2 = new users.Student("FALSE", "Password!23");
        student2.parkinglot = "password_112310734370300";
        manager.SuperManager superManager5 = manager.SuperManager.getInstance();
        java.lang.String str6 = superManager5.firstName;
        users.Student student9 = new users.Student("", "hi!");
        boolean boolean10 = superManager5.validateUser((users.UserInfo) student9);
        paymentStrategy.PaymentInfo paymentInfo11 = student9.getPaymentInfo();
        reservations.Reservation reservation12 = student9.currentReservation;
        paymentStrategy.PaymentInfo paymentInfo18 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int19 = paymentInfo18.getSecurityCode();
        java.lang.String str20 = paymentInfo18.getBillingAddress();
        java.util.Date date22 = null;
        paymentInfo18.parkingInfo(0, date22, "hi!", "hi!", (int) (short) 1);
        student9.setPaymentInfo(paymentInfo18);
        paymentInfo18.setExpDate((int) '\000');
        student2.setPaymentInfo(paymentInfo18);
        paymentInfo18.setSecurityCode((int) '\"');
        int int33 = paymentInfo18.getExpDate();
        org.junit.Assert.assertNotNull(superManager5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str6, "User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(paymentInfo11);
        org.junit.Assert.assertNull(reservation12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        paymentInfo13.setSecurityCode((int) (short) 10);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = superManager0.firstName;
        java.lang.String str5 = superManager0.lastName;
        java.lang.String str6 = superManager0.getUsername();
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FALSE" + "'", str5, "FALSE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=hi!, password=]", "");
        manager2.lastName = "FALSE";
        java.lang.String str5 = manager2.lastName;
        java.lang.String str6 = manager2.firstName;
        manager2.lastName = "password_112325847983500";
        manager2.setPassword("User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FALSE" + "'", str5, "FALSE");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        paymentStrategy.Context context61 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider59);
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
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        user6.type = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str19 = user6.lname;
        user6.setValidation("password_112325847983500");
        java.lang.String str22 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "FALSE" + "'", str22, "FALSE");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        parking.ParkingSpace parkingSpace6 = new parking.ParkingSpace(768);
        int int7 = parkingSpace6.getId();
        reservations.Reservation reservation8 = new reservations.Reservation(1, (int) (short) 10, 1, 0, "User [name= hi!, id=97, email=hi!, password=admin]", parkingSpace6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 768 + "'", int7 == 768);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        parking.ParkingSpace parkingSpace6 = new parking.ParkingSpace(0);
        parking.ParkingLot parkingLot9 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace11 = parkingLot9.getParkingSpace((int) ' ');
        boolean boolean12 = parkingLot9.getEnabled();
        parking.ParkingSpace parkingSpace14 = parkingLot9.getParkingSpace(10);
        parkingSpace14.setId((int) (byte) 10);
        parkingState.Disabled disabled17 = new parkingState.Disabled();
        java.lang.String str18 = disabled17.handleState();
        parkingSpace14.setState((parkingState.State) disabled17);
        parkingSpace6.setState((parkingState.State) disabled17);
        parkingSpace6.setId((int) (byte) 100);
        reservations.Reservation reservation23 = new reservations.Reservation((int) '\000', 15, (int) (byte) 1, 272, "password_112347399105200", parkingSpace6);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("password_112344052445500", "User [name= FALSE, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        boolean boolean9 = csvReader1.getSkipEmptyRecords();
        int int10 = csvReader1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = csvReader1.readRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setDelimiter(',');
        csvReader1.setUseTextQualifier(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(155, "User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        csvReader1.setCaptureRawRecord(false);
        char char9 = csvReader1.getTextQualifier();
        csvReader1.setSafetySwitch(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingSpace4.isEnabled();
        java.util.ArrayList<reservations.Reservation> reservationList6 = parkingSpace4.getReservations();
        parkingSpace4.setEnabled(false);
        parkingSpace4.setId((int) (byte) -1);
        parkingState.Unoccupied unoccupied11 = new parkingState.Unoccupied();
        java.lang.String str12 = unoccupied11.handleState();
        java.lang.String str13 = unoccupied11.handleState();
        java.lang.String str14 = unoccupied11.handleState();
        parkingSpace4.setState((parkingState.State) unoccupied11);
        boolean boolean16 = parkingSpace4.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        csvReader1.setRecordDelimiter('a');
        int int12 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getColumnCount();
        int int8 = csvReader1.getHeaderCount();
        char char9 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        userLogin.MaintainUser maintainUser4 = new userLogin.MaintainUser();
        maintainUser4.update("admin");
        java.util.ArrayList<userLogin.User> userList7 = maintainUser4.users;
        maintainUser0.users = userList7;
        java.util.ArrayList<userLogin.User> userList9 = maintainUser0.users;
        java.lang.String str10 = maintainUser0.path;
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        users.Student student2 = new users.Student("", "hi!");
        int int3 = student2.getParkingRate();
        paymentStrategy.DebitPaymentProvider debitPaymentProvider4 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context5 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider4);
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider6 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo12 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int13 = paymentInfo12.getSecurityCode();
        java.lang.String str14 = paymentInfo12.getBillingAddress();
        java.util.Date date16 = null;
        paymentInfo12.parkingInfo(0, date16, "hi!", "hi!", (int) (short) 1);
        boolean boolean22 = mobilePaymentProvider6.handlePayment(paymentInfo12, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo28 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        boolean boolean30 = mobilePaymentProvider6.handlePayment(paymentInfo28, (double) (-1.0f));
        boolean boolean32 = debitPaymentProvider4.handlePayment(paymentInfo28, (double) 0);
        java.lang.String str33 = paymentInfo28.getBillingName();
        java.lang.String str34 = paymentInfo28.getBillingName();
        student2.setPaymentInfo(paymentInfo28);
        int int36 = student2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "FALSE" + "'", str33, "FALSE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FALSE" + "'", str34, "FALSE");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        java.util.Date date51 = null;
        paymentInfo39.parkingInfo(15, date51, "User [name= hi!, id=97, email=hi!, password=]", "password_112284545599300", 264);
        int int56 = paymentInfo39.getCardNum();
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        paymentStrategy.DebitPaymentProvider debitPaymentProvider21 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo27 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int28 = paymentInfo27.getSecurityCode();
        java.lang.String str29 = paymentInfo27.getBillingAddress();
        java.lang.String str30 = paymentInfo27.getBillingAddress();
        boolean boolean32 = debitPaymentProvider21.handlePayment(paymentInfo27, (double) (-1));
        boolean boolean34 = creditPaymentProvide0.handlePayment(paymentInfo27, (double) 'a');
        paymentStrategy.PaymentInfo paymentInfo35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = creditPaymentProvide0.handlePayment(paymentInfo35, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        users.Visitor visitor2 = new users.Visitor("User [name=null null, id=0, email=null, password=null]", "password_112310734370300");
        int int3 = visitor2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace(52);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        facultyMember2.parkingspacenum = 10;
        java.lang.String str5 = facultyMember2.parkinglot;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        csvWriter1.setDelimiter(',');
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("admin");
        char char2 = csvReader1.getDelimiter();
        java.lang.String[] strArray3 = csvReader1.getValues();
        boolean boolean5 = csvReader1.isQualified((int) (short) -1);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ',' + "'", char2 == ',');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        users.Visitor visitor2 = new users.Visitor("", "");
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) '#', (int) (short) -1, "password_112284545599300", "password_112284545599300", (int) (short) 1);
        visitor2.setPaymentInfo(paymentInfo8);
        paymentInfo8.setBillingName("password_112337353214100");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        int int9 = csvReader1.getColumnCount();
        java.lang.String str10 = csvReader1.getRawRecord();
        csvReader1.setUseComments(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        java.lang.String str3 = parkingLot2.getAddress();
        parkingLot2.setEnabled(false);
        parkingLot2.setEnabled(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        users.Student student2 = new users.Student("FALSE", "Password!23");
        student2.parkinglot = "password_112310734370300";
        paymentStrategy.PaymentInfo paymentInfo5 = student2.getPaymentInfo();
        parking.ParkingLot parkingLot13 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace15 = parkingLot13.getParkingSpace((int) ' ');
        reservations.Reservation reservation16 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace15);
        int int17 = reservation16.getDay();
        int int18 = reservation16.getDuration();
        student2.currentReservation = reservation16;
        int int20 = student2.parkingspacenum;
        org.junit.Assert.assertNull(paymentInfo5);
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        boolean boolean7 = csvReader1.getSafetySwitch();
        csvReader1.setRecordDelimiter('\"');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = csvReader1.getHeader(2);
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
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        boolean boolean9 = debitPaymentProvider0.handlePayment(paymentInfo7, (double) 100);
        paymentStrategy.Context context10 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.Context context11 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        boolean boolean2 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvReader csvReader4 = com.csvreader.CsvReader.parse("hi!");
        char char5 = csvReader4.getComment();
        char char6 = csvReader4.getTextQualifier();
        java.lang.String[] strArray7 = csvReader4.getHeaders();
        java.lang.String[] strArray8 = csvReader4.getValues();
        csvWriter1.writeRecord(strArray8);
        boolean boolean10 = csvWriter1.getForceQualifier();
        com.csvreader.CsvWriter csvWriter12 = new com.csvreader.CsvWriter("");
        csvWriter12.setRecordDelimiter('\"');
        csvWriter12.setTextQualifier('\"');
        char char17 = csvWriter12.getComment();
        csvWriter12.setUseTextQualifier(true);
        char char20 = csvWriter12.getDelimiter();
        char char21 = csvWriter12.getComment();
        char char22 = csvWriter12.getRecordDelimiter();
        char char23 = csvWriter12.getComment();
        int int24 = csvWriter12.getEscapeMode();
        com.csvreader.CsvWriter csvWriter26 = new com.csvreader.CsvWriter("");
        csvWriter26.setRecordDelimiter('\"');
        csvWriter26.setTextQualifier('\"');
        char char31 = csvWriter26.getComment();
        boolean boolean32 = csvWriter26.getForceQualifier();
        csvWriter26.setTextQualifier('a');
        com.csvreader.CsvReader csvReader36 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean37 = csvReader36.readRecord();
        csvReader36.setSafetySwitch(true);
        csvReader36.setTrimWhitespace(false);
        boolean boolean42 = csvReader36.skipRecord();
        boolean boolean43 = csvReader36.getTrimWhitespace();
        java.lang.String str44 = csvReader36.getRawRecord();
        boolean boolean45 = csvReader36.getCaptureRawRecord();
        boolean boolean46 = csvReader36.getUseTextQualifier();
        csvReader36.setTextQualifier('4');
        com.csvreader.CsvWriter csvWriter50 = new com.csvreader.CsvWriter("");
        csvWriter50.setRecordDelimiter('\"');
        csvWriter50.setTextQualifier('\"');
        char char55 = csvWriter50.getComment();
        boolean boolean56 = csvWriter50.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter58 = new com.csvreader.CsvWriter("");
        csvWriter58.setRecordDelimiter('\"');
        boolean boolean61 = csvWriter58.getUseTextQualifier();
        com.csvreader.CsvReader csvReader63 = com.csvreader.CsvReader.parse("hi!");
        char char64 = csvReader63.getComment();
        char char65 = csvReader63.getTextQualifier();
        java.lang.String[] strArray66 = csvReader63.getHeaders();
        java.lang.String[] strArray67 = csvReader63.getValues();
        csvWriter58.writeRecord(strArray67);
        csvWriter50.writeRecord(strArray67);
        csvReader36.setHeaders(strArray67);
        csvWriter26.writeRecord(strArray67);
        csvWriter12.writeRecord(strArray67);
        csvWriter1.writeRecord(strArray67, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(csvReader4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + ',' + "'", char20 == ',');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '#' + "'", char21 == '#');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\"' + "'", char22 == '\"');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '#' + "'", char23 == '#');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '#' + "'", char31 == '#');
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(csvReader36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + char55 + "' != '" + '#' + "'", char55 == '#');
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(csvReader63);
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '#' + "'", char64 == '#');
        org.junit.Assert.assertTrue("'" + char65 + "' != '" + '\"' + "'", char65 == '\"');
        org.junit.Assert.assertNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentInfo6.setCardBallance(10.0d);
        double double13 = paymentInfo6.getCardBallance();
        java.util.Date date15 = null;
        paymentInfo6.parkingInfo((int) (short) 1, date15, "FALSE", "FALSE", (int) '#');
        int int20 = paymentInfo6.getCardNum();
        paymentInfo6.setBillingAddress("password_112347878777100");
        paymentInfo6.setBillingName("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('\000');
        char char4 = csvReader1.getDelimiter();
        boolean boolean5 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("FALSE");
        java.lang.String str9 = csvReader1.getHeader(264);
        csvReader1.setUseTextQualifier(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        int int5 = parkingLot2.getId();
        boolean boolean6 = parkingLot2.getEnabled();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        userLogin.User user6 = new userLogin.User("User [name= hi!, id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]", (-1), "password_112284545599300", "admin", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        java.lang.String str7 = user6.getType();
        java.lang.String str8 = user6.fname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= FALSE, id=97, email=hi!, password=hi!]" + "'", str7, "User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str8, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        csvReader1.setCaptureRawRecord(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        paymentStrategy.Context context61 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(superManager29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(paymentInfo35);
        org.junit.Assert.assertNull(reservation36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 97 + "'", int56 == 97);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.setDelimiter('#');
        char char12 = csvWriter1.getTextQualifier();
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) ',', (int) '4', "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "manager_112327586653400", 5);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        java.lang.String str7 = facultyMember2.getEmail();
        facultyMember2.parkinglot = "User [name= hi!, id=97, email=hi!, password=hi!]";
        paymentStrategy.PaymentInfo paymentInfo15 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo15.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str18 = paymentInfo15.getBillingAddress();
        paymentInfo15.setSecurityCode((int) (byte) -1);
        facultyMember2.setPaymentInfo(paymentInfo15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str18, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("manager_112305914121600", "User [name= FALSE, id=97, email=, password=]");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        java.lang.String str26 = paymentInfo23.getBillingAddress();
        paymentInfo23.setBillingAddress("Password!23");
        boolean boolean30 = creditPaymentProvide0.handlePayment(paymentInfo23, 1.0d);
        paymentInfo23.setBillingName("password_112347399105200");
        int int33 = paymentInfo23.getExpDate();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        int int10 = user6.getId();
        java.lang.String str11 = user6.getEmail();
        user6.setValidation("password_112359916102100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setEscapeMode(1);
        csvWriter1.close();
        char char11 = csvWriter1.getDelimiter();
        csvWriter1.setDelimiter('#');
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(0, 97, "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]", 97);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("password_112312047073100", "password_112306347644100", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112312047073100" + "'", str3, "password_112312047073100");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        java.lang.String str7 = facultyMember2.getEmail();
        facultyMember2.parkinglot = "User [name= hi!, id=97, email=hi!, password=hi!]";
        boolean boolean10 = facultyMember2.getIsValid();
        facultyMember2.setValid();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        users.FacultyMember facultyMember6 = new users.FacultyMember("", "hi!");
        int int7 = facultyMember6.parkingspacenum;
        facultyMember6.parkinglot = "hi!";
        facultyMember6.setValid();
        boolean boolean11 = manager3.validateUser((users.UserInfo) facultyMember6);
        java.lang.String str12 = facultyMember6.parkinglot;
        facultyMember6.setValid();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        userLogin.User user6 = new userLogin.User("", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", 8, "Password!23", "", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        user6.setValidation("Password!23");
        java.lang.String str9 = user6.lname;
        user6.password = "password_112325847983500";
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]" + "'", str9, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        int int47 = reservation39.getDay();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot(5);
        parking.ParkingLot parkingLot9 = parkingSystem0.getLot(32);
        boolean boolean11 = parkingSystem0.isLotEnabled((int) (byte) 1);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(parkingLot7);
        org.junit.Assert.assertNull(parkingLot9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        double double48 = paymentInfo36.getCardBallance();
        boolean boolean50 = creditPaymentProvide0.handlePayment(paymentInfo36, (double) 768);
        int int51 = paymentInfo36.getCardNum();
        paymentInfo36.setBillingAddress("password_112310734370300");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str9 = csvReader1.getRawRecord();
        boolean boolean10 = csvReader1.getCaptureRawRecord();
        csvReader1.setUseComments(true);
        csvReader1.setDelimiter('4');
        int int15 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        boolean boolean3 = csvWriter1.getUseTextQualifier();
        csvWriter1.endRecord();
        com.csvreader.CsvReader csvReader6 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean7 = csvReader6.readRecord();
        csvReader6.setSafetySwitch(true);
        java.lang.String[] strArray10 = csvReader6.getValues();
        boolean boolean11 = csvReader6.getUseComments();
        int int13 = csvReader6.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean14 = csvReader6.getCaptureRawRecord();
        java.lang.String[] strArray15 = csvReader6.getValues();
        csvWriter1.writeRecord(strArray15);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(csvReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        csvWriter1.setTextQualifier('a');
        com.csvreader.CsvReader csvReader11 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean12 = csvReader11.readRecord();
        csvReader11.setSafetySwitch(true);
        csvReader11.setTrimWhitespace(false);
        boolean boolean17 = csvReader11.skipRecord();
        boolean boolean18 = csvReader11.getTrimWhitespace();
        java.lang.String str19 = csvReader11.getRawRecord();
        boolean boolean20 = csvReader11.getCaptureRawRecord();
        boolean boolean21 = csvReader11.getUseTextQualifier();
        csvReader11.setTextQualifier('4');
        com.csvreader.CsvWriter csvWriter25 = new com.csvreader.CsvWriter("");
        csvWriter25.setRecordDelimiter('\"');
        csvWriter25.setTextQualifier('\"');
        char char30 = csvWriter25.getComment();
        boolean boolean31 = csvWriter25.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter33 = new com.csvreader.CsvWriter("");
        csvWriter33.setRecordDelimiter('\"');
        boolean boolean36 = csvWriter33.getUseTextQualifier();
        com.csvreader.CsvReader csvReader38 = com.csvreader.CsvReader.parse("hi!");
        char char39 = csvReader38.getComment();
        char char40 = csvReader38.getTextQualifier();
        java.lang.String[] strArray41 = csvReader38.getHeaders();
        java.lang.String[] strArray42 = csvReader38.getValues();
        csvWriter33.writeRecord(strArray42);
        csvWriter25.writeRecord(strArray42);
        csvReader11.setHeaders(strArray42);
        csvWriter1.writeRecord(strArray42);
        com.csvreader.CsvReader csvReader48 = com.csvreader.CsvReader.parse("hi!");
        char char49 = csvReader48.getComment();
        char char50 = csvReader48.getTextQualifier();
        boolean boolean51 = csvReader48.getUseTextQualifier();
        java.lang.String str53 = csvReader48.get((int) '#');
        csvReader48.setTrimWhitespace(false);
        com.csvreader.CsvWriter csvWriter57 = new com.csvreader.CsvWriter("");
        boolean boolean58 = csvWriter57.getUseTextQualifier();
        com.csvreader.CsvReader csvReader60 = com.csvreader.CsvReader.parse("hi!");
        char char61 = csvReader60.getComment();
        char char62 = csvReader60.getTextQualifier();
        java.lang.String[] strArray63 = csvReader60.getHeaders();
        java.lang.String[] strArray64 = csvReader60.getValues();
        csvWriter57.writeRecord(strArray64);
        csvReader48.setHeaders(strArray64);
        csvWriter1.writeRecord(strArray64);
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(csvReader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '#' + "'", char30 == '#');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(csvReader38);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '#' + "'", char39 == '#');
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\"' + "'", char40 == '\"');
        org.junit.Assert.assertNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(csvReader48);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '#' + "'", char49 == '#');
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + '\"' + "'", char50 == '\"');
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(csvReader60);
        org.junit.Assert.assertTrue("'" + char61 + "' != '" + '#' + "'", char61 == '#');
        org.junit.Assert.assertTrue("'" + char62 + "' != '" + '\"' + "'", char62 == '\"');
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        int int22 = facultyMember2.parkingspacenum;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        user6.fname = "FALSE";
        user6.email = "admin";
        user6.setType("password_112325847983500");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot4 = parkingSystem0.getLot((int) '\000');
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot(100);
        parking.ParkingLot parkingLot8 = parkingSystem0.getLot(34);
        parking.ParkingLot parkingLot10 = parkingSystem0.getLot(0);
        parking.ParkingSpace parkingSpace13 = parkingSystem0.getParkingSpace((int) (byte) 0, 97);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
// flaky:         org.junit.Assert.assertNotNull(parkingLot4);
        org.junit.Assert.assertNotNull(parkingLot6);
// flaky:         org.junit.Assert.assertNotNull(parkingLot8);
// flaky:         org.junit.Assert.assertNotNull(parkingLot10);
        org.junit.Assert.assertNotNull(parkingSpace13);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        csvReader1.setDelimiter('\000');
        csvReader1.setComment(' ');
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        facultyMember9.parkinglot = "User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        user6.email = "";
        java.lang.String str13 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        int int11 = user6.getId();
        java.lang.String str12 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        boolean boolean2 = user0.isValidated;
        int int3 = user0.getId();
        java.lang.String str4 = user0.toString();
        java.lang.String str5 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str4, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setPassword("admin");
        java.lang.String str11 = user6.toString();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.password;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str11, "User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String[] strArray7 = csvReader1.getValues();
        java.lang.String str9 = csvReader1.getHeader(0);
        int int10 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str9 = csvReader1.getRawRecord();
        boolean boolean10 = csvReader1.getCaptureRawRecord();
        csvReader1.setUseComments(true);
        csvReader1.setDelimiter(' ');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot(5);
        parking.ParkingSpace parkingSpace10 = null; // flaky: parkingSystem0.getParkingSpace((int) 'a', (int) '\000');
        reservations.Reservation reservation11 = null;
// flaky:         parkingSpace10.setReservation(reservation11);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(parkingLot7);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace10);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        boolean boolean9 = csvReader1.getUseTextQualifier();
        csvReader1.setCaptureRawRecord(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.lname = "User [name= hi!, id=97, email=hi!, password=hi!]";
        user6.setPassword("User [name= FALSE, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        java.util.ArrayList<userLogin.User> userList16 = maintainUser0.users;
        userLogin.MaintainUser maintainUser17 = new userLogin.MaintainUser();
        maintainUser17.update("admin");
        java.util.ArrayList<userLogin.User> userList20 = maintainUser17.users;
        userLogin.MaintainUser maintainUser21 = new userLogin.MaintainUser();
        maintainUser21.update("admin");
        java.util.ArrayList<userLogin.User> userList24 = maintainUser21.users;
        maintainUser17.users = userList24;
        java.util.ArrayList<userLogin.User> userList26 = maintainUser17.users;
        maintainUser0.users = userList26;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        paymentStrategy.PaymentInfo paymentInfo47 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int48 = paymentInfo47.getSecurityCode();
        java.lang.String str49 = paymentInfo47.getBillingAddress();
        java.lang.String str50 = paymentInfo47.getBillingAddress();
        java.lang.String str51 = paymentInfo47.getBillingAddress();
        boolean boolean53 = debitPaymentProvider0.handlePayment(paymentInfo47, (-1.0d));
        manager.SuperManager superManager54 = manager.SuperManager.getInstance();
        java.lang.String str55 = superManager54.firstName;
        users.Student student58 = new users.Student("", "hi!");
        boolean boolean59 = superManager54.validateUser((users.UserInfo) student58);
        paymentStrategy.PaymentInfo paymentInfo60 = student58.getPaymentInfo();
        student58.setValid();
        java.lang.String str62 = student58.parkinglot;
        int int63 = student58.getParkingRate();
        paymentStrategy.PaymentInfo paymentInfo69 = new paymentStrategy.PaymentInfo(97, 5, "admin", "User [name= hi!, id=97, email=hi!, password=]", 10);
        student58.setPaymentInfo(paymentInfo69);
        boolean boolean72 = debitPaymentProvider0.handlePayment(paymentInfo69, (double) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(superManager54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(paymentInfo60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name= FALSE, id=1, email=hi!, password=hi!]");
        csvWriter1.endRecord();
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setComment('4');
        boolean boolean7 = csvReader1.skipLine();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        csvReader1.setCaptureRawRecord(true);
        java.lang.String str12 = csvReader1.get("password_112284545599300");
        csvReader1.setCaptureRawRecord(false);
        boolean boolean15 = csvReader1.getUseTextQualifier();
        boolean boolean16 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        user6.setPassword("hi!");
        boolean boolean15 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        users.Student student2 = new users.Student("", "hi!");
        java.lang.String str3 = student2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        boolean boolean3 = parkingSystem0.isLotEnabled((int) (short) 1);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        java.lang.String str54 = paymentInfo41.getBillingName();
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        paymentInfo7.setCardNum(1);
        boolean boolean13 = context1.execute(paymentInfo7, (double) 97);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide14 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider15 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo21 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo21.setBillingName("FALSE");
        boolean boolean25 = otherTypeProvider15.handlePayment(paymentInfo21, (double) (short) 1);
        boolean boolean27 = creditPaymentProvide14.handlePayment(paymentInfo21, (double) (short) 0);
        paymentInfo21.setBillingName("password_112284545599300");
        boolean boolean31 = context1.execute(paymentInfo21, (double) 100L);
        paymentInfo21.setExpDate(5);
        java.lang.String str34 = paymentInfo21.getBillingName();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "password_112284545599300" + "'", str34, "password_112284545599300");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        csvWriter1.writeComment("User [name= hi!, id=97, email=hi!, password=hi!]");
        int int4 = csvWriter1.getEscapeMode();
        csvWriter1.setForceQualifier(false);
        int int7 = csvWriter1.getEscapeMode();
        com.csvreader.CsvWriter csvWriter9 = new com.csvreader.CsvWriter("");
        csvWriter9.setRecordDelimiter('\"');
        csvWriter9.setTextQualifier('\"');
        char char14 = csvWriter9.getComment();
        boolean boolean15 = csvWriter9.getUseTextQualifier();
        com.csvreader.CsvWriter csvWriter17 = new com.csvreader.CsvWriter("");
        csvWriter17.setRecordDelimiter('\"');
        boolean boolean20 = csvWriter17.getUseTextQualifier();
        com.csvreader.CsvReader csvReader22 = com.csvreader.CsvReader.parse("hi!");
        char char23 = csvReader22.getComment();
        char char24 = csvReader22.getTextQualifier();
        java.lang.String[] strArray25 = csvReader22.getHeaders();
        java.lang.String[] strArray26 = csvReader22.getValues();
        csvWriter17.writeRecord(strArray26);
        csvWriter9.writeRecord(strArray26);
        csvWriter1.writeRecord(strArray26, true);
        boolean boolean31 = csvWriter1.getUseTextQualifier();
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '#' + "'", char14 == '#');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(csvReader22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '#' + "'", char23 == '#');
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\"' + "'", char24 == '\"');
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=hi!, password=hi!]", "password_112296757334200");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        java.lang.String str5 = csvReader1.get(100);
        csvReader1.setSkipEmptyRecords(false);
        boolean boolean8 = csvReader1.getTrimWhitespace();
        boolean boolean9 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        int int6 = student4.getParkingRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        boolean boolean15 = facultyMember9.getIsValid();
        java.lang.String str16 = facultyMember9.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        java.lang.String str19 = user6.fname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        user6.lname = "";
        user6.setEmail("password_112312047073100");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        users.Visitor visitor2 = new users.Visitor("password_112296757334200", "Password!23");
        reservations.ReservationSystemFacade reservationSystemFacade3 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = reservationSystemFacade3.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade5 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot13 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace15 = parkingLot13.getParkingSpace((int) ' ');
        reservations.Reservation reservation16 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace15);
        users.FacultyMember facultyMember19 = new users.FacultyMember("", "hi!");
        int int20 = facultyMember19.parkingspacenum;
        int int21 = reservationSystemFacade5.calculateOutstanding(reservation16, (users.UserInfo) facultyMember19);
        manager.SuperManager superManager22 = manager.SuperManager.getInstance();
        java.lang.String str23 = superManager22.firstName;
        users.Student student26 = new users.Student("", "hi!");
        boolean boolean27 = superManager22.validateUser((users.UserInfo) student26);
        paymentStrategy.PaymentInfo paymentInfo28 = student26.getPaymentInfo();
        student26.setValid();
        int int30 = reservationSystemFacade3.calculateOutstanding(reservation16, (users.UserInfo) student26);
        reservations.ReservationSystemFacade reservationSystemFacade31 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot39 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace41 = parkingLot39.getParkingSpace((int) ' ');
        reservations.Reservation reservation42 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace41);
        users.FacultyMember facultyMember45 = new users.FacultyMember("", "hi!");
        int int46 = facultyMember45.parkingspacenum;
        int int47 = reservationSystemFacade31.calculateOutstanding(reservation42, (users.UserInfo) facultyMember45);
        reservationSystemFacade3.editBooking(reservation42, (int) (short) -1);
        reservations.ReservationSystemFacade reservationSystemFacade50 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot58 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace60 = parkingLot58.getParkingSpace((int) ' ');
        reservations.Reservation reservation61 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace60);
        users.FacultyMember facultyMember64 = new users.FacultyMember("", "hi!");
        int int65 = facultyMember64.parkingspacenum;
        int int66 = reservationSystemFacade50.calculateOutstanding(reservation61, (users.UserInfo) facultyMember64);
        reservation61.updateDuration((int) ' ');
        reservationSystemFacade3.editBooking(reservation61, (int) (short) 100);
        int int71 = reservation61.getMonth();
        visitor2.currentReservation = reservation61;
        org.junit.Assert.assertNotNull(reservationSystemFacade3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertNotNull(reservationSystemFacade5);
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(superManager22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(paymentInfo28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade31);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade50);
        org.junit.Assert.assertNotNull(parkingSpace60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        int int3 = parkingLot2.getId();
        java.lang.String str4 = parkingLot2.getAddress();
        int int5 = parkingLot2.getId();
        int int6 = parkingLot2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        parkingState.Occupied occupied1 = new parkingState.Occupied("");
        java.lang.String str2 = occupied1.handleState();
        java.lang.String str3 = occupied1.handleState();
        java.lang.String str4 = occupied1.handleState();
        java.lang.String str5 = occupied1.handleState();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean11 = csvReader1.getTrimWhitespace();
        csvReader1.close();
        csvReader1.setTrimWhitespace(false);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = csvReader1.getIndex("FALSE");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace((int) (short) 10);
        reservations.ReservationSystemFacade reservationSystemFacade2 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((int) ' ');
        reservations.Reservation reservation13 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace12);
        reservationSystemFacade2.editBooking(reservation13, (int) (byte) 100);
        parking.ParkingLot parkingLot23 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace25 = parkingLot23.getParkingSpace((int) ' ');
        boolean boolean26 = parkingSpace25.isEnabled();
        reservations.Reservation reservation27 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace25);
        manager.SuperManager superManager28 = manager.SuperManager.getInstance();
        superManager28.firstName = "";
        manager.Manager manager31 = superManager28.autoGenerator();
        users.FacultyMember facultyMember34 = new users.FacultyMember("", "hi!");
        int int35 = facultyMember34.parkingspacenum;
        facultyMember34.parkinglot = "hi!";
        facultyMember34.setValid();
        boolean boolean39 = manager31.validateUser((users.UserInfo) facultyMember34);
        reservations.Reservation reservation40 = facultyMember34.currentReservation;
        int int41 = reservationSystemFacade2.calculateOutstanding(reservation27, (users.UserInfo) facultyMember34);
        parkingSpace1.setReservation(reservation27);
        int int43 = reservation27.getMonth();
        java.lang.String str44 = reservation27.getPlate();
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(superManager28);
        org.junit.Assert.assertNotNull(manager31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(reservation40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 768 + "'", int41 == 768);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Password!23" + "'", str44, "Password!23");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.email;
        user6.password = "hi!";
        java.lang.String str12 = user6.getLName();
        user6.setPassword("manager_112347878775000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        java.util.Date date12 = null;
        paymentInfo6.parkingInfo((int) ' ', date12, "hi!", "hi!", 5);
        java.util.Date date18 = null;
        paymentInfo6.parkingInfo(0, date18, "User [name=null null, id=0, email=null, password=null]", "User [name=null null, id=0, email=null, password=null]", 264);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        user6.email = "";
        java.lang.String str13 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        java.lang.String str6 = parkingLot2.getAddress();
        boolean boolean7 = parkingLot2.getEnabled();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        user6.email = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        java.lang.String str15 = user6.type;
        user6.type = "User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        user6.setEmail("hi!");
        java.lang.String str13 = user6.fname;
        user6.setValidation("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        user6.password = "password_112284545599300";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        boolean boolean5 = csvReader1.readRecord();
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setRecordDelimiter('a');
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setPassword("admin");
        user6.setType("password_112338187831000");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getFName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        java.lang.String str5 = csvReader1.get(100);
        csvReader1.setSkipEmptyRecords(false);
        csvReader1.setUseComments(false);
        boolean boolean10 = csvReader1.readHeaders();
        csvReader1.setUseComments(true);
        boolean boolean13 = csvReader1.skipLine();
        char char14 = csvReader1.getComment();
        java.lang.String[] strArray15 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '#' + "'", char14 == '#');
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("password_112348536883400", ' ', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentInfo6.setCardBallance(10.0d);
        double double13 = paymentInfo6.getCardBallance();
        java.util.Date date15 = null;
        paymentInfo6.parkingInfo((int) (short) 1, date15, "FALSE", "FALSE", (int) '#');
        java.lang.String str20 = paymentInfo6.getBillingName();
        java.lang.String str21 = paymentInfo6.getBillingAddress();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FALSE" + "'", str20, "FALSE");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("password_112357424381900", '\000', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getForceQualifier();
        csvWriter1.writeComment("User [name= hi!, id=97, email=hi!, password=hi!]");
        char char8 = csvWriter1.getDelimiter();
        csvWriter1.endRecord();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        java.lang.String str55 = paymentInfo41.getBillingAddress();
        double double56 = paymentInfo41.getCardBallance();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) ' ');
        parking.ParkingLot parkingLot5 = parkingSystem0.getLot((int) '\"');
        boolean boolean7 = false; // flaky: parkingSystem0.isLotEnabled((int) (byte) 10);
        boolean boolean9 = false; // flaky: parkingSystem0.isLotEnabled(10);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNull(parkingLot3);
// flaky:         org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot(8);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap7 = parkingSystem0.getLots();
// flaky:         parkingSystem0.setEnableLot(0, true);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertNotNull(intMap7);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        csvWriter1.setRecordDelimiter('\000');
        csvWriter1.setUseTextQualifier(false);
        boolean boolean14 = csvWriter1.getUseTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(272, (-1), "password_112347399105200", "password_112344052445500", (int) '\"');
        paymentInfo5.setCardBallance((double) 10.0f);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        paymentInfo7.setCardNum(1);
        paymentInfo7.setExpDate(768);
        boolean boolean15 = debitPaymentProvider0.handlePayment(paymentInfo7, (double) (byte) 1);
        int int16 = paymentInfo7.getSecurityCode();
        int int17 = paymentInfo7.getCardNum();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.setDelimiter('#');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("User [name= hi!, id=97, email=hi!, password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(32);
        java.lang.String str13 = csvReader1.get("manager_112305914121600");
        java.lang.String str15 = csvReader1.get(100);
        java.lang.String str17 = csvReader1.get("User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        manager.Manager manager2 = new manager.Manager("password_112337353214100", "password_112337353214100");
        manager2.setPassword("password_112325847983500");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        users.FacultyMember facultyMember2 = new users.FacultyMember("hi!", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        java.lang.String str3 = facultyMember2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        manager.Manager manager2 = new manager.Manager("password_112344052445500", "password_112357424381900");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        reservation33.updateDuration(15);
        reservation33.updateDuration(34);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(reservationSystemFacade22);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        int int44 = parkingSpace21.getId();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean11 = csvReader1.getTrimWhitespace();
        boolean boolean13 = csvReader1.isQualified((int) (byte) 0);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        manager7.setPassword("password_112284545599300");
        users.FacultyMember facultyMember12 = new users.FacultyMember("", "hi!");
        int int13 = facultyMember12.parkingspacenum;
        facultyMember12.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade16 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot24 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace26 = parkingLot24.getParkingSpace((int) ' ');
        reservations.Reservation reservation27 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace26);
        reservationSystemFacade16.editBooking(reservation27, (int) (byte) 100);
        facultyMember12.currentReservation = reservation27;
        paymentStrategy.OtherTypeProvider otherTypeProvider31 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo37 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo37.setBillingName("FALSE");
        boolean boolean41 = otherTypeProvider31.handlePayment(paymentInfo37, (double) (short) 1);
        paymentInfo37.setCardBallance(10.0d);
        facultyMember12.setPaymentInfo(paymentInfo37);
        paymentStrategy.DebitPaymentProvider debitPaymentProvider45 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo51 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int52 = paymentInfo51.getSecurityCode();
        java.lang.String str53 = paymentInfo51.getBillingAddress();
        java.lang.String str54 = paymentInfo51.getBillingAddress();
        boolean boolean56 = debitPaymentProvider45.handlePayment(paymentInfo51, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo62 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int63 = paymentInfo62.getSecurityCode();
        java.lang.String str64 = paymentInfo62.getBillingAddress();
        java.util.Date date66 = null;
        paymentInfo62.parkingInfo(0, date66, "hi!", "hi!", (int) (short) 1);
        boolean boolean72 = debitPaymentProvider45.handlePayment(paymentInfo62, (double) (short) -1);
        int int73 = paymentInfo62.getExpDate();
        facultyMember12.setPaymentInfo(paymentInfo62);
        facultyMember12.parkinglot = "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]";
        boolean boolean77 = manager7.validateUser((users.UserInfo) facultyMember12);
        reservations.Reservation reservation78 = facultyMember12.currentReservation;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade16);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(reservation78);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(155, 100, "hi!", "hi!", 2);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = superManager0.lastName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FALSE" + "'", str4, "FALSE");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.email;
        java.lang.String str12 = user6.email;
        user6.email = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]";
        int int15 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.State state12 = parkingSpace9.getSensorStatus();
        boolean boolean13 = parkingSpace9.isEnabled();
        parkingSpace9.setId(10);
        java.util.ArrayList<reservations.Reservation> reservationList16 = parkingSpace9.getReservations();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        char char9 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getRecordDelimiter();
        char char5 = csvWriter1.getComment();
        boolean boolean6 = csvWriter1.getUseTextQualifier();
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        manager.Manager manager2 = new manager.Manager("hi!", "hi!");
        manager2.setUsername("");
        manager2.setUsername("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str7 = manager2.firstName;
        java.lang.String str8 = manager2.firstName;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration(2);
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parkingState.State state15 = parkingSpace14.getSensorStatus();
        boolean boolean16 = parkingSpace14.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("password_112310734370300", ' ');
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setUseComments(false);
        boolean boolean4 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(97, "User [name=null null, id=0, email=null, password=null]");
        parkingLot2.setEnabled(false);
        parking.ParkingSpace parkingSpace6 = parkingLot2.getParkingSpace(35);
        parkingLot2.setEnabled(false);
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        maintainUser0.path = "User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]";
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
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getValidation();
        user6.lname = "hi!";
        user6.setValidation("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str16 = user6.getPassword();
        boolean boolean17 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        parkingState.State state16 = parkingSpace14.getSensorStatus();
        reservations.Reservation reservation17 = new reservations.Reservation((int) (byte) 0, 2, (int) (byte) 0, 2, "admin", parkingSpace14);
        int int18 = reservation17.getMonth();
        parking.ParkingSpace parkingSpace19 = reservation17.getSpace();
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(parkingSpace19);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        paymentStrategy.PaymentInfo paymentInfo59 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo59.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        paymentInfo59.setBillingAddress("User [name=null null, id=0, email=null, password=null]");
        boolean boolean65 = otherTypeProvider0.handlePayment(paymentInfo59, 100.0d);
        int int66 = paymentInfo59.getSecurityCode();
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setForceQualifier(false);
        int int8 = csvWriter1.getEscapeMode();
        char char9 = csvWriter1.getTextQualifier();
        csvWriter1.setComment('\"');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '#' + "'", char9 == '#');
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        csvReader1.setDelimiter('4');
        char char9 = csvReader1.getDelimiter();
        boolean boolean10 = csvReader1.getUseTextQualifier();
        java.lang.String[] strArray11 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", "password_112343396437900");
        facultyMember2.parkinglot = "password_112344052445500";
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        boolean boolean6 = csvWriter1.getUseTextQualifier();
        csvWriter1.close();
        csvWriter1.setDelimiter('\000');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        manager7.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        users.Visitor visitor12 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        boolean boolean13 = manager7.validateUser((users.UserInfo) visitor12);
        java.lang.String str14 = visitor12.getEmail();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]" + "'", str14, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        users.Student student2 = new users.Student("password_112344052445500", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setDelimiter('#');
        int int10 = csvWriter1.getEscapeMode();
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name=null null, id=0, email=null, password=null]");
        char char2 = csvWriter1.getTextQualifier();
        csvWriter1.setUseTextQualifier(true);
        csvWriter1.setTextQualifier(' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\"' + "'", char2 == '\"');
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.skipLine();
        csvReader1.setComment('\"');
        csvReader1.setSafetySwitch(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration(2);
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parking.ParkingSpace parkingSpace15 = reservation10.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList16 = parkingSpace15.getReservations();
        boolean boolean17 = parkingSpace15.isEnabled();
        java.util.ArrayList<reservations.Reservation> reservationList18 = parkingSpace15.getReservations();
        parking.ParkingLot parkingLot26 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace28 = parkingLot26.getParkingSpace((int) ' ');
        reservations.Reservation reservation29 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace28);
        int int30 = reservation29.getDay();
        parking.ParkingSpace parkingSpace31 = reservation29.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList32 = parkingSpace31.getReservations();
        parkingState.State state33 = parkingSpace31.getSensorStatus();
        parkingState.Enabled enabled34 = new parkingState.Enabled();
        java.lang.String str35 = enabled34.handleState();
        java.lang.String str36 = enabled34.handleState();
        java.lang.String str37 = enabled34.handleState();
        parkingSpace31.setState((parkingState.State) enabled34);
        parkingSpace15.setState((parkingState.State) enabled34);
        boolean boolean40 = parkingSpace15.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(parkingSpace31);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(state33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        user6.email = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        java.lang.String str15 = user6.type;
        user6.setEmail("Password!23");
        int int18 = user6.getId();
        int int19 = user6.getId();
        boolean boolean20 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        boolean boolean24 = mobilePaymentProvider0.handlePayment(paymentInfo22, (double) (-1.0f));
        paymentStrategy.DebitPaymentProvider debitPaymentProvider25 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo31 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int32 = paymentInfo31.getSecurityCode();
        java.lang.String str33 = paymentInfo31.getBillingAddress();
        java.lang.String str34 = paymentInfo31.getBillingAddress();
        boolean boolean36 = debitPaymentProvider25.handlePayment(paymentInfo31, (double) (-1));
        paymentStrategy.OtherTypeProvider otherTypeProvider37 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo43 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo43.setBillingName("FALSE");
        boolean boolean47 = otherTypeProvider37.handlePayment(paymentInfo43, (double) (short) 1);
        paymentInfo43.setCardBallance(10.0d);
        double double50 = paymentInfo43.getCardBallance();
        paymentInfo43.setExpDate((int) 'a');
        paymentInfo43.setBillingName("User [name= FALSE, id=97, email=hi!, password=hi!]");
        boolean boolean56 = debitPaymentProvider25.handlePayment(paymentInfo43, 0.0d);
        boolean boolean58 = mobilePaymentProvider0.handlePayment(paymentInfo43, (double) '\000');
        int int59 = paymentInfo43.getExpDate();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        csvReader1.close();
        csvReader1.setTextQualifier('\"');
        csvReader1.setSafetySwitch(true);
        char char7 = csvReader1.getTextQualifier();
        boolean boolean8 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        boolean boolean10 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        java.lang.String str4 = superManager0.getPassword();
        superManager0.firstName = "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str4, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        long long4 = csvReader1.getCurrentRecord();
        boolean boolean5 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        csvWriter1.setRecordDelimiter('\"');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '#' + "'", char13 == '#');
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
        org.junit.Assert.assertNotNull(csvReader19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\"' + "'", char21 == '\"');
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider35 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo41 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo41.setBillingName("FALSE");
        paymentInfo41.setCardNum(1);
        paymentInfo41.setExpDate(768);
        paymentInfo41.setBillingName("FALSE");
        boolean boolean51 = mobilePaymentProvider35.handlePayment(paymentInfo41, (double) (short) 10);
        boolean boolean53 = mobilePaymentProvider0.handlePayment(paymentInfo41, 10.0d);
        paymentStrategy.PaymentInfo paymentInfo59 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        int int60 = paymentInfo59.getSecurityCode();
        int int61 = paymentInfo59.getExpDate();
        double double62 = paymentInfo59.getCardBallance();
        boolean boolean64 = mobilePaymentProvider0.handlePayment(paymentInfo59, (double) 'a');
        paymentInfo59.setCardNum(97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(8);
        boolean boolean12 = csvReader1.skipLine();
        int int13 = csvReader1.getColumnCount();
        boolean boolean14 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        maintainUser0.path = "";
        userLogin.MaintainUser maintainUser14 = new userLogin.MaintainUser();
        maintainUser14.update("admin");
        maintainUser14.path = "hi!";
        userLogin.MaintainUser maintainUser19 = new userLogin.MaintainUser();
        java.lang.String str20 = maintainUser19.path;
        userLogin.MaintainUser maintainUser21 = new userLogin.MaintainUser();
        maintainUser21.update("admin");
        java.util.ArrayList<userLogin.User> userList24 = maintainUser21.users;
        maintainUser19.users = userList24;
        maintainUser14.users = userList24;
        maintainUser14.path = "hi!";
        java.lang.String str29 = maintainUser14.path;
        userLogin.MaintainUser maintainUser30 = new userLogin.MaintainUser();
        maintainUser30.update("admin");
        maintainUser30.path = "hi!";
        userLogin.MaintainUser maintainUser35 = new userLogin.MaintainUser();
        java.lang.String str36 = maintainUser35.path;
        userLogin.MaintainUser maintainUser37 = new userLogin.MaintainUser();
        maintainUser37.update("admin");
        java.util.ArrayList<userLogin.User> userList40 = maintainUser37.users;
        maintainUser35.users = userList40;
        maintainUser30.users = userList40;
        maintainUser14.users = userList40;
        maintainUser0.users = userList40;
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        java.lang.String str11 = user6.getValidation();
        user6.type = "FALSE";
        user6.setEmail("password_112312047073100");
        user6.id = ',';
        user6.setValidation("password_112306347644100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setUseTextQualifier(false);
        boolean boolean10 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        java.util.ArrayList<userLogin.User> userList4 = maintainUser0.users;
        maintainUser0.update("User [name=null null, id=0, email=null, password=null]");
        java.util.ArrayList<userLogin.User> userList7 = maintainUser0.users;
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        userLogin.User user0 = new userLogin.User();
        int int1 = user0.id;
        boolean boolean2 = user0.isValidated;
        user0.type = "password_112306347644100";
        java.lang.String str5 = user0.getFName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        int int4 = csvReader1.getColumnCount();
        boolean boolean5 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        char char3 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) ' ');
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot((int) '#', "");
        parkingLot6.setEnabled(false);
        boolean boolean9 = parkingLot6.getEnabled();
        java.lang.String str10 = parkingLot6.getAddress();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        maintainUser0.path = "manager_112347878775000";
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        boolean boolean9 = csvReader1.getUseComments();
        char char10 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("FALSE", "manager_112305914121600");
        int int3 = nonFacultyStaff2.parkingspacenum;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("manager_112347878775000");
        csvWriter1.setUseTextQualifier(false);
    }
}
