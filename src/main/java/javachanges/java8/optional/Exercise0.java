package javachanges.java8.optional;

import javachanges.java8.model.Product;
import java.util.Optional;

public class Exercise0 {
    public static void main(String[] args) {
        Optional<Product> empty = Optional.empty();
        Optional<Product> test = Optional.of(new Product());
        Optional<Product> nullable = Optional.ofNullable(null);

        Product product = empty.orElseGet(Product::new);

        //ifPresent
        //orElseGet

    }
}
