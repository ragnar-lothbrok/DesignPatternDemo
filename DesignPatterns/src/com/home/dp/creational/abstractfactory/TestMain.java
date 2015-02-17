package com.home.dp.creational.abstractfactory;

import com.home.dp.creational.factory.LMVVehicleFactory;
import com.home.dp.creational.factory.Vehicle;

public class TestMain {
    

    public static void main(String[] args) {

        Vehicle vehicle1 = VehicleFactory.getVehicle(new LMVVehicleFactory("car", 50000000.0, 50000.0));
        Vehicle vehicle2 = VehicleFactory.getVehicle(new HMVVehicleFactory("Truck", 50000000.0, 50000.0));

        System.out.println(vehicle1 + " \n" + vehicle2);
    }

    
}
