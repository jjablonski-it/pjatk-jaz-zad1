package designpattern.creational.factorymethod;

public class TaxCalculationFactory {

    public TaxCalculation getTaxCalculation(double income, String personName) {
        if (personName.equals("Jedrzej")) {
            return new SpecialTaxCalculation();
        } else if(income > 1_000_000) {
            return new RichTaxCalculation();
        } else {
            return new BaseTaxCalculation();
        }
    }
}
