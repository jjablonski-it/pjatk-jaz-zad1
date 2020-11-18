package designpattern.structural.decorator.coffeetypes;

public class PlainBlackCoffee implements Coffee {
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Plain black coffee";
    }
}
