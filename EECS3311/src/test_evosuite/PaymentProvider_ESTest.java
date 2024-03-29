/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 29 23:23:47 GMT 2023
 */

package test_evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import paymentStrategy.DebitPaymentProvider;
import paymentStrategy.OtherTypeProvider;
import paymentStrategy.PaymentInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PaymentProvider_ESTest extends PaymentProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PaymentInfo paymentInfo0 = new PaymentInfo(411, (-2662), "", "", 788);
      OtherTypeProvider otherTypeProvider0 = new OtherTypeProvider();
      boolean boolean0 = otherTypeProvider0.handlePayment(paymentInfo0, 1.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PaymentInfo paymentInfo0 = new PaymentInfo(2392, 2392, (String) null, "", 1);
      OtherTypeProvider otherTypeProvider0 = new OtherTypeProvider();
      boolean boolean0 = otherTypeProvider0.handlePayment(paymentInfo0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DebitPaymentProvider debitPaymentProvider0 = new DebitPaymentProvider();
      // Undeclared exception!
      try { 
        debitPaymentProvider0.handlePayment((PaymentInfo) null, (-129.5));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("paymentStrategy.DebitPaymentProvider", e);
      }
  }
}
