package com.home.dp.creational.abstractfactory;

import com.home.dp.creational.factory.Bike;
import com.home.dp.creational.factory.Car;
import com.home.dp.creational.factory.Vehicle;

public class HMVVehicleFactory implements AbstractVehicleFactory {

    private double roadPrice;
    private double insurancePrice;
    private String vehicleName;

    public HMVVehicleFactory(String vehicleName, double roadPrice, double insurancePrice) {
        super();
        this.roadPrice = roadPrice;
        this.insurancePrice = insurancePrice;
        this.vehicleName = vehicleName;
    }

    public Vehicle createVehicle() {
        if ("Bike".equalsIgnoreCase(vehicleName)) {
            return new Bike(vehicleName, roadPrice, insurancePrice);
        } else {
            return new Car(vehicleName, roadPrice, insurancePrice);
        }
    }

}
