package designpattern.creational.prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 5);

        Shape clone = circle.clone();

        System.out.println(circle.equals(clone));
        System.out.println(circle.equals(clone));
    }
}
