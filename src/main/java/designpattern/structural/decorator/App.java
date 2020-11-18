package designpattern.structural.decorator;

import designpattern.structural.decorator.addons.WithMilk;
import designpattern.structural.decorator.addons.WithSugar;
import designpattern.structural.decorator.coffeetypes.Coffee;
import designpattern.structural.decorator.coffeetypes.PlainBlackCoffee;

public class App {
    public static void main(String[] args) {
        Coffee plain = new PlainBlackCoffee();

        System.out.println(plain.cost());
        System.out.println(plain.description());

        Coffee withMilk = new WithMilk(plain);
        System.out.println(withMilk.cost());
        System.out.println(withMilk.description());

        Coffee withSugar = new WithSugar(withMilk);
        System.out.println(withSugar.cost());
        System.out.println(withSugar.description());
    }
}
