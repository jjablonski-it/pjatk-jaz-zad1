package designpattern.creational.factorymethod;

public class BaseTaxCalculation implements TaxCalculation {
    @Override
    public double calculateTax(double income) {
        return 0.19*income;
    }
}
