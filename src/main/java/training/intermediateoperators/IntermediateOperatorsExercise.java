package training.intermediateoperators;

import javax.sql.ConnectionPoolDataSource;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperatorsExercise implements StreamIntermediateOperators {
    @Override
    public Stream<String> wordsLongerThanFiveCharacters(List<String> words) {
        return words.stream().filter(str -> str.length() > 5);
    }

    @Override
    public Stream<String> firstThreeWordsLongerThanFiveCharacters(List<String> words) {
        return words.stream().filter(word -> word.length() > 3).limit(3);
    }

    @Override
    public Stream<String> firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrder(List<String> words) {
        return words.stream().filter(word -> word.length() > 5).distinct().limit(3).sorted(Comparator.reverseOrder());
    }

    @Override
    public Stream<Integer> lengthOfWords(List<String> words) {
        return words.stream().map(word -> word.length());
    }

    @Override
    public Stream<Integer> staircase() {
        return IntStream.range(1,7).flatMap(number -> IntStream.range(0, number+1)).boxed();
    }
}
