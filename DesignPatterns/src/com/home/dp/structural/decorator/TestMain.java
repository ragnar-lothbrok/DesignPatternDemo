package com.home.dp.structural.decorator;

public class TestMain {
    
    public static void main(String[] args) {
        Item item = new Pen(new Pensil(new Gift(), 10.11), 12.11);
        System.out.println(item.getPrice());
    }
    
}
