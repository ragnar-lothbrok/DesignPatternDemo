package com.home.dp.creational.builder;

public class TestMain {

    public static void main(String[] args) {
        System.out.println(new Vehicle(new VehicleBuilder("Truck", 12000000.0).setCNGEnabled(true)));
    }

}
