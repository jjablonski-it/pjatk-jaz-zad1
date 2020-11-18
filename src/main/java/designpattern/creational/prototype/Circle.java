package designpattern.creational.prototype;

public class Circle extends Shape {
    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
