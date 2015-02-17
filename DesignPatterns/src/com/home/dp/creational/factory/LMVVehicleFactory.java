package com.home.dp.creational.factory;

import com.home.dp.creational.abstractfactory.AbstractVehicleFactory;


public class LMVVehicleFactory implements AbstractVehicleFactory{

    private double roadPrice;
    private double insurancePrice;
    private String vehicleName;

    public LMVVehicleFactory(String vehicleName, double roadPrice, double insurancePrice) {
        super();
        this.roadPrice = roadPrice;
        this.insurancePrice = insurancePrice;
        this.vehicleName = vehicleName;
    }
    
    public Vehicle createVehicle() {
        if ("Bike".equalsIgnoreCase(vehicleName)) {
            return new Bike(vehicleName,roadPrice,insurancePrice);
        } else {
            return new Car(vehicleName,roadPrice,insurancePrice);
        }
    }
}
