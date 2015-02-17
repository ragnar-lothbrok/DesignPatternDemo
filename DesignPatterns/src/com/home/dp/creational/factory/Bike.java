package com.home.dp.creational.factory;

public class Bike extends Vehicle {

    private double roadPrice;
    private double insurancePrice;
    private String vehicleName;

    public Bike(String vehicleName, double roadPrice, double insurancePrice) {
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
