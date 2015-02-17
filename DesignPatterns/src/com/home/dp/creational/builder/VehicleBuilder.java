package com.home.dp.creational.builder;

public class VehicleBuilder {

    //Required Parameters
    private String vehicleName;
    private double roadPrice;
    
    //Optional Parameters
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

    public VehicleBuilder(String vehicleName, double roadPrice) {
        super();
        this.vehicleName = vehicleName;
        this.roadPrice = roadPrice;
    }

    public VehicleBuilder setCNGEnabled(boolean cngEnabled) {
        this.cngEnabled = cngEnabled;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(this);
    }

}
