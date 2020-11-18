package designpattern.creational.abstractfactory;

import designpattern.creational.abstractfactory.factories.ShapeFactoryFactory;
import designpattern.creational.abstractfactory.factories.SuperFactory;

public class App {
    public static void main(String[] args) {
        ShapeFactoryFactory superFactory = new SuperFactory();

        System.out.println(superFactory.getFactory("Sharp").getShape("Rect"));
        System.out.println(superFactory.getFactory("Sharp").getShape("Trian"));
        System.out.println(superFactory.getFactory("Round").getShape("Rect"));
        System.out.println(superFactory.getFactory("Round").getShape("Trian"));
    }
}
