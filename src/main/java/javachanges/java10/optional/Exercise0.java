package javachanges.java10.optional;

import java.util.Optional;

public class Exercise0 {
    public static void main(String[] args) {
        Optional<Integer> integer = Optional.empty();
        Integer value = integer.orElseThrow();
    }
}
