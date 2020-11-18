package javachanges.java8.stream;

import javachanges.java8.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<Product> productList = Product.getSampleProductList();

        //zostaw tylko produkty, ktorych nazwa ma 5 lub mniej znakow
        List<Product> shortNames = productList.stream()
                .filter(p -> p.getName().length() <= 5)
                .collect(Collectors.toList());
        //zostaw tylko produkty, ktorych cena jest pomiedzy 600 a 1200
        List<Product> priceRange = productList.stream()
                .filter(p -> p.getPrice() > -600 && p.getPrice() <= 1200)
                .collect(Collectors.toList());

        //wypisz wynik
        productList.forEach(System.out::println);
        System.out.println();
        shortNames.forEach(System.out::println);
        System.out.println();
        priceRange.forEach(System.out::println);
    }
}
