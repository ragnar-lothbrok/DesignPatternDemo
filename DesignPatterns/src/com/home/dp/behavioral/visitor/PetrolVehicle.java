package com.home.dp.behavioral.visitor;

public class PetrolVehicle implements Item {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
