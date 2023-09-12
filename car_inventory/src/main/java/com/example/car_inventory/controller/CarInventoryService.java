package com.example.car_inventory.controller;
import java.util.ArrayList;

public class CarInventoryService
{
	private static ArrayList<Car> carList = new ArrayList<Car>();
	static String getCars()
	{
		String cars = "";
		Car thisCar;
		for(int i = 0 ; i < carList.size() ; i++)
		{
			thisCar = carList.get(i);
			cars += String.format("VIN: %d, Make: %s, Model: %s, Year: %d \n", thisCar.getVIN(),thisCar.getMake(),thisCar.getModel(),thisCar.getYear() );
		}
		return cars;
	}
	static String deleteCar(int VIN)
	{
		for (int i = 0 ; i < carList.size() ; i++)
		{
			if (carList.get(i).getVIN() == VIN)
			{
				carList.remove(i);
				return null;
			}
		}
		return "ID Not Found. Nothing to do.";
	}
	static void addCar(int VIN, String make, String model, int year)
	{
		Car thisCar = new Car(VIN,make,model,year);
		carList.add(thisCar);
	}
	static void addCar(Car newCar)
	{
		carList.add(newCar);
	}
}