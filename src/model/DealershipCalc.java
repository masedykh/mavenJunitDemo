/**
 * @author Michael Sedykh - masedykh
 * CIS175 - Fall 2023
 * Sep 10, 2023
 */

package model;

public class DealershipCalc {
	/**
	 * Calculates the gas expense of the vehicle, depending on what engine is specified
	 * 
	 * @param vehicle	calculates estimated yearly gas expense based off the average yearly expense
	 * @return			the gas expense figure for the vehicle
	 */
	public double calculateYearlyGasExpense(Vehicle vehicle) {
		double yearlyGasExpenseRate = 0;
		int averageConsumerGasExpense = 2200;
		
		if(vehicle.getEngine() == "Petrol" ) {
			yearlyGasExpenseRate = 1;
		} else if (vehicle.getEngine() == "Diesel") {
			yearlyGasExpenseRate = .8;
		} else if (vehicle.getEngine() == "Hybrid") {
			yearlyGasExpenseRate = .47;
		} else {
			yearlyGasExpenseRate = .12;
		}
		
		return averageConsumerGasExpense * yearlyGasExpenseRate;
	}
	
	/**
	 * Calculates the price of the vehicle after one year ownership. A greater mileage will decrease depreciation rate.
	 * Cosmetic damage increases depreciation rate. Vehicle price will subtract a portion of itself for the new figure
	 * 
	 * @param vehicle	obtains the vehicles mileage, price, and cosmeticDamage state to determine price
	 * @return			the price of the vehicle after one year 
	 */
	public double calculateFirstYearDepreciation(Vehicle vehicle) {
		double depreciationRate = 0.0;
		
		if(vehicle.getMileage() <= 4999) {
			depreciationRate = .35;
		} else if(vehicle.getMileage() > 4999 && vehicle.getMileage() <= 15000){
			depreciationRate = .17;
		} else {
			depreciationRate = .12;
		}
		
		if(vehicle.getCosmeticDamage() == true) {
			depreciationRate += .6;
		}
		
		return vehicle.getPrice() - (vehicle.getPrice() * depreciationRate);
	}
	
	/**
	 * Returns if the vehicle can have an extended warranty offer. If damaged or mileage is greater than 19999
	 * warranty is not offered
	 * 
	 * @param vehicle	obtains cosmetic damage state and mileage of vehicle
	 * @return			returns true or false if warranty is offered
	 */
	public boolean offersExtendedWarranty(Vehicle vehicle) {
		if(vehicle.getCosmeticDamage() == true) {
			return false;
		}
		
		if(vehicle.getMileage() < 20000) {
			return true;
		}
		
		return false;
	}
}
