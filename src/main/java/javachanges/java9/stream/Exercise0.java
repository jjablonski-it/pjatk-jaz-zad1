package javachanges.java9.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise0 {
    public static void main(String[] args) {
        List<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .takeWhile(n -> n < 4)
                .collect(Collectors.toList());

        List<Integer> intStream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .dropWhile(n -> n < 4)
                .collect(Collectors.toList());

        System.out.println(intStream);
        System.out.println(intStream2);
    }
}
