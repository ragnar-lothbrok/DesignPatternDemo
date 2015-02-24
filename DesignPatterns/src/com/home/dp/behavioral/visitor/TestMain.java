package com.home.dp.behavioral.visitor;

public class TestMain {

    public static void main(String[] args) {

        VisitorImpl visitorImpl = new VisitorImpl();
        Item item = new PetrolVehicle();
        item.accept(visitorImpl);

        item = new DeiselVehicle();
        item.accept(visitorImpl);

    }

}
