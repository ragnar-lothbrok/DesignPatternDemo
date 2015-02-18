package com.home.dp.structural.bridge;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        this.color.applyColor();
    }

}
