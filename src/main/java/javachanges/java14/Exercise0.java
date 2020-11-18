package javachanges.java14;

public class Exercise0 {
    String name = "objectName";
    Object obj = "";

    public boolean equals(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            return name.equals(s);
        } else {
            return false;
        }
    }

//    if (obj instanceof String s) {
//            s
//    }

}
