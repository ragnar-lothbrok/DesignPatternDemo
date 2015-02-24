package com.home.dp.behavioral.visitor;

public interface Visitor {

    Item visit(PetrolVehicle petrolVehicle);

    Item visit(DeiselVehicle deiselVehicle);
}
