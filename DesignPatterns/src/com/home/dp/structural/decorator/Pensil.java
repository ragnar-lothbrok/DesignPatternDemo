package com.home.dp.structural.decorator;

public class Pensil implements Item {

    private double price;
    private Item item;

    public Pensil(Item item, double price) {
        this.price = price;
        this.item = item;
    }

    @Override
    public double getPrice() {
        return price + item.getPrice();
    }

}
