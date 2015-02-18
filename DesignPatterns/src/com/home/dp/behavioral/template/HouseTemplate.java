package com.home.dp.behavioral.template;

public abstract class HouseTemplate {

    public final void buildHouse() {
        getArea();
        getConstructionMaterial();
        getHouseMap();
        getHouseDocuments();
    }

    abstract void getHouseDocuments();

    private void getArea() {
        System.out.println("Area Acquired.");
    }

    abstract void getHouseMap();

    abstract void getConstructionMaterial();

}
