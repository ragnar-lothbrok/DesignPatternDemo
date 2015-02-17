package com.home.dp.creational.builder;

public class Vehicle {

    private String vehicleName;
    private double roadPrice;
    private boolean cngEnabled;

    public String getVehicleName() {
        return vehicleName;
    }

    public double getRoadPrice() {
        return roadPrice;
    }

    public boolean isCngEnabled() {
        return cngEnabled;
    }

    public Vehicle(VehicleBuilder builder) {
        this.roadPrice = builder.getRoadPrice();
        this.vehicleName = builder.getVehicleName();
        this.cngEnabled = builder.isCngEnabled();
    }

    @Override
    public String toString() {
        return "Vehicle [vehicleName=" + vehicleName + ", roadPrice=" + roadPrice + ", cngEnabled=" + cngEnabled + "]";
    }

}
