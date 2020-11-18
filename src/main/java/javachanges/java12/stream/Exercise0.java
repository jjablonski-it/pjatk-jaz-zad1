package javachanges.java12.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class Exercise0 {
    public static void main(String[] args) {
        Double collect = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.teeing(
                        Collectors.summingDouble(Double::valueOf),
                        counting(),
                        (sum, n) -> sum / n));

        System.out.println(collect);
    }
}
