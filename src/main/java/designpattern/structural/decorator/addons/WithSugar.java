package designpattern.structural.decorator.addons;

import designpattern.structural.decorator.coffeetypes.Coffee;

public class WithSugar extends AddOn {
    public WithSugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1;
    }

    @Override
    public String description() {
        return super.description() + " with sugar.";
    }
}
