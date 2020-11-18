package designpattern.structural.flyweight;

public class TreeType {
    private final String name;
    private final String colour;
    private final String otherData;

    public TreeType(String name, String colour, String otherData) {
        this.name = name;
        this.colour = colour;
        this.otherData = otherData;
    }
}
