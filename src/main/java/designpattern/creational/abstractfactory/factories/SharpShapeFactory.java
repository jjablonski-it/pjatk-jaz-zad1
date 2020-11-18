package designpattern.creational.abstractfactory.factories;

import designpattern.creational.abstractfactory.Shape;
import designpattern.creational.abstractfactory.sharp.Rectangle;
import designpattern.creational.abstractfactory.sharp.Triangle;

public class SharpShapeFactory implements ShapeFactory {
    @Override
    public Shape getShape(String type) {
        if (type.startsWith("Rect")) {
            return new Rectangle();
        } else {
            return new Triangle();
        }
    }
}
