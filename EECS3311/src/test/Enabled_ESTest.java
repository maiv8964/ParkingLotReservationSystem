/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 29 23:20:07 GMT 2023
 */

package parkingState;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import parkingState.Enabled;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Enabled_ESTest extends Enabled_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Enabled enabled0 = new Enabled();
      String string0 = enabled0.handleState();
      assertEquals("", string0);
  }
}
