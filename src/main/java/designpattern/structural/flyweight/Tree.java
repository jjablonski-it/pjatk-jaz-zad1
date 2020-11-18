package designpattern.structural.flyweight;

public class Tree {
    final int x;
    final int y;
    final TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
}
