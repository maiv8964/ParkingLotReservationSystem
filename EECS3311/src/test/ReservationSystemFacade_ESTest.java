/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 29 23:25:52 GMT 2023
 */

package reservations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import parking.ParkingLot;
import parking.ParkingSpace;
import paymentStrategy.Context;
import paymentStrategy.CreditPaymentProvide;
import paymentStrategy.DebitPaymentProvider;
import paymentStrategy.PaymentInfo;
import paymentStrategy.PaymentProvider;
import reservations.Reservation;
import reservations.ReservationSystemFacade;
import users.NonFacultyStaff;
import users.Student;
import users.UserInfo;
import users.Visitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ReservationSystemFacade_ESTest extends ReservationSystemFacade_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      ParkingSpace parkingSpace0 = new ParkingSpace(616);
      Reservation reservation0 = new Reservation((-2805), (-1268), (-2805), (-1268), (String) null, parkingSpace0);
      Student student0 = new Student(":7jJ[TkaCe`8,", "");
      reservationSystemFacade0.cancelBooking(reservation0, student0);
      assertEquals((-1268), reservation0.getStartTime());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Visitor visitor0 = new Visitor("L6TB_x3n9hy(jqQ", "");
      PaymentInfo paymentInfo0 = new PaymentInfo(915, 1, "", "", 1);
      visitor0.setPaymentInfo(paymentInfo0);
      ParkingSpace parkingSpace0 = new ParkingSpace((-3215));
      CreditPaymentProvide creditPaymentProvide0 = new CreditPaymentProvide();
      Context context0 = new Context(creditPaymentProvide0);
      Reservation reservation0 = reservationSystemFacade0.createReservation(visitor0, (-1), (-128), (-2118), (-1), "", parkingSpace0, context0);
      assertEquals((-128), reservation0.getMonth());
      assertEquals((-2118), reservation0.getDay());
      assertEquals((-1), reservation0.getDuration());
      assertEquals((-1), reservation0.getStartTime());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Visitor visitor0 = new Visitor("L6TB_x3n9hy(jqQ", "");
      PaymentInfo paymentInfo0 = new PaymentInfo(1440, 1, "0upXbt7`", "0upXbt7`", 311);
      visitor0.setPaymentInfo(paymentInfo0);
      ParkingSpace parkingSpace0 = new ParkingSpace(1);
      CreditPaymentProvide creditPaymentProvide0 = new CreditPaymentProvide();
      Context context0 = new Context(creditPaymentProvide0);
      Reservation reservation0 = reservationSystemFacade0.createReservation(visitor0, 0, 1, 1, 152, "zkd(<C<*'\u0007^&&d~", parkingSpace0, context0);
      assertEquals(1, reservation0.getMonth());
      assertEquals(152, reservation0.getStartTime());
      assertEquals(0, reservation0.getDuration());
      assertEquals(1, reservation0.getDay());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Visitor visitor0 = new Visitor("Z?2", "L6TB_x3n9hy(jqQ");
      PaymentInfo paymentInfo0 = new PaymentInfo(1057, (-758), "", "g-JJg", 6200);
      visitor0.setPaymentInfo(paymentInfo0);
      ParkingSpace parkingSpace0 = new ParkingSpace(6200);
      CreditPaymentProvide creditPaymentProvide0 = new CreditPaymentProvide();
      Context context0 = new Context(creditPaymentProvide0);
      Reservation reservation0 = reservationSystemFacade0.createReservation(visitor0, 6200, 0, (-1), (-1), "Processing payment using Debit Type payment method...", parkingSpace0, context0);
      assertEquals(6200, reservation0.getDuration());
      assertEquals((-1), reservation0.getDay());
      assertEquals(0, reservation0.getMonth());
      assertEquals((-1), reservation0.getStartTime());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Visitor visitor0 = new Visitor("L6TB_x3n9hy(jqQ", ":(n:e=4)");
      PaymentInfo paymentInfo0 = new PaymentInfo(1419, (-7), "0upXbt7`", "0upXbt7`", 190);
      visitor0.setPaymentInfo(paymentInfo0);
      ParkingSpace parkingSpace0 = new ParkingSpace((-7));
      CreditPaymentProvide creditPaymentProvide0 = new CreditPaymentProvide();
      Context context0 = new Context(creditPaymentProvide0);
      Reservation reservation0 = reservationSystemFacade0.createReservation(visitor0, 190, 152, 1732, 0, "", parkingSpace0, context0);
      int int0 = reservationSystemFacade0.calculateOutstanding(reservation0, visitor0);
      assertEquals(152, reservation0.getMonth());
      assertEquals(1732, reservation0.getDay());
      assertEquals(0, reservation0.getStartTime());
      assertEquals(2835, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Visitor visitor0 = new Visitor("", "");
      // Undeclared exception!
      try { 
        reservationSystemFacade0.calculateOutstanding((Reservation) null, visitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("reservations.ReservationSystemFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      ParkingSpace parkingSpace0 = new ParkingSpace(595);
      Reservation reservation0 = new Reservation(595, 595, 595, 595, "eJhzXh| (4F@`", parkingSpace0);
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      // Undeclared exception!
      try { 
        reservationSystemFacade0.payBalance(reservation0, (UserInfo) null, debitPaymentProvider0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("reservations.ReservationSystemFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Reservation reservation0 = new Reservation(1, 1, 1, 1, "d~B$}_CN`", (ParkingSpace) null);
      Visitor visitor0 = new Visitor("d~B$}_CN`", "");
      reservationSystemFacade0.payBalance(reservation0, visitor0, (PaymentProvider) null);
      assertEquals(1, reservation0.getDay());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      // Undeclared exception!
      try { 
        reservationSystemFacade0.editBooking((Reservation) null, 522);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("reservations.ReservationSystemFacade", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      reservationSystemFacade0.editBooking((Reservation) null, (-2118));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Visitor visitor0 = new Visitor("L6TB_x3n9hy(jqQ", "");
      PaymentInfo paymentInfo0 = new PaymentInfo(1440, 1, "0upXbt7`", "0upXbt7`", 311);
      visitor0.setPaymentInfo(paymentInfo0);
      ParkingSpace parkingSpace0 = new ParkingSpace(1);
      CreditPaymentProvide creditPaymentProvide0 = new CreditPaymentProvide();
      Context context0 = new Context(creditPaymentProvide0);
      Reservation reservation0 = reservationSystemFacade0.createReservation(visitor0, (-2118), 1, 0, (-1279), "L6TB_x3n9hy(jqQ", parkingSpace0, context0);
      assertEquals(0, reservation0.getDay());
      assertEquals(1, reservation0.getMonth());
      assertNotNull(reservation0);
      assertEquals((-1279), reservation0.getStartTime());
      
      int int0 = reservationSystemFacade0.calculateOutstanding(visitor0.currentReservation, visitor0);
      assertEquals((-31785), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Visitor visitor0 = new Visitor("", "");
      PaymentInfo paymentInfo0 = new PaymentInfo(0, 2740, "users.UserInfo", (String) null, 8);
      visitor0.setPaymentInfo(paymentInfo0);
      ParkingSpace parkingSpace0 = new ParkingSpace(100);
      CreditPaymentProvide creditPaymentProvide0 = new CreditPaymentProvide();
      Context context0 = new Context(creditPaymentProvide0);
      Reservation reservation0 = reservationSystemFacade0.createReservation(visitor0, 1440, 0, 0, 1440, "", parkingSpace0, context0);
      assertNull(reservation0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Visitor visitor0 = new Visitor("", "");
      ParkingSpace parkingSpace0 = new ParkingSpace(0);
      Reservation reservation0 = new Reservation(0, (-291), 0, 0, "Qiwg|gj?=4Xf", parkingSpace0);
      visitor0.currentReservation = reservation0;
      Reservation reservation1 = reservationSystemFacade0.createReservation(visitor0, 0, 0, 0, 0, (String) null, parkingSpace0, (Context) null);
      assertNull(reservation1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Visitor visitor0 = new Visitor("L6TB_x3n9hy(jqQ", "");
      ParkingSpace parkingSpace0 = new ParkingSpace(1);
      CreditPaymentProvide creditPaymentProvide0 = new CreditPaymentProvide();
      Context context0 = new Context(creditPaymentProvide0);
      // Undeclared exception!
      try { 
        reservationSystemFacade0.createReservation(visitor0, (-2118), 1, 0, (-1279), "L6TB_x3n9hy(jqQ", parkingSpace0, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("paymentStrategy.CreditPaymentProvide", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Student student0 = new Student("Processing payment using Mobile Type payment method...", "Processing payment using Mobile Type payment method...");
      Reservation reservation0 = reservationSystemFacade0.createReservation(student0, 0, 0, 0, 0, (String) null, (ParkingSpace) null, (Context) null);
      assertNull(reservation0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      ReservationSystemFacade reservationSystemFacade1 = ReservationSystemFacade.getInstance();
      assertSame(reservationSystemFacade1, reservationSystemFacade0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Map<Integer, ParkingLot> map0 = reservationSystemFacade0.getLots();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      assertNotNull(reservationSystemFacade0);
      
      ParkingSpace parkingSpace0 = new ParkingSpace(1);
      Reservation reservation0 = new Reservation(1, (-5460), 1, (-1), "", parkingSpace0);
      NonFacultyStaff nonFacultyStaff0 = new NonFacultyStaff("reservations.ReservationSystemFacade", "");
      int int0 = reservationSystemFacade0.calculateOutstanding(reservation0, nonFacultyStaff0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ReservationSystemFacade reservationSystemFacade0 = ReservationSystemFacade.getInstance();
      Visitor visitor0 = new Visitor("'0QNZQ7", "'0QNZQ7");
      // Undeclared exception!
      try { 
        reservationSystemFacade0.cancelBooking((Reservation) null, visitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("reservations.ReservationSystemFacade", e);
      }
  }
}