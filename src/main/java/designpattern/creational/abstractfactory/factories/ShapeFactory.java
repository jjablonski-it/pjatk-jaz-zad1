package designpattern.creational.abstractfactory.factories;

import designpattern.creational.abstractfactory.Shape;

public interface ShapeFactory {
    Shape getShape(String type);
}
