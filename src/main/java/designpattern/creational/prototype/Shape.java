package designpattern.creational.prototype;

public abstract class Shape implements Cloneable {
    public int x;
    public int y;
    public String colour;

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
