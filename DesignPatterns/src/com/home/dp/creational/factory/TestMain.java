package com.home.dp.creational.factory;

public class TestMain {

    public static void main(String[] args) {

        Vehicle vehicle1 = new LMVVehicleFactory("car", 50000000.0, 50000.0).createVehicle();
        Vehicle vehicle2 = new LMVVehicleFactory("car", 50000000.0, 50000.0).createVehicle();

        System.out.println(vehicle1 + " \n" + vehicle2);
    }

}
