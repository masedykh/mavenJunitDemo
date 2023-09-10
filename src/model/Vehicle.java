/**
 * Author: Michael Sedykh - masedykh
 * Course: CIS175 - Fall 2023
 * Date: Sep 10, 2023
 */
package model;

public class Vehicle {
    // Instance variables to store vehicle information
    private String makeModel;
    private String engine;
    private int mileage;
    private double price;
    private boolean cosmeticDamage;

    /**
     * Default constructor for the 'Vehicle' class.
     * Initializes instance variables with default values.
     */
    public Vehicle() {
        this.makeModel = "";
        this.engine = "";
        this.mileage = 0;
        this.price = 0;
        this.cosmeticDamage = false;
    }

    /**
     * Constructor for the 'Vehicle' class with a specified make and model.
     * Initializes instance variables with default values except for 'makeModel'.
     *
     * @param makeModel The make and model of the vehicle.
     */
    public Vehicle(String makeModel) {
        this.makeModel = makeModel;
        this.engine = "";
        this.mileage = 0;
        this.price = 0;
        this.cosmeticDamage = false;
    }

    /**
     * Getter for the make and model of the vehicle.
     *
     * @return The make and model of the vehicle.
     */
    public String getMakeModel() {
        return makeModel;
    }

    /**
     * Setter for the make and model of the vehicle.
     *
     * @param makeModel The make and model of the vehicle to set.
     */
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    /**
     * Getter for the engine type of the vehicle.
     *
     * @return The engine type of the vehicle.
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Setter for the engine type of the vehicle.
     *
     * @param engine The engine type of the vehicle to set.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * Getter for the mileage of the vehicle.
     *
     * @return The mileage of the vehicle.
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Setter for the mileage of the vehicle.
     *
     * @param mileage The mileage of the vehicle to set.
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * Getter for the price of the vehicle.
     *
     * @return The price of the vehicle.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter for the price of the vehicle.
     *
     * @param price The price of the vehicle to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Getter for the information about cosmetic damage on the vehicle.
     *
     * @return True if the vehicle has cosmetic damage, false otherwise.
     */
    public boolean getCosmeticDamage() {
        return cosmeticDamage;
    }

    /**
     * Setter for the information about cosmetic damage on the vehicle.
     *
     * @param cosmeticDamage True if the vehicle has cosmetic damage, false otherwise.
     */
    public void setCosmeticDamage(boolean cosmeticDamage) {
        this.cosmeticDamage = cosmeticDamage;
    }

    /**
     * Generates a formatted string containing the vehicle's information.
     *
     * @return A string representation of the vehicle's information.
     */
    public String printInfo() {
        return "Make Model: " + getMakeModel() + "-Engine: " + getEngine() +
                "-Mileage: " + getMileage() + "-Price: " + getPrice() +
                "-Any Damage?: " + getCosmeticDamage();
    }
}
