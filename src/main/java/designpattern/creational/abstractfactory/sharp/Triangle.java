package designpattern.creational.abstractfactory.sharp;

import designpattern.creational.abstractfactory.Shape;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Plain old triangle");
    }
}
