package com.home.dp.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> itemList;

    public void add(Item item) {
        if (itemList == null) {
            itemList = new ArrayList<Item>();
        }
        itemList.add(item);
    }

    public void remove(Item item) {
        if (itemList != null) {
            itemList.remove(item);
        }
    }

    public int calculateAmount() {
        int sum = 0;
        if (itemList != null && itemList.size() > 0) {
            for (Item item : itemList) {
                sum += item.getPrice();
            }
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateAmount());
    }

}
