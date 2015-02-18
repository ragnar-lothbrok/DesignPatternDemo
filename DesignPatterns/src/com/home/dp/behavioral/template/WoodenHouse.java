package com.home.dp.behavioral.template;

public class WoodenHouse extends HouseTemplate {

    @Override
    void getConstructionMaterial() {
        System.out.println("Wooden Material Done***");
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
