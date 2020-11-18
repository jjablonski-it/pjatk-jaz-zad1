package designpattern.structural.decorator.addons;

import designpattern.structural.decorator.coffeetypes.Coffee;

public class WithMilk extends AddOn {
    public WithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 2.5;
    }

    @Override
    public String description() {
        return super.description() + " with milk.";
    }
}
