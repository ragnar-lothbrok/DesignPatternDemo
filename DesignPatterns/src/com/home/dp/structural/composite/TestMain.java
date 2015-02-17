package com.home.dp.structural.composite;

public class TestMain {

    public static void main(String[] args) {
            Shape obj1 = new Rectangle();
            Shape obj2 = new Rectangle();
            Shape cir = new Circle();
            Drawing drawing = new Drawing();
            drawing.add(obj1);
            drawing.add(cir);
            drawing.draw("Red");
            drawing.clear();
            drawing.add(obj2);
            drawing.add(cir);
            drawing.draw("Green");
        }
}
