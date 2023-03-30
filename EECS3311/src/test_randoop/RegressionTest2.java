import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        manager.Manager manager2 = new manager.Manager("hi!", "password_112284545599300");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        userLogin.User user6 = new userLogin.User("User [name= hi!, id=97, email=hi!, password=admin]", "password_112336809022100", 0, "User [name= hi!, id=97, email=hi!, password=]", "", "password_112343396437900");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        int int21 = paymentInfo8.getSecurityCode();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        reservations.Reservation reservation23 = student4.currentReservation;
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(reservation23);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        paymentStrategy.Context context73 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) creditPaymentProvide0);
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name= FALSE, id=97, email=hi!, password=hi!]", "password_112312047073100");
        java.lang.String str3 = nonFacultyStaff2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112312047073100" + "'", str3, "password_112312047073100");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        char char5 = csvReader1.getDelimiter();
        boolean boolean6 = csvReader1.getUseComments();
        char char7 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        csvReader1.setDelimiter('\"');
        boolean boolean12 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        java.lang.String str7 = user6.getType();
        user6.setPassword("");
        user6.password = "Password!23";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace((int) '#');
        boolean boolean2 = parkingSpace1.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) ' ');
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot(0, "FALSE");
        parking.ParkingLot parkingLot9 = parkingSystem0.addLot((int) (byte) -1, "password_112325847983500");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertNotNull(parkingLot9);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration(2);
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        int int15 = reservation10.getMonth();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setComment('4');
        boolean boolean7 = csvReader1.skipLine();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        csvReader1.setCaptureRawRecord(true);
        java.lang.String str12 = csvReader1.get("password_112284545599300");
        boolean boolean13 = csvReader1.skipRecord();
        int int14 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("admin");
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        int int60 = paymentInfo59.getSecurityCode();
        paymentInfo59.setCardBallance((double) (short) 100);
        paymentInfo59.setExpDate((int) '\"');
        boolean boolean66 = otherTypeProvider0.handlePayment(paymentInfo59, 0.0d);
        int int67 = paymentInfo59.getSecurityCode();
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", '\"', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        char char5 = csvReader1.getDelimiter();
        csvReader1.setDelimiter('4');
        char char8 = csvReader1.getDelimiter();
        csvReader1.setRecordDelimiter('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot((int) (byte) 100);
        boolean boolean9 = parkingSystem0.isLotEnabled((int) (short) 0);
// flaky:         parkingSystem0.setEnableLot((int) (byte) 10, false);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
        org.junit.Assert.assertNotNull(parkingLot7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        java.lang.String str8 = user6.type;
        java.lang.String str9 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        manager.Manager manager2 = new manager.Manager("hi!", "");
        manager2.firstName = "Password!23";
        manager2.setPassword("password_112296757334200");
        manager2.setPassword("manager_112305914121600");
        manager2.setPassword("User [name= FALSE, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setEscapeMode(8);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String str7 = csvReader1.getRawRecord();
        int int8 = csvReader1.getColumnCount();
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        csvReader1.setUseComments(true);
        long long12 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        users.FacultyMember facultyMember2 = new users.FacultyMember("password_112312047073100", "password_112336809022100");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setBillingName("FALSE");
        paymentInfo5.setCardNum(1);
        paymentInfo5.setBillingAddress("");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        user6.setEmail("User [name= FALSE, id=97, email=, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        csvReader1.setRecordDelimiter(',');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        boolean boolean7 = csvReader1.readHeaders();
        int int8 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setDelimiter(',');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "hi!", "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]" + "'", str3, "User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        userLogin.MaintainUser maintainUser23 = new userLogin.MaintainUser();
        java.lang.String str24 = maintainUser23.path;
        userLogin.MaintainUser maintainUser25 = new userLogin.MaintainUser();
        maintainUser25.update("admin");
        java.util.ArrayList<userLogin.User> userList28 = maintainUser25.users;
        maintainUser23.users = userList28;
        maintainUser23.path = "User [name= hi!, id=97, email=hi!, password=]";
        java.util.ArrayList<userLogin.User> userList32 = maintainUser23.users;
        maintainUser0.users = userList32;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        parkingSpace48.setId((int) (short) 100);
        boolean boolean88 = parkingSpace48.isEnabled();
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
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        java.lang.String str18 = maintainUser17.path;
        userLogin.MaintainUser maintainUser19 = new userLogin.MaintainUser();
        maintainUser19.update("admin");
        maintainUser19.path = "hi!";
        userLogin.MaintainUser maintainUser24 = new userLogin.MaintainUser();
        java.lang.String str25 = maintainUser24.path;
        userLogin.MaintainUser maintainUser26 = new userLogin.MaintainUser();
        maintainUser26.update("admin");
        java.util.ArrayList<userLogin.User> userList29 = maintainUser26.users;
        maintainUser24.users = userList29;
        maintainUser19.users = userList29;
        maintainUser17.users = userList29;
        userLogin.MaintainUser maintainUser33 = new userLogin.MaintainUser();
        java.lang.String str34 = maintainUser33.path;
        userLogin.MaintainUser maintainUser35 = new userLogin.MaintainUser();
        maintainUser35.update("admin");
        java.util.ArrayList<userLogin.User> userList38 = maintainUser35.users;
        maintainUser33.users = userList38;
        maintainUser17.users = userList38;
        maintainUser0.users = userList38;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        reservationSystemFacade0.editBooking(reservation36, 97);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap41 = reservationSystemFacade0.getLots();
        parking.ParkingLot parkingLot49 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace51 = parkingLot49.getParkingSpace((int) ' ');
        boolean boolean52 = parkingSpace51.isEnabled();
        reservations.Reservation reservation53 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace51);
        java.lang.String str54 = reservation53.getPlate();
        int int55 = reservation53.getDay();
        int int56 = reservation53.getStartTime();
        users.FacultyMember facultyMember59 = new users.FacultyMember("", "hi!");
        int int60 = facultyMember59.parkingspacenum;
        facultyMember59.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade63 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot71 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace73 = parkingLot71.getParkingSpace((int) ' ');
        reservations.Reservation reservation74 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace73);
        reservationSystemFacade63.editBooking(reservation74, (int) (byte) 100);
        facultyMember59.currentReservation = reservation74;
        paymentStrategy.OtherTypeProvider otherTypeProvider78 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo84 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo84.setBillingName("FALSE");
        boolean boolean88 = otherTypeProvider78.handlePayment(paymentInfo84, (double) (short) 1);
        paymentInfo84.setCardBallance(10.0d);
        facultyMember59.setPaymentInfo(paymentInfo84);
        reservationSystemFacade0.cancelBooking(reservation53, (users.UserInfo) facultyMember59);
        java.lang.String str93 = reservation53.getPlate();
        int int94 = reservation53.getDay();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertNotNull(intMap41);
        org.junit.Assert.assertNotNull(parkingSpace51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Password!23" + "'", str54, "Password!23");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade63);
        org.junit.Assert.assertNotNull(parkingSpace73);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Password!23" + "'", str93, "Password!23");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 8 + "'", int94 == 8);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        boolean boolean10 = csvReader1.readRecord();
        java.lang.String str12 = csvReader1.get("User [name= FALSE, id=97, email=, password=]");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        int int15 = user6.getId();
        java.lang.String str16 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FALSE" + "'", str16, "FALSE");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("password_112284545599300", "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=admin]", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "admin");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        csvReader1.setUseComments(false);
        java.lang.String[] strArray10 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        char char6 = csvReader1.getDelimiter();
        csvReader1.setComment('#');
        csvReader1.setSafetySwitch(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ',' + "'", char6 == ',');
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        java.lang.String str56 = paymentInfo39.getBillingAddress();
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        int int6 = paymentInfo5.getSecurityCode();
        int int7 = paymentInfo5.getExpDate();
        double double8 = paymentInfo5.getCardBallance();
        paymentInfo5.setCardBallance((double) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        int int9 = csvReader1.getColumnCount();
        csvReader1.setSafetySwitch(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        boolean boolean9 = csvReader1.readHeaders();
        csvReader1.setUseTextQualifier(true);
        csvReader1.setComment('\000');
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        manager.Manager manager2 = new manager.Manager("FALSE", "admin");
        java.lang.String str3 = manager2.lastName;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.lang.String str46 = student37.parkinglot;
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
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parkingSpace14.setId((int) '4');
        int int17 = parkingSpace14.getId();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        boolean boolean10 = csvReader1.skipLine();
        java.lang.String str11 = csvReader1.getRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        csvWriter1.setComment(' ');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("Password!23", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        parkingState.Unoccupied unoccupied0 = new parkingState.Unoccupied();
        java.lang.String str1 = unoccupied0.handleState();
        java.lang.String str2 = unoccupied0.handleState();
        java.lang.String str3 = unoccupied0.handleState();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        char char7 = csvReader1.getComment();
        boolean boolean9 = csvReader1.isQualified(2);
        boolean boolean10 = csvReader1.getTrimWhitespace();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setComment('4');
        boolean boolean7 = csvReader1.skipLine();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        csvReader1.setCaptureRawRecord(true);
        java.lang.String str12 = csvReader1.get("password_112284545599300");
        csvReader1.setSkipEmptyRecords(true);
        java.lang.String str16 = csvReader1.get((int) (byte) 10);
        char char17 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\"' + "'", char17 == '\"');
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        boolean boolean7 = user6.isValidated;
        user6.setName("password_112336809022100", "password_112310734370300");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        char char7 = csvReader1.getComment();
        boolean boolean9 = csvReader1.isQualified(2);
        int int10 = csvReader1.getColumnCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getForceQualifier();
        csvWriter1.writeComment("User [name= hi!, id=97, email=hi!, password=hi!]");
        char char8 = csvWriter1.getDelimiter();
        csvWriter1.close();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot(34, "password_112310734370300");
        parking.ParkingLot parkingLot8 = parkingSystem0.getLot((int) (short) 0);
        parking.ParkingLot parkingLot10 = parkingSystem0.getLot((int) (short) 1);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertNotNull(parkingLot8);
        org.junit.Assert.assertNotNull(parkingLot10);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("", "hi!", "FALSE");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name= hi!, id=97, email=hi!, password=admin]", "User [name= hi!, id=97, email=hi!, password=]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=]", "FALSE", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        users.UserInfo userInfo16 = userInfoFactory0.makeUser("", "password_112338187831000", "manager_112327586653400");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
        org.junit.Assert.assertNull(userInfo16);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getComment();
        boolean boolean4 = csvReader1.getUseComments();
        csvReader1.setTextQualifier('#');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        reservations.Reservation reservation67 = null;
        users.FacultyMember facultyMember70 = new users.FacultyMember("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=admin]");
        java.lang.String str71 = facultyMember70.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            int int72 = reservationSystemFacade0.calculateOutstanding(reservation67, (users.UserInfo) facultyMember70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str71, "User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        java.lang.String str6 = csvReader1.get(97);
        csvReader1.setRecordDelimiter('\"');
        boolean boolean9 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        userLogin.User user6 = new userLogin.User("password_112310734370300", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", 10, "", "hi!", "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        java.lang.String str3 = facultyMember2.parkinglot;
        java.lang.String str4 = facultyMember2.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", "password_112296757334200");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.email;
        java.lang.String str10 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        maintainUser0.path = "User [name= hi!, id=97, email=hi!, password=admin]";
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = superManager0.firstName;
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "password_112306347644100" + "'", str2, "password_112306347644100");
        org.junit.Assert.assertNotNull(manager3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getComment();
        java.lang.String str5 = csvReader1.getHeader(5);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("Password!23", '\"', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        facultyMember2.parkinglot = "password_112306347644100";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade11);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", "password_112343396437900");
        int int3 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        manager.SuperManager superManager75 = manager.SuperManager.getInstance();
        superManager75.firstName = "";
        manager.Manager manager78 = superManager75.autoGenerator();
        users.FacultyMember facultyMember81 = new users.FacultyMember("", "hi!");
        int int82 = facultyMember81.parkingspacenum;
        facultyMember81.parkinglot = "hi!";
        facultyMember81.setValid();
        boolean boolean86 = manager78.validateUser((users.UserInfo) facultyMember81);
        java.lang.String str87 = facultyMember81.parkinglot;
        paymentStrategy.PaymentInfo paymentInfo93 = new paymentStrategy.PaymentInfo((int) (short) 0, 100, "", "password_112306347644100", 35);
        facultyMember81.setPaymentInfo(paymentInfo93);
        boolean boolean96 = debitPaymentProvider58.handlePayment(paymentInfo93, 0.0d);
        paymentInfo93.setExpDate((int) '4');
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str20, "User [name= hi!, id=97, email=hi!, password=]");
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
        org.junit.Assert.assertNotNull(superManager75);
        org.junit.Assert.assertNotNull(manager78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        paymentStrategy.PaymentInfo paymentInfo75 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int76 = paymentInfo75.getSecurityCode();
        java.lang.String str77 = paymentInfo75.getBillingAddress();
        java.lang.String str78 = paymentInfo75.getBillingAddress();
        int int79 = paymentInfo75.getCardNum();
        int int80 = paymentInfo75.getExpDate();
        boolean boolean82 = otherTypeProvider0.handlePayment(paymentInfo75, (double) 8);
        paymentInfo75.setSecurityCode(35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(superManager40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(paymentInfo46);
        org.junit.Assert.assertNull(reservation47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 97 + "'", int76 == 97);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        csvWriter1.setUseTextQualifier(false);
        char char7 = csvWriter1.getTextQualifier();
        com.csvreader.CsvReader csvReader9 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean10 = csvReader9.readRecord();
        csvReader9.setSafetySwitch(true);
        java.lang.String[] strArray13 = csvReader9.getValues();
        boolean boolean14 = csvReader9.getSafetySwitch();
        java.lang.String[] strArray15 = csvReader9.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray15);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
        org.junit.Assert.assertNotNull(csvReader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        int int9 = csvReader1.getHeaderCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = csvReader1.skipLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.email = "User [name= hi!, id=97, email=hi!, password=hi!]";
        java.lang.String str19 = user6.getFName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader(reader0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter inputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("manager_112327586653400");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        java.lang.String str15 = user6.email;
        user6.setPassword("password_112338187831000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.toString();
        java.lang.String str14 = user6.fname;
        user6.setType("User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.password;
        java.lang.String str10 = user6.password;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        csvReader1.setUseComments(false);
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        paymentStrategy.OtherTypeProvider otherTypeProvider16 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo22.setBillingName("FALSE");
        boolean boolean26 = otherTypeProvider16.handlePayment(paymentInfo22, (double) (short) 1);
        paymentInfo22.setBillingAddress("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        int int29 = paymentInfo22.getExpDate();
        facultyMember9.setPaymentInfo(paymentInfo22);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "password_112306347644100" + "'", str2, "password_112306347644100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.setEmail("hi!");
        int int14 = user6.id;
        java.lang.String str15 = user6.getType();
        user6.setValidation("User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        parking.ParkingSpace parkingSpace12 = reservation10.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList13 = parkingSpace12.getReservations();
        parkingSpace12.setId(0);
        boolean boolean16 = parkingSpace12.isEnabled();
        parkingState.State state17 = parkingSpace12.getSensorStatus();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(state17);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        int int53 = paymentInfo41.getExpDate();
        paymentInfo41.setSecurityCode(100);
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("FALSE");
        csvReader1.setUseTextQualifier(false);
        int int11 = csvReader1.getIndex("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        boolean boolean5 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        int int51 = paymentInfo39.getCardNum();
        int int52 = paymentInfo39.getExpDate();
        paymentInfo39.setExpDate(35);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        int int14 = user6.getId();
        int int15 = user6.getId();
        java.lang.String str16 = user6.getFName();
        user6.email = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FALSE" + "'", str16, "FALSE");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        csvReader1.setRecordDelimiter('a');
        csvReader1.setTextQualifier('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        boolean boolean13 = csvReader1.getTrimWhitespace();
        long long14 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.setEmail("hi!");
        int int14 = user6.getId();
        java.lang.String str15 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        parkingState.Enabled enabled0 = new parkingState.Enabled();
        java.lang.String str1 = enabled0.handleState();
        java.lang.String str2 = enabled0.handleState();
        java.lang.String str3 = enabled0.handleState();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("hi!", "admin");
        paymentStrategy.PaymentInfo paymentInfo3 = nonFacultyStaff2.getPaymentInfo();
        int int4 = nonFacultyStaff2.getParkingRate();
        int int5 = nonFacultyStaff2.getParkingRate();
        nonFacultyStaff2.parkinglot = "Password!23";
        org.junit.Assert.assertNull(paymentInfo3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        maintainUser0.path = "password_112347399105200";
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        csvReader1.setRecordDelimiter('\000');
        csvReader1.setTextQualifier('\"');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        java.lang.String str11 = csvReader1.get("hi!");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        java.lang.String str12 = reservation11.getPlate();
        int int13 = reservation11.getStartTime();
        parking.ParkingSpace parkingSpace14 = reservation11.getSpace();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password!23" + "'", str12, "Password!23");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(parkingSpace14);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        int int4 = csvWriter1.getEscapeMode();
        csvWriter1.setForceQualifier(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        char char9 = csvReader1.getComment();
        csvReader1.setDelimiter('a');
        csvReader1.setSkipEmptyRecords(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '#' + "'", char9 == '#');
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot(34, "password_112310734370300");
        boolean boolean7 = parkingLot6.getEnabled();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        paymentStrategy.PaymentInfo paymentInfo41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = debitPaymentProvider0.handlePayment(paymentInfo41, (double) (short) 0);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str36, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        csvReader1.close();
        csvReader1.setTextQualifier('\"');
        char char5 = csvReader1.getTextQualifier();
        java.lang.String str6 = csvReader1.getRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        int int4 = csvReader1.getColumnCount();
        java.lang.String str6 = csvReader1.get("password_112338187831000");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = manager3.getPassword();
        java.lang.String str5 = manager3.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112347878777100" + "'", str4, "password_112347878777100");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "manager_112347878775000" + "'", str5, "manager_112347878775000");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        manager.Manager manager2 = new manager.Manager("hi!", "hi!");
        manager2.setUsername("");
        java.lang.String str5 = manager2.getUsername();
        java.lang.String str6 = manager2.firstName;
        java.lang.String str7 = manager2.getPassword();
        java.lang.String str8 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setRecordDelimiter('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        csvReader1.setSkipEmptyRecords(true);
        csvReader1.setEscapeMode(1);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        userLogin.User user0 = new userLogin.User();
        int int1 = user0.id;
        boolean boolean2 = user0.isValidated;
        java.lang.String str3 = user0.password;
        java.lang.String str4 = user0.email;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
// flaky:         maintainUser0.load("User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.State state12 = parkingSpace9.getSensorStatus();
        int int13 = parkingSpace9.getId();
        parkingSpace9.setId(2);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot(8);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap7 = parkingSystem0.getLots();
        parkingSystem0.setEnableLot((int) (byte) -1, false);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertNull(parkingLot6);
        org.junit.Assert.assertNotNull(intMap7);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        java.lang.String str4 = superManager0.getPassword();
        java.lang.String str5 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112337353214100" + "'", str4, "password_112337353214100");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "password_112337353214100" + "'", str5, "password_112337353214100");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        int int9 = csvReader1.getHeaderCount();
        csvReader1.setSafetySwitch(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        java.lang.String str7 = facultyMember2.getPassword();
        java.lang.String str8 = facultyMember2.parkinglot;
        facultyMember2.parkinglot = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        users.Visitor visitor2 = new users.Visitor("", "");
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) '#', (int) (short) -1, "password_112284545599300", "password_112284545599300", (int) (short) 1);
        visitor2.setPaymentInfo(paymentInfo8);
        int int10 = visitor2.getParkingRate();
        int int11 = visitor2.parkingspacenum;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) ' ');
        boolean boolean5 = false; // flaky: parkingSystem0.isLotEnabled((int) (byte) 10);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNull(parkingLot3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        facultyMember2.setValid();
        java.lang.String str7 = facultyMember2.getPassword();
        int int8 = facultyMember2.getParkingRate();
        facultyMember2.parkinglot = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.toString();
        java.lang.String str12 = user6.getLName();
        user6.setPassword("Password!23");
        user6.lname = "Password!23";
        int int17 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str11, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        boolean boolean9 = csvReader1.readHeaders();
        char char10 = csvReader1.getTextQualifier();
        java.lang.String str12 = csvReader1.get("manager_112305914121600");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setComment('\000');
        java.lang.String str8 = csvReader1.getHeader(10);
        com.csvreader.CsvReader csvReader10 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean11 = csvReader10.readRecord();
        csvReader10.setSafetySwitch(true);
        boolean boolean14 = csvReader10.skipLine();
        java.lang.String[] strArray20 = new java.lang.String[] { "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "password_112284545599300", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "FALSE" };
        csvReader10.setHeaders(strArray20);
        java.lang.String[] strArray22 = csvReader10.getValues();
        csvReader1.setHeaders(strArray22);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(csvReader10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = creditPaymentProvide0.handlePayment(paymentInfo6, (double) 8);
        paymentInfo6.setCardBallance((double) 2);
        java.lang.String str19 = paymentInfo6.getBillingAddress();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.util.Date date9 = null;
        paymentInfo5.parkingInfo(0, date9, "hi!", "hi!", (int) (short) 1);
        int int14 = paymentInfo5.getExpDate();
        paymentInfo5.setBillingName("manager_112305914121600");
        paymentInfo5.setBillingName("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        java.lang.String str6 = paymentInfo5.getBillingName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FALSE" + "'", str6, "FALSE");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        parking.ParkingLot parkingLot50 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace52 = parkingLot50.getParkingSpace((int) ' ');
        reservations.Reservation reservation53 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace52);
        int int54 = reservation53.getDay();
        parking.ParkingSpace parkingSpace55 = reservation53.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList56 = parkingSpace55.getReservations();
        parkingSpace55.setId(0);
        users.FacultyMember facultyMember61 = new users.FacultyMember("", "hi!");
        int int62 = facultyMember61.parkingspacenum;
        facultyMember61.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade65 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot73 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace75 = parkingLot73.getParkingSpace((int) ' ');
        reservations.Reservation reservation76 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace75);
        reservationSystemFacade65.editBooking(reservation76, (int) (byte) 100);
        facultyMember61.currentReservation = reservation76;
        int int80 = reservation76.getMonth();
        parkingSpace55.setReservation(reservation76);
        manager.SuperManager superManager82 = manager.SuperManager.getInstance();
        java.lang.String str83 = superManager82.firstName;
        users.Student student86 = new users.Student("", "hi!");
        boolean boolean87 = superManager82.validateUser((users.UserInfo) student86);
        paymentStrategy.PaymentInfo paymentInfo88 = student86.getPaymentInfo();
        int int89 = student86.getParkingRate();
        reservationSystemFacade0.cancelBooking(reservation76, (users.UserInfo) student86);
        int int91 = reservation76.getStartTime();
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
        org.junit.Assert.assertNotNull(parkingSpace52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(parkingSpace55);
        org.junit.Assert.assertNotNull(reservationList56);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade65);
        org.junit.Assert.assertNotNull(parkingSpace75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(superManager82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(paymentInfo88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 5 + "'", int89 == 5);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 100 + "'", int91 == 100);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", "password_112338187831000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name= FALSE, id=97, email=hi!, password=hi!]" + "'", str3, "User [name= FALSE, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        student4.setValid();
        java.lang.String str8 = student4.parkinglot;
        paymentStrategy.PaymentInfo paymentInfo9 = student4.getPaymentInfo();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(paymentInfo9);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        parking.ParkingSpace parkingSpace12 = reservation10.getSpace();
        parkingSpace12.setEnabled(false);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getSafetySwitch();
        int int7 = csvReader1.getHeaderCount();
        boolean boolean8 = csvReader1.getUseComments();
        boolean boolean10 = csvReader1.isQualified(155);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= FALSE, id=97, email=hi!, password=hi!]");
        boolean boolean3 = csvReader1.isQualified(2);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        parkingSpace9.setId((int) (short) 100);
        parkingSpace9.setId(272);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        csvWriter1.setDelimiter(',');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        manager.Manager manager2 = new manager.Manager("hi!", "hi!");
        manager2.setUsername("");
        java.lang.String str5 = manager2.getUsername();
        java.lang.String str6 = manager2.firstName;
        manager2.lastName = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("User [name= hi!, id=97, email=hi!, password=admin]", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        parking.ParkingSpace parkingSpace6 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation7 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace6);
        parking.ParkingSpace parkingSpace8 = reservation7.getSpace();
        java.lang.String str9 = reservation7.getPlate();
        org.junit.Assert.assertNotNull(parkingSpace8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str9, "User [name= hi!, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        manager7.lastName = "";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getComment();
        boolean boolean11 = csvWriter1.getUseTextQualifier();
        char char12 = csvWriter1.getTextQualifier();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setDelimiter('#');
        int int10 = csvWriter1.getEscapeMode();
        char char11 = csvWriter1.getComment();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '#' + "'", char11 == '#');
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = manager3.firstName;
        java.lang.String str5 = manager3.getPassword();
        manager3.setUsername("User [name= FALSE, id=1, email=hi!, password=hi!]");
        java.lang.String str8 = manager3.firstName;
        java.lang.String str9 = manager3.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "password_112348536883400" + "'", str5, "password_112348536883400");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= FALSE, id=1, email=hi!, password=hi!]" + "'", str9, "User [name= FALSE, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        paymentStrategy.PaymentInfo paymentInfo53 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int54 = paymentInfo53.getSecurityCode();
        java.util.Date date56 = null;
        paymentInfo53.parkingInfo((int) (byte) 1, date56, "hi!", "User [name= hi!, id=97, email=hi!, password=]", 8);
        boolean boolean62 = mobilePaymentProvider46.handlePayment(paymentInfo53, (double) ' ');
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        users.Visitor visitor2 = new users.Visitor("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", "User [name=null null, id=0, email=null, password=null]");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        java.lang.String str12 = reservation11.getPlate();
        int int13 = reservation11.getDay();
        reservation11.updateDuration((int) (short) 100);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password!23" + "'", str12, "Password!23");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        boolean boolean11 = csvReader1.getTrimWhitespace();
        char char12 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.close();
        csvReader1.setComment(',');
        csvReader1.setSkipEmptyRecords(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        user0.type = "password_112296757334200";
        java.lang.String str4 = user0.email;
        user0.setId((-1));
        user0.setValidation("User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        paymentStrategy.PaymentInfo paymentInfo47 = new paymentStrategy.PaymentInfo(97, 5, "admin", "User [name= hi!, id=97, email=hi!, password=]", 10);
        boolean boolean49 = creditPaymentProvide0.handlePayment(paymentInfo47, (double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("FALSE", "Password!23");
        int int3 = nonFacultyStaff2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("password_112347878777100", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        boolean boolean10 = csvReader1.skipLine();
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        csvReader1.setTextQualifier(' ');
        int int8 = csvReader1.getColumnCount();
        csvReader1.setSkipEmptyRecords(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = csvReader1.get(0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(32);
        boolean boolean12 = csvReader1.getTrimWhitespace();
        csvReader1.setTextQualifier('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setEscapeMode(1);
        csvWriter1.close();
        int int11 = csvWriter1.getEscapeMode();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        users.Student student2 = new users.Student("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "password_112337353214100");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        manager.Manager manager2 = new manager.Manager("hi!", "");
        java.lang.String str3 = manager2.getPassword();
        reservations.ReservationSystemFacade reservationSystemFacade4 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap5 = reservationSystemFacade4.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        reservations.Reservation reservation17 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace16);
        users.FacultyMember facultyMember20 = new users.FacultyMember("", "hi!");
        int int21 = facultyMember20.parkingspacenum;
        int int22 = reservationSystemFacade6.calculateOutstanding(reservation17, (users.UserInfo) facultyMember20);
        manager.SuperManager superManager23 = manager.SuperManager.getInstance();
        java.lang.String str24 = superManager23.firstName;
        users.Student student27 = new users.Student("", "hi!");
        boolean boolean28 = superManager23.validateUser((users.UserInfo) student27);
        paymentStrategy.PaymentInfo paymentInfo29 = student27.getPaymentInfo();
        student27.setValid();
        int int31 = reservationSystemFacade4.calculateOutstanding(reservation17, (users.UserInfo) student27);
        java.lang.String str32 = student27.getPassword();
        int int33 = student27.getParkingRate();
        boolean boolean34 = manager2.validateUser((users.UserInfo) student27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(reservationSystemFacade4);
        org.junit.Assert.assertNotNull(intMap5);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(superManager23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(paymentInfo29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider1 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        boolean boolean11 = otherTypeProvider1.handlePayment(paymentInfo7, (double) (short) 1);
        paymentInfo7.setCardBallance(10.0d);
        double double14 = paymentInfo7.getCardBallance();
        int int15 = paymentInfo7.getCardNum();
        boolean boolean17 = creditPaymentProvide0.handlePayment(paymentInfo7, (double) '4');
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
        manager.SuperManager superManager46 = manager.SuperManager.getInstance();
        java.lang.String str47 = superManager46.firstName;
        users.Student student50 = new users.Student("", "hi!");
        boolean boolean51 = superManager46.validateUser((users.UserInfo) student50);
        paymentStrategy.PaymentInfo paymentInfo52 = student50.getPaymentInfo();
        reservations.Reservation reservation53 = student50.currentReservation;
        paymentStrategy.PaymentInfo paymentInfo59 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int60 = paymentInfo59.getSecurityCode();
        java.lang.String str61 = paymentInfo59.getBillingAddress();
        java.util.Date date63 = null;
        paymentInfo59.parkingInfo(0, date63, "hi!", "hi!", (int) (short) 1);
        student50.setPaymentInfo(paymentInfo59);
        boolean boolean70 = debitPaymentProvider18.handlePayment(paymentInfo59, 1.0d);
        boolean boolean72 = creditPaymentProvide0.handlePayment(paymentInfo59, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(superManager46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(paymentInfo52);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getEmail();
        java.lang.String str10 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        csvWriter1.setUseTextQualifier(false);
        char char19 = csvWriter1.getComment();
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '#' + "'", char19 == '#');
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("password_112284545599300");
        csvReader1.setSafetySwitch(true);
        char char4 = csvReader1.getDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setForceQualifier(false);
        csvWriter1.setRecordDelimiter('#');
        char char10 = csvWriter1.getRecordDelimiter();
        csvWriter1.setForceQualifier(true);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("Password!23");
        csvWriter1.setEscapeMode(5);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("hi!");
        superManager0.firstName = "password_112347878777100";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        java.lang.String str22 = enabled17.handleState();
        java.lang.String str23 = enabled17.handleState();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        char char12 = csvWriter1.getDelimiter();
        boolean boolean13 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        char char10 = csvWriter1.getDelimiter();
        int int11 = csvWriter1.getEscapeMode();
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        csvReader1.setDelimiter('\"');
        int int12 = csvReader1.getHeaderCount();
        boolean boolean13 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        java.lang.String str5 = csvReader1.get((int) (byte) -1);
        int int6 = csvReader1.getColumnCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = csvReader1.skipLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        int int16 = reservation15.getDay();
        parking.ParkingSpace parkingSpace17 = reservation15.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList18 = parkingSpace17.getReservations();
        reservations.Reservation reservation19 = new reservations.Reservation(5, (int) ',', (-1), (int) (short) 10, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", parkingSpace17);
        java.lang.String str20 = reservation19.getPlate();
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]" + "'", str20, "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.fname = "";
        user6.setId(5);
        user6.lname = "password_112336809022100";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.email;
        java.lang.String str10 = user6.lname;
        user6.password = "password_112284545599300";
        user6.setValidation("User [name= hi!, id=97, email=hi!, password=admin]");
        java.lang.String str15 = user6.type;
        java.lang.String str16 = user6.password;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "password_112284545599300" + "'", str16, "password_112284545599300");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        java.lang.String str15 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "password_112347878777100" + "'", str1, "password_112347878777100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "password_112337353214100" + "'", str15, "password_112337353214100");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        boolean boolean9 = csvReader1.readHeaders();
        csvReader1.setUseTextQualifier(true);
        csvReader1.setComment('\000');
        boolean boolean14 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) (byte) -1, "password_112325847983500");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        int int4 = csvReader1.getHeaderCount();
        csvReader1.setTextQualifier(' ');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        java.lang.String str43 = paymentInfo35.getBillingAddress();
        paymentInfo35.setExpDate(155);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("password_112343396437900", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name=null null, id=0, email=null, password=null]", "manager_112305914121600");
        int int3 = nonFacultyStaff2.getParkingRate();
        int int4 = nonFacultyStaff2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("password_112336809022100", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        manager.Manager manager2 = new manager.Manager("password_112284545599300", "password_112306347644100");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        reservation19.updateDuration(768);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("", "hi!");
        boolean boolean3 = nonFacultyStaff2.getIsValid();
        int int4 = nonFacultyStaff2.getParkingRate();
        int int5 = nonFacultyStaff2.getParkingRate();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        csvWriter1.setComment(' ');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("password_112310734370300");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        java.lang.String str11 = user6.lname;
        user6.setName("password_112343396437900", "password_112343396437900");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("password_112337353214100", "FALSE");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parkingSpace7.setId((int) (byte) 10);
        parkingState.Disabled disabled10 = new parkingState.Disabled();
        java.lang.String str11 = disabled10.handleState();
        parkingSpace7.setState((parkingState.State) disabled10);
        java.lang.String str13 = disabled10.handleState();
        java.lang.String str14 = disabled10.handleState();
        java.lang.String str15 = disabled10.handleState();
        java.lang.String str16 = disabled10.handleState();
        java.lang.String str17 = disabled10.handleState();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        paymentStrategy.PaymentInfo paymentInfo75 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = debitPaymentProvider58.handlePayment(paymentInfo75, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "password_112347878777100" + "'", str20, "password_112347878777100");
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
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        java.lang.String str40 = enabled34.handleState();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parkingSpace7.setEnabled(false);
        parkingState.Occupied occupied11 = new parkingState.Occupied("hi!");
        parkingSpace7.setState((parkingState.State) occupied11);
        boolean boolean13 = parkingSpace7.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        int int4 = csvReader1.getHeaderCount();
        boolean boolean5 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getValidation();
        java.lang.String str14 = user6.email;
        boolean boolean15 = user6.isValidated;
        java.lang.String str16 = user6.type;
        java.lang.String str17 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider1 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        boolean boolean11 = otherTypeProvider1.handlePayment(paymentInfo7, (double) (short) 1);
        boolean boolean13 = creditPaymentProvide0.handlePayment(paymentInfo7, (double) (short) 0);
        paymentInfo7.setBillingName("password_112284545599300");
        paymentInfo7.setCardNum(100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str9 = csvReader1.getRawRecord();
        boolean boolean10 = csvReader1.getCaptureRawRecord();
        boolean boolean11 = csvReader1.getUseTextQualifier();
        boolean boolean12 = csvReader1.getCaptureRawRecord();
        csvReader1.setUseComments(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        parkingState.Unoccupied unoccupied0 = new parkingState.Unoccupied();
        java.lang.String str1 = unoccupied0.handleState();
        java.lang.String str2 = unoccupied0.handleState();
        java.lang.String str3 = unoccupied0.handleState();
        java.lang.String str4 = unoccupied0.handleState();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        users.FacultyMember facultyMember2 = new users.FacultyMember("password_112310734370300", "password_112325847983500");
        java.lang.String str3 = facultyMember2.getPassword();
        facultyMember2.parkingspacenum = 32;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112325847983500" + "'", str3, "password_112325847983500");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        int int76 = nonFacultyStaff30.getParkingRate();
        int int77 = nonFacultyStaff30.parkingspacenum;
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "password_112347878777100" + "'", str20, "password_112347878777100");
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
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("admin");
        boolean boolean2 = csvReader1.skipRecord();
        java.lang.String[] strArray3 = csvReader1.getValues();
        csvReader1.setSafetySwitch(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        java.lang.String str12 = reservation11.getPlate();
        int int13 = reservation11.getStartTime();
        java.lang.String str14 = reservation11.getPlate();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password!23" + "'", str12, "Password!23");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Password!23" + "'", str14, "Password!23");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        csvReader1.setTextQualifier('4');
        java.lang.String[] strArray6 = csvReader1.getHeaders();
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setRecordDelimiter('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('\000');
        char char4 = csvReader1.getDelimiter();
        int int5 = csvReader1.getColumnCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        int int18 = csvWriter1.getEscapeMode();
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("password_112347399105200", ',', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        users.FacultyMember facultyMember2 = new users.FacultyMember("password_112296757334200", "hi!");
        java.lang.String str3 = facultyMember2.parkinglot;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        java.lang.String str15 = reservation10.getPlate();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        java.util.Date date62 = null;
        paymentInfo42.parkingInfo(0, date62, "", "password_112347878777100", (int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(superManager29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "password_112347878777100" + "'", str30, "password_112347878777100");
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        userLogin.User user6 = new userLogin.User("", "admin", 32, "hi!", "password_112284545599300", "User [name= hi!, id=97, email=hi!, password=admin]");
        user6.lname = "hi!";
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        java.lang.String str11 = user6.password;
        user6.setValidation("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "password_112284545599300" + "'", str11, "password_112284545599300");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        csvWriter1.setDelimiter('a');
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context1 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        paymentInfo7.setCardNum(1);
        boolean boolean13 = context1.execute(paymentInfo7, (double) 97);
        int int14 = paymentInfo7.getExpDate();
        java.util.Date date16 = null;
        paymentInfo7.parkingInfo((-30), date16, "manager_112327586653400", "password_112347878777100", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.getLName();
        user6.type = "password_112310734370300";
        java.lang.String str16 = user6.getFName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        java.lang.String str6 = csvReader1.get(97);
        csvReader1.setRecordDelimiter('\"');
        char char9 = csvReader1.getDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String[] strArray7 = csvReader1.getValues();
        java.lang.String str9 = csvReader1.getHeader(0);
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        csvWriter1.setDelimiter(',');
        csvWriter1.setRecordDelimiter('a');
        char char20 = csvWriter1.getRecordDelimiter();
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'a' + "'", char20 == 'a');
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        parkingState.Occupied occupied1 = new parkingState.Occupied("User [name= FALSE, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        boolean boolean2 = user0.isValidated;
        user0.type = "password_112347399105200";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.getLName();
        java.lang.String str14 = user6.getPassword();
        user6.password = "password_112310734370300";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        int int4 = csvReader1.getHeaderCount();
        java.lang.String[] strArray5 = csvReader1.getValues();
        int int7 = csvReader1.getIndex("admin");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        maintainUser0.path = "User [name= hi!, id=97, email=hi!, password=]";
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        java.lang.String str17 = user6.getLName();
        java.lang.String str18 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        userLogin.MaintainUser maintainUser14 = new userLogin.MaintainUser();
        java.lang.String str15 = maintainUser14.path;
        userLogin.MaintainUser maintainUser16 = new userLogin.MaintainUser();
        maintainUser16.update("admin");
        maintainUser16.path = "hi!";
        userLogin.MaintainUser maintainUser21 = new userLogin.MaintainUser();
        java.lang.String str22 = maintainUser21.path;
        userLogin.MaintainUser maintainUser23 = new userLogin.MaintainUser();
        maintainUser23.update("admin");
        java.util.ArrayList<userLogin.User> userList26 = maintainUser23.users;
        maintainUser21.users = userList26;
        maintainUser16.users = userList26;
        maintainUser14.users = userList26;
        maintainUser0.users = userList26;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        reservations.Reservation reservation35 = facultyMember2.currentReservation;
        int int36 = reservation35.getDay();
        int int37 = reservation35.getDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(reservation35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.getLName();
        user6.type = "password_112310734370300";
        boolean boolean16 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.skipLine();
        csvReader1.setComment('\"');
        csvReader1.setTrimWhitespace(false);
        long long11 = csvReader1.getCurrentRecord();
        long long12 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "manager_112327586653400";
        java.lang.String str13 = user6.getPassword();
        java.lang.String str14 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "manager_112327586653400" + "'", str13, "manager_112327586653400");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]" + "'", str14, "User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        char char4 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        csvWriter1.setRecordDelimiter('\000');
        csvWriter1.setUseTextQualifier(false);
        char char14 = csvWriter1.getComment();
        csvWriter1.setComment(' ');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '#' + "'", char14 == '#');
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setComment('4');
        boolean boolean7 = csvReader1.skipLine();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        csvReader1.setCaptureRawRecord(true);
        java.lang.String str12 = csvReader1.get("password_112284545599300");
        csvReader1.setCaptureRawRecord(false);
        char char15 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '4' + "'", char15 == '4');
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap43 = reservationSystemFacade0.getLots();
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
        org.junit.Assert.assertNotNull(intMap43);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getRecordDelimiter();
        char char5 = csvWriter1.getComment();
        boolean boolean6 = csvWriter1.getForceQualifier();
        char char7 = csvWriter1.getRecordDelimiter();
        csvWriter1.setForceQualifier(false);
        int int10 = csvWriter1.getEscapeMode();
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setEscapeMode(1);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("password_112347878777100");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        java.lang.String str11 = user6.lname;
        user6.setType("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String str14 = user6.getPassword();
        java.lang.String str15 = user6.getEmail();
        user6.setType("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(52, 15, "User [name= hi!, id=97, email=hi!, password=hi!]", "password_112343396437900", 768);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot4 = parkingSystem0.getLot((int) '\000');
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot(100);
        // The following exception was thrown during execution in test generation
        try {
            parking.ParkingSpace parkingSpace9 = null; // flaky: parkingSystem0.getParkingSpace(100, (int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid space id");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot4);
        org.junit.Assert.assertNotNull(parkingLot6);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        csvWriter1.setForceQualifier(true);
        int int12 = csvWriter1.getEscapeMode();
        csvWriter1.setTextQualifier('4');
        csvWriter1.setEscapeMode(100);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= FALSE, id=1, email=hi!, password=hi!]", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        java.lang.String str15 = superManager0.firstName;
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str2, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        char char31 = csvWriter1.getRecordDelimiter();
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
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\"' + "'", char31 == '\"');
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        java.lang.String str2 = user0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        int int25 = reservation13.getMonth();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        paymentInfo39.setCardNum(10);
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
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("password_112284545599300");
        csvReader1.setTextQualifier('4');
        int int4 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingSpace4.isEnabled();
        parkingSpace4.setEnabled(true);
        parkingSpace4.setId(155);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        java.lang.String str11 = user6.lname;
        user6.setType("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String str14 = user6.getPassword();
        java.lang.String str15 = user6.getEmail();
        user6.type = "User [name=null null, id=0, email=null, password=null]";
        user6.email = "password_112312047073100";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        parkingState.Occupied occupied1 = new parkingState.Occupied("password_112296757334200");
        java.lang.String str2 = occupied1.handleState();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "password_112296757334200" + "'", str2, "password_112296757334200");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=hi!, password=]", "");
        manager2.lastName = "FALSE";
        manager2.lastName = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        manager.SuperManager superManager7 = manager.SuperManager.getInstance();
        java.lang.String str8 = superManager7.firstName;
        java.lang.String str9 = superManager7.getUsername();
        users.FacultyMember facultyMember12 = new users.FacultyMember("", "hi!");
        boolean boolean13 = superManager7.validateUser((users.UserInfo) facultyMember12);
        boolean boolean14 = manager2.validateUser((users.UserInfo) facultyMember12);
        java.lang.String str15 = facultyMember12.getPassword();
        reservations.Reservation reservation16 = facultyMember12.currentReservation;
        org.junit.Assert.assertNotNull(superManager7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str9, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(reservation16);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setForceQualifier(false);
        int int8 = csvWriter1.getEscapeMode();
        boolean boolean9 = csvWriter1.getForceQualifier();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        boolean boolean9 = csvReader1.getUseTextQualifier();
        java.lang.String str10 = csvReader1.getRawRecord();
        csvReader1.setComment('#');
        csvReader1.setSafetySwitch(true);
        char char15 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\"' + "'", char15 == '\"');
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        users.FacultyMember facultyMember2 = new users.FacultyMember("Password!23", "User [name=null null, id=0, email=null, password=null]");
        paymentStrategy.PaymentInfo paymentInfo3 = facultyMember2.getPaymentInfo();
        org.junit.Assert.assertNull(paymentInfo3);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        users.Visitor visitor2 = new users.Visitor("", "");
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) '#', (int) (short) -1, "password_112284545599300", "password_112284545599300", (int) (short) 1);
        visitor2.setPaymentInfo(paymentInfo8);
        int int10 = visitor2.getParkingRate();
        visitor2.parkingspacenum = 100;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.getLName();
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setId((int) '#');
        java.lang.String str18 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str18, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        userLogin.MaintainUser maintainUser4 = new userLogin.MaintainUser();
        maintainUser4.update("admin");
        java.util.ArrayList<userLogin.User> userList7 = maintainUser4.users;
        maintainUser0.users = userList7;
        maintainUser0.path = "password_112310734370300";
        maintainUser0.path = "FALSE";
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setComment(' ');
        boolean boolean9 = csvReader1.getSkipEmptyRecords();
        char char10 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        user6.type = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str19 = user6.password;
        java.lang.String str20 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        int int11 = user6.getId();
        user6.setName("manager_112347878775000", "password_112284545599300");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
            csvReader1.setEscapeMode((-30));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        java.lang.String str5 = csvReader1.get(100);
        csvReader1.setSkipEmptyRecords(false);
        boolean boolean8 = csvReader1.getTrimWhitespace();
        boolean boolean9 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        users.Visitor visitor2 = new users.Visitor("password_112325847983500", "password_112296757334200");
        int int3 = visitor2.getParkingRate();
        int int4 = visitor2.getParkingRate();
        paymentStrategy.PaymentInfo paymentInfo5 = visitor2.getPaymentInfo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNull(paymentInfo5);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String str7 = csvReader1.getRawRecord();
        int int8 = csvReader1.getColumnCount();
        boolean boolean9 = csvReader1.getCaptureRawRecord();
        csvReader1.setUseComments(true);
        csvReader1.setDelimiter('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) '\000', "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
        boolean boolean3 = parkingLot2.getEnabled();
        int int4 = parkingLot2.getId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("password_112347399105200", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.close();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        long long5 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        java.lang.String str15 = user6.toString();
        user6.setPassword("password_112336809022100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= FALSE, id=97, email=hi!, password=hi!]" + "'", str15, "User [name= FALSE, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        reservationSystemFacade0.editBooking(reservation36, 97);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap41 = reservationSystemFacade0.getLots();
        parking.ParkingLot parkingLot49 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace51 = parkingLot49.getParkingSpace((int) ' ');
        boolean boolean52 = parkingSpace51.isEnabled();
        reservations.Reservation reservation53 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace51);
        java.lang.String str54 = reservation53.getPlate();
        int int55 = reservation53.getDay();
        int int56 = reservation53.getStartTime();
        users.FacultyMember facultyMember59 = new users.FacultyMember("", "hi!");
        int int60 = facultyMember59.parkingspacenum;
        facultyMember59.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade63 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot71 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace73 = parkingLot71.getParkingSpace((int) ' ');
        reservations.Reservation reservation74 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace73);
        reservationSystemFacade63.editBooking(reservation74, (int) (byte) 100);
        facultyMember59.currentReservation = reservation74;
        paymentStrategy.OtherTypeProvider otherTypeProvider78 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo84 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo84.setBillingName("FALSE");
        boolean boolean88 = otherTypeProvider78.handlePayment(paymentInfo84, (double) (short) 1);
        paymentInfo84.setCardBallance(10.0d);
        facultyMember59.setPaymentInfo(paymentInfo84);
        reservationSystemFacade0.cancelBooking(reservation53, (users.UserInfo) facultyMember59);
        int int93 = facultyMember59.parkingspacenum;
        facultyMember59.parkinglot = "password_112336809022100";
        int int96 = facultyMember59.getParkingRate();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(parkingSpace38);
        org.junit.Assert.assertNotNull(intMap41);
        org.junit.Assert.assertNotNull(parkingSpace51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Password!23" + "'", str54, "Password!23");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade63);
        org.junit.Assert.assertNotNull(parkingSpace73);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 8 + "'", int96 == 8);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.getValidation();
        java.lang.String str13 = user6.getFName();
        user6.lname = "password_112343396437900";
        java.lang.String str16 = user6.password;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        int int81 = paymentInfo77.getCardNum();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(superManager28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
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
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 35 + "'", int81 == 35);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        paymentInfo10.setExpDate((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        parkingSpace9.setId((int) (byte) 1);
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
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        boolean boolean7 = csvReader1.readHeaders();
        boolean boolean8 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) '\000', "admin");
        java.lang.String str3 = parkingLot2.getAddress();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        int int43 = reservation36.getMonth();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        manager.Manager manager3 = superManager0.autoGenerator();
        superManager0.setUsername("User [name= hi!, id=97, email=hi!, password=hi!]");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        users.NonFacultyStaff nonFacultyStaff10 = new users.NonFacultyStaff("hi!", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        boolean boolean11 = superManager0.validateUser((users.UserInfo) nonFacultyStaff10);
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str2, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertNotNull(manager3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str6, "User [name= hi!, id=97, email=hi!, password=hi!]");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        users.FacultyMember facultyMember2 = new users.FacultyMember("FALSE", "password_112296757334200");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.toString();
        user6.type = "User [name= hi!, id=97, email=hi!, password=hi!]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str11, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        csvWriter1.setTextQualifier('a');
        boolean boolean10 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=admin]", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name= FALSE, id=97, email=, password=]", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        student4.setValid();
        java.lang.String str8 = student4.parkinglot;
        int int9 = student4.parkingspacenum;
        int int10 = student4.getParkingRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("admin", "hi!", "Password!23");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        userLogin.MaintainUser maintainUser16 = new userLogin.MaintainUser();
        java.lang.String str17 = maintainUser16.path;
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
        maintainUser16.users = userList28;
        java.util.ArrayList<userLogin.User> userList32 = maintainUser16.users;
        maintainUser0.users = userList32;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        csvReader1.setTextQualifier(' ');
        int int8 = csvReader1.getColumnCount();
        csvReader1.setSkipEmptyRecords(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = csvReader1.readHeaders();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        userLogin.MaintainUser maintainUser24 = new userLogin.MaintainUser();
        maintainUser24.update("admin");
        java.util.ArrayList<userLogin.User> userList27 = maintainUser24.users;
        maintainUser0.users = userList27;
        java.util.ArrayList<userLogin.User> userList29 = maintainUser0.users;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingSpace4.isEnabled();
        parkingSpace4.setEnabled(true);
        parking.ParkingLot parkingLot15 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace17 = parkingLot15.getParkingSpace((int) ' ');
        boolean boolean18 = parkingSpace17.isEnabled();
        reservations.Reservation reservation19 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace17);
        java.lang.String str20 = reservation19.getPlate();
        int int21 = reservation19.getDay();
        int int22 = reservation19.getDay();
        parkingSpace4.setReservation(reservation19);
        reservations.ReservationSystemFacade reservationSystemFacade24 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap25 = reservationSystemFacade24.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade26 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot34 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace36 = parkingLot34.getParkingSpace((int) ' ');
        reservations.Reservation reservation37 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace36);
        users.FacultyMember facultyMember40 = new users.FacultyMember("", "hi!");
        int int41 = facultyMember40.parkingspacenum;
        int int42 = reservationSystemFacade26.calculateOutstanding(reservation37, (users.UserInfo) facultyMember40);
        manager.SuperManager superManager43 = manager.SuperManager.getInstance();
        java.lang.String str44 = superManager43.firstName;
        users.Student student47 = new users.Student("", "hi!");
        boolean boolean48 = superManager43.validateUser((users.UserInfo) student47);
        paymentStrategy.PaymentInfo paymentInfo49 = student47.getPaymentInfo();
        student47.setValid();
        int int51 = reservationSystemFacade24.calculateOutstanding(reservation37, (users.UserInfo) student47);
        parking.ParkingLot parkingLot54 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace56 = parkingLot54.getParkingSpace((int) ' ');
        boolean boolean57 = parkingLot54.getEnabled();
        parking.ParkingSpace parkingSpace59 = parkingLot54.getParkingSpace(10);
        parking.ParkingSpace parkingSpace66 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation67 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace66);
        parkingSpace59.setReservation(reservation67);
        users.Visitor visitor71 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        visitor71.setValid();
        reservationSystemFacade24.cancelBooking(reservation67, (users.UserInfo) visitor71);
        parkingSpace4.setReservation(reservation67);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password!23" + "'", str20, "Password!23");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(reservationSystemFacade24);
        org.junit.Assert.assertNotNull(intMap25);
        org.junit.Assert.assertNotNull(reservationSystemFacade26);
        org.junit.Assert.assertNotNull(parkingSpace36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(superManager43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(paymentInfo49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(parkingSpace56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(parkingSpace59);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getValidation();
        java.lang.String str14 = user6.email;
        java.lang.String str15 = user6.email;
        user6.isValidated = false;
        boolean boolean18 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        paymentInfo34.setCardBallance((double) (-1L));
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
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        java.lang.String str4 = superManager0.getPassword();
        superManager0.setPassword("password_112306347644100");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str4, "User [name= hi!, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setDelimiter('\000');
        csvWriter1.setUseTextQualifier(true);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        char char7 = csvReader1.getComment();
        boolean boolean9 = csvReader1.isQualified(2);
        csvReader1.setSafetySwitch(true);
        csvReader1.setTextQualifier('4');
        csvReader1.setUseTextQualifier(false);
        int int16 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        csvWriter1.setTextQualifier('a');
        char char10 = csvWriter1.getRecordDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("FALSE");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        boolean boolean8 = parkingLot2.getEnabled();
        parkingLot2.setEnabled(false);
        boolean boolean11 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace13 = parkingLot2.getParkingSpace(8);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parkingSpace13);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getValidation();
        java.lang.String str14 = user6.email;
        boolean boolean15 = user6.isValidated;
        java.lang.String str16 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        csvWriter1.setDelimiter(',');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("password_112337353214100");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        manager.Manager manager2 = new manager.Manager("", "admin");
        manager2.lastName = "Password!23";
        users.NonFacultyStaff nonFacultyStaff7 = new users.NonFacultyStaff("", "hi!");
        java.lang.String str8 = nonFacultyStaff7.getEmail();
        boolean boolean9 = manager2.validateUser((users.UserInfo) nonFacultyStaff7);
        int int10 = nonFacultyStaff7.getParkingRate();
        paymentStrategy.PaymentInfo paymentInfo11 = nonFacultyStaff7.getPaymentInfo();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(paymentInfo11);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("password_112344052445500", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = superManager0.firstName;
        java.lang.String str5 = superManager0.lastName;
        java.lang.String str6 = superManager0.getUsername();
        superManager0.setPassword("User [name= hi!, id=97, email=hi!, password=hi!]");
        manager.SuperManager superManager9 = manager.SuperManager.getInstance();
        java.lang.String str10 = superManager9.firstName;
        users.Student student13 = new users.Student("", "hi!");
        boolean boolean14 = superManager9.validateUser((users.UserInfo) student13);
        paymentStrategy.PaymentInfo paymentInfo15 = student13.getPaymentInfo();
        student13.setValid();
        java.lang.String str17 = student13.parkinglot;
        java.lang.String str18 = student13.parkinglot;
        int int19 = student13.parkingspacenum;
        int int20 = student13.parkingspacenum;
        boolean boolean21 = superManager0.validateUser((users.UserInfo) student13);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FALSE" + "'", str5, "FALSE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(paymentInfo15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        parkingState.State state16 = parkingSpace14.getSensorStatus();
        reservations.Reservation reservation17 = new reservations.Reservation((int) (byte) 0, 2, (int) (byte) 0, 2, "admin", parkingSpace14);
        parkingState.Unoccupied unoccupied18 = new parkingState.Unoccupied();
        java.lang.String str19 = unoccupied18.handleState();
        parkingSpace14.setState((parkingState.State) unoccupied18);
        users.FacultyMember facultyMember23 = new users.FacultyMember("", "hi!");
        int int24 = facultyMember23.parkingspacenum;
        facultyMember23.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade27 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot35 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace37 = parkingLot35.getParkingSpace((int) ' ');
        reservations.Reservation reservation38 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace37);
        reservationSystemFacade27.editBooking(reservation38, (int) (byte) 100);
        facultyMember23.currentReservation = reservation38;
        parking.ParkingSpace parkingSpace42 = reservation38.getSpace();
        parkingSpace14.setReservation(reservation38);
        int int44 = reservation38.getDuration();
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade27);
        org.junit.Assert.assertNotNull(parkingSpace37);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        superManager0.firstName = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]";
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str6, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        boolean boolean2 = user0.isValidated;
        java.lang.String str3 = user0.fname;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        int int4 = facultyMember2.getParkingRate();
        facultyMember2.setValid();
        facultyMember2.setValid();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        int int28 = student23.getParkingRate();
        student23.parkinglot = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(superManager19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]" + "'", str20, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(paymentInfo25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentInfo6.setCardBallance(10.0d);
        double double13 = paymentInfo6.getCardBallance();
        int int14 = paymentInfo6.getExpDate();
        paymentInfo6.setCardBallance((double) 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setSafetySwitch(false);
        boolean boolean9 = csvReader1.getSafetySwitch();
        boolean boolean10 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setComment('4');
        boolean boolean7 = csvReader1.skipLine();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        csvReader1.setUseTextQualifier(false);
        long long11 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("password_112343396437900", "password_112344052445500", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112343396437900" + "'", str3, "password_112343396437900");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        boolean boolean7 = csvReader1.skipLine();
        int int9 = csvReader1.getIndex("manager_112347878775000");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("", '\"', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) 0, 8, "manager_112351534964500", "", 15);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot((int) '\"');
        parkingSystem0.setEnableLot(0, false);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertNotNull(parkingLot6);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        java.lang.String str9 = user6.toString();
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str9, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str11, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.password = "hi!";
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setPassword("User [name= hi!, id=97, email=User [name= hi!, id=97, email=hi!, password=], password=manager_112327586653400]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) 0, 100, "", "password_112306347644100", 35);
        int int6 = paymentInfo5.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        boolean boolean2 = csvReader1.skipLine();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.setId(97);
        user6.isValidated = false;
        int int16 = user6.id;
        user6.fname = "FALSE";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        users.Student student2 = new users.Student("password_112337353214100", "password_112343396437900");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        int int9 = csvWriter1.getEscapeMode();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        user6.email = "";
        int int13 = user6.id;
        java.lang.String str14 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.getSafetySwitch();
        java.lang.String str6 = csvReader1.getRawRecord();
        boolean boolean7 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        java.lang.String str6 = paymentInfo5.getBillingName();
        paymentInfo5.setSecurityCode(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FALSE" + "'", str6, "FALSE");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        parkingSpace21.setId(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(state24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("", "hi!", "FALSE");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("User [name= hi!, id=97, email=hi!, password=hi!]", "User [name= hi!, id=97, email=hi!, password=admin]", "User [name= hi!, id=97, email=hi!, password=]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("password_112325847983500", "password_112296757334200", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        users.UserInfo userInfo16 = userInfoFactory0.makeUser("password_112336809022100", "password_112348536883400", "Password!23");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
        org.junit.Assert.assertNull(userInfo16);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot4 = parkingSystem0.getLot((int) '\000');
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot(100);
        parking.ParkingLot parkingLot8 = parkingSystem0.getLot(34);
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) (short) 0);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot4);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertNotNull(parkingLot8);
        org.junit.Assert.assertNotNull(parkingSpace10);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("password_112296757334200");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112296757334200 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        parking.ParkingSpace parkingSpace11 = new parking.ParkingSpace(0);
        java.util.ArrayList<reservations.Reservation> reservationList12 = parkingSpace11.getReservations();
        boolean boolean13 = parkingSpace11.isEnabled();
        reservations.Reservation reservation14 = new reservations.Reservation((int) '4', 1, (int) (short) 10, 8, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", parkingSpace11);
        reservations.Reservation reservation15 = new reservations.Reservation(1, (-30), (int) ',', (int) (short) 100, "password_112337353214100", parkingSpace11);
        java.util.ArrayList<reservations.Reservation> reservationList16 = parkingSpace11.getReservations();
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        paymentStrategy.DebitPaymentProvider debitPaymentProvider36 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.Context context37 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) debitPaymentProvider36);
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider38 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo44 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int45 = paymentInfo44.getSecurityCode();
        java.lang.String str46 = paymentInfo44.getBillingAddress();
        java.util.Date date48 = null;
        paymentInfo44.parkingInfo(0, date48, "hi!", "hi!", (int) (short) 1);
        boolean boolean54 = mobilePaymentProvider38.handlePayment(paymentInfo44, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo60 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        boolean boolean62 = mobilePaymentProvider38.handlePayment(paymentInfo60, (double) (-1.0f));
        boolean boolean64 = debitPaymentProvider36.handlePayment(paymentInfo60, (double) 0);
        paymentStrategy.OtherTypeProvider otherTypeProvider65 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo71 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo71.setBillingName("FALSE");
        boolean boolean75 = otherTypeProvider65.handlePayment(paymentInfo71, (double) (short) 1);
        boolean boolean77 = debitPaymentProvider36.handlePayment(paymentInfo71, (double) 100L);
        boolean boolean79 = context35.execute(paymentInfo71, (double) (-1L));
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingSpace11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        csvReader1.setTextQualifier('4');
        java.lang.String[] strArray6 = csvReader1.getHeaders();
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean10 = csvReader1.getUseComments();
        boolean boolean11 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        paymentStrategy.PaymentInfo paymentInfo8 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int9 = paymentInfo8.getSecurityCode();
        int int10 = paymentInfo8.getSecurityCode();
        double double11 = paymentInfo8.getCardBallance();
        int int12 = paymentInfo8.getCardNum();
        nonFacultyStaff2.setPaymentInfo(paymentInfo8);
        java.util.Date date15 = null;
        paymentInfo8.parkingInfo(2, date15, "password_112351534974900", "password_112325847983500", 264);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        java.lang.String str3 = parkingLot2.getAddress();
        boolean boolean4 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace6 = parkingLot2.getParkingSpace(5);
        java.util.ArrayList<reservations.Reservation> reservationList7 = parkingSpace6.getReservations();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(parkingSpace6);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        reservations.Reservation reservation7 = facultyMember2.currentReservation;
        int int8 = facultyMember2.getParkingRate();
        reservations.Reservation reservation9 = facultyMember2.currentReservation;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNull(reservation9);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        users.Student student2 = new users.Student("", "hi!");
        int int3 = student2.getParkingRate();
        int int4 = student2.getParkingRate();
        java.lang.String str5 = student2.parkinglot;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.setId(97);
        user6.email = "admin";
        user6.setType("Password!23");
        java.lang.String str18 = user6.getFName();
        java.lang.String str19 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        user6.type = "User [name= hi!, id=97, email=hi!, password=]";
        java.lang.String str17 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "FALSE" + "'", str17, "FALSE");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(1, "manager_112305914121600");
        parkingLot2.setEnabled(true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot7 = parkingSystem0.addLot(5, "admin");
        parkingSystem0.setEnableLot(1, false);
        parking.ParkingLot parkingLot12 = parkingSystem0.getLot((int) 'a');
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertNotNull(parkingLot7);
        org.junit.Assert.assertNull(parkingLot12);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        int int35 = paymentInfo23.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getTrimWhitespace();
        java.lang.String str9 = csvReader1.getRawRecord();
        boolean boolean10 = csvReader1.getCaptureRawRecord();
        csvReader1.setUseComments(true);
        csvReader1.setSkipEmptyRecords(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        java.lang.String str18 = maintainUser0.path;
        java.util.ArrayList<userLogin.User> userList19 = maintainUser0.users;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "password_112296757334200" + "'", str18, "password_112296757334200");
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(100, (int) (short) 100, "User [name= FALSE, id=1, email=hi!, password=hi!]", "password_112337353214100", 15);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        csvReader1.setTextQualifier('4');
        java.lang.String[] strArray6 = csvReader1.getHeaders();
        boolean boolean7 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        csvReader1.setUseComments(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        java.lang.String str35 = facultyMember2.getPassword();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        parking.ParkingSpace parkingSpace12 = reservation10.getSpace();
        int int13 = reservation10.getMonth();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        boolean boolean9 = csvReader1.readHeaders();
        char char10 = csvReader1.getTextQualifier();
        boolean boolean11 = csvReader1.getSkipEmptyRecords();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(8);
        boolean boolean12 = csvReader1.getSafetySwitch();
        csvReader1.setComment('\000');
        csvReader1.setUseComments(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        userLogin.User user6 = new userLogin.User("", "User [name= hi!, id=97, email=hi!, password=]", (int) (byte) -1, "FALSE", "admin", "");
        boolean boolean7 = user6.isValidated;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        boolean boolean5 = parkingSystem0.isLotEnabled(0);
        parking.ParkingLot parkingLot8 = parkingSystem0.addLot((-1), "User [name= FALSE, id=97, email=, password=]");
        java.lang.String str9 = parkingLot8.getAddress();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parkingLot8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= FALSE, id=97, email=, password=]" + "'", str9, "User [name= FALSE, id=97, email=, password=]");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.csvreader.CsvReader csvReader1 = null; // flaky: new com.csvreader.CsvReader("manager_112305914121600");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        user6.type = "";
        user6.setValidation("password_112325847983500");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        int int70 = reservation58.getMonth();
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
        org.junit.Assert.assertNotNull(reservationSystemFacade47);
        org.junit.Assert.assertNotNull(parkingSpace57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(parkingSpace69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        int int29 = student23.getParkingRate();
        reservations.Reservation reservation30 = null;
        student23.currentReservation = reservation30;
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
        org.junit.Assert.assertNull(reservation28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        java.lang.String str14 = user6.lname;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str14, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        int int4 = facultyMember2.getParkingRate();
        facultyMember2.setValid();
        reservations.Reservation reservation6 = facultyMember2.currentReservation;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNull(reservation6);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingSpace4.isEnabled();
        parkingSpace4.setEnabled(true);
        parking.ParkingLot parkingLot15 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace17 = parkingLot15.getParkingSpace((int) ' ');
        boolean boolean18 = parkingSpace17.isEnabled();
        reservations.Reservation reservation19 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace17);
        java.lang.String str20 = reservation19.getPlate();
        int int21 = reservation19.getDay();
        int int22 = reservation19.getDay();
        parkingSpace4.setReservation(reservation19);
        int int24 = reservation19.getDay();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Password!23" + "'", str20, "Password!23");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        int int15 = user6.getId();
        user6.setName("FALSE", "hi!");
        user6.id = (byte) 0;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getComment();
        java.lang.String str5 = csvReader1.getHeader((int) (short) 1);
        csvReader1.setComment('a');
        boolean boolean8 = csvReader1.getSkipEmptyRecords();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        java.util.Date date49 = null;
        paymentInfo40.parkingInfo((int) '\000', date49, "User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]", "password_112284545599300", (int) '4');
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        int int8 = csvReader1.getIndex("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setCaptureRawRecord(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        boolean boolean5 = csvReader1.skipLine();
        boolean boolean6 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        java.lang.String str24 = superManager0.lastName;
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(manager15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "FALSE" + "'", str24, "FALSE");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        user6.setName("password_112284545599300", "admin");
        user6.setName("password_112312047073100", "User [name= FALSE, id=97, email=, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        user6.setName("", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        int int80 = facultyMember71.getParkingRate();
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
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str64, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 8 + "'", int80 == 8);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("hi!");
        manager.Manager manager4 = superManager0.autoGenerator();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNotNull(manager4);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) ' ', "FALSE");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        reservations.ReservationSystemFacade reservationSystemFacade26 = reservations.ReservationSystemFacade.getInstance();
        reservations.ReservationSystemFacade reservationSystemFacade27 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap28 = reservationSystemFacade27.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade29 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot37 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace39 = parkingLot37.getParkingSpace((int) ' ');
        reservations.Reservation reservation40 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace39);
        users.FacultyMember facultyMember43 = new users.FacultyMember("", "hi!");
        int int44 = facultyMember43.parkingspacenum;
        int int45 = reservationSystemFacade29.calculateOutstanding(reservation40, (users.UserInfo) facultyMember43);
        users.Student student48 = new users.Student("", "hi!");
        int int49 = student48.getParkingRate();
        reservationSystemFacade27.cancelBooking(reservation40, (users.UserInfo) student48);
        users.FacultyMember facultyMember53 = new users.FacultyMember("", "hi!");
        int int54 = facultyMember53.parkingspacenum;
        facultyMember53.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade57 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot65 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace67 = parkingLot65.getParkingSpace((int) ' ');
        reservations.Reservation reservation68 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace67);
        reservationSystemFacade57.editBooking(reservation68, (int) (byte) 100);
        facultyMember53.currentReservation = reservation68;
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider72 = new paymentStrategy.MobilePaymentProvider();
        reservationSystemFacade26.payBalance(reservation40, (users.UserInfo) facultyMember53, (paymentStrategy.PaymentProvider) mobilePaymentProvider72);
        reservations.ReservationSystemFacade reservationSystemFacade74 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot82 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace84 = parkingLot82.getParkingSpace((int) ' ');
        reservations.Reservation reservation85 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace84);
        users.FacultyMember facultyMember88 = new users.FacultyMember("", "hi!");
        int int89 = facultyMember88.parkingspacenum;
        int int90 = reservationSystemFacade74.calculateOutstanding(reservation85, (users.UserInfo) facultyMember88);
        reservationSystemFacade26.editBooking(reservation85, 768);
        users.Visitor visitor95 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        visitor95.setValid();
        java.lang.String str97 = visitor95.parkinglot;
        int int98 = visitor95.getParkingRate();
        reservationSystemFacade0.cancelBooking(reservation85, (users.UserInfo) visitor95);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade26);
        org.junit.Assert.assertNotNull(reservationSystemFacade27);
        org.junit.Assert.assertNotNull(intMap28);
        org.junit.Assert.assertNotNull(reservationSystemFacade29);
        org.junit.Assert.assertNotNull(parkingSpace39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade57);
        org.junit.Assert.assertNotNull(parkingSpace67);
        org.junit.Assert.assertNotNull(reservationSystemFacade74);
        org.junit.Assert.assertNotNull(parkingSpace84);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNull(str97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 15 + "'", int98 == 15);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        boolean boolean9 = csvReader1.getUseTextQualifier();
        java.lang.String str10 = csvReader1.getRawRecord();
        csvReader1.setComment('#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = csvReader1.skipLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
            boolean boolean12 = csvReader1.isQualified(2);
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
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.password = "Password!23";
        java.lang.String str12 = user6.getLName();
        user6.email = "User [name= hi!, id=97, email=hi!, password=hi!]";
        user6.id = '4';
        java.lang.String str17 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        user6.email = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        boolean boolean15 = user6.isValidated;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        userLogin.User user6 = new userLogin.User("User [name= hi!, id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]", (-1), "password_112284545599300", "admin", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        java.lang.String str7 = user6.getType();
        user6.email = "password_112306347644100";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= FALSE, id=97, email=hi!, password=hi!]" + "'", str7, "User [name= FALSE, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        user6.type = "User [name= hi!, id=97, email=hi!, password=]";
        user6.type = "User [name= hi!, id=97, email=hi!, password=hi!]";
        java.lang.String str19 = user6.getType();
        java.lang.String str20 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str19, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getHeaderCount();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = csvReader1.getHeader(0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        boolean boolean9 = csvReader1.getUseComments();
        java.lang.Class<?> wildcardClass10 = csvReader1.getClass();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.skipLine();
        csvReader1.setComment('\"');
        csvReader1.setTrimWhitespace(false);
        long long11 = csvReader1.getCurrentRecord();
        csvReader1.setComment(',');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        java.lang.String str5 = csvReader1.get(100);
        csvReader1.setSkipEmptyRecords(false);
        csvReader1.setUseComments(false);
        boolean boolean10 = csvReader1.readHeaders();
        int int11 = csvReader1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        boolean boolean9 = user6.isValidated;
        user6.setType("Password!23");
        java.lang.String str12 = user6.type;
        java.lang.String str13 = user6.email;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password!23" + "'", str12, "Password!23");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        users.Visitor visitor2 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        int int3 = visitor2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String str7 = csvReader1.get("FALSE");
        boolean boolean8 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(false);
        csvReader1.setComment(',');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = creditPaymentProvide0.handlePayment(paymentInfo6, (double) 8);
        int int17 = paymentInfo6.getExpDate();
        paymentInfo6.setCardBallance(0.0d);
        paymentInfo6.setCardNum((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        csvWriter1.setTextQualifier('a');
        char char10 = csvWriter1.getComment();
        com.csvreader.CsvReader csvReader12 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean13 = csvReader12.readRecord();
        csvReader12.setSafetySwitch(true);
        csvReader12.setTrimWhitespace(false);
        boolean boolean18 = csvReader12.skipRecord();
        java.lang.String[] strArray19 = csvReader12.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray19, false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertNotNull(csvReader12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setId(5);
        user6.type = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str19 = user6.lname;
        java.lang.String str20 = user6.password;
        user6.id = '\"';
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        manager.Manager manager2 = superManager0.autoGenerator();
        superManager0.setPassword("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        manager.SuperManager superManager75 = manager.SuperManager.getInstance();
        superManager75.firstName = "";
        manager.Manager manager78 = superManager75.autoGenerator();
        users.FacultyMember facultyMember81 = new users.FacultyMember("", "hi!");
        int int82 = facultyMember81.parkingspacenum;
        facultyMember81.parkinglot = "hi!";
        facultyMember81.setValid();
        boolean boolean86 = manager78.validateUser((users.UserInfo) facultyMember81);
        java.lang.String str87 = facultyMember81.parkinglot;
        paymentStrategy.PaymentInfo paymentInfo93 = new paymentStrategy.PaymentInfo((int) (short) 0, 100, "", "password_112306347644100", 35);
        facultyMember81.setPaymentInfo(paymentInfo93);
        boolean boolean96 = debitPaymentProvider58.handlePayment(paymentInfo93, 0.0d);
        paymentInfo93.setSecurityCode(97);
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
        org.junit.Assert.assertNotNull(superManager75);
        org.junit.Assert.assertNotNull(manager78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        csvReader1.setUseComments(false);
        boolean boolean10 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        parking.ParkingSpace parkingSpace12 = reservation10.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList13 = parkingSpace12.getReservations();
        parkingSpace12.setId(0);
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
        parkingSpace12.setReservation(reservation33);
        int int39 = reservation33.getStartTime();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade22);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        csvReader1.setDelimiter('\"');
        int int12 = csvReader1.getHeaderCount();
        int int14 = csvReader1.getIndex("password_112337353214100");
        int int15 = csvReader1.getColumnCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        parkingState.Occupied occupied1 = new parkingState.Occupied("User [name=null null, id=0, email=null, password=null]");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name= hi!, id=97, email=hi!, password=]", "password_112348536883400");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String[] strArray11 = new java.lang.String[] { "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "password_112284545599300", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "FALSE" };
        csvReader1.setHeaders(strArray11);
        boolean boolean13 = csvReader1.readHeaders();
        boolean boolean14 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        users.Student student2 = new users.Student("", "");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        csvWriter1.setForceQualifier(true);
        int int12 = csvWriter1.getEscapeMode();
        csvWriter1.setRecordDelimiter(',');
        csvWriter1.setUseTextQualifier(true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        paymentInfo59.setBillingAddress("password_112296757334200");
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
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        csvReader1.setTextQualifier(',');
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
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        csvReader1.setComment('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.setEmail("hi!");
        boolean boolean14 = user6.isValidated;
        boolean boolean15 = user6.isValidated;
        java.lang.String str16 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        paymentStrategy.OtherTypeProvider otherTypeProvider49 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo55 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo55.setBillingName("FALSE");
        boolean boolean59 = otherTypeProvider49.handlePayment(paymentInfo55, (double) (short) 1);
        paymentStrategy.CreditPaymentProvide creditPaymentProvide60 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo66 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int67 = paymentInfo66.getSecurityCode();
        java.lang.String str68 = paymentInfo66.getBillingAddress();
        java.util.Date date70 = null;
        paymentInfo66.parkingInfo(0, date70, "hi!", "hi!", (int) (short) 1);
        boolean boolean76 = creditPaymentProvide60.handlePayment(paymentInfo66, (double) 8);
        paymentStrategy.PaymentInfo paymentInfo82 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int83 = paymentInfo82.getSecurityCode();
        int int84 = paymentInfo82.getSecurityCode();
        double double85 = paymentInfo82.getCardBallance();
        boolean boolean87 = creditPaymentProvide60.handlePayment(paymentInfo82, (double) '#');
        boolean boolean89 = otherTypeProvider49.handlePayment(paymentInfo82, (double) 0.0f);
        boolean boolean91 = mobilePaymentProvider0.handlePayment(paymentInfo82, (double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 97 + "'", int83 == 97);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 97 + "'", int84 == 97);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        int int9 = csvWriter1.getEscapeMode();
        int int10 = csvWriter1.getEscapeMode();
        csvWriter1.setComment(',');
        char char13 = csvWriter1.getDelimiter();
        csvWriter1.setEscapeMode(2);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + ',' + "'", char13 == ',');
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setComment('\000');
        boolean boolean7 = csvReader1.getSkipEmptyRecords();
        long long8 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setRecordDelimiter('\"');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        parking.ParkingLot parkingLot19 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace21 = parkingLot19.getParkingSpace((int) ' ');
        reservations.Reservation reservation22 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace21);
        int int23 = reservation22.getDay();
        reservation22.updateDuration(2);
        parking.ParkingSpace parkingSpace26 = reservation22.getSpace();
        parkingSpace9.setReservation(reservation22);
        parking.ParkingLot parkingLot30 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace32 = parkingLot30.getParkingSpace((int) ' ');
        boolean boolean33 = parkingLot30.getEnabled();
        parking.ParkingSpace parkingSpace35 = parkingLot30.getParkingSpace(10);
        parking.ParkingSpace parkingSpace42 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation43 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace42);
        parkingSpace35.setReservation(reservation43);
        parkingSpace9.setReservation(reservation43);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertNotNull(parkingSpace32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(parkingSpace35);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        users.Visitor visitor2 = new users.Visitor("Password!23", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        boolean boolean3 = visitor2.getIsValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        facultyMember9.parkinglot = "password_112306347644100";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = creditPaymentProvide0.handlePayment(paymentInfo6, (double) 8);
        int int17 = paymentInfo6.getExpDate();
        paymentInfo6.setExpDate((int) ',');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("FALSE");
        csvWriter1.close();
        csvWriter1.close();
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        int int7 = paymentInfo5.getSecurityCode();
        double double8 = paymentInfo5.getCardBallance();
        int int9 = paymentInfo5.getExpDate();
        int int10 = paymentInfo5.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        csvWriter1.setTextQualifier('#');
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setForceQualifier(false);
        csvWriter1.setUseTextQualifier(true);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getRecordDelimiter();
        char char5 = csvWriter1.getComment();
        boolean boolean6 = csvWriter1.getForceQualifier();
        int int7 = csvWriter1.getEscapeMode();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("password_112296757334200");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.update("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getCaptureRawRecord();
        boolean boolean9 = csvReader1.getUseTextQualifier();
        java.lang.String str10 = csvReader1.getRawRecord();
        csvReader1.setComment('#');
        csvReader1.setSafetySwitch(true);
        boolean boolean15 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("password_112348536883400", "manager_112305914121600");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        users.Visitor visitor2 = new users.Visitor("password_112337353214100", "Password!23");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        manager.Manager manager2 = new manager.Manager("User [name= hi!, id=97, email=hi!, password=]", "");
        manager2.lastName = "FALSE";
        java.lang.String str5 = manager2.lastName;
        java.lang.String str6 = manager2.firstName;
        manager2.lastName = "password_112325847983500";
        manager2.firstName = "password_112338187831000";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FALSE" + "'", str5, "FALSE");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.Context context17 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) mobilePaymentProvider0);
        paymentStrategy.PaymentInfo paymentInfo23 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int24 = paymentInfo23.getSecurityCode();
        double double25 = paymentInfo23.getCardBallance();
        int int26 = paymentInfo23.getCardNum();
        boolean boolean28 = mobilePaymentProvider0.handlePayment(paymentInfo23, (double) 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader(reader0, '\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter inputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name= hi!, id=97, email=hi!, password=admin]", "password_112336809022100");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        java.lang.String str13 = user6.getLName();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        user6.id = ' ';
        java.lang.String str12 = user6.fname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        parking.ParkingSpace parkingSpace84 = new parking.ParkingSpace(0);
        java.util.ArrayList<reservations.Reservation> reservationList85 = parkingSpace84.getReservations();
        boolean boolean86 = parkingSpace84.isEnabled();
        reservations.Reservation reservation87 = new reservations.Reservation((int) '4', 1, (int) (short) 10, 8, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", parkingSpace84);
        parkingSpace4.setReservation(reservation87);
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
        org.junit.Assert.assertNotNull(reservationList85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setRecordDelimiter('a');
        csvReader1.setUseComments(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        csvReader1.setDelimiter('#');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        users.Student student2 = new users.Student("password_112325847983500", "manager_112347878775000");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = manager3.getPassword();
        users.FacultyMember facultyMember7 = new users.FacultyMember("admin", "FALSE");
        paymentStrategy.PaymentInfo paymentInfo8 = facultyMember7.getPaymentInfo();
        boolean boolean9 = manager3.validateUser((users.UserInfo) facultyMember7);
        users.NonFacultyStaff nonFacultyStaff12 = new users.NonFacultyStaff("", "hi!");
        boolean boolean13 = manager3.validateUser((users.UserInfo) nonFacultyStaff12);
        java.lang.String str14 = manager3.getUsername();
        java.lang.String str15 = manager3.lastName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112354709083600" + "'", str4, "password_112354709083600");
        org.junit.Assert.assertNull(paymentInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "manager_112354709081500" + "'", str14, "manager_112354709081500");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        users.Visitor visitor2 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=hi!]");
        int int3 = visitor2.getParkingRate();
        reservations.ReservationSystemFacade reservationSystemFacade4 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap5 = reservationSystemFacade4.getLots();
        users.FacultyMember facultyMember8 = new users.FacultyMember("", "hi!");
        int int9 = facultyMember8.parkingspacenum;
        facultyMember8.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade12 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot20 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace22 = parkingLot20.getParkingSpace((int) ' ');
        reservations.Reservation reservation23 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace22);
        reservationSystemFacade12.editBooking(reservation23, (int) (byte) 100);
        facultyMember8.currentReservation = reservation23;
        int int27 = reservation23.getMonth();
        reservationSystemFacade4.editBooking(reservation23, (int) (byte) 100);
        parking.ParkingLot parkingLot37 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace39 = parkingLot37.getParkingSpace((int) ' ');
        reservations.Reservation reservation40 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace39);
        int int41 = reservation40.getDay();
        parking.ParkingSpace parkingSpace42 = reservation40.getSpace();
        users.FacultyMember facultyMember45 = new users.FacultyMember("", "hi!");
        int int46 = reservationSystemFacade4.calculateOutstanding(reservation40, (users.UserInfo) facultyMember45);
        int int47 = reservation40.getDay();
        visitor2.currentReservation = reservation40;
        parking.ParkingSpace parkingSpace49 = reservation40.getSpace();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertNotNull(reservationSystemFacade4);
        org.junit.Assert.assertNotNull(intMap5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade12);
        org.junit.Assert.assertNotNull(parkingSpace22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(parkingSpace39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(parkingSpace49);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider1 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        boolean boolean11 = otherTypeProvider1.handlePayment(paymentInfo7, (double) (short) 1);
        boolean boolean13 = creditPaymentProvide0.handlePayment(paymentInfo7, (double) (short) 0);
        double double14 = paymentInfo7.getCardBallance();
        paymentInfo7.setExpDate(155);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=hi!]", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        csvWriter1.setTextQualifier('\"');
        boolean boolean10 = csvWriter1.getUseTextQualifier();
        char char11 = csvWriter1.getTextQualifier();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('\000');
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        paymentInfo53.setCardBallance((double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(superManager40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
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
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace((-1));
        reservations.ReservationSystemFacade reservationSystemFacade2 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot10 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace12 = parkingLot10.getParkingSpace((int) ' ');
        reservations.Reservation reservation13 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace12);
        reservationSystemFacade2.editBooking(reservation13, (int) (byte) 100);
        parking.ParkingLot parkingLot23 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace25 = parkingLot23.getParkingSpace((int) ' ');
        reservations.Reservation reservation26 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace25);
        int int27 = reservation26.getDay();
        parking.ParkingSpace parkingSpace28 = reservation26.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList29 = parkingSpace28.getReservations();
        parkingSpace28.setId(0);
        int int32 = parkingSpace28.getId();
        parking.ParkingLot parkingLot40 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace42 = parkingLot40.getParkingSpace((int) ' ');
        reservations.Reservation reservation43 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace42);
        int int44 = reservation43.getDay();
        int int45 = reservation43.getDuration();
        parkingSpace28.setReservation(reservation43);
        reservationSystemFacade2.editBooking(reservation43, 2);
        parkingSpace1.setReservation(reservation43);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(parkingSpace25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(parkingSpace28);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(parkingSpace42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getTrimWhitespace();
        int int5 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setId((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = user6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDuration();
        int int12 = reservation10.getMonth();
        int int13 = reservation10.getMonth();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.getSafetySwitch();
        long long6 = csvReader1.getCurrentRecord();
        boolean boolean7 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        java.lang.String[] strArray9 = csvReader1.getHeaders();
        boolean boolean10 = csvReader1.skipRecord();
        long long11 = csvReader1.getCurrentRecord();
        csvReader1.setRecordDelimiter('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        reservation39.updateDuration((int) ' ');
        users.FacultyMember facultyMember49 = new users.FacultyMember("", "hi!");
        int int50 = facultyMember49.parkingspacenum;
        facultyMember49.parkinglot = "hi!";
        reservationSystemFacade0.cancelBooking(reservation39, (users.UserInfo) facultyMember49);
        reservations.ReservationSystemFacade reservationSystemFacade54 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap55 = reservationSystemFacade54.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade56 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot64 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace66 = parkingLot64.getParkingSpace((int) ' ');
        reservations.Reservation reservation67 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace66);
        users.FacultyMember facultyMember70 = new users.FacultyMember("", "hi!");
        int int71 = facultyMember70.parkingspacenum;
        int int72 = reservationSystemFacade56.calculateOutstanding(reservation67, (users.UserInfo) facultyMember70);
        manager.SuperManager superManager73 = manager.SuperManager.getInstance();
        java.lang.String str74 = superManager73.firstName;
        users.Student student77 = new users.Student("", "hi!");
        boolean boolean78 = superManager73.validateUser((users.UserInfo) student77);
        paymentStrategy.PaymentInfo paymentInfo79 = student77.getPaymentInfo();
        student77.setValid();
        int int81 = reservationSystemFacade54.calculateOutstanding(reservation67, (users.UserInfo) student77);
        int int82 = reservation67.getMonth();
        users.NonFacultyStaff nonFacultyStaff85 = new users.NonFacultyStaff("FALSE", "manager_112305914121600");
        reservations.Reservation reservation86 = nonFacultyStaff85.currentReservation;
        reservationSystemFacade0.cancelBooking(reservation67, (users.UserInfo) nonFacultyStaff85);
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade54);
        org.junit.Assert.assertNotNull(intMap55);
        org.junit.Assert.assertNotNull(reservationSystemFacade56);
        org.junit.Assert.assertNotNull(parkingSpace66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(superManager73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(paymentInfo79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(reservation86);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setDelimiter(',');
        csvReader1.close();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        csvReader1.setUseTextQualifier(false);
        boolean boolean8 = csvReader1.isQualified((int) (byte) 100);
        char char9 = csvReader1.getDelimiter();
        java.lang.String[] strArray10 = csvReader1.getValues();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        java.lang.String str8 = user6.email;
        user6.id = 0;
        user6.type = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str13 = user6.getLName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        user0.type = "password_112296757334200";
        java.lang.String str4 = user0.email;
        boolean boolean5 = user0.isValidated;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        int int30 = paymentInfo17.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        manager.Manager manager2 = new manager.Manager("manager_112305914121600", "hi!");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        users.FacultyMember facultyMember31 = new users.FacultyMember("", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        paymentStrategy.PaymentInfo paymentInfo32 = facultyMember31.getPaymentInfo();
        boolean boolean33 = facultyMember31.getIsValid();
        reservations.ReservationSystemFacade reservationSystemFacade34 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot42 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace44 = parkingLot42.getParkingSpace((int) ' ');
        reservations.Reservation reservation45 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace44);
        reservationSystemFacade34.editBooking(reservation45, (int) (byte) 100);
        java.lang.String str48 = reservation45.getPlate();
        reservation45.updateDuration((int) (short) -1);
        facultyMember31.currentReservation = reservation45;
        student23.currentReservation = reservation45;
        int int53 = student23.getParkingRate();
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
        org.junit.Assert.assertNull(paymentInfo32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(reservationSystemFacade34);
        org.junit.Assert.assertNotNull(parkingSpace44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "admin" + "'", str48, "admin");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        boolean boolean6 = parkingSystem0.isLotEnabled((int) (byte) 100);
        parking.ParkingLot parkingLot9 = parkingSystem0.addLot((-1), "User [name=null null, id=0, email=null, password=null]");
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap10 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap11 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingLot9);
        org.junit.Assert.assertNotNull(intMap10);
        org.junit.Assert.assertNotNull(intMap11);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        users.FacultyMember facultyMember2 = new users.FacultyMember("admin", "FALSE");
        paymentStrategy.PaymentInfo paymentInfo3 = facultyMember2.getPaymentInfo();
        paymentStrategy.OtherTypeProvider otherTypeProvider4 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo10 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo10.setBillingName("FALSE");
        boolean boolean14 = otherTypeProvider4.handlePayment(paymentInfo10, (double) (short) 1);
        paymentStrategy.Context context15 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider4);
        paymentStrategy.OtherTypeProvider otherTypeProvider16 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo22.setBillingName("FALSE");
        boolean boolean26 = otherTypeProvider16.handlePayment(paymentInfo22, (double) (short) 1);
        paymentInfo22.setCardBallance(10.0d);
        double double29 = paymentInfo22.getCardBallance();
        paymentInfo22.setExpDate((int) 'a');
        paymentInfo22.setBillingName("User [name= FALSE, id=97, email=hi!, password=hi!]");
        boolean boolean35 = context15.execute(paymentInfo22, (double) (short) 0);
        facultyMember2.setPaymentInfo(paymentInfo22);
        org.junit.Assert.assertNull(paymentInfo3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        csvReader1.setSkipEmptyRecords(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.password = "Password!23";
        java.lang.String str12 = user6.getLName();
        java.lang.String str13 = user6.getLName();
        java.lang.String str14 = user6.type;
        java.lang.String str15 = user6.lname;
        user6.email = "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        csvReader1.setDelimiter('\"');
        int int12 = csvReader1.getHeaderCount();
        csvReader1.setUseTextQualifier(true);
        csvReader1.setRecordDelimiter('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setSkipEmptyRecords(true);
        long long8 = csvReader1.getCurrentRecord();
        int int10 = csvReader1.getIndex("manager_112347878775000");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        userLogin.User user6 = new userLogin.User("", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", 8, "Password!23", "", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String str7 = user6.password;
        int int8 = user6.id;
        user6.fname = "";
        java.lang.String str11 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]" + "'", str11, "User [name= User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=], id=8, email=Password!23, password=]");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        parking.ParkingSpace parkingSpace23 = reservation16.getSpace();
        parking.ParkingSpace parkingSpace24 = reservation16.getSpace();
        org.junit.Assert.assertNull(paymentInfo3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(reservationSystemFacade5);
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertNotNull(parkingSpace24);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        paymentInfo23.setBillingAddress("User [name= hi!, id=97, email=hi!, password=admin]");
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
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getValidation();
        user6.lname = "hi!";
        java.lang.String str14 = user6.password;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        java.lang.String str10 = csvReader1.get("User [name= hi!, id=97, email=hi!, password=admin]");
        csvReader1.setDelimiter(',');
        long long13 = csvReader1.getCurrentRecord();
        csvReader1.setCaptureRawRecord(true);
        csvReader1.setCaptureRawRecord(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        csvReader1.close();
        csvReader1.setTextQualifier('\"');
        csvReader1.setSafetySwitch(true);
        boolean boolean7 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parkingLot2.setEnabled(true);
        java.lang.String str5 = parkingLot2.getAddress();
        int int6 = parkingLot2.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        reservations.Reservation reservation35 = facultyMember2.currentReservation;
        int int36 = reservation35.getDuration();
        parking.ParkingSpace parkingSpace37 = reservation35.getSpace();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(reservation35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(parkingSpace37);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        int int14 = reservation10.getStartTime();
        reservation10.updateDuration((int) (short) 100);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        users.FacultyMember facultyMember2 = new users.FacultyMember("Password!23", "User [name= hi!, id=97, email=hi!, password=hi!]");
        java.lang.String str3 = facultyMember2.parkinglot;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration(2);
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parkingState.State state15 = parkingSpace14.getSensorStatus();
        parkingState.State state16 = null;
        parkingSpace14.setState(state16);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state15);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("User [name= FALSE, id=97, email=, password=]", '\"');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= FALSE, id=97, email=, password=] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        reservations.Reservation reservation7 = facultyMember2.currentReservation;
        int int8 = facultyMember2.getParkingRate();
        int int9 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.toString();
        java.lang.String str13 = user6.getEmail();
        user6.id = ',';
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("password_112348536883400", '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setSkipEmptyRecords(true);
        java.lang.String str9 = csvReader1.getHeader((int) (short) 10);
        boolean boolean10 = csvReader1.getUseTextQualifier();
        csvReader1.setUseComments(false);
        java.lang.String str14 = csvReader1.getHeader((int) (byte) 100);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        paymentStrategy.PaymentInfo paymentInfo75 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo75.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        paymentInfo75.setBillingAddress("User [name=null null, id=0, email=null, password=null]");
        boolean boolean81 = otherTypeProvider0.handlePayment(paymentInfo75, (double) 'a');
        paymentStrategy.Context context82 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(superManager40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(paymentInfo46);
        org.junit.Assert.assertNull(reservation47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        parking.ParkingSpace parkingSpace12 = reservation10.getSpace();
        boolean boolean13 = parkingSpace12.isEnabled();
        parkingSpace12.setId(264);
        reservations.ReservationSystemFacade reservationSystemFacade16 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot24 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace26 = parkingLot24.getParkingSpace((int) ' ');
        reservations.Reservation reservation27 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace26);
        reservationSystemFacade16.editBooking(reservation27, (int) (byte) 100);
        reservations.ReservationSystemFacade reservationSystemFacade30 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot38 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace40 = parkingLot38.getParkingSpace((int) ' ');
        reservations.Reservation reservation41 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace40);
        reservationSystemFacade30.editBooking(reservation41, (int) (byte) 100);
        users.FacultyMember facultyMember46 = new users.FacultyMember("", "hi!");
        int int47 = facultyMember46.parkingspacenum;
        facultyMember46.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade50 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot58 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace60 = parkingLot58.getParkingSpace((int) ' ');
        reservations.Reservation reservation61 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace60);
        reservationSystemFacade50.editBooking(reservation61, (int) (byte) 100);
        facultyMember46.currentReservation = reservation61;
        manager.SuperManager superManager65 = manager.SuperManager.getInstance();
        java.lang.String str66 = superManager65.firstName;
        users.Student student69 = new users.Student("", "hi!");
        boolean boolean70 = superManager65.validateUser((users.UserInfo) student69);
        paymentStrategy.PaymentInfo paymentInfo71 = student69.getPaymentInfo();
        student69.setValid();
        java.lang.String str73 = student69.parkinglot;
        int int74 = student69.getParkingRate();
        reservationSystemFacade30.cancelBooking(reservation61, (users.UserInfo) student69);
        int int76 = reservation61.getDuration();
        reservationSystemFacade16.editBooking(reservation61, 1);
        parkingSpace12.setReservation(reservation61);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reservationSystemFacade16);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertNotNull(reservationSystemFacade30);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade50);
        org.junit.Assert.assertNotNull(parkingSpace60);
        org.junit.Assert.assertNotNull(superManager65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(paymentInfo71);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 5 + "'", int74 == 5);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.skipLine();
        int int7 = csvReader1.getEscapeMode();
        boolean boolean8 = csvReader1.readHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getRecordDelimiter();
        csvWriter1.setUseTextQualifier(true);
        csvWriter1.setComment(',');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getTrimWhitespace();
        java.lang.String[] strArray5 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        java.lang.String str31 = csvReader1.getHeader((int) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        users.Student student2 = new users.Student("", "hi!");
        int int3 = student2.getParkingRate();
        student2.setValid();
        student2.setValid();
        student2.parkinglot = "manager_112327586653400";
        int int8 = student2.getParkingRate();
        parking.ParkingLot parkingLot16 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace18 = parkingLot16.getParkingSpace((int) ' ');
        reservations.Reservation reservation19 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace18);
        int int20 = reservation19.getDay();
        reservation19.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace23 = reservation19.getSpace();
        parking.ParkingSpace parkingSpace24 = reservation19.getSpace();
        student2.currentReservation = reservation19;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertNotNull(parkingSpace24);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        char char44 = csvWriter1.getTextQualifier();
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
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '\"' + "'", char44 == '\"');
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("User [name= FALSE, id=97, email=hi!, password=hi!]", "password_112312047073100");
        int int3 = nonFacultyStaff2.parkingspacenum;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        facultyMember2.setValid();
        facultyMember2.setValid();
        facultyMember2.parkingspacenum = (byte) 0;
        facultyMember2.setValid();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        csvWriter1.close();
        char char11 = csvWriter1.getComment();
        csvWriter1.setEscapeMode((int) '\"');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '#' + "'", char11 == '#');
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        maintainUser0.path = "password_112348536883400";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        parking.ParkingSpace parkingSpace15 = reservation10.getSpace();
        int int16 = reservation10.getDay();
        java.lang.String str17 = reservation10.getPlate();
        parking.ParkingSpace parkingSpace18 = reservation10.getSpace();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertNotNull(parkingSpace18);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        users.FacultyMember facultyMember6 = new users.FacultyMember("", "hi!");
        int int7 = facultyMember6.parkingspacenum;
        facultyMember6.parkinglot = "hi!";
        facultyMember6.setValid();
        boolean boolean11 = manager3.validateUser((users.UserInfo) facultyMember6);
        java.lang.String str12 = facultyMember6.parkinglot;
        paymentStrategy.PaymentInfo paymentInfo18 = new paymentStrategy.PaymentInfo((int) (short) 0, 100, "", "password_112306347644100", 35);
        facultyMember6.setPaymentInfo(paymentInfo18);
        java.util.Date date21 = null;
        paymentInfo18.parkingInfo(15, date21, "password_112343396437900", "User [name= FALSE, id=1, email=hi!, password=hi!]", (int) '4');
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getComment();
        java.lang.String str5 = csvReader1.getHeader((int) (short) 1);
        csvReader1.setComment('a');
        csvReader1.setRecordDelimiter('a');
        java.lang.String str11 = csvReader1.getHeader((int) '4');
        csvReader1.setDelimiter('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        userLogin.User user6 = new userLogin.User("", "admin", 32, "hi!", "password_112284545599300", "User [name= hi!, id=97, email=hi!, password=admin]");
        user6.lname = "hi!";
        user6.password = "password_112306347644100";
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap3 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot6 = parkingSystem0.getLot((int) '\"');
        parking.ParkingLot parkingLot9 = parkingSystem0.addLot(5, "Password!23");
        parking.ParkingSpace parkingSpace12 = null; // flaky: parkingSystem0.getParkingSpace((int) '\000', 35);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap13 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap14 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertNotNull(intMap4);
        org.junit.Assert.assertNotNull(parkingLot6);
        org.junit.Assert.assertNotNull(parkingLot9);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(intMap13);
        org.junit.Assert.assertNotNull(intMap14);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot3 = parkingSystem0.getLot((int) (byte) 0);
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap4 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(parkingLot3);
        org.junit.Assert.assertNotNull(intMap4);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        char char36 = csvWriter1.getDelimiter();
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
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + ',' + "'", char36 == ',');
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        reservations.Reservation reservation35 = null;
        reservationSystemFacade0.editBooking(reservation35, (int) (short) -1);
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        int int11 = user6.id;
        user6.lname = "manager_112354709081500";
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.path = "admin";
        maintainUser0.path = "User [name= User [name= User [name= hi!, id=97, email=hi!, password=hi!], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=], id=97, email=User [name= hi!, id=97, email=hi!, password=hi!], password=]";
        userLogin.MaintainUser maintainUser5 = new userLogin.MaintainUser();
        java.lang.String str6 = maintainUser5.path;
        userLogin.MaintainUser maintainUser7 = new userLogin.MaintainUser();
        maintainUser7.update("admin");
        java.util.ArrayList<userLogin.User> userList10 = maintainUser7.users;
        maintainUser5.users = userList10;
        maintainUser0.users = userList10;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        csvReader1.setDelimiter('\"');
        boolean boolean12 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.lname;
        java.lang.String str13 = user6.toString();
        java.lang.String str14 = user6.fname;
        user6.setEmail("manager_112351534964500");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        paymentStrategy.PaymentInfo paymentInfo54 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo54.setSecurityCode(10);
        boolean boolean58 = mobilePaymentProvider0.handlePayment(paymentInfo54, (double) 8);
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("hi!");
        char char2 = csvWriter1.getComment();
        boolean boolean3 = csvWriter1.getUseTextQualifier();
        csvWriter1.endRecord();
        char char5 = csvWriter1.getRecordDelimiter();
        csvWriter1.write("password_112306347644100");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        int int13 = user6.id;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        userLogin.User user0 = new userLogin.User();
        int int1 = user0.id;
        boolean boolean2 = user0.isValidated;
        java.lang.String str3 = user0.password;
        user0.setPassword("password_112284545599300");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        manager.Manager manager3 = superManager0.autoGenerator();
        superManager0.setUsername("User [name= hi!, id=97, email=hi!, password=hi!]");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.setUsername("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        superManager0.setPassword("password_112338187831000");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str6, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]" + "'", str7, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
            java.lang.String[] strArray11 = csvReader1.getValues();
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
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("admin", "password_112312047073100");
        java.lang.String str3 = nonFacultyStaff2.parkinglot;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingSpace9.isEnabled();
        reservations.Reservation reservation11 = new reservations.Reservation((int) 'a', (int) (byte) -1, 8, (int) '#', "Password!23", parkingSpace9);
        java.lang.String str12 = reservation11.getPlate();
        int int13 = reservation11.getDay();
        int int14 = reservation11.getMonth();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Password!23" + "'", str12, "Password!23");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        users.UserInfoFactory userInfoFactory0 = new users.UserInfoFactory();
        users.UserInfo userInfo4 = userInfoFactory0.makeUser("", "hi!", "FALSE");
        users.UserInfo userInfo8 = userInfoFactory0.makeUser("password_112284545599300", "", "User [name= hi!, id=97, email=hi!, password=]");
        users.UserInfo userInfo12 = userInfoFactory0.makeUser("User [name=null null, id=0, email=null, password=null]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "password_112306347644100");
        users.UserInfo userInfo16 = userInfoFactory0.makeUser("password_112325847983500", "User [name= hi!, id=97, email=hi!, password=hi!]", "password_112296757334200");
        org.junit.Assert.assertNull(userInfo4);
        org.junit.Assert.assertNull(userInfo8);
        org.junit.Assert.assertNull(userInfo12);
        org.junit.Assert.assertNull(userInfo16);
    }
}
