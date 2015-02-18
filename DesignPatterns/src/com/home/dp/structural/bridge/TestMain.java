package com.home.dp.structural.bridge;

public class TestMain {
    public static void main(String[] args) {

        Shape shape = new Triangle(new GreenColor());
        shape.applyColor();
        
        shape = new Circle(new RedColor());
        shape.applyColor();
        
    }
}
