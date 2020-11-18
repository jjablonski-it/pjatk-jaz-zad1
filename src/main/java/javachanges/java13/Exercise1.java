package javachanges.java13;

public class Exercise1 {

    public static boolean sillyMethod(String input) {
        return input.isBlank();
    }

    public static void main(String[] args) {
        sillyMethod(null);
    }

    //Exception in thread "main" java.lang.NullPointerException
    //     at Exercise1.main(Exercise1.java:6)
}
