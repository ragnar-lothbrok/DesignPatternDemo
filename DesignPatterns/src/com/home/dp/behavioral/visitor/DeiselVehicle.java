package com.home.dp.behavioral.visitor;

public class DeiselVehicle implements Item {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
