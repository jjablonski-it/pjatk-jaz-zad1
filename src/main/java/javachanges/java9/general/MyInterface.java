package javachanges.java9.general;

public interface MyInterface {
    default boolean test(Integer i) {
        return callPrivateMethod(i);
    }

    private boolean callPrivateMethod(Integer i) {
        return i.equals(i);
    }
}
