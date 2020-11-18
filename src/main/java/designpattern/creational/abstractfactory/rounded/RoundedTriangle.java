package designpattern.creational.abstractfactory.rounded;

import designpattern.creational.abstractfactory.Shape;

public class RoundedTriangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rounded triangle");
    }
}
