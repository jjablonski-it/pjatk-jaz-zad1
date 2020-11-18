package training.termialoperators;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class TerminalOperatorsExercise implements StreamTerminalOperators {

    @Override
    public void addToSet(Stream<String> stream, Set<String> set) {
    }

    @Override
    public void addToListInReverseOrder(Stream<String> stream, List<String> list) {
    }

    @Override
    public String[] collectToArray(Stream<String> stream) {
        return new String[0];
    }

    @Override
    public Set<String> collectToSet(Stream<String> stream) {
        return Set.of();
    }

    @Override
    public List<String> collectToList(Stream<String> stream) {
        return List.of();
    }

    @Override
    public String mergeIntoString(Stream<String> stream) {
        return "";
    }

    @Override
    public int countCharacters(Stream<String> stream) {
        return 0;
    }

    @Override
    public int longestWordLength(Stream<String> stream) {
        return 0;
    }

    @Override
    public String longestWord(Stream<String> stream) {
        return "";
    }

    @Override
    public Map<Integer, List<String>> wordsGroupedByLength(Stream<String> stream) {
        return Map.of();
    }
}
