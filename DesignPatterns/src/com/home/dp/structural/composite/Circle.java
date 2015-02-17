package com.home.dp.structural.composite;

public class Circle implements Shape{

    @Override
    public void draw(String color) {
        System.out.println("Circle : "+color);
    }

}
