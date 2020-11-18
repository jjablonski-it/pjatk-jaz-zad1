package javachanges.java8.general;

import javachanges.java8.model.Product;

import java.util.List;

public class Exercise0 {
    public static void main(String[] args) {
        List<Product> sampleProductList = Product.getSampleProductList();

        SimpleProductChecker productChecker = new SimpleProductChecker();

        for (int i = 0; i < sampleProductList.size(); i++) {
            productChecker.checkLabel(sampleProductList.get(i));
        }

        for (Product product : sampleProductList) {
            productChecker.checkLabel(product);
        }

//        sampleProductList.forEach();
    }
}
