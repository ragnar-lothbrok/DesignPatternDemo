package com.home.dp.creational.abstractfactory;

import com.home.dp.creational.factory.Vehicle;

public class VehicleFactory {

    public static Vehicle getVehicle(AbstractVehicleFactory vehicleFactory) {
        return vehicleFactory.createVehicle();
    }
}
