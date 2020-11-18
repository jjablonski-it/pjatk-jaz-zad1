package javachanges.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise0 {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5)
                .limit(3)
                .map(i -> i * i);

//        List<Integer> squares = intStream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        List<Integer> squares2 = intStream.collect(Collectors.toList());

//        System.out.println(squares);
        System.out.println(squares2);


    }
}