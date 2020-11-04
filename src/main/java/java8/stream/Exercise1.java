package java8.stream;

import java8.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Product> productList = Product.getSampleProductList();

        //zostaw tylko produkty, ktorych nazwa ma 5 lub mniej znakow
        List<Product> shortNames = new ArrayList<>();
        //zostaw tylko produkty, ktorych cena jest pomiedzy 600 a 1200
        List<Product> priceRange = new ArrayList<>();

        //wypisz wynik
        productList.forEach(System.out::println);
        System.out.println();
        shortNames.forEach(System.out::println);
        System.out.println();
        priceRange.forEach(System.out::println);
    }
}
