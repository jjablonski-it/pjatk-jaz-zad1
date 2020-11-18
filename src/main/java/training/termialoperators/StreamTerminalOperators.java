package training.termialoperators;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public interface StreamTerminalOperators {

    void addToSet(Stream<String> stream, Set<String> set);

    void addToListInReverseOrder(Stream<String> stream, List<String> list);

    String[] collectToArray(Stream<String> stream);

    Set<String> collectToSet(Stream<String> stream);

    List<String> collectToList(Stream<String> stream);

    /**
     * Sugestia: Collectors.joining
     */
    String mergeIntoString(Stream<String> stream);

    int countCharacters(Stream<String> stream);

    int longestWordLength(Stream<String> stream);

    String longestWord(Stream<String> stream);

    Map<Integer, List<String>> wordsGroupedByLength(Stream<String> stream);

}
