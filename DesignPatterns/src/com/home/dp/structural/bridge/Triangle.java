package com.home.dp.structural.bridge;

public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        this.color.applyColor();
    }
    
}
