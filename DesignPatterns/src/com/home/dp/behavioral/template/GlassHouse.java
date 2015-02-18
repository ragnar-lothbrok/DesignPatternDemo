package com.home.dp.behavioral.template;

public class GlassHouse extends HouseTemplate {

    @Override
    void getConstructionMaterial() {
        System.out.println("Glass Material Done***");
    }

    @Override
    void getHouseMap() {
        System.out.println("Mapping Done***");
    }

    @Override
    void getHouseDocuments() {
        System.out.println("Documents Done***");
    }

}
