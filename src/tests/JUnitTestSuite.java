/**
 * @author Michael Sedykh - masedykh
 * CIS175 - Fall 2023
 * Sep 10, 2023
 * 
 * Demonstration of JUnit Suite of TestTesla and TestMustang classes
 */

package tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestTesla.class, TestMustang.class })

public class JUnitTestSuite {

}