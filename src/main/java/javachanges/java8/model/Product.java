package javachanges.java8.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    final String name;
    final double price;
    final Category category;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public Product() {
        this.name = "Test Product";
        this.price = 1.0;
        this.category = Category.UNKNOWN;
    }

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return "[" + this.name + "|" + this.price + "]";
    }

    public static List<Product> getSampleProductList() {
        return new ArrayList<>(
                List.of(
                        new Product("Laptop AlienWare", 3000.0, Category.DEVICE),
                        new Product("Laptop Lenovo", 2000.0, Category.DEVICE),
                        new Product("Motherboard 1", 500.0, Category.PARTS),
                        new Product("Motherboard 2", 600.0, Category.PARTS),
                        new Product("Graphics Card 1", 2000.0, Category.PARTS),
                        new Product("Graphics Card 2", 3000.0, Category.PARTS),
                        new Product("Graphics Card 3", 4000.0, Category.PARTS),
                        new Product("Keyboard", 49.99, Category.PERIPHERAL),
                        new Product("Mouse", 49.99, Category.PERIPHERAL),
                        new Product("Monitor Blue Tint", 1000.00, Category.PERIPHERAL),
                        new Product("Monitor Red Tint", 1000.00, Category.PERIPHERAL)
                ));
    }
}