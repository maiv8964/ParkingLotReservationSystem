/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 29 23:24:04 GMT 2023
 */

package paymentStrategy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import paymentStrategy.DebitPaymentProvider;
import paymentStrategy.PaymentInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DebitPaymentProvider_ESTest extends DebitPaymentProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      PaymentInfo paymentInfo0 = new PaymentInfo(1, 2724, "", "paymentStrategy.DebitPaymentProvider", 0);
      boolean boolean0 = debitPaymentProvider0.handlePayment(paymentInfo0, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      PaymentInfo paymentInfo0 = new PaymentInfo((-2818), (-5162), "l%ut3/", "l%ut3/", (-2818));
      boolean boolean0 = debitPaymentProvider0.handlePayment(paymentInfo0, 2211);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      // Undeclared exception!
      try { 
        debitPaymentProvider0.handlePayment((PaymentInfo) null, 371.363982);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("paymentStrategy.DebitPaymentProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      PaymentInfo paymentInfo0 = new PaymentInfo(2829, 2025, "", "", (-1));
      boolean boolean0 = debitPaymentProvider0.handlePayment(paymentInfo0, 2829);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      PaymentInfo paymentInfo0 = new PaymentInfo(1, 1, "KG:y|c)'j<^|", (String) null, 1);
      boolean boolean0 = debitPaymentProvider0.handlePayment(paymentInfo0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      PaymentInfo paymentInfo0 = new PaymentInfo(2211, (-5162), (String) null, (String) null, 0);
      boolean boolean0 = debitPaymentProvider0.handlePayment(paymentInfo0, (-5162));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      PaymentInfo paymentInfo0 = new PaymentInfo(2556, 2556, "", "BF~D", 2556);
      boolean boolean0 = debitPaymentProvider0.handlePayment(paymentInfo0, 2556);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      PaymentInfo paymentInfo0 = new PaymentInfo(1442, 0, "paymentStrategy.PaymentInfo", "Invalid payment information.", 1001);
      boolean boolean0 = debitPaymentProvider0.handlePayment(paymentInfo0, (-724.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      PaymentInfo paymentInfo0 = new PaymentInfo(0, 0, "", "", 0);
      boolean boolean0 = debitPaymentProvider0.handlePayment(paymentInfo0, 0);
      assertFalse(boolean0);
  }
}