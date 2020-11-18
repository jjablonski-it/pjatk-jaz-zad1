package designpattern.structural.decorator.coffeetypes;

public class HomeRoastCoffee implements Coffee {
    @Override
    public double cost() {
        return 15;
    }

    @Override
    public String description() {
        return "Special home roast";
    }
}
