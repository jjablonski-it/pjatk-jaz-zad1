package javachanges.java8.general;

import javachanges.java8.model.Product;

public class SimpleProductChecker implements ProductLabelChecker {

    @Override
    public void checkLabel(Product product) {
        if (product.getName().length() > 0) {
            System.out.println("Name is set.");
        }
    }
}