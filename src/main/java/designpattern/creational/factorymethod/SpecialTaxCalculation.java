package designpattern.creational.factorymethod;

public class SpecialTaxCalculation implements TaxCalculation {

    @Override
    public double calculateTax(double income) {
        return 1;
    }
}
