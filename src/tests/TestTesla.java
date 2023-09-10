/**
 * @author Michael Sedykh - masedykh
 * CIS175 - Fall 2023
 * Sep 10, 2023
 * 
 * TestTesla tests Vehicle.java and DealershipCalc.java functionality through JUnit tests
 * the JUnit tests checks for all of DealershipCalc's methods 
 */

package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Vehicle;
import model.DealershipCalc;

public class TestTesla {
	Vehicle testVehicle = new Vehicle("2021 Model X");	
	DealershipCalc dealerShipCalc = new DealershipCalc();
	
	@Before
	public void setUp() throws Exception {
	}
	
	/**
	 * testYearlyGasExpense() manually had the variable expGasExpense calculated
	 * the equation to determine expGasExpense is 2200 (Average Consumer Expense) * .12 (EV rate)
	 */
	@Test
	public void testYearlyGasExpense() {
		String engineType = "Electric";
		double expGasExpense = 264;
		
		testVehicle.setEngine(engineType);
		assertTrue(dealerShipCalc.calculateYearlyGasExpense(testVehicle) == expGasExpense);
	}
	
	/**
	 * testFirstYearDepr() manually had the variable expFirstYearDepr calculated
	 * the figure comes from 75000-(75000*.35(Depreciation Rate))
	 */
	@Test
	public void testFirstYearDepr() {
		int mileage = 350;
		double price = 75000;
		boolean cosmeticDamage = false;
		double expFirstYearDepr = 48750;
		
		testVehicle.setMileage(mileage);
		testVehicle.setPrice(price);
		testVehicle.setCosmeticDamage(cosmeticDamage);
		
		assertEquals(expFirstYearDepr, dealerShipCalc.calculateFirstYearDepreciation(testVehicle), 0);
	}
	
	/**
	 * tests functionality if a warranty is possible
	 */
	@Test 
	public void testExtWarranty() {
		int mileage = 350;
		boolean cosmeticDamage = false;
		
		testVehicle.setMileage(mileage);
		testVehicle.setCosmeticDamage(cosmeticDamage);
		
		assertTrue(dealerShipCalc.offersExtendedWarranty(testVehicle));
	}
}