package com.home.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    List<Shape> shapesList;

    @Override
    public void draw(String color) {
        for (Shape shape : getShapesList()) {
            shape.draw(color);
        }
    }

    public List<Shape> getShapesList() {
        if (shapesList == null)
            shapesList = new ArrayList<Shape>();
        return shapesList;
    }

    // adding shape to drawing
    public void add(Shape s) {
        this.getShapesList().add(s);
    }

    // removing shape from drawing
    public void remove(Shape s) {
        getShapesList().remove(s);
    }

    // removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.getShapesList().clear();
    }

}
