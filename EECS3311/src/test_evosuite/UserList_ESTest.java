/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 29 23:36:26 GMT 2023
 */

package test_evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import users.UserInfo;
import users.UserList;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UserList_ESTest extends UserList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserList userList0 = new UserList();
      ArrayList<UserInfo> arrayList0 = userList0.getList();
      assertEquals(0, arrayList0.size());
  }
}
