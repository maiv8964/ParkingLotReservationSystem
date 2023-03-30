import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File  does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.util.Date date9 = null;
        paymentInfo5.parkingInfo(100, date9, "", "hi!", 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("hi!", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = com.csvreader.CsvReader.ESCAPE_MODE_BACKSLASH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        java.lang.Class<?> wildcardClass3 = parkingLot2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter2 = new com.csvreader.CsvWriter(writer0, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter outputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader(inputStream0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("FALSE", '4');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File FALSE does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader(inputStream0, '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        main main0 = new main();
        java.awt.event.ActionEvent actionEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.confirmActions(actionEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        java.lang.Class<?> wildcardClass8 = user6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader(reader0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter inputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        main main0 = new main();
        java.awt.event.ActionEvent actionEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.mainActions(actionEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int0 = com.csvreader.CsvWriter.ESCAPE_MODE_DOUBLED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        java.lang.Class<?> wildcardClass17 = facultyMember14.getClass();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        main main0 = new main();
        java.awt.event.ActionEvent actionEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.registerActions(actionEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        main main0 = new main();
        java.awt.event.ActionEvent actionEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.actionPerformed(actionEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter inputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("", "admin", "FALSE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File hi! does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        userLogin.User user0 = new userLogin.User();
        user0.isValidated = true;
        java.lang.String str3 = user0.getPassword();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.io.OutputStream outputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter(outputStream0, 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        main main0 = new main();
        java.awt.event.ActionEvent actionEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.viewActions(actionEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("hi!", "FALSE");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("User [name= hi!, id=97, email=hi!, password=]", ' ');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=97, email=hi!, password=] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int0 = com.csvreader.CsvWriter.ESCAPE_MODE_BACKSLASH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name= hi!, id=97, email=hi!, password=]", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.io.OutputStream outputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter(outputStream0, '\"', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader(inputStream0, 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter2 = new com.csvreader.CsvWriter(writer0, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter outputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.toString();
        user6.password = "Password!23";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str10, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.State state12 = parkingSpace9.getSensorStatus();
        int int13 = parkingSpace9.getId();
        boolean boolean14 = parkingSpace9.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        csvReader1.setTextQualifier(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = csvReader1.getValues();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(1);
        boolean boolean8 = parkingLot2.getEnabled();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int0 = com.csvreader.CsvReader.ESCAPE_MODE_DOUBLED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        student4.setValid();
        boolean boolean8 = student4.getIsValid();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        user6.setEmail("admin");
        java.lang.String str15 = user6.type;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = csvReader1.isQualified((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        manager.Manager manager2 = new manager.Manager("admin", "FALSE");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setPassword("FALSE");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        main main0 = new main();
        java.awt.event.ActionEvent actionEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.errorActions(actionEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("", '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("admin");
        java.lang.String str4 = superManager0.getPassword();
        manager.Manager manager5 = superManager0.autoGenerator();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str4, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertNotNull(manager5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader(inputStream0, '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("admin");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File admin does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.io.OutputStream outputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter(outputStream0, ' ', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = csvReader1.getIndex("password_112284545599300");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        int int17 = reservation11.getMonth();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        java.lang.String str3 = parkingLot2.getAddress();
        boolean boolean4 = parkingLot2.getEnabled();
        boolean boolean5 = parkingLot2.getEnabled();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        java.lang.String str7 = facultyMember2.getEmail();
        paymentStrategy.PaymentInfo paymentInfo8 = facultyMember2.getPaymentInfo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(paymentInfo8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        main main0 = new main();
        java.awt.event.ActionEvent actionEvent1 = null;
        // The following exception was thrown during execution in test generation
        try {
            main0.paymentActions(actionEvent1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        java.lang.String str7 = user6.getType();
        java.lang.String str8 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.lname;
        user6.setType("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(8, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        boolean boolean7 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.setId((int) (short) 100);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        user6.setPassword("");
        user6.isValidated = true;
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        int int11 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=hi!]", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        int int9 = csvReader1.getColumnCount();
        char char10 = csvReader1.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = csvReader1.get("");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        int int4 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parkingLot2.setEnabled(true);
        java.lang.String str5 = parkingLot2.getAddress();
        boolean boolean6 = parkingLot2.getEnabled();
        java.lang.String str7 = parkingLot2.getAddress();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        manager.Manager manager2 = new manager.Manager("hi!", "admin");
        java.lang.String str3 = manager2.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        java.lang.String str7 = superManager0.lastName;
        superManager0.setPassword("password_112284545599300");
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = csvReader1.isQualified(8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("password_112284545599300", '#');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112284545599300 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        manager.Manager manager2 = new manager.Manager("admin", "Password!23");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        userLogin.User user0 = new userLogin.User();
        user0.isValidated = true;
        user0.setId(1);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        int int4 = csvWriter1.getEscapeMode();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("password_112284545599300");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        user6.setPassword("");
        user6.setPassword("Password!23");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=admin]", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.fname = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("password_112284545599300");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        manager.Manager manager2 = new manager.Manager("FALSE", "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        int int7 = csvReader1.getColumnCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String[] strArray4 = csvReader1.getHeaders();
        char char5 = csvReader1.getTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.isValidated = false;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        java.lang.String str11 = user6.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]" + "'", str11, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("", '4');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File  does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.isValidated = false;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter2 = new com.csvreader.CsvWriter(writer0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter outputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        manager.Manager manager2 = new manager.Manager("hi!", "hi!");
        manager2.setUsername("");
        java.lang.String str5 = manager2.getUsername();
        java.lang.String str6 = manager2.firstName;
        manager2.setUsername("FALSE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.fname = "";
        java.lang.String str12 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        boolean boolean7 = csvReader1.getUseComments();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = csvReader1.getValues();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=admin]", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.skipLine();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.State state12 = parkingSpace9.getSensorStatus();
        boolean boolean13 = parkingSpace9.isEnabled();
        boolean boolean14 = parkingSpace9.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        java.lang.String str7 = facultyMember2.getEmail();
        int int8 = facultyMember2.getParkingRate();
        facultyMember2.parkinglot = "password_112284545599300";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("FALSE", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        char char2 = csvReader1.getTextQualifier();
        long long3 = csvReader1.getCurrentRecord();
        boolean boolean4 = csvReader1.skipRecord();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\"' + "'", char2 == '\"');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        int int4 = csvWriter1.getEscapeMode();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(1);
        int int8 = parkingLot2.getId();
        parkingLot2.setEnabled(true);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        java.lang.String str3 = parkingLot2.getAddress();
        java.lang.String str4 = parkingLot2.getAddress();
        boolean boolean5 = parkingLot2.getEnabled();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        int int4 = facultyMember2.parkingspacenum;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.io.OutputStream outputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter(outputStream0, ',', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getRecordDelimiter();
        com.csvreader.CsvReader csvReader6 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean7 = csvReader6.readRecord();
        csvReader6.setSafetySwitch(true);
        csvReader6.setTrimWhitespace(false);
        boolean boolean12 = csvReader6.skipRecord();
        java.lang.String[] strArray13 = csvReader6.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray13, false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertNotNull(csvReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getSafetySwitch();
        java.lang.String str8 = csvReader1.getHeader(0);
        csvReader1.setRecordDelimiter('a');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader(reader0, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter inputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setSecurityCode(10);
        java.lang.Class<?> wildcardClass8 = paymentInfo5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        java.lang.String[] strArray17 = new java.lang.String[] { "Password!23", "password_112284545599300", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=admin]", "admin" };
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.setDelimiter('#');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getValidation();
        user6.lname = "Password!23";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("hi!", '\"', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.password = "hi!";
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        int int26 = parkingSpace7.getId();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNotNull(reservationSystemFacade8);
        org.junit.Assert.assertNotNull(parkingSpace18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        java.lang.String str40 = facultyMember32.getEmail();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        java.lang.String str65 = facultyMember2.getPassword();
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("Password!23", '\000', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.type = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("admin", "hi!", "User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("admin", ',', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        java.lang.String str4 = superManager0.getPassword();
        superManager0.lastName = "hi!";
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str4, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("admin");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        java.lang.String str11 = user6.getValidation();
        user6.type = "FALSE";
        user6.setId((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        int int4 = csvWriter1.getEscapeMode();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("admin");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name= hi!, id=97, email=hi!, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=97, email=hi!, password=] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        java.lang.String str4 = maintainUser0.path;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("password_112284545599300");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112284545599300 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(32, "admin");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "User [name= hi!, id=97, email=hi!, password=]", "FALSE" };
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray12);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter2 = new com.csvreader.CsvWriter(writer0, '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter outputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        student23.setValid();
        reservations.Reservation reservation29 = student23.currentReservation;
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
        org.junit.Assert.assertNull(reservation29);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        double double94 = paymentInfo83.getCardBallance();
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
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        reservation39.updateDuration(2);
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
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        boolean boolean11 = user6.isValidated;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name= hi!, id=97, email=hi!, password=admin]", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        csvReader1.setTextQualifier(' ');
        int int8 = csvReader1.getColumnCount();
        csvReader1.setSkipEmptyRecords(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = csvReader1.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        manager.Manager manager2 = new manager.Manager("hi!", "");
        manager2.firstName = "Password!23";
        manager2.setUsername("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        int int12 = user6.id;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        char char7 = csvReader1.getComment();
        char char8 = csvReader1.getTextQualifier();
        java.lang.String[] strArray9 = csvReader1.getHeaders();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        userLogin.MaintainUser maintainUser4 = new userLogin.MaintainUser();
        maintainUser4.update("admin");
        java.util.ArrayList<userLogin.User> userList7 = maintainUser4.users;
        maintainUser0.users = userList7;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=]", true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingLot7.getEnabled();
        parking.ParkingSpace parkingSpace12 = parkingLot7.getParkingSpace(10);
        parkingSpace12.setId((int) (byte) 10);
        parkingState.Disabled disabled15 = new parkingState.Disabled();
        java.lang.String str16 = disabled15.handleState();
        parkingSpace12.setState((parkingState.State) disabled15);
        reservations.Reservation reservation18 = new reservations.Reservation((int) (short) 0, (int) '4', 15, 768, "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", parkingSpace12);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("admin");
        char char2 = csvReader1.getDelimiter();
        long long3 = csvReader1.getCurrentRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ',' + "'", char2 == ',');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        csvWriter1.setComment('\"');
        csvWriter1.setTextQualifier('4');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter2 = new com.csvreader.CsvWriter(writer0, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter outputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getValidation();
        java.lang.String str14 = user6.getType();
        java.lang.String str15 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]" + "'", str15, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        manager.Manager manager2 = new manager.Manager("Password!23", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("User [name= hi!, id=97, email=hi!, password=admin]", '\000', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        reservation11.updateDuration((int) ' ');
        int int19 = reservation11.getStartTime();
        reservation11.updateDuration(264);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        int int9 = csvReader1.getColumnCount();
        char char10 = csvReader1.getDelimiter();
        boolean boolean11 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        users.Visitor visitor2 = new users.Visitor("Password!23", "admin");
        int int3 = visitor2.getParkingRate();
        int int4 = visitor2.getParkingRate();
        visitor2.parkingspacenum = 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.FacultyMember facultyMember4 = new users.FacultyMember("", "hi!");
        boolean boolean5 = facultyMember4.getIsValid();
        boolean boolean6 = facultyMember4.getIsValid();
        boolean boolean7 = superManager0.validateUser((users.UserInfo) facultyMember4);
        superManager0.firstName = "";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        int int28 = reservation13.getDuration();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        java.lang.Class<?> wildcardClass3 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        int int10 = user6.getId();
        user6.email = "password_112284545599300";
        java.lang.String str13 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "password_112284545599300" + "'", str13, "password_112284545599300");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentInfo6.setCardBallance(10.0d);
        double double13 = paymentInfo6.getCardBallance();
        paymentInfo6.setExpDate((int) 'a');
        java.util.Date date17 = null;
        paymentInfo6.parkingInfo((int) '4', date17, "User [name= hi!, id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]", (int) (byte) 10);
        paymentInfo6.setExpDate((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.email;
        java.lang.String str12 = user6.getFName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        int int30 = paymentInfo22.getCardNum();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        boolean boolean8 = parkingLot2.getEnabled();
        java.lang.String str9 = parkingLot2.getAddress();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        boolean boolean2 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=hi!]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("Password!23", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("FALSE");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File FALSE does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        int int12 = parkingSpace9.getId();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        int int8 = csvReader1.getIndex("Password!23");
        char char9 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(97, 5, "admin", "User [name= hi!, id=97, email=hi!, password=]", 10);
        int int6 = paymentInfo5.getExpDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace((int) (short) 100);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvReader csvReader9 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean10 = csvReader9.readRecord();
        csvReader9.setSafetySwitch(true);
        boolean boolean13 = csvReader9.skipLine();
        java.lang.String[] strArray19 = new java.lang.String[] { "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "password_112284545599300", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "FALSE" };
        csvReader9.setHeaders(strArray19);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray19);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(csvReader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        int int9 = csvReader1.getHeaderCount();
        boolean boolean10 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        int int23 = paymentInfo13.getCardNum();
        paymentInfo13.setBillingAddress("User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        int int9 = csvReader1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = csvReader1.isQualified((int) '\"');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        visitor2.setValid();
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
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        user6.password = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getDelimiter();
        csvWriter1.setEscapeMode((int) (short) 10);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.lang.String str8 = paymentInfo5.getBillingName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        int int10 = user6.getId();
        user6.email = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        userLogin.User user6 = new userLogin.User("", "admin", 32, "hi!", "password_112284545599300", "User [name= hi!, id=97, email=hi!, password=admin]");
        user6.lname = "hi!";
        java.lang.Class<?> wildcardClass9 = user6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = csvReader1.getHeader((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        superManager0.setUsername("User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("Password!23");
        char char2 = csvReader1.getTextQualifier();
        long long3 = csvReader1.getCurrentRecord();
        boolean boolean4 = csvReader1.skipRecord();
        csvReader1.setRecordDelimiter('#');
        int int7 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\"' + "'", char2 == '\"');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("FALSE", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("admin");
        java.lang.Class<?> wildcardClass2 = csvReader1.getClass();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        parking.ParkingSpace parkingSpace17 = reservation11.getSpace();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(parkingSpace17);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        maintainUser0.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("Password!23");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File Password!23 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        facultyMember2.setValid();
        facultyMember2.setValid();
        facultyMember2.setValid();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        reservations.Reservation reservation7 = facultyMember2.currentReservation;
        users.FacultyMember facultyMember10 = new users.FacultyMember("", "hi!");
        int int11 = facultyMember10.parkingspacenum;
        facultyMember10.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade14 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot22 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace24 = parkingLot22.getParkingSpace((int) ' ');
        reservations.Reservation reservation25 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace24);
        reservationSystemFacade14.editBooking(reservation25, (int) (byte) 100);
        facultyMember10.currentReservation = reservation25;
        facultyMember2.currentReservation = reservation25;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(reservation7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade14);
        org.junit.Assert.assertNotNull(parkingSpace24);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        users.FacultyMember facultyMember7 = new users.FacultyMember("", "hi!");
        int int8 = facultyMember7.parkingspacenum;
        facultyMember7.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade11 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot19 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace21 = parkingLot19.getParkingSpace((int) ' ');
        reservations.Reservation reservation22 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace21);
        reservationSystemFacade11.editBooking(reservation22, (int) (byte) 100);
        facultyMember7.currentReservation = reservation22;
        parking.ParkingSpace parkingSpace26 = reservation22.getSpace();
        parkingSpace26.setEnabled(false);
        parkingState.State state29 = parkingSpace26.getSensorStatus();
        parkingState.Disabled disabled30 = new parkingState.Disabled();
        java.lang.String str31 = disabled30.handleState();
        parkingSpace26.setState((parkingState.State) disabled30);
        reservations.Reservation reservation33 = new reservations.Reservation(0, (int) '\"', 0, 10, "User [name= FALSE, id=97, email=hi!, password=hi!]", parkingSpace26);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade11);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertNotNull(state29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        reservations.Reservation reservation46 = null;
        users.FacultyMember facultyMember49 = new users.FacultyMember("", "hi!");
        int int50 = facultyMember49.parkingspacenum;
        facultyMember49.parkinglot = "hi!";
        facultyMember49.setValid();
        facultyMember49.setValid();
        facultyMember49.parkingspacenum = (byte) 0;
        reservations.ReservationSystemFacade reservationSystemFacade57 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap58 = reservationSystemFacade57.getLots();
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
        reservationSystemFacade57.editBooking(reservation76, (int) (byte) 100);
        facultyMember49.currentReservation = reservation76;
        // The following exception was thrown during execution in test generation
        try {
            int int84 = reservationSystemFacade0.calculateOutstanding(reservation46, (users.UserInfo) facultyMember49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade20);
        org.junit.Assert.assertNotNull(parkingSpace30);
        org.junit.Assert.assertNotNull(superManager35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str36, "User [name= hi!, id=97, email=hi!, password=admin]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(paymentInfo41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade57);
        org.junit.Assert.assertNotNull(intMap58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade65);
        org.junit.Assert.assertNotNull(parkingSpace75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        java.lang.String str3 = csvReader1.getRawRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parkingSpace7.setId((int) (byte) 10);
        parkingState.Disabled disabled10 = new parkingState.Disabled();
        java.lang.String str11 = disabled10.handleState();
        parkingSpace7.setState((parkingState.State) disabled10);
        parkingState.Unoccupied unoccupied13 = new parkingState.Unoccupied();
        java.lang.String str14 = unoccupied13.handleState();
        java.lang.String str15 = unoccupied13.handleState();
        parkingSpace7.setState((parkingState.State) unoccupied13);
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        boolean boolean8 = csvReader1.getUseComments();
        int int10 = csvReader1.getIndex("");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("password_112284545599300", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.io.OutputStream outputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter(outputStream0, '4', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        userLogin.User user6 = new userLogin.User("", "admin", 32, "hi!", "password_112284545599300", "User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setName("Password!23", "admin");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("FALSE", ' ', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        users.FacultyMember facultyMember6 = new users.FacultyMember("", "hi!");
        int int7 = facultyMember6.parkingspacenum;
        facultyMember6.parkinglot = "hi!";
        facultyMember6.setValid();
        boolean boolean11 = manager3.validateUser((users.UserInfo) facultyMember6);
        java.lang.String str12 = manager3.lastName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        student4.setValid();
        java.lang.String str8 = student4.parkinglot;
        int int9 = student4.getParkingRate();
        int int10 = student4.getParkingRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        users.FacultyMember facultyMember56 = new users.FacultyMember("", "hi!");
        int int57 = facultyMember56.parkingspacenum;
        facultyMember56.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade60 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot68 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace70 = parkingLot68.getParkingSpace((int) ' ');
        reservations.Reservation reservation71 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace70);
        reservationSystemFacade60.editBooking(reservation71, (int) (byte) 100);
        facultyMember56.currentReservation = reservation71;
        paymentStrategy.OtherTypeProvider otherTypeProvider75 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo81 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo81.setBillingName("FALSE");
        boolean boolean85 = otherTypeProvider75.handlePayment(paymentInfo81, (double) (short) 1);
        paymentInfo81.setCardBallance(10.0d);
        facultyMember56.setPaymentInfo(paymentInfo81);
        boolean boolean90 = context40.execute(paymentInfo81, (double) (short) 10);
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(parkingSpace37);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(reservation53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade60);
        org.junit.Assert.assertNotNull(parkingSpace70);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setRecordDelimiter('a');
        char char9 = csvReader1.getTextQualifier();
        char char10 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        csvReader1.setTrimWhitespace(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setEscapeMode((int) (short) 100);
        com.csvreader.CsvReader csvReader9 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean10 = csvReader9.readRecord();
        csvReader9.setSafetySwitch(true);
        java.lang.String[] strArray13 = csvReader9.getValues();
        boolean boolean14 = csvReader9.getUseComments();
        char char15 = csvReader9.getTextQualifier();
        java.lang.String[] strArray16 = csvReader9.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray16);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\"' + "'", char15 == '\"');
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int7 = paymentInfo6.getSecurityCode();
        java.lang.String str8 = paymentInfo6.getBillingAddress();
        java.util.Date date10 = null;
        paymentInfo6.parkingInfo(0, date10, "hi!", "hi!", (int) (short) 1);
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (-1));
        paymentStrategy.PaymentInfo paymentInfo22 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        java.lang.String str23 = paymentInfo22.getBillingName();
        boolean boolean25 = mobilePaymentProvider0.handlePayment(paymentInfo22, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "FALSE" + "'", str23, "FALSE");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("User [name= FALSE, id=97, email=hi!, password=hi!]", '\000');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= FALSE, id=97, email=hi!, password=hi!] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setSecurityCode(10);
        paymentInfo5.setCardNum((int) (byte) 100);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        reservations.Reservation reservation5 = null;
        parkingSpace4.setReservation(reservation5);
        java.util.ArrayList<reservations.Reservation> reservationList7 = parkingSpace4.getReservations();
        boolean boolean8 = parkingSpace4.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("admin");
        char char2 = csvReader1.getDelimiter();
        java.lang.String[] strArray3 = csvReader1.getValues();
        boolean boolean4 = csvReader1.skipRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ',' + "'", char2 == ',');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader("password_112284545599300", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        users.FacultyMember facultyMember2 = new users.FacultyMember("Password!23", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name= FALSE, id=97, email=hi!, password=hi!]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= FALSE, id=97, email=hi!, password=hi!] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        parking.ParkingLot parkingLot13 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace15 = parkingLot13.getParkingSpace((int) ' ');
        reservations.Reservation reservation16 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace15);
        int int17 = reservation16.getDay();
        reservation16.updateDuration(2);
        parking.ParkingSpace parkingSpace20 = reservation16.getSpace();
        parking.ParkingSpace parkingSpace21 = reservation16.getSpace();
        facultyMember2.currentReservation = reservation16;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(parkingSpace15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(parkingSpace20);
        org.junit.Assert.assertNotNull(parkingSpace21);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        paymentInfo5.setCardBallance((double) 97);
        double double11 = paymentInfo5.getCardBallance();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str8, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        com.csvreader.CsvReader csvReader6 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean7 = csvReader6.readRecord();
        csvReader6.setSafetySwitch(true);
        java.lang.String[] strArray10 = csvReader6.getValues();
        boolean boolean11 = csvReader6.getUseComments();
        char char12 = csvReader6.getTextQualifier();
        java.lang.String[] strArray13 = csvReader6.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray13, false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(csvReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        manager.Manager manager2 = new manager.Manager("Password!23", "");
        manager2.lastName = "hi!";
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        paymentStrategy.DebitPaymentProvider debitPaymentProvider0 = new paymentStrategy.DebitPaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = debitPaymentProvider0.handlePayment(paymentInfo1, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("User [name= hi!, id=97, email=hi!, password=hi!]", '\"');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=97, email=hi!, password=hi!] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        boolean boolean8 = csvReader1.getUseComments();
        char char9 = csvReader1.getDelimiter();
        csvReader1.setTrimWhitespace(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        paymentInfo19.setBillingAddress("User [name= FALSE, id=97, email=, password=]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        manager.Manager manager3 = superManager0.autoGenerator();
        manager3.firstName = "";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name= FALSE, id=97, email=hi!, password=hi!]" + "'", str2, "User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNotNull(manager3);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        int int41 = paymentInfo33.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str36, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader1 = new com.csvreader.CsvReader("User [name= FALSE, id=97, email=, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= FALSE, id=97, email=, password=] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        user6.id = 35;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setUsername("hi!");
        java.lang.String str4 = superManager0.getUsername();
        superManager0.firstName = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str1, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.toString();
        java.lang.String str13 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name= hi!, id=97, email=hi!, password=hi!]" + "'", str12, "User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        manager.Manager manager2 = new manager.Manager("", "admin");
        manager2.lastName = "Password!23";
        users.NonFacultyStaff nonFacultyStaff7 = new users.NonFacultyStaff("", "hi!");
        java.lang.String str8 = nonFacultyStaff7.getEmail();
        boolean boolean9 = manager2.validateUser((users.UserInfo) nonFacultyStaff7);
        java.lang.String str10 = manager2.getUsername();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider1 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        boolean boolean11 = otherTypeProvider1.handlePayment(paymentInfo7, (double) (short) 1);
        paymentInfo7.setCardBallance(10.0d);
        double double14 = paymentInfo7.getCardBallance();
        int int15 = paymentInfo7.getCardNum();
        boolean boolean17 = creditPaymentProvide0.handlePayment(paymentInfo7, (double) '4');
        paymentStrategy.CreditPaymentProvide creditPaymentProvide18 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo24 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int25 = paymentInfo24.getSecurityCode();
        java.lang.String str26 = paymentInfo24.getBillingAddress();
        java.util.Date date28 = null;
        paymentInfo24.parkingInfo(0, date28, "hi!", "hi!", (int) (short) 1);
        boolean boolean34 = creditPaymentProvide18.handlePayment(paymentInfo24, (double) 8);
        boolean boolean36 = creditPaymentProvide0.handlePayment(paymentInfo24, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.setUsername("hi!");
        java.lang.String str3 = superManager0.lastName;
        java.lang.String str4 = superManager0.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FALSE" + "'", str3, "FALSE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setEscapeMode(1);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.lname = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str14 = user6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) 0, 0, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "hi!", (int) ',');
        paymentInfo5.setExpDate(0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        char char9 = csvReader1.getRecordDelimiter();
        java.lang.String str11 = csvReader1.get(8);
        boolean boolean12 = csvReader1.skipLine();
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(0);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentInfo6.setCardBallance(10.0d);
        double double13 = paymentInfo6.getCardBallance();
        paymentInfo6.setExpDate((int) 'a');
        java.util.Date date17 = null;
        paymentInfo6.parkingInfo((int) '4', date17, "User [name= hi!, id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]", (int) (byte) 10);
        java.lang.String str22 = paymentInfo6.getBillingAddress();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        user6.setValidation("User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = csvReader1.isQualified((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        manager.Manager manager2 = superManager0.autoGenerator();
        manager2.lastName = "User [name= FALSE, id=97, email=, password=]";
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(manager2);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        boolean boolean7 = csvReader1.getSafetySwitch();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = csvReader1.getIndex("");
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getType();
        java.lang.String str12 = user6.password;
        java.lang.String str13 = user6.password;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        manager7.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str10 = manager7.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str2, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager_112305914121600" + "'", str10, "manager_112305914121600");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("password_112296757334200", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        parking.ParkingLot parkingLot34 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace36 = parkingLot34.getParkingSpace((int) ' ');
        reservations.Reservation reservation37 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace36);
        parkingState.State state38 = parkingSpace36.getSensorStatus();
        reservations.Reservation reservation39 = new reservations.Reservation((int) (byte) 0, 2, (int) (byte) 0, 2, "admin", parkingSpace36);
        parkingState.Unoccupied unoccupied40 = new parkingState.Unoccupied();
        java.lang.String str41 = unoccupied40.handleState();
        parkingSpace36.setState((parkingState.State) unoccupied40);
        java.lang.String str43 = unoccupied40.handleState();
        parkingSpace21.setState((parkingState.State) unoccupied40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(parkingSpace36);
        org.junit.Assert.assertNotNull(state38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        java.lang.String str7 = user6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]" + "'", str7, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        java.lang.String str3 = parkingLot2.getAddress();
        java.lang.String str4 = parkingLot2.getAddress();
        int int5 = parkingLot2.getId();
        int int6 = parkingLot2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getSafetySwitch();
        char char7 = csvReader1.getRecordDelimiter();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        java.lang.String str10 = csvReader1.getHeader((int) (short) 10);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        boolean boolean3 = facultyMember2.getIsValid();
        boolean boolean4 = facultyMember2.getIsValid();
        java.lang.String str5 = facultyMember2.parkinglot;
        facultyMember2.setValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot5 = parkingSystem0.addLot((int) (byte) 100, "hi!");
        parking.ParkingLot parkingLot7 = parkingSystem0.getLot(5);
        parkingSystem0.setEnableLot(100, true);
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
        org.junit.Assert.assertNotNull(parkingLot5);
// flaky:         org.junit.Assert.assertNotNull(parkingLot7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        boolean boolean2 = user0.isValidated;
        int int3 = user0.id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        userLogin.MaintainUser maintainUser4 = new userLogin.MaintainUser();
        maintainUser4.update("admin");
        java.util.ArrayList<userLogin.User> userList7 = maintainUser4.users;
        maintainUser0.users = userList7;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        java.lang.String str8 = superManager0.firstName;
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str2, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.lang.String str43 = facultyMember41.getEmail();
        java.lang.String str44 = facultyMember41.parkinglot;
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("admin", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        int int7 = paymentInfo5.getSecurityCode();
        paymentInfo5.setExpDate((int) '\"');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter2 = new com.csvreader.CsvWriter(writer0, '\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter outputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        char char12 = csvWriter1.getTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        user6.setEmail("hi!");
        java.lang.String str13 = user6.fname;
        user6.setType("User [name= FALSE, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.password = "Password!23";
        java.lang.String str12 = user6.getLName();
        java.lang.String str13 = user6.getLName();
        user6.setValidation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        paymentStrategy.CreditPaymentProvide creditPaymentProvide28 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo34 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int35 = paymentInfo34.getSecurityCode();
        java.lang.String str36 = paymentInfo34.getBillingAddress();
        java.util.Date date38 = null;
        paymentInfo34.parkingInfo(0, date38, "hi!", "hi!", (int) (short) 1);
        boolean boolean44 = creditPaymentProvide28.handlePayment(paymentInfo34, (double) 8);
        paymentStrategy.OtherTypeProvider otherTypeProvider45 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context46 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider45);
        paymentStrategy.PaymentInfo paymentInfo52 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo52.setBillingName("FALSE");
        paymentInfo52.setCardNum(1);
        boolean boolean58 = context46.execute(paymentInfo52, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo64 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int65 = paymentInfo64.getSecurityCode();
        java.lang.String str66 = paymentInfo64.getBillingAddress();
        java.util.Date date68 = null;
        paymentInfo64.parkingInfo(0, date68, "hi!", "hi!", (int) (short) 1);
        int int73 = paymentInfo64.getExpDate();
        boolean boolean75 = context46.execute(paymentInfo64, (double) 5);
        paymentInfo64.setSecurityCode((int) '\"');
        boolean boolean79 = creditPaymentProvide28.handlePayment(paymentInfo64, (double) ' ');
        paymentStrategy.PaymentInfo paymentInfo85 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo85.setBillingName("FALSE");
        paymentInfo85.setCardNum(1);
        boolean boolean91 = creditPaymentProvide28.handlePayment(paymentInfo85, (double) (short) 1);
        boolean boolean93 = creditPaymentProvide0.handlePayment(paymentInfo85, (double) 1);
        paymentInfo85.setBillingName("User [name= hi!, id=97, email=hi!, password=]");
        double double96 = paymentInfo85.getCardBallance();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        int int26 = student21.getParkingRate();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(paymentInfo24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = csvReader1.readRecord();
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        java.lang.String str15 = user6.getType();
        user6.setValidation("Password!23");
        java.lang.String str18 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        reservations.ReservationSystemFacade reservationSystemFacade24 = reservations.ReservationSystemFacade.getInstance();
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
        users.FacultyMember facultyMember51 = new users.FacultyMember("", "hi!");
        int int52 = facultyMember51.parkingspacenum;
        facultyMember51.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade55 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot63 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace65 = parkingLot63.getParkingSpace((int) ' ');
        reservations.Reservation reservation66 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace65);
        reservationSystemFacade55.editBooking(reservation66, (int) (byte) 100);
        facultyMember51.currentReservation = reservation66;
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider70 = new paymentStrategy.MobilePaymentProvider();
        reservationSystemFacade24.payBalance(reservation38, (users.UserInfo) facultyMember51, (paymentStrategy.PaymentProvider) mobilePaymentProvider70);
        int int72 = reservation38.getMonth();
        parkingSpace21.setReservation(reservation38);
        int int74 = reservation38.getStartTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(reservationSystemFacade24);
        org.junit.Assert.assertNotNull(reservationSystemFacade25);
        org.junit.Assert.assertNotNull(intMap26);
        org.junit.Assert.assertNotNull(reservationSystemFacade27);
        org.junit.Assert.assertNotNull(parkingSpace37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade55);
        org.junit.Assert.assertNotNull(parkingSpace65);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = csvReader1.get(35);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.email;
        user6.lname = "manager_112305914121600";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        parking.ParkingLot parkingLot12 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace14 = parkingLot12.getParkingSpace((int) ' ');
        reservations.Reservation reservation15 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace14);
        parkingState.State state16 = parkingSpace14.getSensorStatus();
        parkingState.State state17 = parkingSpace14.getSensorStatus();
        reservations.Reservation reservation18 = new reservations.Reservation((int) '\"', (-1), (int) (byte) 100, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=]", parkingSpace14);
        int int19 = reservation18.getMonth();
        java.lang.String str20 = reservation18.getPlate();
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertNotNull(state16);
        org.junit.Assert.assertNotNull(state17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str20, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        paymentInfo5.setExpDate((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str8, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        user6.setName("", "");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str17 = user6.getFName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        java.lang.String str25 = facultyMember2.parkinglot;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        boolean boolean10 = csvReader1.skipLine();
        java.lang.String[] strArray11 = csvReader1.getValues();
        boolean boolean12 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        java.lang.String str25 = state24.handleState();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(state24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        user6.fname = "";
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        superManager0.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.Class<?> wildcardClass4 = superManager0.getClass();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.util.Date date9 = null;
        paymentInfo5.parkingInfo(0, date9, "hi!", "hi!", (int) (short) 1);
        int int14 = paymentInfo5.getExpDate();
        int int15 = paymentInfo5.getExpDate();
        int int16 = paymentInfo5.getExpDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        int int9 = csvReader1.getColumnCount();
        csvReader1.setCaptureRawRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = csvReader1.getHeaders();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (byte) -1, (int) '4', "User [name= hi!, id=97, email=hi!, password=]", "FALSE", (int) (byte) -1);
        paymentInfo5.setCardNum((int) (byte) 0);
        paymentInfo5.setCardBallance(0.0d);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        char char4 = csvWriter1.getRecordDelimiter();
        char char5 = csvWriter1.getComment();
        boolean boolean6 = csvWriter1.getForceQualifier();
        csvWriter1.setRecordDelimiter('\000');
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("manager_112305914121600");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File manager_112305914121600 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setEmail("admin");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("password_112306347644100", '\000');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112306347644100 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        userLogin.User user0 = new userLogin.User();
        int int1 = user0.id;
        user0.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        user6.email = "password_112284545599300";
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        int int14 = user6.getId();
        user6.email = "User [name=null null, id=0, email=null, password=null]";
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setForceQualifier(true);
        csvWriter1.close();
        char char11 = csvWriter1.getTextQualifier();
        int int12 = csvWriter1.getEscapeMode();
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.io.OutputStream outputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter(outputStream0, '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        parking.ParkingLot parkingLot33 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace35 = parkingLot33.getParkingSpace((int) ' ');
        reservations.Reservation reservation36 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace35);
        reservationSystemFacade25.editBooking(reservation36, (int) (byte) 100);
        parking.ParkingLot parkingLot46 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace48 = parkingLot46.getParkingSpace((int) ' ');
        reservations.Reservation reservation49 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace48);
        int int50 = reservation49.getDay();
        parking.ParkingSpace parkingSpace51 = reservation49.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList52 = parkingSpace51.getReservations();
        parkingSpace51.setId(0);
        int int55 = parkingSpace51.getId();
        parking.ParkingLot parkingLot63 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace65 = parkingLot63.getParkingSpace((int) ' ');
        reservations.Reservation reservation66 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace65);
        int int67 = reservation66.getDay();
        int int68 = reservation66.getDuration();
        parkingSpace51.setReservation(reservation66);
        reservationSystemFacade25.editBooking(reservation66, 2);
        reservations.ReservationSystemFacade reservationSystemFacade72 = reservations.ReservationSystemFacade.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap73 = reservationSystemFacade72.getLots();
        reservations.ReservationSystemFacade reservationSystemFacade74 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot82 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace84 = parkingLot82.getParkingSpace((int) ' ');
        reservations.Reservation reservation85 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace84);
        users.FacultyMember facultyMember88 = new users.FacultyMember("", "hi!");
        int int89 = facultyMember88.parkingspacenum;
        int int90 = reservationSystemFacade74.calculateOutstanding(reservation85, (users.UserInfo) facultyMember88);
        users.Student student93 = new users.Student("", "hi!");
        int int94 = student93.getParkingRate();
        reservationSystemFacade72.cancelBooking(reservation85, (users.UserInfo) student93);
        paymentStrategy.PaymentInfo paymentInfo96 = student93.getPaymentInfo();
        int int97 = student93.getParkingRate();
        paymentStrategy.PaymentProvider paymentProvider98 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystemFacade0.payBalance(reservation66, (users.UserInfo) student93, paymentProvider98);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intMap24);
        org.junit.Assert.assertNotNull(reservationSystemFacade25);
        org.junit.Assert.assertNotNull(parkingSpace35);
        org.junit.Assert.assertNotNull(parkingSpace48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(parkingSpace51);
        org.junit.Assert.assertNotNull(reservationList52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(parkingSpace65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(reservationSystemFacade72);
        org.junit.Assert.assertNotNull(intMap73);
        org.junit.Assert.assertNotNull(reservationSystemFacade74);
        org.junit.Assert.assertNotNull(parkingSpace84);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 5 + "'", int94 == 5);
        org.junit.Assert.assertNull(paymentInfo96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 5 + "'", int97 == 5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) (short) 100, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("FALSE");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.util.ArrayList<userLogin.User> userList1 = null;
        maintainUser0.users = userList1;
        maintainUser0.path = "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]";
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name= hi!, id=97, email=hi!, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=97, email=hi!, password=] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        java.lang.String str48 = facultyMember27.parkinglot;
        paymentStrategy.PaymentInfo paymentInfo49 = facultyMember27.getPaymentInfo();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNull(paymentInfo49);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap1 = parkingSystem0.getLots();
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap2 = parkingSystem0.getLots();
        parking.ParkingLot parkingLot4 = parkingSystem0.getLot((int) '\000');
        parking.ParkingSpace parkingSpace7 = null; // flaky: parkingSystem0.getParkingSpace((int) ',', (int) '\000');
        java.util.Map<java.lang.Integer, parking.ParkingLot> intMap8 = parkingSystem0.getLots();
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(intMap2);
// flaky:         org.junit.Assert.assertNotNull(parkingLot4);
// flaky:         org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNotNull(intMap8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getValidation();
        java.lang.String str13 = user6.getPassword();
        java.lang.String str14 = user6.getValidation();
        user6.setType("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FALSE" + "'", str12, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FALSE" + "'", str14, "FALSE");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        csvReader1.setDelimiter('\"');
        char char8 = csvReader1.getTextQualifier();
        int int9 = csvReader1.getColumnCount();
        java.lang.String str10 = csvReader1.getRawRecord();
        csvReader1.setSafetySwitch(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name= hi!, id=97, email=hi!, password=hi!]", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        java.lang.String str14 = reservation10.getPlate();
        java.lang.String str15 = reservation10.getPlate();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        boolean boolean9 = user6.isValidated;
        user6.setType("manager_112305914121600");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        parking.ParkingSpace parkingSpace6 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation7 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace6);
        parking.ParkingSpace parkingSpace8 = reservation7.getSpace();
        parkingState.State state9 = parkingSpace8.getSensorStatus();
        org.junit.Assert.assertNotNull(parkingSpace8);
        org.junit.Assert.assertNotNull(state9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setEscapeMode((int) (short) 100);
        char char8 = csvWriter1.getDelimiter();
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        char char10 = csvReader1.getComment();
        java.lang.String str12 = csvReader1.getHeader((int) (byte) 100);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=admin]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        users.FacultyMember facultyMember2 = new users.FacultyMember("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]");
        int int3 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.close();
        char char9 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.io.OutputStream outputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter(outputStream0, '\000', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        char char9 = csvWriter1.getDelimiter();
        int int10 = csvWriter1.getEscapeMode();
        com.csvreader.CsvReader csvReader12 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean13 = csvReader12.readRecord();
        csvReader12.setSafetySwitch(true);
        java.lang.String[] strArray16 = csvReader12.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray16);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(csvReader12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", '4');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        boolean boolean10 = csvReader1.getTrimWhitespace();
        csvReader1.setComment('\000');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        paymentStrategy.OtherTypeProvider otherTypeProvider30 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context31 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider30);
        paymentStrategy.PaymentInfo paymentInfo37 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo37.setBillingName("FALSE");
        paymentInfo37.setCardNum(1);
        boolean boolean43 = context31.execute(paymentInfo37, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo49 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int50 = paymentInfo49.getSecurityCode();
        java.lang.String str51 = paymentInfo49.getBillingAddress();
        java.util.Date date53 = null;
        paymentInfo49.parkingInfo(0, date53, "hi!", "hi!", (int) (short) 1);
        int int58 = paymentInfo49.getExpDate();
        boolean boolean60 = context31.execute(paymentInfo49, (double) 5);
        double double61 = paymentInfo49.getCardBallance();
        boolean boolean63 = mobilePaymentProvider0.handlePayment(paymentInfo49, (double) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        csvWriter1.setTextQualifier('a');
        boolean boolean10 = csvWriter1.getForceQualifier();
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        boolean boolean7 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        int int9 = csvWriter1.getEscapeMode();
        char char10 = csvWriter1.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("password_112296757334200");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        superManager0.lastName = "hi!";
        superManager0.lastName = "FALSE";
        manager.Manager manager7 = superManager0.autoGenerator();
        users.Visitor visitor10 = new users.Visitor("", "");
        boolean boolean11 = visitor10.getIsValid();
        int int12 = visitor10.getParkingRate();
        boolean boolean13 = superManager0.validateUser((users.UserInfo) visitor10);
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "password_112284545599300" + "'", str1, "password_112284545599300");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str2, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(manager7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        boolean boolean18 = parkingSpace1.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        users.Student student2 = new users.Student("FALSE", "FALSE");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setSafetySwitch(false);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = csvReader1.getIndex("User [name=null null, id=0, email=null, password=null]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (byte) 0, 32, "Password!23", "FALSE", 0);
        paymentInfo5.setCardBallance((double) 15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        paymentStrategy.CreditPaymentProvide creditPaymentProvide41 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.PaymentInfo paymentInfo47 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int48 = paymentInfo47.getSecurityCode();
        java.lang.String str49 = paymentInfo47.getBillingAddress();
        java.util.Date date51 = null;
        paymentInfo47.parkingInfo(0, date51, "hi!", "hi!", (int) (short) 1);
        boolean boolean57 = creditPaymentProvide41.handlePayment(paymentInfo47, (double) 8);
        paymentStrategy.OtherTypeProvider otherTypeProvider58 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context59 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider58);
        paymentStrategy.PaymentInfo paymentInfo65 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo65.setBillingName("FALSE");
        paymentInfo65.setCardNum(1);
        boolean boolean71 = context59.execute(paymentInfo65, (double) 97);
        paymentStrategy.PaymentInfo paymentInfo77 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int78 = paymentInfo77.getSecurityCode();
        java.lang.String str79 = paymentInfo77.getBillingAddress();
        java.util.Date date81 = null;
        paymentInfo77.parkingInfo(0, date81, "hi!", "hi!", (int) (short) 1);
        int int86 = paymentInfo77.getExpDate();
        boolean boolean88 = context59.execute(paymentInfo77, (double) 5);
        paymentInfo77.setSecurityCode((int) '\"');
        boolean boolean92 = creditPaymentProvide41.handlePayment(paymentInfo77, (double) ' ');
        boolean boolean94 = debitPaymentProvider0.handlePayment(paymentInfo77, 100.0d);
        paymentInfo77.setSecurityCode(32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str36, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = manager3.getPassword();
        manager3.lastName = "Password!23";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password_112310734370300" + "'", str4, "password_112310734370300");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        csvWriter1.setTextQualifier('a');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("", "manager_112305914121600", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        userLogin.User user6 = new userLogin.User("", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", 8, "Password!23", "", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String str7 = user6.password;
        java.lang.String str8 = user6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Password!23" + "'", str8, "Password!23");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        java.lang.String str7 = csvReader1.getRawRecord();
        csvReader1.setDelimiter('\"');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        boolean boolean5 = csvReader1.skipRecord();
        boolean boolean6 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        boolean boolean7 = user6.isValidated;
        user6.setType("password_112306347644100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        int int3 = csvReader1.getEscapeMode();
        char char4 = csvReader1.getRecordDelimiter();
        boolean boolean5 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        facultyMember2.setValid();
        facultyMember2.setValid();
        int int8 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        paymentStrategy.OtherTypeProvider otherTypeProvider76 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context77 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider76);
        paymentStrategy.PaymentInfo paymentInfo83 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo83.setBillingName("FALSE");
        paymentInfo83.setCardNum(1);
        boolean boolean89 = context77.execute(paymentInfo83, (double) 97);
        boolean boolean91 = context45.execute(paymentInfo83, (double) 15);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(reservation75);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("hi!", "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        parking.ParkingSpace parkingSpace12 = reservation10.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList13 = parkingSpace12.getReservations();
        boolean boolean14 = parkingSpace12.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("password_112284545599300");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        int int77 = nonFacultyStaff30.getParkingRate();
        reservations.Reservation reservation78 = nonFacultyStaff30.currentReservation;
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(parkingSpace41);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(reservation75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertNull(reservation78);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        reservations.Reservation reservation17 = facultyMember14.currentReservation;
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(reservation17);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader(inputStream0, '\"', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("Password!23", "password_112306347644100", "manager_112305914121600");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Password!23" + "'", str3, "Password!23");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.State state12 = parkingSpace9.getSensorStatus();
        boolean boolean13 = parkingSpace9.isEnabled();
        parkingState.Occupied occupied15 = new parkingState.Occupied("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        parkingSpace9.setState((parkingState.State) occupied15);
        boolean boolean17 = parkingSpace9.isEnabled();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('#');
        boolean boolean4 = csvReader1.getCaptureRawRecord();
        csvReader1.setTrimWhitespace(false);
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = csvReader1.skipLine();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.setEmail("hi!");
        boolean boolean14 = user6.isValidated;
        java.lang.String str15 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.getValidation();
        java.lang.String str14 = user6.fname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FALSE" + "'", str13, "FALSE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str14, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        maintainUser0.update("admin");
        java.util.ArrayList<userLogin.User> userList3 = maintainUser0.users;
        userLogin.MaintainUser maintainUser4 = new userLogin.MaintainUser();
        maintainUser4.update("admin");
        java.util.ArrayList<userLogin.User> userList7 = maintainUser4.users;
        maintainUser0.users = userList7;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("User [name=null null, id=0, email=null, password=null]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name=null null, id=0, email=null, password=null] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        users.Visitor visitor2 = new users.Visitor("User [name= FALSE, id=97, email=, password=]", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        parking.ParkingSpace parkingSpace1 = new parking.ParkingSpace(2);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        users.Visitor visitor2 = new users.Visitor("User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "");
        visitor2.setValid();
        int int4 = visitor2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        manager.Manager manager3 = superManager0.autoGenerator();
        superManager0.setUsername("User [name= hi!, id=97, email=hi!, password=hi!]");
        java.lang.String str6 = superManager0.getPassword();
        java.lang.String str7 = superManager0.getPassword();
        superManager0.firstName = "password_112284545599300";
        java.lang.String str10 = superManager0.lastName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str2, "User [name=null null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str6, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FALSE" + "'", str10, "FALSE");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("", false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.Disabled disabled12 = new parkingState.Disabled();
        parkingSpace9.setState((parkingState.State) disabled12);
        int int14 = parkingSpace9.getId();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        java.lang.String str7 = paymentInfo5.getBillingAddress();
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        paymentInfo5.setBillingAddress("Password!23");
        int int11 = paymentInfo5.getSecurityCode();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        csvWriter1.setUseTextQualifier(false);
        csvWriter1.setForceQualifier(false);
        com.csvreader.CsvReader csvReader13 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean14 = csvReader13.readRecord();
        csvReader13.setSafetySwitch(true);
        csvReader13.setTrimWhitespace(false);
        boolean boolean19 = csvReader13.skipRecord();
        java.lang.String[] strArray20 = csvReader13.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray20);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(csvReader13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.csvreader.CsvReader csvReader2 = null; // flaky: new com.csvreader.CsvReader("User [name= FALSE, id=97, email=hi!, password=hi!]", '\"');
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        com.csvreader.CsvReader csvReader7 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean8 = csvReader7.readRecord();
        csvReader7.setSafetySwitch(true);
        csvReader7.setTrimWhitespace(false);
        boolean boolean13 = csvReader7.skipRecord();
        java.lang.String[] strArray14 = csvReader7.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray14);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        java.lang.String str8 = csvReader1.getRawRecord();
        long long9 = csvReader1.getCurrentRecord();
        int int10 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        boolean boolean5 = csvWriter1.getUseTextQualifier();
        csvWriter1.setTextQualifier(' ');
        csvWriter1.setComment(' ');
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.endRecord();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        users.Student student4 = new users.Student("", "hi!");
        boolean boolean5 = superManager0.validateUser((users.UserInfo) student4);
        paymentStrategy.PaymentInfo paymentInfo6 = student4.getPaymentInfo();
        student4.setValid();
        int int8 = student4.getParkingRate();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paymentInfo6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        int int9 = csvReader1.getColumnCount();
        csvReader1.setCaptureRawRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        int int4 = facultyMember2.getParkingRate();
        int int5 = facultyMember2.getParkingRate();
        int int6 = facultyMember2.parkingspacenum;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(2, 1, "password_112296757334200", "FALSE", (int) '\"');
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        parkingState.Unoccupied unoccupied0 = new parkingState.Unoccupied();
        java.lang.String str1 = unoccupied0.handleState();
        java.lang.String str2 = unoccupied0.handleState();
        java.lang.String str3 = unoccupied0.handleState();
        java.lang.String str4 = unoccupied0.handleState();
        java.lang.String str5 = unoccupied0.handleState();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setTrimWhitespace(false);
        java.lang.Class<?> wildcardClass9 = csvReader1.getClass();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        int int31 = reservation27.getDuration();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("User [name= hi!, id=97, email=hi!, password=]", 'a', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        user6.type = "User [name= hi!, id=97, email=hi!, password=]";
        user6.type = "User [name= hi!, id=97, email=hi!, password=hi!]";
        java.lang.String str19 = user6.email;
        java.lang.String str20 = user6.password;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider0 = new paymentStrategy.MobilePaymentProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        paymentInfo6.setCardNum(1);
        paymentInfo6.setExpDate(768);
        paymentInfo6.setBillingName("FALSE");
        boolean boolean16 = mobilePaymentProvider0.handlePayment(paymentInfo6, (double) (short) 10);
        paymentInfo6.setBillingAddress("admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getUseTextQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        boolean boolean9 = csvWriter1.getUseTextQualifier();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.write("password_112306347644100");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "password_112306347644100");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getComment();
        java.lang.String str5 = csvReader1.getHeader((int) (short) 1);
        boolean boolean6 = csvReader1.readRecord();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        char char8 = csvWriter1.getRecordDelimiter();
        char char9 = csvWriter1.getDelimiter();
        char char10 = csvWriter1.getComment();
        boolean boolean11 = csvWriter1.getUseTextQualifier();
        csvWriter1.setRecordDelimiter('#');
        com.csvreader.CsvReader csvReader15 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean16 = csvReader15.readRecord();
        csvReader15.setSafetySwitch(true);
        java.lang.String[] strArray19 = csvReader15.getValues();
        boolean boolean20 = csvReader15.getUseComments();
        java.lang.String[] strArray21 = csvReader15.getValues();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray21, true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(csvReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        paymentInfo41.setBillingName("FALSE");
        int int57 = paymentInfo41.getCardNum();
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader3 = new com.csvreader.CsvReader(inputStream0, ',', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int6 = paymentInfo5.getSecurityCode();
        double double7 = paymentInfo5.getCardBallance();
        double double8 = paymentInfo5.getCardBallance();
        int int9 = paymentInfo5.getCardNum();
        java.util.Date date11 = null;
        paymentInfo5.parkingInfo(97, date11, "User [name= hi!, id=97, email=hi!, password=hi!]", "User [name= hi!, id=97, email=hi!, password=hi!]", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        csvReader1.setRecordDelimiter('\000');
        boolean boolean9 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.close();
        csvReader1.setEscapeMode((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = csvReader1.isQualified(15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=]");
        user6.email = "FALSE";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        paymentStrategy.PaymentInfo paymentInfo42 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int43 = paymentInfo42.getSecurityCode();
        java.lang.String str44 = paymentInfo42.getBillingAddress();
        java.util.Date date46 = null;
        paymentInfo42.parkingInfo(0, date46, "hi!", "hi!", (int) (short) 1);
        boolean boolean52 = debitPaymentProvider25.handlePayment(paymentInfo42, (double) (short) -1);
        boolean boolean54 = mobilePaymentProvider0.handlePayment(paymentInfo42, 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        paymentStrategy.CreditPaymentProvide creditPaymentProvide16 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider17 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo23 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo23.setBillingName("FALSE");
        boolean boolean27 = otherTypeProvider17.handlePayment(paymentInfo23, (double) (short) 1);
        paymentInfo23.setCardBallance(10.0d);
        double double30 = paymentInfo23.getCardBallance();
        int int31 = paymentInfo23.getCardNum();
        boolean boolean33 = creditPaymentProvide16.handlePayment(paymentInfo23, (double) '4');
        facultyMember9.setPaymentInfo(paymentInfo23);
        java.lang.String str35 = paymentInfo23.getBillingName();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "password_112306347644100" + "'", str2, "password_112306347644100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "FALSE" + "'", str35, "FALSE");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        parkingState.Occupied occupied1 = new parkingState.Occupied("admin");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        manager.Manager manager1 = superManager0.autoGenerator();
        manager1.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str4 = manager1.lastName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.lname;
        int int13 = user6.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        manager.Manager manager16 = superManager0.autoGenerator();
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "password_112306347644100" + "'", str2, "password_112306347644100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(manager15);
        org.junit.Assert.assertNotNull(manager16);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        userLogin.User user6 = new userLogin.User("password_112284545599300", "User [name=null null, id=0, email=null, password=null]", (int) (short) 100, "User [name= FALSE, id=97, email=hi!, password=hi!]", "hi!", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        java.lang.String[] strArray11 = new java.lang.String[] { "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]", "password_112284545599300", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "FALSE" };
        csvReader1.setHeaders(strArray11);
        boolean boolean13 = csvReader1.readHeaders();
        java.lang.String str15 = csvReader1.getHeader((int) (byte) 10);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name= hi!, id=97, email=hi!, password=]");
        csvReader1.setComment('\000');
        char char4 = csvReader1.getDelimiter();
        csvReader1.setCaptureRawRecord(false);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.setTrimWhitespace(false);
        boolean boolean7 = csvReader1.skipRecord();
        char char8 = csvReader1.getDelimiter();
        boolean boolean9 = csvReader1.skipLine();
        csvReader1.setCaptureRawRecord(false);
        java.lang.String str13 = csvReader1.get("password_112296757334200");
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        parkingState.State state43 = parkingSpace9.getSensorStatus();
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
        org.junit.Assert.assertNotNull(state43);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        boolean boolean16 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot((int) (byte) 100, "hi!");
        boolean boolean3 = parkingLot2.getEnabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        java.lang.String str11 = user6.password;
        user6.lname = "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]";
        java.lang.String str14 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        users.Student student2 = new users.Student("password_112325847983500", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.type = "";
        user6.fname = "FALSE";
        user6.setEmail("hi!");
        user6.setEmail("password_112325847983500");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(10);
        parking.ParkingSpace parkingSpace14 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation15 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace14);
        parkingSpace7.setReservation(reservation15);
        java.util.ArrayList<reservations.Reservation> reservationList17 = parkingSpace7.getReservations();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertNotNull(reservationList17);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("password_112310734370300", '#');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File password_112310734370300 does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        boolean boolean2 = user0.isValidated;
        int int3 = user0.getId();
        java.lang.String str4 = user0.toString();
        user0.setValidation("User [name= hi!, id=97, email=hi!, password=hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str4, "User [name=null null, id=0, email=null, password=null]");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getType();
        user6.setPassword("hi!");
        boolean boolean10 = user6.isValidated;
        java.lang.String str11 = user6.getLName();
        java.lang.String str12 = user6.getType();
        user6.lname = "FALSE";
        user6.type = "User [name= hi!, id=97, email=hi!, password=]";
        boolean boolean17 = user6.isValidated;
        user6.type = "admin";
        user6.setName("password_112312047073100", "Password!23");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        int int7 = csvReader1.getColumnCount();
        boolean boolean8 = csvReader1.getUseTextQualifier();
        csvReader1.setSkipEmptyRecords(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        paymentStrategy.OtherTypeProvider otherTypeProvider0 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo6 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo6.setBillingName("FALSE");
        boolean boolean10 = otherTypeProvider0.handlePayment(paymentInfo6, (double) (short) 1);
        paymentStrategy.Context context11 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider0);
        java.lang.Class<?> wildcardClass12 = context11.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        java.lang.String str6 = facultyMember2.getPassword();
        java.lang.String str7 = facultyMember2.getEmail();
        int int8 = facultyMember2.getParkingRate();
        int int9 = facultyMember2.parkingspacenum;
        int int10 = facultyMember2.parkingspacenum;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        facultyMember2.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade6 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot14 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace16 = parkingLot14.getParkingSpace((int) ' ');
        reservations.Reservation reservation17 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace16);
        reservationSystemFacade6.editBooking(reservation17, (int) (byte) 100);
        facultyMember2.currentReservation = reservation17;
        int int21 = facultyMember2.getParkingRate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("", "");
        int int3 = nonFacultyStaff2.parkingspacenum;
        nonFacultyStaff2.parkingspacenum = (byte) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setTextQualifier('4');
        int int9 = csvReader1.getColumnCount();
        csvReader1.setCaptureRawRecord(true);
        csvReader1.setRecordDelimiter('\"');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        userLogin.MaintainUser maintainUser0 = new userLogin.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        userLogin.MaintainUser maintainUser2 = new userLogin.MaintainUser();
        maintainUser2.update("admin");
        java.util.ArrayList<userLogin.User> userList5 = maintainUser2.users;
        maintainUser0.users = userList5;
        maintainUser0.path = "User [name= hi!, id=97, email=hi!, password=]";
        java.util.ArrayList<userLogin.User> userList9 = maintainUser0.users;
        // The following exception was thrown during execution in test generation
        try {
            maintainUser0.load("FALSE");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File FALSE does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        java.lang.String str4 = csvReader1.get("FALSE");
        csvReader1.setComment('4');
        boolean boolean7 = csvReader1.skipLine();
        long long8 = csvReader1.getCurrentRecord();
        int int9 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setUseTextQualifier(false);
        java.lang.String[] strArray8 = csvReader1.getHeaders();
        boolean boolean9 = csvReader1.readHeaders();
        char char10 = csvReader1.getTextQualifier();
        char char11 = csvReader1.getComment();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '#' + "'", char11 == '#');
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        int int11 = reservation10.getDay();
        reservation10.updateDuration((int) ',');
        parking.ParkingSpace parkingSpace14 = reservation10.getSpace();
        int int15 = reservation10.getMonth();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        userLogin.User user0 = new userLogin.User();
        java.lang.String str1 = user0.getEmail();
        boolean boolean2 = user0.isValidated;
        int int3 = user0.getId();
        java.lang.String str4 = user0.toString();
        user0.password = "password_112296757334200";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str4, "User [name=null null, id=0, email=null, password=null]");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
            csvWriter1.writeComment("Password!23");
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        parking.ParkingLot parkingLot29 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace31 = parkingLot29.getParkingSpace((int) ' ');
        reservations.Reservation reservation32 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace31);
        int int33 = reservation32.getDay();
        reservation32.updateDuration(2);
        parking.ParkingSpace parkingSpace36 = reservation32.getSpace();
        parking.ParkingSpace parkingSpace37 = reservation32.getSpace();
        parkingSpace21.setReservation(reservation32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(parkingSpace31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(parkingSpace36);
        org.junit.Assert.assertNotNull(parkingSpace37);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        parking.ParkingLot parkingLot74 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace76 = parkingLot74.getParkingSpace((int) ' ');
        reservations.Reservation reservation77 = null;
        parkingSpace76.setReservation(reservation77);
        java.util.ArrayList<reservations.Reservation> reservationList79 = parkingSpace76.getReservations();
        reservations.Reservation reservation80 = new reservations.Reservation((-1), (int) 'a', (int) '#', 0, "password_112306347644100", parkingSpace76);
        reservationSystemFacade0.editBooking(reservation80, 0);
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
        org.junit.Assert.assertNotNull(parkingSpace76);
        org.junit.Assert.assertNotNull(reservationList79);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("password_112325847983500", "hi!");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        paymentStrategy.CreditPaymentProvide creditPaymentProvide0 = new paymentStrategy.CreditPaymentProvide();
        paymentStrategy.OtherTypeProvider otherTypeProvider1 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.PaymentInfo paymentInfo7 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo7.setBillingName("FALSE");
        boolean boolean11 = otherTypeProvider1.handlePayment(paymentInfo7, (double) (short) 1);
        paymentInfo7.setCardBallance(10.0d);
        double double14 = paymentInfo7.getCardBallance();
        int int15 = paymentInfo7.getCardNum();
        boolean boolean17 = creditPaymentProvide0.handlePayment(paymentInfo7, (double) '4');
        manager.SuperManager superManager18 = manager.SuperManager.getInstance();
        superManager18.firstName = "";
        manager.Manager manager21 = superManager18.autoGenerator();
        users.FacultyMember facultyMember24 = new users.FacultyMember("", "hi!");
        int int25 = facultyMember24.parkingspacenum;
        facultyMember24.parkinglot = "hi!";
        facultyMember24.setValid();
        boolean boolean29 = manager21.validateUser((users.UserInfo) facultyMember24);
        java.lang.String str30 = facultyMember24.getPassword();
        paymentStrategy.OtherTypeProvider otherTypeProvider31 = new paymentStrategy.OtherTypeProvider();
        paymentStrategy.Context context32 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) otherTypeProvider31);
        paymentStrategy.PaymentInfo paymentInfo38 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        int int39 = paymentInfo38.getSecurityCode();
        java.lang.String str40 = paymentInfo38.getBillingAddress();
        java.util.Date date42 = null;
        paymentInfo38.parkingInfo(0, date42, "hi!", "hi!", (int) (short) 1);
        boolean boolean48 = otherTypeProvider31.handlePayment(paymentInfo38, (double) 0);
        facultyMember24.setPaymentInfo(paymentInfo38);
        boolean boolean51 = creditPaymentProvide0.handlePayment(paymentInfo38, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(superManager18);
        org.junit.Assert.assertNotNull(manager21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        parking.ParkingSpace parkingSpace11 = new parking.ParkingSpace((int) '#');
        reservations.Reservation reservation12 = new reservations.Reservation((int) (short) 0, (int) ',', (int) (short) 10, (int) (byte) 100, "User [name= hi!, id=97, email=hi!, password=hi!]", parkingSpace11);
        parking.ParkingSpace parkingSpace13 = reservation12.getSpace();
        reservations.Reservation reservation14 = new reservations.Reservation((int) ' ', 1, (int) (byte) 1, (int) '\000', "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]", parkingSpace13);
        org.junit.Assert.assertNotNull(parkingSpace13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("User [name=null null, id=0, email=null, password=null]");
        boolean boolean2 = csvReader1.getSafetySwitch();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        java.lang.String str6 = csvReader1.get(97);
        csvReader1.setRecordDelimiter('\"');
        csvReader1.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = csvReader1.readHeaders();
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
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        reservations.Reservation reservation86 = student27.currentReservation;
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
        org.junit.Assert.assertNull(reservation86);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        parking.ParkingSystem parkingSystem0 = parking.ParkingSystem.getInstance();
        parking.ParkingSpace parkingSpace3 = parkingSystem0.getParkingSpace(10, (int) (byte) 1);
        parking.ParkingLot parkingLot6 = parkingSystem0.addLot((int) (byte) 10, "password_112310734370300");
        org.junit.Assert.assertNotNull(parkingSystem0);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertNotNull(parkingLot6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        users.FacultyMember facultyMember14 = new users.FacultyMember("", "hi!");
        int int15 = facultyMember14.parkingspacenum;
        int int16 = reservationSystemFacade0.calculateOutstanding(reservation11, (users.UserInfo) facultyMember14);
        int int17 = reservation11.getDuration();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        csvWriter1.setRecordDelimiter('#');
        csvWriter1.setDelimiter('#');
        csvWriter1.setDelimiter(',');
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        userLogin.User user0 = new userLogin.User();
        user0.isValidated = true;
        java.lang.String str3 = user0.lname;
        java.lang.String str4 = user0.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        reservations.Reservation reservation3 = facultyMember2.currentReservation;
        int int4 = facultyMember2.getParkingRate();
        org.junit.Assert.assertNull(reservation3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        reservations.ReservationSystemFacade reservationSystemFacade24 = reservations.ReservationSystemFacade.getInstance();
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
        users.FacultyMember facultyMember51 = new users.FacultyMember("", "hi!");
        int int52 = facultyMember51.parkingspacenum;
        facultyMember51.parkinglot = "hi!";
        reservations.ReservationSystemFacade reservationSystemFacade55 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot63 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace65 = parkingLot63.getParkingSpace((int) ' ');
        reservations.Reservation reservation66 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace65);
        reservationSystemFacade55.editBooking(reservation66, (int) (byte) 100);
        facultyMember51.currentReservation = reservation66;
        paymentStrategy.MobilePaymentProvider mobilePaymentProvider70 = new paymentStrategy.MobilePaymentProvider();
        reservationSystemFacade24.payBalance(reservation38, (users.UserInfo) facultyMember51, (paymentStrategy.PaymentProvider) mobilePaymentProvider70);
        int int72 = reservation38.getMonth();
        parkingSpace21.setReservation(reservation38);
        parkingSpace21.setId(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade6);
        org.junit.Assert.assertNotNull(parkingSpace16);
        org.junit.Assert.assertNotNull(parkingSpace21);
        org.junit.Assert.assertNotNull(reservationSystemFacade24);
        org.junit.Assert.assertNotNull(reservationSystemFacade25);
        org.junit.Assert.assertNotNull(intMap26);
        org.junit.Assert.assertNotNull(reservationSystemFacade27);
        org.junit.Assert.assertNotNull(parkingSpace37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(reservationSystemFacade55);
        org.junit.Assert.assertNotNull(parkingSpace65);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo((int) (short) -1, (int) (byte) 1, "", "hi!", (int) 'a');
        paymentInfo5.setBillingAddress("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str8 = paymentInfo5.getBillingAddress();
        paymentInfo5.setCardBallance((double) 97);
        paymentInfo5.setExpDate(0);
        paymentInfo5.setBillingName("password_112306347644100");
        paymentInfo5.setExpDate(8);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str8, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        manager7.setPassword("password_112284545599300");
        java.lang.String str10 = manager7.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]" + "'", str2, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "manager_112327586653400" + "'", str10, "manager_112327586653400");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        users.FacultyMember facultyMember2 = new users.FacultyMember("", "hi!");
        int int3 = facultyMember2.parkingspacenum;
        java.lang.String str4 = facultyMember2.parkinglot;
        int int5 = facultyMember2.getParkingRate();
        reservations.Reservation reservation6 = facultyMember2.currentReservation;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNull(reservation6);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.getUseTextQualifier();
        java.lang.String str6 = csvReader1.get((int) '#');
        boolean boolean7 = csvReader1.readRecord();
        boolean boolean8 = csvReader1.getUseComments();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        boolean boolean6 = csvReader1.getUseComments();
        csvReader1.setUseComments(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = csvReader1.readHeaders();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.util.Date date56 = null;
        paymentInfo42.parkingInfo(0, date56, "hi!", "User [name= hi!, id=32, email=User [name= hi!, id=97, email=hi!, password=admin], password=password_112284545599300]", (int) (short) -1);
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
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        parkingState.State state43 = null;
        parkingSpace9.setState(state43);
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        users.FacultyMember facultyMember5 = new users.FacultyMember("", "hi!");
        boolean boolean6 = superManager0.validateUser((users.UserInfo) facultyMember5);
        manager.Manager manager7 = superManager0.autoGenerator();
        superManager0.firstName = "manager_112327586653400";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]" + "'", str2, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(manager7);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        boolean boolean4 = csvWriter1.getUseTextQualifier();
        int int5 = csvWriter1.getEscapeMode();
        char char6 = csvWriter1.getRecordDelimiter();
        csvWriter1.setDelimiter('\000');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        char char6 = csvReader1.getDelimiter();
        csvReader1.setComment('#');
        boolean boolean10 = csvReader1.isQualified((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ',' + "'", char6 == ',');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        int int67 = reservation59.getDay();
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("password_112306347644100", '#', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        user6.lname = "FALSE";
        user6.email = "";
        user6.password = "password_112306347644100";
        user6.setValidation("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter2 = new com.csvreader.CsvWriter(writer0, ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter outputStream can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        manager.Manager manager2 = new manager.Manager("", "hi!");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getComment();
        java.lang.String str5 = csvReader1.getHeader((int) (short) 1);
        csvReader1.setComment('a');
        csvReader1.setRecordDelimiter('a');
        char char10 = csvReader1.getTextQualifier();
        csvReader1.setUseComments(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '#' + "'", char3 == '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\"' + "'", char10 == '\"');
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.getUsername();
        superManager0.lastName = "hi!";
        superManager0.lastName = "FALSE";
        superManager0.lastName = "User [name= FALSE, id=97, email=hi!, password=hi!]";
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]" + "'", str2, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= FALSE, id=97, email=, password=]", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name= FALSE, id=97, email=hi!, password=hi!]" + "'", str3, "User [name= FALSE, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        user6.setType("User [name= hi!, id=97, email=hi!, password=]");
        user6.password = "User [name= hi!, id=97, email=hi!, password=]";
        user6.setPassword("");
        user6.password = "User [name= hi!, id=97, email=hi!, password=admin]";
        java.lang.String str15 = user6.getType();
        java.lang.String str16 = user6.getPassword();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str15, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name= hi!, id=97, email=hi!, password=admin]" + "'", str16, "User [name= hi!, id=97, email=hi!, password=admin]");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        userLogin.User user6 = new userLogin.User("", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", 8, "Password!23", "", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String str7 = user6.password;
        int int8 = user6.id;
        java.lang.String str9 = user6.lname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]" + "'", str9, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(parkingSpace14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        parking.ParkingLot parkingLot2 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace4 = parkingLot2.getParkingSpace((int) ' ');
        boolean boolean5 = parkingLot2.getEnabled();
        parking.ParkingSpace parkingSpace7 = parkingLot2.getParkingSpace(1);
        int int8 = parkingLot2.getId();
        int int9 = parkingLot2.getId();
        org.junit.Assert.assertNotNull(parkingSpace4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parkingSpace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        parkingSpace26.setEnabled(true);
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
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        reservations.ReservationSystemFacade reservationSystemFacade0 = reservations.ReservationSystemFacade.getInstance();
        parking.ParkingLot parkingLot8 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace10 = parkingLot8.getParkingSpace((int) ' ');
        reservations.Reservation reservation11 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace10);
        reservationSystemFacade0.editBooking(reservation11, (int) (byte) 100);
        parking.ParkingLot parkingLot21 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace23 = parkingLot21.getParkingSpace((int) ' ');
        reservations.Reservation reservation24 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace23);
        int int25 = reservation24.getDay();
        parking.ParkingSpace parkingSpace26 = reservation24.getSpace();
        java.util.ArrayList<reservations.Reservation> reservationList27 = parkingSpace26.getReservations();
        parkingSpace26.setId(0);
        int int30 = parkingSpace26.getId();
        parking.ParkingLot parkingLot38 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace40 = parkingLot38.getParkingSpace((int) ' ');
        reservations.Reservation reservation41 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace40);
        int int42 = reservation41.getDay();
        int int43 = reservation41.getDuration();
        parkingSpace26.setReservation(reservation41);
        reservationSystemFacade0.editBooking(reservation41, 2);
        reservations.Reservation reservation47 = null;
        manager.SuperManager superManager48 = manager.SuperManager.getInstance();
        java.lang.String str49 = superManager48.firstName;
        users.Student student52 = new users.Student("", "hi!");
        boolean boolean53 = superManager48.validateUser((users.UserInfo) student52);
        paymentStrategy.PaymentInfo paymentInfo54 = student52.getPaymentInfo();
        student52.setValid();
        java.lang.String str56 = student52.parkinglot;
        int int57 = student52.getParkingRate();
        // The following exception was thrown during execution in test generation
        try {
            int int58 = reservationSystemFacade0.calculateOutstanding(reservation47, (users.UserInfo) student52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(parkingSpace10);
        org.junit.Assert.assertNotNull(parkingSpace23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(parkingSpace26);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(parkingSpace40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(superManager48);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(paymentInfo54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.setComment('\"');
        csvReader1.setUseComments(false);
        csvReader1.setDelimiter('\"');
        // The following exception was thrown during execution in test generation
        try {
            csvReader1.setEscapeMode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter escapeMode must be a valid value.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        userLogin.User user6 = new userLogin.User("", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", 8, "Password!23", "", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String str7 = user6.password;
        user6.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        java.lang.String str8 = user6.getLName();
        boolean boolean9 = user6.isValidated;
        java.lang.String str10 = user6.lname;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("User [name= hi!, id=97, email=hi!, password=]", "User [name= FALSE, id=97, email=hi!, password=hi!]", "User [name= User [name= hi!, id=97, email=hi!, password=], id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str3, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        boolean boolean43 = facultyMember41.getIsValid();
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("User [name=null null, id=0, email=null, password=null]", "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]", "Password!23");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null null, id=0, email=null, password=null]" + "'", str3, "User [name=null null, id=0, email=null, password=null]");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        boolean boolean5 = csvReader1.skipLine();
        csvReader1.setDelimiter('4');
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        csvReader1.close();
        csvReader1.setTrimWhitespace(false);
        boolean boolean9 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        csvWriter1.setUseTextQualifier(true);
        char char9 = csvWriter1.getRecordDelimiter();
        com.csvreader.CsvReader csvReader11 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean12 = csvReader11.readRecord();
        csvReader11.setSafetySwitch(true);
        boolean boolean15 = csvReader11.skipLine();
        java.lang.String str17 = csvReader11.get("FALSE");
        csvReader11.setUseTextQualifier(false);
        com.csvreader.CsvReader csvReader21 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean22 = csvReader21.readRecord();
        csvReader21.setSafetySwitch(true);
        java.lang.String[] strArray25 = csvReader21.getValues();
        boolean boolean26 = csvReader21.getUseComments();
        char char27 = csvReader21.getTextQualifier();
        java.lang.String[] strArray28 = csvReader21.getValues();
        csvReader11.setHeaders(strArray28);
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeRecord(strArray28, false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertNotNull(csvReader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(csvReader21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\"' + "'", char27 == '\"');
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        userLogin.User user6 = new userLogin.User("User [name= hi!, id=97, email=hi!, password=]", "User [name= hi!, id=97, email=hi!, password=]", (-1), "password_112284545599300", "admin", "User [name= FALSE, id=97, email=hi!, password=hi!]");
        user6.id = 34;
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        csvReader1.setTextQualifier(' ');
        int int8 = csvReader1.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = csvReader1.getValues();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvReader class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
            csvWriter1.write("User [name= hi!, id=97, email=hi!, password=]", false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.csvreader.CsvReader csvReader1 = null; // flaky: new com.csvreader.CsvReader("User [name= FALSE, id=97, email=hi!, password=hi!]");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        int int14 = facultyMember6.getParkingRate();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reservation12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getFName();
        java.lang.String str8 = user6.getPassword();
        java.lang.String str9 = user6.toString();
        java.lang.String str10 = user6.getPassword();
        java.lang.String str11 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str9, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        paymentStrategy.PaymentInfo paymentInfo5 = new paymentStrategy.PaymentInfo(0, (int) '#', "manager_112305914121600", "", (int) (byte) 1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
            csvWriter1.write("User [name= FALSE, id=97, email=, password=]", false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This instance of the CsvWriter class has already been closed.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\"' + "'", char11 == '\"');
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvReader csvReader2 = new com.csvreader.CsvReader("User [name= hi!, id=97, email=hi!, password=admin]", ',');
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: File User [name= hi!, id=97, email=hi!, password=admin] does not exist.");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.firstName;
        java.lang.String str2 = superManager0.firstName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        paymentInfo57.setExpDate((int) '4');
        java.lang.String str66 = paymentInfo57.getBillingName();
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "FALSE" + "'", str66, "FALSE");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        userLogin.User user6 = new userLogin.User("", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", 8, "Password!23", "", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        java.lang.String str7 = user6.email;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Password!23" + "'", str7, "Password!23");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        paymentStrategy.Context context48 = new paymentStrategy.Context((paymentStrategy.PaymentProvider) mobilePaymentProvider46);
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
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        boolean boolean4 = csvReader1.skipRecord();
        java.lang.String str6 = csvReader1.get(97);
        csvReader1.setRecordDelimiter('\"');
        csvReader1.close();
        csvReader1.setSkipEmptyRecords(true);
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        userLogin.User user6 = new userLogin.User("", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]", 8, "Password!23", "", "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
        user6.setValidation("Password!23");
        boolean boolean9 = user6.isValidated;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.String str3 = com.csvreader.CsvWriter.replace("password_112312047073100", "password_112296757334200", "password_112325847983500");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "password_112312047073100" + "'", str3, "password_112312047073100");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        parkingSpace26.setEnabled(false);
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
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        reservations.Reservation reservation47 = null;
        manager.SuperManager superManager48 = manager.SuperManager.getInstance();
        java.lang.String str49 = superManager48.firstName;
        users.Student student52 = new users.Student("", "hi!");
        boolean boolean53 = superManager48.validateUser((users.UserInfo) student52);
        paymentStrategy.PaymentInfo paymentInfo54 = student52.getPaymentInfo();
        student52.setValid();
        java.lang.String str56 = student52.parkinglot;
        int int57 = student52.getParkingRate();
        // The following exception was thrown during execution in test generation
        try {
            int int58 = reservationSystemFacade0.calculateOutstanding(reservation47, (users.UserInfo) student52);
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
        org.junit.Assert.assertNotNull(superManager48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(paymentInfo54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        boolean boolean10 = parkingLot7.getEnabled();
        parking.ParkingSpace parkingSpace12 = parkingLot7.getParkingSpace(1);
        reservations.Reservation reservation13 = new reservations.Reservation((int) '4', 15, (int) '\"', (int) (byte) 100, "admin", parkingSpace12);
        java.lang.String str14 = reservation13.getPlate();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        java.lang.String str8 = user6.getEmail();
        java.lang.String str9 = user6.getValidation();
        user6.setName("User [name= hi!, id=97, email=hi!, password=]", "");
        java.lang.String str13 = user6.toString();
        user6.password = "User [name=null null, id=0, email=null, password=null]";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FALSE" + "'", str9, "FALSE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]" + "'", str13, "User [name=User [name= hi!, id=97, email=hi!, password=] , id=97, email=hi!, password=]");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        java.lang.String str1 = superManager0.getUsername();
        users.UserInfo userInfo2 = null;
        boolean boolean3 = superManager0.validateUser(userInfo2);
        org.junit.Assert.assertNotNull(superManager0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]" + "'", str1, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=admin, password=admin]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        reservation59.updateDuration((int) (short) 10);
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
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getUseComments();
        char char7 = csvReader1.getTextQualifier();
        int int8 = csvReader1.getHeaderCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        userLogin.User user6 = new userLogin.User("FALSE", "User [name= hi!, id=97, email=hi!, password=]", (int) '#', "admin", "admin", "FALSE");
        user6.setEmail("User [name= hi!, id=97, email=hi!, password=admin]");
        user6.setType("User [name= hi!, id=97, email=hi!, password=hi!]");
        user6.setPassword("User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str13 = user6.getPassword();
        user6.email = "password_112284545599300";
        user6.lname = "password_112296757334200";
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str13, "User [name= hi!, id=97, email=hi!, password=]");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("admin");
        csvWriter1.setUseTextQualifier(false);
        char char4 = csvWriter1.getRecordDelimiter();
        csvWriter1.setEscapeMode((int) (short) -1);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.csvreader.CsvWriter csvWriter3 = new com.csvreader.CsvWriter("manager_112305914121600", ' ', charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter charset can not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        users.Student student2 = new users.Student("password_112284545599300", "password_112306347644100");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        csvReader1.close();
        int int6 = csvReader1.getColumnCount();
        csvReader1.setComment(' ');
        int int9 = csvReader1.getEscapeMode();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getValidation();
        java.lang.String str8 = user6.getLName();
        user6.type = "";
        user6.isValidated = true;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FALSE" + "'", str7, "FALSE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        parking.ParkingLot parkingLot7 = new parking.ParkingLot(0, "hi!");
        parking.ParkingSpace parkingSpace9 = parkingLot7.getParkingSpace((int) ' ');
        reservations.Reservation reservation10 = new reservations.Reservation(1, (int) (byte) 0, 1, (int) (byte) 100, "admin", parkingSpace9);
        parkingState.State state11 = parkingSpace9.getSensorStatus();
        parkingState.State state12 = parkingSpace9.getSensorStatus();
        boolean boolean13 = parkingSpace9.isEnabled();
        parkingState.Occupied occupied15 = new parkingState.Occupied("User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
        parkingSpace9.setState((parkingState.State) occupied15);
        java.lang.String str17 = occupied15.handleState();
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertNotNull(state11);
        org.junit.Assert.assertNotNull(state12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]" + "'", str17, "User [name=FALSE User [name= hi!, id=97, email=hi!, password=], id=35, email=User [name= hi!, id=97, email=hi!, password=admin], password=admin]");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        boolean boolean6 = csvReader1.getSafetySwitch();
        int int7 = csvReader1.getHeaderCount();
        boolean boolean8 = csvReader1.getSafetySwitch();
        boolean boolean9 = csvReader1.getUseTextQualifier();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        char char2 = csvReader1.getComment();
        char char3 = csvReader1.getTextQualifier();
        java.lang.String str5 = csvReader1.get(8);
        boolean boolean6 = csvReader1.readRecord();
        int int7 = csvReader1.getColumnCount();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        reservation36.updateDuration((int) '#');
        int int45 = reservation36.getStartTime();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("hi!", "");
        java.lang.String str3 = nonFacultyStaff2.getEmail();
        int int4 = nonFacultyStaff2.getParkingRate();
        int int5 = nonFacultyStaff2.getParkingRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        boolean boolean25 = student21.getIsValid();
        org.junit.Assert.assertNotNull(reservationSystemFacade0);
        org.junit.Assert.assertNotNull(intMap1);
        org.junit.Assert.assertNotNull(reservationSystemFacade2);
        org.junit.Assert.assertNotNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNull(paymentInfo24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        boolean boolean15 = csvReader1.getTrimWhitespace();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        manager.SuperManager superManager0 = manager.SuperManager.getInstance();
        superManager0.firstName = "";
        manager.Manager manager3 = superManager0.autoGenerator();
        java.lang.String str4 = manager3.firstName;
        java.lang.String str5 = manager3.lastName;
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(manager3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        users.NonFacultyStaff nonFacultyStaff2 = new users.NonFacultyStaff("password_112325847983500", "FALSE");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.csvreader.CsvWriter csvWriter1 = new com.csvreader.CsvWriter("");
        csvWriter1.setRecordDelimiter('\"');
        csvWriter1.setTextQualifier('\"');
        char char6 = csvWriter1.getComment();
        boolean boolean7 = csvWriter1.getForceQualifier();
        csvWriter1.setTextQualifier('a');
        char char10 = csvWriter1.getComment();
        // The following exception was thrown during execution in test generation
        try {
            csvWriter1.writeComment("manager_112327586653400");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.toString();
        java.lang.String str8 = user6.email;
        java.lang.String str9 = user6.email;
        java.lang.String str10 = user6.lname;
        java.lang.String str11 = user6.getValidation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name= hi!, id=97, email=hi!, password=]" + "'", str7, "User [name= hi!, id=97, email=hi!, password=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        userLogin.User user6 = new userLogin.User("", "hi!", (int) 'a', "hi!", "", "hi!");
        java.lang.String str7 = user6.getPassword();
        user6.setName("", "User [name= hi!, id=97, email=hi!, password=]");
        java.lang.String str11 = user6.getValidation();
        user6.lname = "hi!";
        user6.email = "Password!23";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FALSE" + "'", str11, "FALSE");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.csvreader.CsvReader csvReader1 = com.csvreader.CsvReader.parse("hi!");
        boolean boolean2 = csvReader1.readRecord();
        csvReader1.setSafetySwitch(true);
        java.lang.String[] strArray5 = csvReader1.getValues();
        char char6 = csvReader1.getDelimiter();
        csvReader1.setComment('#');
        boolean boolean10 = csvReader1.isQualified((int) '4');
        boolean boolean11 = csvReader1.getCaptureRawRecord();
        java.lang.String str13 = csvReader1.get((int) '\000');
        boolean boolean14 = csvReader1.skipLine();
        org.junit.Assert.assertNotNull(csvReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ',' + "'", char6 == ',');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}
