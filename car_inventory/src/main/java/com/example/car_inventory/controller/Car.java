package com.example.car_inventory.controller;
public class Car
{
	private int year;
	private int vin;
	private String make,model;
	
	public Car(int vin, String make, String model, int year)
	{
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public Car()
	{
		this.vin = 0;
		this.make = null;
		this.model = null;
		this.year = 0;
	}
	public int getVIN()
	{
		return this.vin;
	}
	public String getMake()
	{
		return this.make;
	}
	public String getModel()
	{
		return this.model;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setVIN(int vin)
	{
		this.vin = vin;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
}