/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 29 23:22:21 GMT 2023
 */

package test_evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import parkingState.Disabled;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Disabled_ESTest extends Disabled_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Disabled disabled0 = new Disabled();
      String string0 = disabled0.handleState();
      assertNull(string0);
  }
}