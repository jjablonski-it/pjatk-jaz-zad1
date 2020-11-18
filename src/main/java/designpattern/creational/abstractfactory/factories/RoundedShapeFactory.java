package designpattern.creational.abstractfactory.factories;

import designpattern.creational.abstractfactory.Shape;
import designpattern.creational.abstractfactory.rounded.RoundedRectangle;
import designpattern.creational.abstractfactory.rounded.RoundedTriangle;

public class RoundedShapeFactory implements ShapeFactory {

    @Override
    public Shape getShape(String type) {
        if (type.startsWith("Rect")) {
            return new RoundedRectangle();
        } else {
            return new RoundedTriangle();
        }
    }
}
