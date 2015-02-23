package com.home.dp.behavioral.strategy;

public class TestMain {

    public static void main(String[] args) {

        Item item1 = new Item(100, "Pen");
        Item item2 = new Item(10, "Pensil");
        Item item3 = new Item(1000, "Box");

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(item1);
        shoppingCart.add(item2);
        shoppingCart.add(item3);
        
        shoppingCart.pay(new PaypalStrategy("gotsaveme@gmail.com", "pickel"));
    }

}
