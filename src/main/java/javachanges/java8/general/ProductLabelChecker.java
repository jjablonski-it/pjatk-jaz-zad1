package javachanges.java8.general;

import javachanges.java8.model.Category;
import javachanges.java8.model.Product;

public interface ProductLabelChecker {
    void checkLabel(Product product);

    default void checkPrice(Product product) {
        if(product.getPrice() > 0) {
            System.out.println("Price is set.");
        }
    }

    static void checkEverything(Product product) {
        if(product.getPrice() > 0 && product.getName().length() > 0 &&
                !product.getCategory().equals(Category.UNKNOWN)) {
            System.out.println("Everything in order.");
        }
    }
}
