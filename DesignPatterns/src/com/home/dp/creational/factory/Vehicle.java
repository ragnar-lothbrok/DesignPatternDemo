package com.home.dp.creational.factory;

public abstract class Vehicle {

    public abstract Double getRoadPrice();

    public abstract Double getInsurancePrice();

    public abstract String getVehicleName();

    @Override
    public String toString() {
        return "Vehicle [getRoadPrice()=" + getRoadPrice() + ", getInsurancePrice()=" + getInsurancePrice()
                + ", getVehicleName()=" + getVehicleName() + "]";
    }

}
