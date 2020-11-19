package training.termialoperators;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperatorsExercise implements StreamTerminalOperators {

    @Override
    public void addToSet(Stream<String> stream, Set<String> set) {
        stream.forEach(set::add);
    }

    @Override
    public void addToListInReverseOrder(Stream<String> stream, List<String> list) {
        stream.sorted(Comparator.reverseOrder()).forEach(list::add);
    }

    @Override
    public String[] collectToArray(Stream<String> stream) {
        return stream.toArray(String[]::new);
    }

    @Override
    public Set<String> collectToSet(Stream<String> stream) {
        return stream.collect(Collectors.toSet());
    }

    @Override
    public List<String> collectToList(Stream<String> stream) {
        return stream.collect(Collectors.toList());
    }

    @Override
    public String mergeIntoString(Stream<String> stream) {
        return stream.collect(Collectors.joining("-", "[", "]"));
    }

    @Override
    public int countCharacters(Stream<String> stream) {
        return stream.mapToInt(String::length).sum();
    }

    @Override
    public int longestWordLength(Stream<String> stream) {
        return stream.mapToInt(String::length).reduce(0, (max, len) -> len > max ? len : max);
    }

    @Override
    public String longestWord(Stream<String> stream) {
        return stream.sorted((s1, s2) -> s2.length() - s1.length()).limit(1).collect(Collectors.joining());
    }

    @Override
    public Map<Integer, List<String>> wordsGroupedByLength(Stream<String> stream) {
        return stream.collect(Collectors.groupingBy(String::length));
    }
}
