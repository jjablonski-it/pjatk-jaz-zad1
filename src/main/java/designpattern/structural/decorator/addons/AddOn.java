package designpattern.structural.decorator.addons;

import designpattern.structural.decorator.coffeetypes.Coffee;

public abstract class AddOn implements Coffee {
    private final Coffee decoratedCoffee;

    public AddOn(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }

    @Override
    public String description() {
        return decoratedCoffee.description();
    }
}
