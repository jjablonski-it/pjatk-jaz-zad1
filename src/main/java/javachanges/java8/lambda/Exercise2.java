package javachanges.java8.lambda;

import javachanges.java8.model.Product;

import java.util.Comparator;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<Product> productList = Product.getSampleProductList();

        //posortuj liste po nazwach produktow
        productList.sort((p1,p2) -> p1.getName().compareTo(p2.getName()));
        //posortuj po cenach, a potem po nazwach
        productList.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getName));
        //posortuj po cenach, a potem po nazwach, malejaco
        Comparator<Double> comp = (p1, p2) -> {
            return p1.compareTo(p2);
        };

        productList.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getName).reversed());
        //wypisz wynik
        productList.forEach(System.out::println);
    }
}
