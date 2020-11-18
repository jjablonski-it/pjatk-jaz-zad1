package javachanges.java8.lambda;

import javachanges.java8.model.Product;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exercise1 {

    Runnable runnable = () -> {};
    Predicate<Product> predicate = x -> true;
    Comparator<Product> comparator = (x1, x2) -> x1.getName().compareTo(x2.getName());
    Supplier<Product> supplier = () -> new Product();
    Consumer<Product> consumer = x -> System.out.println(x);
    Function<Product, Double> function = x -> x.getPrice();
}
