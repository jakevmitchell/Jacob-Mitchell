/*
 * This class serves as the controller for the SpringBoot Application.
 * It calls upon the Service to perform actions using GET, POST, and DELETE.
 */
package com.example.car_inventory.controller;
import com.example.car_inventory.helper_classes.*;
import com.example.car_inventory.service.CarInventoryService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CarInventoryResource {
 
	//Instantiates an instance of CarInventoryService
	@Autowired
	private CarInventoryService carInventoryService;
	
	//This method will return a list of all the cars added to the list using getCars from the Service class
    @RequestMapping(value="/cars",method=RequestMethod.GET)
    public String returnCar()
    {
    	return carInventoryService.getCars();
    }
    
    //This method takes the car given in POST request and uses the Service class to add it to our list of cars
    @RequestMapping(value={"/add"},method= {RequestMethod.POST})
    public void addCar(@RequestBody Car newCar)
    {
    	carInventoryService.addCar(newCar);
    	return;
    }
    
    //This method will delete a car from our list if it is found using the Service class.
    @RequestMapping(value = "/delete/{vin}",method = RequestMethod.DELETE)
    public String deleteCar(@PathVariable int vin)
    {
    	return carInventoryService.deleteCar(vin);
    }
}