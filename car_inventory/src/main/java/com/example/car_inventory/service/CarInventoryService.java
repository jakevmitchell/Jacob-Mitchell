/*
 * This class contains the code used by the resource to execute different functions within the application.
 * Its primary purpose is to manipulate a list made up of Cars.
 */
package com.example.car_inventory.service;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.car_inventory.helper_classes.Car;
@Service
public class CarInventoryService
{
	private static ArrayList<Car> carList = new ArrayList<Car>();
	
	//This method will return all of the cars currently in the list
	public String getCars()
	{
		String cars = "";
		Car thisCar;
		for(int i = 0 ; i < carList.size() ; i++)
		{
			thisCar = carList.get(i);
			cars += thisCar.toString();
		}
		return cars;
	}
	
	//This method will search through our list of cars and remove the car with the given VIN if it is found.
	public String deleteCar(int VIN)
	{
		for (int i = 0 ; i < carList.size() ; i++)
		{
			if (carList.get(i).getVin() == VIN)
			{
				carList.remove(i);
				return null;
			}
		}
		return "ID Not Found. Nothing to do.";
	}
	
	//This method adds a car to the list if it is fed the VIN, make, model, and year.
	public void addCar(int VIN, String make, String model, int year)
	{
		Car thisCar = new Car(VIN,make,model,year);
		carList.add(thisCar);
	}
	
	//This method adds a car to the list if the car is given as a Car object already.
	public void addCar(Car newCar)
	{
		carList.add(newCar);
	}
}