/**
 * @author Michael Sedykh - masedykh
 * CIS175 - Fall 2023
 * Sep 10, 2023
 * 
 * tests.TestMustang tests Vehicle.java getters and setters through JUnit testing
 */

package tests;
/**

 * CIS175 - Fall 2023
 * Sep 10, 2023
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Vehicle;

public class TestMustang {

	String makeModel = "2012 Mustang";
	Vehicle testVehicle = new Vehicle(makeModel);
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testVehicleModel() {
		assertEquals(makeModel, testVehicle.getMakeModel());
	}
	
	@Test
	public void testSettingProps() {
		boolean cosmeticDamage = true;
		testVehicle.setCosmeticDamage(cosmeticDamage);
		assertTrue(cosmeticDamage == testVehicle.getCosmeticDamage());
	}
	
	@Test 
	public void testNoNull() {
		assertNotNull(testVehicle.printInfo());
	}
}