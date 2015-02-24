package com.home.dp.behavioral.visitor;

public class VisitorImpl implements Visitor {

    @Override
    public Item visit(PetrolVehicle petrolVehicle) {
        System.out.println("petrolVehicle...");
        return petrolVehicle;
    }

    @Override
    public Item visit(DeiselVehicle deiselVehicle) {
        System.out.println("deiselVehicle...");
        return deiselVehicle;
    }

}
