package designpattern.creational.abstractfactory.factories;

public interface ShapeFactoryFactory {
    ShapeFactory getFactory(String type);
}
