/*
 * This is the Car object in which all the data will be stored. It is able to take in a VIN, make, model, and year.
 * It uses lombok to automatically generate setters and getters in runtime.
 */
package com.example.car_inventory.helper_classes;

import lombok.Data;
import lombok.Setter;
import lombok.Getter;
@Data public class Car
{
	@Setter @Getter private int year;
	@Setter @Getter private int vin;
	@Setter @Getter private String make,model;
	
	//This method will instantiate a car object using the values given
	public Car(int vin, String make, String model, int year)
	{
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	//This method will instantiate a car with base values if none are given.
	public Car()
	{
		this.vin = 0;
		this.make = null;
		this.model = null;
		this.year = 0;
	}
	//Using custom toString to modify the output to look a bit cleaner.
	public String toString()
	{
		return String.format("VIN: %d, Make: %s, Model: %s, Year: %d \n", vin,make,model,year );
	}
}