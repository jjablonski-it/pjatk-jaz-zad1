package javachanges.java10.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise0 {
    public static void main(String[] args) {
        List.copyOf(new HashSet<>());
        Set.copyOf(new ArrayList<>());
        Map.copyOf(new HashMap<>());

        List<Integer> list = Stream.of(1, 2, 3).collect(Collectors.toUnmodifiableList());
        Set<Integer> set = Stream.of(1, 2, 3).collect(Collectors.toUnmodifiableSet());
        Map<Integer, Integer> map = Stream.of(1, 2, 3).collect(Collectors.toUnmodifiableMap(i -> i, i -> i));
    }
}
