package com.home.dp.creational.abstractfactory;

import com.home.dp.creational.factory.Vehicle;

public class Truck extends Vehicle {

    private double roadPrice;
    private double insurancePrice;
    private String vehicleName;

    public Truck(String vehicleName, double roadPrice, double insurancePrice) {
        super();
        this.roadPrice = roadPrice;
        this.insurancePrice = insurancePrice;
        this.vehicleName = vehicleName;
    }

    @Override
    public Double getRoadPrice() {
        return this.roadPrice;
    }

    @Override
    public Double getInsurancePrice() {
        return this.insurancePrice;
    }

    @Override
    public String getVehicleName() {
        return this.vehicleName;
    }

}
