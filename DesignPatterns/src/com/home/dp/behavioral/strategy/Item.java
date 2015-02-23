package com.home.dp.behavioral.strategy;

public class Item {
    private int price;
    private String itemName;

    public Item(int price, String itemName) {
        super();
        this.price = price;
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

}
