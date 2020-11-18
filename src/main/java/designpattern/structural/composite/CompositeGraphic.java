package designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    List<Graphic> graphicList = new ArrayList<>();

    @Override
    public void draw() {
        graphicList.forEach(Graphic::draw);
    }

    public void add(Graphic graphic) {
        graphicList.add(graphic);
    }
}