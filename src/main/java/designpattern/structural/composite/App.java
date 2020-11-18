package designpattern.structural.composite;

public class App {
    public static void main(String[] args) {
        Graphic circle1 = new Circle();
        Graphic circle2 = new Circle();
        Graphic circle3 = new Circle();
        CompositeGraphic compositeGraphic1 = new CompositeGraphic();
        CompositeGraphic compositeGraphic2 = new CompositeGraphic();
        CompositeGraphic compositeGraphic3 = new CompositeGraphic();

        compositeGraphic1.add(circle1);
        compositeGraphic1.add(circle2);

        compositeGraphic2.add(circle3);

        compositeGraphic3.add(compositeGraphic1);
        compositeGraphic3.add(compositeGraphic2);

        compositeGraphic3.draw();
    }
}
