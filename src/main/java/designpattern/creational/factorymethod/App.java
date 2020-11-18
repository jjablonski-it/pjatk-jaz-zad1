package designpattern.creational.factorymethod;

public class App {
    public static void main(String[] args) {
        double income = 100_000_000;
        String jedrzej = "Jedrzej";
        String franek = "Franek";

        TaxCalculationFactory factory = new TaxCalculationFactory();
        double taxForJedrzej = factory.getTaxCalculation(income, jedrzej).calculateTax(income);
        double taxForFranek = factory.getTaxCalculation(income, franek).calculateTax(income);

        System.out.println(taxForFranek);
        System.out.println(taxForJedrzej);

    }
}
