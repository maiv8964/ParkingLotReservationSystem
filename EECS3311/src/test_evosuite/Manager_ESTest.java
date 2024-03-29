/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 29 23:15:31 GMT 2023
 */

package test_evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import manager.Manager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import users.FacultyMember;
import users.NonFacultyStaff;
import users.Student;
import users.UserInfo;
import users.Visitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Manager_ESTest extends Manager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Manager manager0 = new Manager("\"r/j7BO/~1#17s$k.", "4?5");
      assertEquals("\"r/j7BO/~1#17s$k.", manager0.getUsername());
      assertEquals("4?5", manager0.getPassword());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Manager manager0 = new Manager("", "");
      manager0.setUsername((String) null);
      String string0 = manager0.getUsername();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Manager manager0 = new Manager("", "");
      String string0 = manager0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Manager manager0 = new Manager((String) null, (String) null);
      String string0 = manager0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Manager manager0 = new Manager("cC", "cC");
      manager0.setPassword("");
      String string0 = manager0.getPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Manager manager0 = new Manager("7@-", "7@-");
      Visitor visitor0 = new Visitor("7@-", (String) null);
      // Undeclared exception!
      try { 
        manager0.validateUser(visitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Manager manager0 = new Manager("userFs.Visitor", "userFs.Visitor");
      Visitor visitor0 = new Visitor("+@-", "?=a?=A?=0?=!0@$!&]]]]]]]]");
      boolean boolean0 = manager0.validateUser(visitor0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Manager manager0 = new Manager("", "");
      Visitor visitor0 = new Visitor("", "R:b");
      boolean boolean0 = manager0.validateUser(visitor0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Manager manager0 = new Manager(" &5^`YA@CVsx.f?v>", " &5^`YA@CVsx.f?v>");
      boolean boolean0 = manager0.validateUser((UserInfo) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Manager manager0 = new Manager((String) null, (String) null);
      NonFacultyStaff nonFacultyStaff0 = new NonFacultyStaff((String) null, (String) null);
      boolean boolean0 = manager0.validateUser(nonFacultyStaff0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Manager manager0 = new Manager((String) null, (String) null);
      FacultyMember facultyMember0 = new FacultyMember((String) null, (String) null);
      boolean boolean0 = manager0.validateUser(facultyMember0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Manager manager0 = new Manager("Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.", "Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.");
      manager0.setUsername("Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.");
      assertEquals("Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.", manager0.getPassword());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Manager manager0 = new Manager("Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.", "Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.");
      String string0 = manager0.getUsername();
      assertEquals("Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Manager manager0 = new Manager((String) null, (String) null);
      Student student0 = new Student((String) null, (String) null);
      boolean boolean0 = manager0.validateUser(student0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Manager manager0 = new Manager("Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.", "Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.");
      Visitor visitor0 = new Visitor("+@-", "Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.");
      boolean boolean0 = manager0.validateUser(visitor0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Manager manager0 = new Manager("Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.", "Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.");
      String string0 = manager0.getPassword();
      assertEquals("Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol.", string0);
  }
}
