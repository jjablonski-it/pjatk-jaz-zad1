package javachanges.java8.stream;

import javachanges.java8.model.Category;
import javachanges.java8.model.Product;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<Product> productList = Product.getSampleProductList();

        //suma cen za produkty o krotkich nazwach
        Optional<Double> sum = productList.stream()
                .filter(p -> p.getName().length() <= 5)
                .map(Product::getPrice)
                .reduce(Double::sum);

        System.out.println(sum.get());

        //mapa kategoria -> sumaryczna wartosc produktow
        Map<Category, Double> collect = productList.stream()
                .collect(Collectors.toMap(Product::getCategory, Product::getPrice, Double::sum));

        System.out.println(collect);

    }
}
