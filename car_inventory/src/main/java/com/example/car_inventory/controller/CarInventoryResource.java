package com.example.car_inventory.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CarInventoryResource {
 
    @RequestMapping(value="/cars",method=RequestMethod.GET)
    @ResponseBody
    public String getCars()
    {
    	return CarInventoryService.getCars();
    }
    
    @RequestMapping(value={"/add"},method= {RequestMethod.POST})
    @ResponseBody
    public void addCar(@RequestBody Car newCar)
    {
    	CarInventoryService.addCar(newCar);
    	return;
    }
    
    @RequestMapping(value = "/delete/{vin}",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteCar(@PathVariable int vin)
    {
    	return CarInventoryService.deleteCar(vin);
    }
}