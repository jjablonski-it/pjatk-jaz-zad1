package designpattern.creational.factorymethod;

public class RichTaxCalculation implements TaxCalculation {

    @Override
    public double calculateTax(double income) {
        return 0.45*income;
    }
}
