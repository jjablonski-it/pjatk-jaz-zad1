package designpattern.creational.abstractfactory.rounded;

import designpattern.creational.abstractfactory.Shape;

public class RoundedRectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rounded rectangle");
    }
}
