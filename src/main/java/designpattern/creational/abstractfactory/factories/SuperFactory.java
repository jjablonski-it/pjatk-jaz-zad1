package designpattern.creational.abstractfactory.factories;

import designpattern.creational.abstractfactory.sharp.Rectangle;
import designpattern.creational.abstractfactory.sharp.Triangle;

public class SuperFactory implements ShapeFactoryFactory {
    @Override
    public ShapeFactory getFactory(String type) {
        if (type.startsWith("Sharp")) {
            return new SharpShapeFactory();
        } else {
            return new RoundedShapeFactory();
        }
    }
}
