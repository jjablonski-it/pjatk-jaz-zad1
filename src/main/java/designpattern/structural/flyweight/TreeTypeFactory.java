package designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    Map<String, TreeType> treeTypes = new HashMap<>();

    public TreeType getTreeType(String name, String colour, String otherData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, colour, otherData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
