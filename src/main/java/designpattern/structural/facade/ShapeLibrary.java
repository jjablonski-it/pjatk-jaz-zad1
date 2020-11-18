package designpattern.structural.facade;

public class ShapeLibrary {
    public Shape getRectangle() { return new Shape(); }
    public Shape getTriangle() { return new Shape(); }
    public Shape getCircle() { return new Shape(); }
    public Shape getSquare() { return new Shape(); }
    public Shape getTrapezoid() { return new Shape(); }
}
